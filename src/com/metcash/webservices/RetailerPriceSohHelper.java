/*     */ package com.metcash.webservices;
/*     */ 
/*     */ import com.metcash.common.services.ProductService;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Product;
/*     */ import com.metcash.model.segment.db.ProductSoh;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.RetailerPriceSohValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.RetailerPriceSohXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequest;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerPriceSohResponse;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.pricesoh.RetailerPriceSohValidationResult;
/*     */ import com.metcash.webservices.validation.pricesoh.RetailerPriceSohValidator;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RetailerPriceSohHelper
/*     */ {
/*     */   private static final String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RetailerPriceSohResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></RetailerPriceSohResponse>";
/*  27 */   private static Log log = LogFactory.getLog(RetailerPriceSohHelper.class);
/*     */   
/*     */   protected ProductService productService;
/*     */   
/*     */   public RetailerPriceSohHelper() {
/*     */     try {
/*  33 */       this.productService = new ProductService();
/*  34 */     } catch (Exception e) {
/*  35 */       log.error("RetailerPriceSohHelper()", e);
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
/*     */   public String getRetailerPriceSoh(String xmlRetailerPriceSohRequest, String authenticatedRetailerId, String authenticatedRetailerStateId) {
/*  48 */     RetailerPriceSohRequest request = null;
/*  49 */     RetailerPriceSohValidationResult result = new RetailerPriceSohValidationResult();
/*  50 */     RetailerPriceSohResponse response = null;
/*     */ 
/*     */     
/*     */     try {
/*  54 */       request = (new RetailerPriceSohXmlAdapter())
/*  55 */         .parseXml(xmlRetailerPriceSohRequest);
/*  56 */     } catch (Exception e) {
/*  57 */       result.setMessage(ValidationResult.ERROR, 
/*  58 */           ValidationConfig.ERROR_PARSING_REQUEST_XML);
/*     */     } 
/*     */ 
/*     */     
/*  62 */     if (!result.isInError()) {
/*  63 */       processRequest(request, authenticatedRetailerId, 
/*  64 */           authenticatedRetailerStateId, result);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  70 */       response = result.getResponse();
/*  71 */       RetailerPriceSohValidationAdapter responseValidationAdapter = new RetailerPriceSohValidationAdapter();
/*  72 */       String xmlResponse = responseValidationAdapter.getXml(response);
/*  73 */       log.info("getRetailerPriceSoh() Response: " + xmlResponse);
/*  74 */       return xmlResponse;
/*     */     }
/*  76 */     catch (Exception e) {
/*  77 */       log.error("Problem returning an XML Response to client:", e);
/*     */ 
/*     */       
/*  80 */       return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RetailerPriceSohResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></RetailerPriceSohResponse>";
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
/*     */   public void processRequest(RetailerPriceSohRequest request, String authenticatedRetailerId, String authenticatedRetailerStateId, RetailerPriceSohValidationResult result) {
/*  96 */     RetailerPriceSohValidator validator = null;
/*     */     try {
/*  98 */       validator = new RetailerPriceSohValidator(request, result, 
/*  99 */           this.productService);
/*     */ 
/*     */       
/* 102 */       boolean isValid = validator.validateAuthenticatedRetailer(
/* 103 */           authenticatedRetailerId, authenticatedRetailerStateId);
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
/* 124 */               result.setRetailerProductDetail(validator
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
/* 135 */               result.setRetailerProductDetail(soh);
/*     */             } else {
/* 137 */               result.setProductResponseMessage(
/* 138 */                   ValidationResult.WARN, "Invalid product " + 
/* 139 */                   requestProductCode);
/*     */             } 
/*     */           } 
/* 142 */         } else if (productViewWrapper == null || 
/* 143 */           productViewWrapper.size() == 0) {
/* 144 */           result.setMessage(ValidationResult.ERROR, 
/* 145 */               "No valid products in the request.");
/*     */         } 
/*     */       } 
/* 148 */     } catch (Exception e) {
/* 149 */       log.error("processRequest()", e);
/* 150 */       result.setMessage(ValidationResult.ERROR, 
/* 151 */           "Unexpected error occurred while processing request.");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\RetailerPriceSohHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */