/*     */ package com.metcash.webservices.validation.order;
/*     */ 
/*     */ import com.metcash.model.segment.db.ProductDetail;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.util.system.Log;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.Validator;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class OrderValidator
/*     */   extends Validator
/*     */ {
/*  35 */   protected List resultsList = new ArrayList();
/*     */   protected OrderValidationResult currentResult;
/*     */   
/*     */   public SupplierRep validateSupplierRep(String xmlStateId, String xmlSuppRepId) throws Exception {
/*  39 */     SupplierRep supplierRep = super.validateSupplierRep(xmlStateId, xmlSuppRepId);
/*  40 */     if (supplierRep == null) {
/*  41 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NO_REP_EXISTS) + ":SupplierRepId:" + xmlSuppRepId + ":SupplierStateId:" + xmlStateId);
/*     */     }
/*  43 */     return supplierRep;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean validateMetcashProductCode(String productDescription, String productCode, int orderQty, int lineId) {
/*  52 */     boolean valid = true;
/*  53 */     if (productCode.length() != 6) {
/*  54 */       valid = false;
/*  55 */       this.currentResult.addLineMessageToOrderDetail(
/*  56 */           String.valueOf(ValidationConfig.MAX_METCASH_PRODUCT_ID) + ":ProductId:" + productCode, 
/*  57 */           productDescription, 
/*  58 */           productCode, 
/*  59 */           ValidationResult.ERROR, 
/*  60 */           orderQty, 
/*  61 */           lineId);
/*     */     } 
/*     */     
/*  64 */     if (!isIntegerValue(productCode)) {
/*  65 */       valid = false;
/*  66 */       this.currentResult.addLineMessageToOrderDetail(
/*  67 */           String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + ":ProductId:" + productCode, 
/*  68 */           productDescription, 
/*  69 */           productCode, 
/*  70 */           ValidationResult.ERROR, 
/*  71 */           orderQty, 
/*  72 */           lineId);
/*     */     } 
/*     */     
/*  75 */     return valid;
/*     */   }
/*     */   
/*     */   public boolean validateCustomerOrderId(String customerOrderId) {
/*  79 */     boolean valid = true;
				Log.info(this, "VALIDTECUSTOMERORDERID*********");
/*  81 */     if (!validateReferenceId(customerOrderId)) {
/*  82 */       valid = false;
/*  83 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.INVALID_CHARACTERS) + ":CustomerOrderReference:" + customerOrderId);
/*     */     } 
				Log.debug(this,"*****************VALID ORDERID?------------"+ valid);
/*  85 */     return valid;

/*     */   }
/*     */   
/*     */   public boolean validateOrderQuantity(int orderLineNum, int orderQty, String productId, ProductDetail productDetail) {
/*  89 */     boolean isValid = true;
/*  90 */     if (productDetail != null) {
/*     */       
/*  92 */       if (orderQty == 0 || orderQty < productDetail.minOrdQty.internalValue()) {
/*  93 */         isValid = false;
/*  94 */         this.currentResult.addLineMessageToOrderDetail(
/*  95 */             String.valueOf(ValidationConfig.MIN_ORDER_QTY_NOT_MET) + ":ProductId:" + productId + ":OrderQty:" + orderQty, 
/*  96 */             productDetail.productDescription.internalValue(), 
/*  97 */             productId, 
/*  98 */             ValidationResult.ERROR, 
/*  99 */             orderQty, 
/* 100 */             orderLineNum);
/* 101 */         Log.info(this, "OV:validateOrderQuantity found QTY less than MIN ORD QTY ");
/*     */       } 
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
/* 118 */       return isValid;
/*     */     } 
/*     */     
/* 121 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\OrderValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */