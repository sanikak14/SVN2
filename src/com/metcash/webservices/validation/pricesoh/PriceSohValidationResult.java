/*    */ package com.metcash.webservices.validation.pricesoh;
/*    */ 
/*    */ import com.metcash.webservices.validation.ValidationResult;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class PriceSohValidationResult
/*    */   extends ValidationResult
/*    */ {
/* 13 */   private int currentProductResponseIndex = -1;
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
/*    */   public abstract void setProductResponseMessage(int paramInt, String paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract int createProductResponse();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void resetProductResponseIndex() {
/* 41 */     this.currentProductResponseIndex = 0;
/*    */   }
/*    */   
/*    */   public int getCurrentProductResponseIndex() {
/* 45 */     return this.currentProductResponseIndex;
/*    */   }
/*    */   
/*    */   public int increaseProductResponseIndex() {
/* 49 */     return ++this.currentProductResponseIndex;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\PriceSohValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */