/*     */ package com.metcash.webservices.eai.xml.retailer.order.types;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Hashtable;
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
/*     */ public class ProductCodeTypeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int M_TYPE = 0;
/*  36 */   public static final ProductCodeTypeType M = new ProductCodeTypeType(0, "M");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ProductCodeTypeType(int type, String value) {
/*  60 */     this.type = type;
/*  61 */     this.stringValue = value;
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
/*     */   public static Enumeration enumerate() {
/*  78 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/*  88 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/*  98 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/*  99 */     members.put("M", M);
/* 100 */     return members;
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
/*     */   private Object readResolve() {
/* 112 */     return valueOf(this.stringValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 123 */     return this.stringValue;
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
/*     */   public static ProductCodeTypeType valueOf(String string) {
/* 135 */     Object obj = null;
/* 136 */     if (string != null) {
/* 137 */       obj = _memberTable.get(string);
/*     */     }
/* 139 */     if (obj == null) {
/* 140 */       String err = string + " is not a valid ProductCodeTypeType";
/* 141 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 143 */     return (ProductCodeTypeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\types\ProductCodeTypeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */