/*     */ package com.metcash.webservices.validation.pricesoh;
/*     */ 
/*     */ import com.metcash.common.services.ProductService;
/*     */ import com.metcash.model.field.ProductId;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.Product;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequest;
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
/*     */ 
/*     */ public class RetailerPriceSohValidator
/*     */   extends PriceSohValidator
/*     */ {
/*  27 */   private Log log = LogFactory.getLog(RetailerPriceSohValidator.class);
/*     */ 
/*     */   
/*     */   private RetailerPriceSohRequest request;
/*     */ 
/*     */   
/*     */   public RetailerPriceSohValidator(RetailerPriceSohRequest request, RetailerPriceSohValidationResult result, ProductService productService) {
/*  34 */     super(productService);
/*  35 */     this.request = request;
/*  36 */     this.currentResult = result;
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
/*     */   public boolean validateAuthenticatedRetailer(String authenticatedRetailerId, String authenticatedRetailerStateId) {
/*  50 */     boolean isValid = false;
/*  51 */     String retailerIdFromRequest = this.request.getCustomer().getId();
/*  52 */     String retailerStateIdFromRequest = this.request.getCustomer()
/*  53 */       .getStateCode().toString();
/*  54 */     if (this.log.isDebugEnabled()) {
/*  55 */       this.log
/*  56 */         .debug("validateAuthenticatedRetailer() retailerIdFromRequest,retailerStateIdFromRequest :" + 
/*  57 */           retailerIdFromRequest + 
/*  58 */           "," + 
/*  59 */           retailerStateIdFromRequest + 
/*  60 */           " against authenticatedRetailerId,authenticatedRetailerStateId: " + 
/*  61 */           authenticatedRetailerId + 
/*  62 */           "," + 
/*  63 */           authenticatedRetailerStateId);
/*     */     }
/*  65 */     if (authenticatedRetailerId != null && 
/*  66 */       !authenticatedRetailerId.equals("") && 
/*  67 */       authenticatedRetailerStateId != null && 
/*  68 */       !authenticatedRetailerStateId.equals(""))
/*     */     {
/*     */       
/*  71 */       if (retailerIdFromRequest.equals(authenticatedRetailerId) && 
/*  72 */         retailerStateIdFromRequest
/*  73 */         .equals(authenticatedRetailerStateId)) {
/*  74 */         isValid = true;
/*     */       }
/*     */     }
/*     */     
/*  78 */     if (!isValid) {
/*  79 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/*  80 */           ValidationConfig.AUTHENTICATED_RETAILER_DOES_NOT_MATCH);
/*     */     }
/*     */     
/*  83 */     return isValid;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProductViewWrapper validateAllProductsForCustomer() {
/*  88 */     Product[] xmlProducts = this.request.getProduct();
/*  89 */     ProductId[] productIds = new ProductId[xmlProducts.length];
/*  90 */     for (int i = 0; i < xmlProducts.length; i++) {
/*  91 */       productIds[i] = new ProductId(xmlProducts[i].getCode());
/*     */     }
/*  93 */     ProductViewWrapper productViewWrapper = 
/*  94 */       validateAllProductsForCustomer(getCustomer(), productIds);
/*  95 */     if (productViewWrapper == null) {
/*  96 */       this.currentResult.setProductResponseMessage(ValidationResult.WARN, 
/*  97 */           "Some products might not be avaiable for customer.");
/*     */     }
/*     */     
/* 100 */     return productViewWrapper;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public Customer getCustomerImpl() {
/* 118 */     String customerId = this.request.getCustomer().getId();
/* 119 */     String customerStateId = this.request.getCustomer().getStateCode()
/* 120 */       .toString();
/* 121 */     return validateCustomer(customerStateId, customerId);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\RetailerPriceSohValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */