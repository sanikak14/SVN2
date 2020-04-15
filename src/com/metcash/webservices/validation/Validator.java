/*    */ package com.metcash.webservices.validation;
/*    */ 
/*    */ import com.metcash.common.services.SupplierRepService;
/*    */ import com.metcash.model.field.CustomerId;
/*    */ import com.metcash.model.field.PillarId;
/*    */ import com.metcash.model.field.StateId;
/*    */ import com.metcash.model.field.SupplierRepId;
/*    */ import com.metcash.model.segment.db.Customer;
/*    */ import com.metcash.model.segment.db.SupplierRep;
/*    */ import com.metcash.webservices.cache.OSCacheHelper;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Validator
/*    */ {
/*    */   public Customer validateCustomer(String xmlStateId, String xmlCustomerId) {
/* 31 */     CustomerId customerId = new CustomerId(xmlCustomerId);
/* 32 */     StateId stateId = new StateId(xmlStateId);
/* 33 */     Customer customer = OSCacheHelper.getCustomerFromCache(PillarId.ALM, 
/* 34 */         stateId, customerId);
/* 35 */     return customer;
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
/*    */   public SupplierRep validateSupplierRep(String xmlStateId, String xmlSuppRepId) throws Exception {
/* 50 */     SupplierRepService repService = new SupplierRepService();
/* 51 */     SupplierRep supplierRep = repService.findSupplierRep(
/* 52 */         new PillarId("ALM"), new StateId(xmlStateId), 
/* 53 */         new SupplierRepId(xmlSuppRepId));
/* 54 */     return supplierRep;
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
/*    */   public boolean validateReferenceId(String refString) {
/* 68 */     if (refString != null) {
/* 69 */       if (!refString.equals("")) {
/* 70 */         if (refString.indexOf("\"") > -1 || 
/* 71 */           refString.indexOf("~") > -1 || 
/* 72 */           refString.indexOf("(") > -1 || 
/* 73 */           refString.indexOf(")") > -1) {
/* 74 */           return false;
/*    */         }
/* 76 */         return true;
/*    */       } 
/*    */       
/* 79 */       return true;
/*    */     } 
/*    */     
/* 82 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isIntegerValue(String number) {
/*    */     try {
/* 88 */       Integer.parseInt(number);
/* 89 */       return true;
/* 90 */     } catch (NumberFormatException nfe) {
/* 91 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\Validator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */