/*     */ package com.metcash.webservices.eai.xml.supplier.order.types;
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
/*     */   public static final int V_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final ProductCodeTypeType V = new ProductCodeTypeType(1, "V");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int A_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final ProductCodeTypeType A = new ProductCodeTypeType(2, "A");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ProductCodeTypeType(int type, String value) {
/*  80 */     this.type = type;
/*  81 */     this.stringValue = value;
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
/*  98 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 108 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 118 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 119 */     members.put("M", M);
/* 120 */     members.put("V", V);
/* 121 */     members.put("A", A);
/* 122 */     return members;
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
/* 134 */     return valueOf(this.stringValue);
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
/* 145 */     return this.stringValue;
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
/* 157 */     Object obj = null;
/* 158 */     if (string != null) {
/* 159 */       obj = _memberTable.get(string);
/*     */     }
/* 161 */     if (obj == null) {
/* 162 */       String err = string + " is not a valid ProductCodeTypeType";
/* 163 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 165 */     return (ProductCodeTypeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\types\ProductCodeTypeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */