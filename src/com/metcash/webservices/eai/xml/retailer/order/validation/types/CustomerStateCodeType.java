/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation.types;
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
/*     */ public class CustomerStateCodeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int VALUE_1_TYPE = 0;
/*  36 */   public static final CustomerStateCodeType VALUE_1 = new CustomerStateCodeType(0, "1");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_2_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final CustomerStateCodeType VALUE_2 = new CustomerStateCodeType(1, "2");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_3_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final CustomerStateCodeType VALUE_3 = new CustomerStateCodeType(2, "3");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_4_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final CustomerStateCodeType VALUE_4 = new CustomerStateCodeType(3, "4");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_5_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final CustomerStateCodeType VALUE_5 = new CustomerStateCodeType(4, "5");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_6_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final CustomerStateCodeType VALUE_6 = new CustomerStateCodeType(5, "6");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_7_TYPE = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final CustomerStateCodeType VALUE_7 = new CustomerStateCodeType(6, "7");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_8_TYPE = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final CustomerStateCodeType VALUE_8 = new CustomerStateCodeType(7, "8");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_9_TYPE = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public static final CustomerStateCodeType VALUE_9 = new CustomerStateCodeType(8, "9");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 131 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CustomerStateCodeType(int type, String value) {
/* 140 */     this.type = type;
/* 141 */     this.stringValue = value;
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
/* 158 */     return _memberTable.elements();
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
/* 169 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 179 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 180 */     members.put("1", VALUE_1);
/* 181 */     members.put("2", VALUE_2);
/* 182 */     members.put("3", VALUE_3);
/* 183 */     members.put("4", VALUE_4);
/* 184 */     members.put("5", VALUE_5);
/* 185 */     members.put("6", VALUE_6);
/* 186 */     members.put("7", VALUE_7);
/* 187 */     members.put("8", VALUE_8);
/* 188 */     members.put("9", VALUE_9);
/* 189 */     return members;
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
/* 201 */     return valueOf(this.stringValue);
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
/* 213 */     return this.stringValue;
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
/*     */   public static CustomerStateCodeType valueOf(String string) {
/* 225 */     Object obj = null;
/* 226 */     if (string != null) {
/* 227 */       obj = _memberTable.get(string);
/*     */     }
/* 229 */     if (obj == null) {
/* 230 */       String err = string + " is not a valid CustomerStateCodeType";
/* 231 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 233 */     return (CustomerStateCodeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\types\CustomerStateCodeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */