/*     */ package com.metcash.webservices;
/*     */ 
/*     */ import com.metcash.common.services.SupplierRepProductService;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Product;
/*     */ import com.metcash.model.segment.db.ProductSoh;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.SupplierPriceSohValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.SupplierPriceSohXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierPriceSohRequest;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.pricesoh.PriceSohValidationResult;
/*     */ import com.metcash.webservices.validation.pricesoh.SupplierPriceSohValidationResult;
/*     */ import com.metcash.webservices.validation.pricesoh.SupplierPriceSohValidator;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierPriceSohHelper
/*     */ {
/*     */   private static final String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SupplierPriceSohResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></SupplierPriceSohResponse>";
/*  27 */   private static Log log = LogFactory.getLog(SupplierPriceSohHelper.class);
/*     */   
/*     */   protected SupplierRepProductService productService;
/*     */   
/*     */   public SupplierPriceSohHelper() {
/*     */     try {
/*  33 */       this.productService = new SupplierRepProductService();
/*  34 */     } catch (Exception e) {
/*  35 */       log.error("SupplierPriceSohHelper()", e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierPriceSoh(String xmlSupplierPriceSohRequest, String authenticatedSupplierId, String authenticatedSupplierStateId) {
/*  48 */     SupplierPriceSohRequest request = null;
/*  49 */     SupplierPriceSohValidationResult result = new SupplierPriceSohValidationResult();
/*  50 */     SupplierPriceSohResponse response = null;
/*     */ 
/*     */     
/*     */     try {
/*  54 */       request = (new SupplierPriceSohXmlAdapter())
/*  55 */         .parseXml(xmlSupplierPriceSohRequest);
/*  56 */     } catch (Exception e) {
/*  57 */       result.setMessage(ValidationResult.ERROR, 
/*  58 */           ValidationConfig.ERROR_PARSING_REQUEST_XML);
/*     */     } 
/*     */ 
/*     */     
/*  62 */     if (!result.isInError()) {
/*  63 */       processRequest(request, authenticatedSupplierId, 
/*  64 */           authenticatedSupplierStateId, result);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  70 */       response = result.getResponse();
/*  71 */       SupplierPriceSohValidationAdapter responseValidationAdapter = new SupplierPriceSohValidationAdapter();
/*  72 */       String xmlResponse = responseValidationAdapter.getXml(response);
/*  73 */       log.info("getSupplierPriceSoh() Response: " + xmlResponse);
/*  74 */       return xmlResponse;
/*     */     }
/*  76 */     catch (Exception e) {
/*  77 */       log.error("Problem returning an XML Response to client:", e);
/*     */ 
/*     */       
/*  80 */       return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SupplierPriceSohResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></SupplierPriceSohResponse>";
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void processRequest(SupplierPriceSohRequest request, String authenticatedSupplierId, String authenticatedSupplierStateId, SupplierPriceSohValidationResult result) {
/*  96 */     SupplierPriceSohValidator validator = null;
/*     */     try {
/*  98 */       validator = new SupplierPriceSohValidator(request, (PriceSohValidationResult)result, 
/*  99 */           this.productService);
/*     */ 
/*     */       
/* 102 */       boolean isValid = validator.validateAuthenticatedSupplier(
/* 103 */           authenticatedSupplierId, authenticatedSupplierStateId);
/*     */       
/* 105 */       if (isValid) {
/*     */         
/* 107 */         ProductViewWrapper productViewWrapper = validator
/* 108 */           .validateAllProductsForCustomer();
/* 109 */         if (!result.isInError() && productViewWrapper != null && 
/* 110 */           productViewWrapper.size() > 0) {
/* 111 */           String requestProductCode = null;
/* 112 */           ProductView productView = null;
/* 113 */           for (int i = 0; i < request.getProductCount(); i++) {
/*     */             
/* 115 */             requestProductCode = request.getProduct(i).getCode();
/* 116 */             productView = productViewWrapper
/* 117 */               .getProduct(requestProductCode);
/*     */ 
/*     */             
/* 120 */             result.createProductResponse();
/* 121 */             if (productView != null && 
/* 122 */               productView.getProductDetail() != null) {
/*     */               
/* 124 */               result.setSupplierProductDetail(validator
/* 125 */                   .getCustomer(), productView);
/*     */               
/* 127 */               Product.ProductPK productKey = productView
/* 128 */                 .getProductDetail().getProductKey();
/* 129 */               ProductSoh soh = this.productService.findProductStock(
/* 130 */                   productKey.pillarId.internalValue(), 
/* 131 */                   productKey.stateId.internalValue(), 
/* 132 */                   (productView.getProductDetail()).branchId
/* 133 */                   .internalValue(), 
/* 134 */                   productKey.productId.internalValue());
/* 135 */               result.setSupplierProductDetail(soh);
/*     */             } else {
/*     */               
/* 138 */               result.setProductResponseMessage(
/* 139 */                   ValidationResult.WARN, "Invalid product " + 
/* 140 */                   requestProductCode);
/*     */             } 
/*     */           } 
/* 143 */         } else if (productViewWrapper == null || 
/* 144 */           productViewWrapper.size() == 0) {
/* 145 */           result.setMessage(ValidationResult.ERROR, 
/* 146 */               "No valid products in the request.");
/*     */         } 
/*     */       } 
/* 149 */     } catch (Exception e) {
/* 150 */       log.error("processRequest()", e);
/* 151 */       result.setMessage(ValidationResult.ERROR, 
/* 152 */           "Unexpected error occurred while processing request.");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\SupplierPriceSohHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */