/*    */ package com.metcash.webservices.validation;
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
/*    */ public abstract class ValidationResult
/*    */ {
/* 16 */   public static int ERROR = 0;
/* 17 */   public static int WARN = 1;
/* 18 */   public static int INFO = 2;
/* 19 */   public static int DEBUG = 3;
/* 20 */   public static String ERROR_KEY = "ERROR";
/* 21 */   public static String WARN_KEY = "WARN";
/* 22 */   public static String INFO_KEY = "INFO";
/* 23 */   public static String DEBUG_KEY = "DEBUG";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private boolean inError;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String convertUnitQtyToDecimalFormat(int unitQty, int packQty) {
/* 39 */     int caseQty = unitQty / packQty;
/* 40 */     int remainingUnitQty = unitQty % packQty;
/* 41 */     StringBuffer sb = new StringBuffer();
/* 42 */     sb.append(caseQty);
/* 43 */     sb.append('.');
/* 44 */     sb.append(remainingUnitQty);
/* 45 */     return sb.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isInError() {
/* 55 */     return this.inError;
/*    */   }
/*    */   
/*    */   public void setInError(boolean inError) {
/* 59 */     this.inError = inError;
/*    */   }
/*    */   
/*    */   public String severityToString(int severity) {
/* 63 */     switch (severity) {
/*    */       case 0:
/* 65 */         return ERROR_KEY;
/*    */       case 1:
/* 67 */         return WARN_KEY;
/*    */       case 2:
/* 69 */         return INFO_KEY;
/*    */       case 3:
/* 71 */         return DEBUG_KEY;
/*    */     } 
/* 73 */     return "";
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\ValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */