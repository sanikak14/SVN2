/*     */ package com.metcash.webservices.validation.pricesoh;
/*     */ 
/*     */ import com.metcash.common.services.ProductService;
/*     */ import com.metcash.common.services.SupplierRepProductService;
/*     */ import com.metcash.model.field.ProductId;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.webservices.config.O4Config;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.Product;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierPriceSohRequest;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ public class SupplierPriceSohValidator
/*     */   extends PriceSohValidator
/*     */ {
/*  28 */   private Log log = LogFactory.getLog(SupplierPriceSohValidator.class);
/*     */ 
/*     */   
/*     */   private SupplierPriceSohRequest request;
/*     */ 
/*     */   
/*     */   public SupplierPriceSohValidator(SupplierPriceSohRequest request, PriceSohValidationResult result, SupplierRepProductService supplierRepProductService) {
/*  35 */     super((ProductService)supplierRepProductService);
/*  36 */     this.request = request;
/*  37 */     this.currentResult = result;
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
/*     */   public boolean validateAuthenticatedSupplier(String authenticatedSupplierId, String authenticatedSupplierStateId) {
/*  51 */     boolean isValid = false;
/*  52 */     String supplierIdFromRequest = this.request.getSupplierRep().getId();
/*  53 */     String supplierStateIdFromRequest = this.request.getSupplierRep()
/*  54 */       .getStateCode().toString();
/*  55 */     if (this.log.isDebugEnabled()) {
/*  56 */       this.log
/*  57 */         .debug("validateAuthenticatedSupplier() supplierIdFromRequest,supplierStateIdFromRequest :" + 
/*  58 */           supplierIdFromRequest + 
/*  59 */           "," + 
/*  60 */           supplierStateIdFromRequest + 
/*  61 */           " against authenticatedSupplierId,authenticatedSupplierStateId: " + 
/*  62 */           authenticatedSupplierId + 
/*  63 */           "," + 
/*  64 */           authenticatedSupplierStateId);
/*     */     }
/*  66 */     if (authenticatedSupplierId != null && 
/*  67 */       !authenticatedSupplierId.equals("") && 
/*  68 */       authenticatedSupplierStateId != null && 
/*  69 */       !authenticatedSupplierStateId.equals(""))
/*     */     {
/*     */       
/*  72 */       if (supplierIdFromRequest.equals(authenticatedSupplierId) && 
/*  73 */         supplierStateIdFromRequest
/*  74 */         .equals(authenticatedSupplierStateId)) {
/*  75 */         isValid = true;
/*     */       }
/*     */     }
/*     */     
/*  79 */     if (!isValid) {
/*  80 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/*  81 */           ValidationConfig.AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH);
/*     */     }
/*  83 */     else if ((!authenticatedSupplierId.equals(O4Config.O4_REP_ID
/*  84 */         .internalValue()) && 
/*  85 */       !authenticatedSupplierId.equals(O4Config.O4_SUPPLIER_ID.internalValue())) || 
/*  86 */       !authenticatedSupplierStateId.equals(O4Config.O4_STATE_ID.internalValue())) {
/*  87 */       this.currentResult
/*  88 */         .setMessage(ValidationResult.ERROR, 
/*  89 */           "This web service is not available for the authenticated user.");
/*  90 */       isValid = false;
/*     */     } 
/*     */     
/*  93 */     return isValid;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProductViewWrapper validateAllProductsForCustomer() {
/*  98 */     Product[] xmlProducts = this.request.getProduct();
/*  99 */     ProductId[] productIds = new ProductId[xmlProducts.length];
/* 100 */     for (int i = 0; i < xmlProducts.length; i++) {
/* 101 */       productIds[i] = new ProductId(xmlProducts[i].getCode());
/*     */     }
/* 103 */     ProductViewWrapper productViewWrapper = null;
/*     */     try {
/* 105 */       productViewWrapper = ((SupplierRepProductService)this.productService)
/* 106 */         .o4RepProductSearchByIdArray(getCustomer(), productIds, 
/* 107 */           false);
/* 108 */     } catch (Exception e) {
/* 109 */       this.log.error("validateAllProductsForCustomer()", e);
/*     */     } 
/* 111 */     if (productViewWrapper == null) {
/* 112 */       this.currentResult.setProductResponseMessage(ValidationResult.WARN, 
/* 113 */           "Some products might not be avaiable for customer.");
/*     */     }
/*     */     
/* 116 */     return productViewWrapper;
/*     */   }
/*     */   
/*     */   protected Customer getCustomerImpl() {
/* 120 */     String customerId = this.request.getCustomer().getId();
/* 121 */     String customerStateId = this.request.getCustomer().getStateCode()
/* 122 */       .toString();
/* 123 */     return validateCustomer(customerStateId, customerId);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\SupplierPriceSohValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */