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
/*     */ public class OrderHeaderStatusStageType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int R_TYPE = 0;
/*  36 */   public static final OrderHeaderStatusStageType R = new OrderHeaderStatusStageType(0, "R");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int P_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final OrderHeaderStatusStageType P = new OrderHeaderStatusStageType(1, "P");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int E_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final OrderHeaderStatusStageType E = new OrderHeaderStatusStageType(2, "E");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int I_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final OrderHeaderStatusStageType I = new OrderHeaderStatusStageType(3, "I");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int C_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final OrderHeaderStatusStageType C = new OrderHeaderStatusStageType(4, "C");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int J_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final OrderHeaderStatusStageType J = new OrderHeaderStatusStageType(5, "J");
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
/*     */   private OrderHeaderStatusStageType(int type, String value) {
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
/* 150 */     members.put("R", R);
/* 151 */     members.put("P", P);
/* 152 */     members.put("E", E);
/* 153 */     members.put("I", I);
/* 154 */     members.put("C", C);
/* 155 */     members.put("J", J);
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
/*     */   public static OrderHeaderStatusStageType valueOf(String string) {
/* 193 */     Object obj = null;
/* 194 */     if (string != null) {
/* 195 */       obj = _memberTable.get(string);
/*     */     }
/* 197 */     if (obj == null) {
/* 198 */       String err = string + " is not a valid OrderHeaderStatusStageType";
/* 199 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 201 */     return (OrderHeaderStatusStageType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\types\OrderHeaderStatusStageType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */