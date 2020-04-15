/*    */ package com.metcash.webservices.validation.orderhistory;
/*    */ 
/*    */ import com.metcash.model.segment.db.OrderHeader;
/*    */ import com.metcash.webservices.eai.xml.globaltypes.types.SeverityType;
/*    */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.Message;
/*    */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory;
/*    */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse;
/*    */ import com.metcash.webservices.validation.ValidationResult;
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
/*    */ public class SupplierOrderHistoryValidationResult
/*    */   extends ValidationResult
/*    */ {
/* 29 */   private OrderHistoryResponse response = new OrderHistoryResponse();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OrderHistoryResponse getResponse() {
/* 38 */     return this.response;
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
/*    */   public void setMessage(int severity, String message) {
/* 50 */     if (severity == ValidationResult.ERROR) {
/* 51 */       setInError(true);
/*    */     }
/*    */     
/* 54 */     Message xmlMessage = new Message();
/* 55 */     xmlMessage.setData(message);
/* 56 */     xmlMessage
/* 57 */       .setSeverity(SeverityType.valueOf(severityToString(severity)));
/*    */     
/* 59 */     this.response.setMessage(xmlMessage);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setOrderHistory(OrderHeader order) {
/* 69 */     OrderHistory orderHistory = new OrderHistory();
/* 70 */     orderHistory.setWebOrderId((order.getOrderKey()).webOrderId
/* 71 */         .internalValue());
/* 72 */     orderHistory.setCreatedDate(order.createdDate.internalValue());
/* 73 */     this.response.addOrderHistory(orderHistory);
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderhistory\SupplierOrderHistoryValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */