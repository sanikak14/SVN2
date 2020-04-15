/*    */ package com.metcash.webservices.utils.jndi;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AlmWebServiceManager
/*    */ {
/*    */   private boolean submitRetailerOrderIsAvailable = true;
/*    */   private boolean submitSupplierOrderIsAvailable = true;
/*    */   private boolean isAvailableGetRetailerPriceSoh = false;
/*    */   private boolean isAvailableGetSupplierPriceSoh = true;
/*    */   private boolean isAvailableGetSupplierOrderStatus = true;
/*    */   private boolean isAvailableGetOrderHistory = true;
/*    */   
/*    */   public void setSubmitRetailerOrderIsAvailable(boolean isAvailable) {
/* 35 */     this.submitRetailerOrderIsAvailable = isAvailable;
/*    */   }
/*    */   
/*    */   public boolean getSubmitRetailerOrderIsAvailable() {
/* 39 */     return this.submitRetailerOrderIsAvailable;
/*    */   }
/*    */   
/*    */   public void setSubmitSupplierOrderIsAvailable(boolean isAvailable) {
/* 43 */     this.submitSupplierOrderIsAvailable = isAvailable;
/*    */   }
/*    */   
/*    */   public boolean getSubmitSupplierOrderIsAvailable() {
/* 47 */     return this.submitSupplierOrderIsAvailable;
/*    */   }
/*    */   
/*    */   public boolean isAvailableGetRetailerPriceSoh() {
/* 51 */     return this.isAvailableGetRetailerPriceSoh;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setAvailableGetRetailerPriceSoh(boolean isAvailableGetRetailerPriceSoh) {
/* 56 */     this.isAvailableGetRetailerPriceSoh = isAvailableGetRetailerPriceSoh;
/*    */   }
/*    */   
/*    */   public boolean isAvailableGetSupplierPriceSoh() {
/* 60 */     return this.isAvailableGetSupplierPriceSoh;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setAvailableGetSupplierPriceSoh(boolean isAvailableGetSupplierPriceSoh) {
/* 65 */     this.isAvailableGetSupplierPriceSoh = isAvailableGetSupplierPriceSoh;
/*    */   }
/*    */   
/*    */   public boolean isAvailableGetSupplierOrderStatus() {
/* 69 */     return this.isAvailableGetSupplierOrderStatus;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setAvailableGetSupplierOrderStatus(boolean isAvailableGetSupplierOrderStatus) {
/* 74 */     this.isAvailableGetSupplierOrderStatus = isAvailableGetSupplierOrderStatus;
/*    */   }
/*    */   
/*    */   public boolean isAvailableGetOrderHistory() {
/* 78 */     return this.isAvailableGetOrderHistory;
/*    */   }
/*    */   
/*    */   public void setAvailableGetOrderHistory(boolean isAvailableGetOrderHistory) {
/* 82 */     this.isAvailableGetOrderHistory = isAvailableGetOrderHistory;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservice\\utils\jndi\AlmWebServiceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */