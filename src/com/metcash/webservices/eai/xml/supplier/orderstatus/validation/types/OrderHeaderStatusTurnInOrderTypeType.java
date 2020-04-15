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
/*     */ public class OrderHeaderStatusTurnInOrderTypeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int VALUE_0_TYPE = 0;
/*  36 */   public static final OrderHeaderStatusTurnInOrderTypeType VALUE_0 = new OrderHeaderStatusTurnInOrderTypeType(0, "R");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_1_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final OrderHeaderStatusTurnInOrderTypeType VALUE_1 = new OrderHeaderStatusTurnInOrderTypeType(1, "B");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_2_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final OrderHeaderStatusTurnInOrderTypeType VALUE_2 = new OrderHeaderStatusTurnInOrderTypeType(2, "O");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_3_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final OrderHeaderStatusTurnInOrderTypeType VALUE_3 = new OrderHeaderStatusTurnInOrderTypeType(3, "T");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_4_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final OrderHeaderStatusTurnInOrderTypeType VALUE_4 = new OrderHeaderStatusTurnInOrderTypeType(4, "");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  81 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private OrderHeaderStatusTurnInOrderTypeType(int type, String value) {
/* 100 */     this.type = type;
/* 101 */     this.stringValue = value;
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
/* 118 */     return _memberTable.elements();
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
/* 129 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 139 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 140 */     members.put("R", VALUE_0);
/* 141 */     members.put("B", VALUE_1);
/* 142 */     members.put("O", VALUE_2);
/* 143 */     members.put("T", VALUE_3);
/* 144 */     members.put("", VALUE_4);
/* 145 */     return members;
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
/* 157 */     return valueOf(this.stringValue);
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
/* 169 */     return this.stringValue;
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
/*     */   public static OrderHeaderStatusTurnInOrderTypeType valueOf(String string) {
/* 183 */     Object obj = null;
/* 184 */     if (string != null) {
/* 185 */       obj = _memberTable.get(string);
/*     */     }
/* 187 */     if (obj == null) {
/* 188 */       String err = string + " is not a valid OrderHeaderStatusTurnInOrderTypeType";
/* 189 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 191 */     return (OrderHeaderStatusTurnInOrderTypeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\types\OrderHeaderStatusTurnInOrderTypeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */