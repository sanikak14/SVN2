/*     */ package com.metcash.webservices.validation.pricesoh;
/*     */ 
/*     */ import com.metcash.common.services.ProductService;
/*     */ import com.metcash.model.field.ProductId;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.webservices.SupplierOrderHelper;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.ProductCodeTypeType;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.Validator;
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
/*     */ public abstract class PriceSohValidator
/*     */   extends Validator
/*     */ {
/*     */   protected PriceSohValidationResult currentResult;
/*     */   ProductService productService;
/*     */   private Customer customer;
/*  30 */   private static Log log = LogFactory.getLog(PriceSohValidator.class);
/*     */   
/*     */   public PriceSohValidator(ProductService productService) {
/*  33 */     this.productService = productService;
/*     */   }
/*     */   
/*     */   public Customer getCustomer() {
/*  37 */     if (this.customer == null) {
/*  38 */       this.customer = getCustomerImpl();
/*     */     }
/*  40 */     return this.customer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract Customer getCustomerImpl();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierRep validateSupplierRep(String xmlStateId, String xmlSuppRepId) {
/*  58 */     SupplierRep supplierRep = null;
/*     */     try {
/*  60 */       supplierRep = super.validateSupplierRep(xmlStateId, xmlSuppRepId);
/*  61 */     } catch (Exception e) {
/*  62 */       log.error("validateSupplierRep()", e);
/*     */     } 
/*     */     
/*  65 */     if (supplierRep == null) {
/*  66 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/*  67 */           String.valueOf(ValidationConfig.NO_REP_EXISTS) + ":SupplierRepId:" + 
/*  68 */           xmlSuppRepId + ":SupplierStateId:" + xmlStateId);
/*     */     }
/*  70 */     return supplierRep;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ProductViewWrapper validateAllProductsForCustomer(Customer customer, ProductId[] productIds) {
/*  76 */     ProductViewWrapper productViewWrapper = null;
/*     */     try {
/*  78 */       productViewWrapper = this.productService.findProductViewsByIdArray(
/*  79 */           customer, productIds, false);
/*  80 */     } catch (Exception e) {
/*  81 */       log.error("validateAllProductsForCustomer()", e);
/*     */     } 
/*     */     
/*  84 */     return productViewWrapper;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String convertToMetcashProductCode(String productCode, ProductCodeTypeType codeType, SupplierRep supplierRep, Customer customer) {
/* 181 */     String metcashProductCode = null;
/* 182 */     if (codeType == ProductCodeTypeType.V) {
/* 183 */       metcashProductCode = 
/* 184 */         SupplierOrderHelper.findCrossReferencedProduct(supplierRep, customer, 
/* 185 */           productCode);
/*     */     }
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
/* 214 */     return metcashProductCode;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\PriceSohValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */