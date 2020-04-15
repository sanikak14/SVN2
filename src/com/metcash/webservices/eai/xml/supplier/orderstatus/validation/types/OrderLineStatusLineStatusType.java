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
/*     */ public class OrderLineStatusLineStatusType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int __TYPE = 0;
/*  36 */   public static final OrderLineStatusLineStatusType _ = new OrderLineStatusLineStatusType(0, " ");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_0_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final OrderLineStatusLineStatusType VALUE_0 = new OrderLineStatusLineStatusType(1, "0");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_1_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final OrderLineStatusLineStatusType VALUE_1 = new OrderLineStatusLineStatusType(2, "1");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_2_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final OrderLineStatusLineStatusType VALUE_2 = new OrderLineStatusLineStatusType(3, "2");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_3_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final OrderLineStatusLineStatusType VALUE_3 = new OrderLineStatusLineStatusType(4, "3");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_4_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final OrderLineStatusLineStatusType VALUE_4 = new OrderLineStatusLineStatusType(5, "4");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_5_TYPE = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final OrderLineStatusLineStatusType VALUE_5 = new OrderLineStatusLineStatusType(6, "5");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_6_TYPE = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final OrderLineStatusLineStatusType VALUE_6 = new OrderLineStatusLineStatusType(7, "6");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_7_TYPE = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public static final OrderLineStatusLineStatusType VALUE_7 = new OrderLineStatusLineStatusType(8, "7");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_8_TYPE = 9;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 126 */   public static final OrderLineStatusLineStatusType VALUE_8 = new OrderLineStatusLineStatusType(9, "8");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_9_TYPE = 10;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 136 */   public static final OrderLineStatusLineStatusType VALUE_9 = new OrderLineStatusLineStatusType(10, "9");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 151 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private OrderLineStatusLineStatusType(int type, String value) {
/* 160 */     this.type = type;
/* 161 */     this.stringValue = value;
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
/* 178 */     return _memberTable.elements();
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
/* 189 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 199 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 200 */     members.put(" ", _);
/* 201 */     members.put("0", VALUE_0);
/* 202 */     members.put("1", VALUE_1);
/* 203 */     members.put("2", VALUE_2);
/* 204 */     members.put("3", VALUE_3);
/* 205 */     members.put("4", VALUE_4);
/* 206 */     members.put("5", VALUE_5);
/* 207 */     members.put("6", VALUE_6);
/* 208 */     members.put("7", VALUE_7);
/* 209 */     members.put("8", VALUE_8);
/* 210 */     members.put("9", VALUE_9);
/* 211 */     return members;
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
/* 223 */     return valueOf(this.stringValue);
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
/* 235 */     return this.stringValue;
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
/*     */   public static OrderLineStatusLineStatusType valueOf(String string) {
/* 248 */     Object obj = null;
/* 249 */     if (string != null) {
/* 250 */       obj = _memberTable.get(string);
/*     */     }
/* 252 */     if (obj == null) {
/* 253 */       String err = string + " is not a valid OrderLineStatusLineStatusType";
/* 254 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 256 */     return (OrderLineStatusLineStatusType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\types\OrderLineStatusLineStatusType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */