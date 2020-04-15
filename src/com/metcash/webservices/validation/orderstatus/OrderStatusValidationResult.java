/*    */ package com.metcash.webservices.validation.orderstatus;
/*    */ 
/*    */ import com.metcash.webservices.validation.ValidationResult;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class OrderStatusValidationResult
/*    */   extends ValidationResult
/*    */ {
/* 13 */   private int currentOrderResponseIndex = -1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void setMessage(int paramInt, String paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void setOrderResponseMessage(int paramInt, String paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract int createOrderResponse();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void resetOrderResponseIndex() {
/* 42 */     this.currentOrderResponseIndex = 0;
/*    */   }
/*    */   
/*    */   public int getCurrentOrderResponseIndex() {
/* 46 */     return this.currentOrderResponseIndex;
/*    */   }
/*    */   
/*    */   public int increaseOrderResponseIndex() {
/* 50 */     return ++this.currentOrderResponseIndex;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderstatus\OrderStatusValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */