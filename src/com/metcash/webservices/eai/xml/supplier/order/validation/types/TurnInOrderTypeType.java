/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation.types;
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
/*     */ public class TurnInOrderTypeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int O_TYPE = 0;
/*  36 */   public static final TurnInOrderTypeType O = new TurnInOrderTypeType(0, "O");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int B_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final TurnInOrderTypeType B = new TurnInOrderTypeType(1, "B");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int T_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final TurnInOrderTypeType T = new TurnInOrderTypeType(2, "T");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int R_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final TurnInOrderTypeType R = new TurnInOrderTypeType(3, "R");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  81 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private TurnInOrderTypeType(int type, String value) {
/*  90 */     this.type = type;
/*  91 */     this.stringValue = value;
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
/* 108 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 118 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 128 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 129 */     members.put("O", O);
/* 130 */     members.put("B", B);
/* 131 */     members.put("T", T);
/* 132 */     members.put("R", R);
/* 133 */     return members;
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
/* 145 */     return valueOf(this.stringValue);
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
/* 156 */     return this.stringValue;
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
/*     */   public static TurnInOrderTypeType valueOf(String string) {
/* 168 */     Object obj = null;
/* 169 */     if (string != null) {
/* 170 */       obj = _memberTable.get(string);
/*     */     }
/* 172 */     if (obj == null) {
/* 173 */       String err = string + " is not a valid TurnInOrderTypeType";
/* 174 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 176 */     return (TurnInOrderTypeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\types\TurnInOrderTypeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */