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
/*     */ public class ApplyBonusType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int Y_TYPE = 0;
/*  36 */   public static final ApplyBonusType Y = new ApplyBonusType(0, "Y");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int N_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final ApplyBonusType N = new ApplyBonusType(1, "N");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ApplyBonusType(int type, String value) {
/*  70 */     this.type = type;
/*  71 */     this.stringValue = value;
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
/*  88 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/*  98 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 108 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 109 */     members.put("Y", Y);
/* 110 */     members.put("N", N);
/* 111 */     return members;
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
/* 123 */     return valueOf(this.stringValue);
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
/* 134 */     return this.stringValue;
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
/*     */   public static ApplyBonusType valueOf(String string) {
/* 146 */     Object obj = null;
/* 147 */     if (string != null) {
/* 148 */       obj = _memberTable.get(string);
/*     */     }
/* 150 */     if (obj == null) {
/* 151 */       String err = string + " is not a valid ApplyBonusType";
/* 152 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 154 */     return (ApplyBonusType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\types\ApplyBonusType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */