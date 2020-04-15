/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types;
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
/*     */ public class OrderHeaderStatusOrderSourceType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int MFR_TYPE = 0;
/*  36 */   public static final OrderHeaderStatusOrderSourceType MFR = new OrderHeaderStatusOrderSourceType(0, "MFR");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int WEB_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final OrderHeaderStatusOrderSourceType WEB = new OrderHeaderStatusOrderSourceType(1, "WEB");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int WSE_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final OrderHeaderStatusOrderSourceType WSE = new OrderHeaderStatusOrderSourceType(2, "WSE");
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
/*     */   private OrderHeaderStatusOrderSourceType(int type, String value) {
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
/* 120 */     members.put("MFR", MFR);
/* 121 */     members.put("WEB", WEB);
/* 122 */     members.put("WSE", WSE);
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
/*     */   
/*     */   public String toString() {
/* 147 */     return this.stringValue;
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
/*     */   public static OrderHeaderStatusOrderSourceType valueOf(String string) {
/* 161 */     Object obj = null;
/* 162 */     if (string != null) {
/* 163 */       obj = _memberTable.get(string);
/*     */     }
/* 165 */     if (obj == null) {
/* 166 */       String err = string + " is not a valid OrderHeaderStatusOrderSourceType";
/* 167 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 169 */     return (OrderHeaderStatusOrderSourceType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\types\OrderHeaderStatusOrderSourceType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */