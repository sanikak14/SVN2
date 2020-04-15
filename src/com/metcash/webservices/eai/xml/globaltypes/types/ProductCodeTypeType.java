/*     */ package com.metcash.webservices.eai.xml.globaltypes.types;
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
/*     */ 
/*     */ public class ProductCodeTypeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int M_TYPE = 0;
/*  37 */   public static final ProductCodeTypeType M = new ProductCodeTypeType(0, "M");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int V_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   public static final ProductCodeTypeType V = new ProductCodeTypeType(1, "V");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int R_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   public static final ProductCodeTypeType R = new ProductCodeTypeType(2, "R");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ProductCodeTypeType(int type, String value) {
/*  81 */     this.type = type;
/*  82 */     this.stringValue = value;
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
/*  99 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 109 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 119 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 120 */     members.put("M", M);
/* 121 */     members.put("V", V);
/* 122 */     members.put("R", R);
/* 123 */     return members;
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
/* 135 */     return valueOf(this.stringValue);
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
/* 146 */     return this.stringValue;
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
/* 158 */     Object obj = null;
/* 159 */     if (string != null) {
/* 160 */       obj = _memberTable.get(string);
/*     */     }
/* 162 */     if (obj == null) {
/* 163 */       String err = string + " is not a valid ProductCodeTypeType";
/* 164 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 166 */     return (ProductCodeTypeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\types\ProductCodeTypeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */