/*    */ package com.metcash.webservices.validation.orderstatus;
/*    */ 
/*    */ import com.metcash.common.services.OrderService;
/*    */ import com.metcash.common.services.SupplierRepOrderService;
/*    */ import com.metcash.model.field.WebOrderId;
/*    */ import com.metcash.model.segment.ViewOrder;
/*    */ import com.metcash.model.segment.db.SupplierRep;
/*    */ import com.metcash.webservices.config.ValidationConfig;
/*    */ import com.metcash.webservices.validation.ValidationResult;
/*    */ import com.metcash.webservices.validation.Validator;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class OrderStatusValidator
/*    */   extends Validator
/*    */ {
/*    */   protected OrderStatusValidationResult currentResult;
/*    */   protected OrderService orderService;
/* 30 */   private static Log log = LogFactory.getLog(OrderStatusValidator.class);
/*    */   
/*    */   public OrderStatusValidator(OrderService orderService) {
/* 33 */     this.orderService = orderService;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SupplierRep validateSupplierRep(String xmlStateId, String xmlSuppRepId) {
/* 49 */     SupplierRep supplierRep = null;
/*    */     try {
/* 51 */       supplierRep = super.validateSupplierRep(xmlStateId, xmlSuppRepId);
/* 52 */     } catch (Exception e) {
/* 53 */       log.error("validateSupplierRep()", e);
/*    */     } 
/*    */     
/* 56 */     if (supplierRep == null) {
/* 57 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/* 58 */           String.valueOf(ValidationConfig.NO_REP_EXISTS) + ":SupplierRepId:" + 
/* 59 */           xmlSuppRepId + ":SupplierStateId:" + xmlStateId);
/*    */     }
/* 61 */     return supplierRep;
/*    */   }
/*    */   
/*    */   public Map validateAllOrders(WebOrderId[] webOrderIds) {
/* 65 */     Map<Object, Object> orders = new HashMap<Object, Object>();
/*    */     try {
/* 67 */       ViewOrder order = null;
/* 68 */       for (int i = 0; i < webOrderIds.length; i++) {
/* 69 */         order = ((SupplierRepOrderService)this.orderService)
/* 70 */           .findViewOrder(webOrderIds[i]);
/* 71 */         if (order != null) {
/* 72 */           orders.put(webOrderIds[i], order);
/*    */         }
/*    */       } 
/* 75 */     } catch (Exception e) {
/* 76 */       log.error("validateAllOrders()", e);
/*    */     } 
/*    */     
/* 79 */     return orders;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderstatus\OrderStatusValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */