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
/*     */ public class OrderHeaderStatusStatusType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int C_TYPE = 0;
/*  36 */   public static final OrderHeaderStatusStatusType C = new OrderHeaderStatusStatusType(0, "C");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int I_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final OrderHeaderStatusStatusType I = new OrderHeaderStatusStatusType(1, "I");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int P_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final OrderHeaderStatusStatusType P = new OrderHeaderStatusStatusType(2, "P");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int X_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final OrderHeaderStatusStatusType X = new OrderHeaderStatusStatusType(3, "X");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int J_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final OrderHeaderStatusStatusType J = new OrderHeaderStatusStatusType(4, "J");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int U_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final OrderHeaderStatusStatusType U = new OrderHeaderStatusStatusType(5, "U");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private OrderHeaderStatusStatusType(int type, String value) {
/* 110 */     this.type = type;
/* 111 */     this.stringValue = value;
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
/* 128 */     return _memberTable.elements();
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
/* 139 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 149 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 150 */     members.put("C", C);
/* 151 */     members.put("I", I);
/* 152 */     members.put("P", P);
/* 153 */     members.put("X", X);
/* 154 */     members.put("J", J);
/* 155 */     members.put("U", U);
/* 156 */     return members;
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
/* 168 */     return valueOf(this.stringValue);
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
/* 180 */     return this.stringValue;
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
/*     */   public static OrderHeaderStatusStatusType valueOf(String string) {
/* 193 */     Object obj = null;
/* 194 */     if (string != null) {
/* 195 */       obj = _memberTable.get(string);
/*     */     }
/* 197 */     if (obj == null) {
/* 198 */       String err = string + " is not a valid OrderHeaderStatusStatusType";
/* 199 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 201 */     return (OrderHeaderStatusStatusType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\types\OrderHeaderStatusStatusType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */