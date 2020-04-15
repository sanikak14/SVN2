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
/*     */ public class SupplierRepStateCodeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int VALUE_1_TYPE = 0;
/*  36 */   public static final SupplierRepStateCodeType VALUE_1 = new SupplierRepStateCodeType(0, "1");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_2_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final SupplierRepStateCodeType VALUE_2 = new SupplierRepStateCodeType(1, "2");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_3_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final SupplierRepStateCodeType VALUE_3 = new SupplierRepStateCodeType(2, "3");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_4_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final SupplierRepStateCodeType VALUE_4 = new SupplierRepStateCodeType(3, "4");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_5_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final SupplierRepStateCodeType VALUE_5 = new SupplierRepStateCodeType(4, "5");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_6_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final SupplierRepStateCodeType VALUE_6 = new SupplierRepStateCodeType(5, "6");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_7_TYPE = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final SupplierRepStateCodeType VALUE_7 = new SupplierRepStateCodeType(6, "7");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_8_TYPE = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final SupplierRepStateCodeType VALUE_8 = new SupplierRepStateCodeType(7, "8");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_9_TYPE = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public static final SupplierRepStateCodeType VALUE_9 = new SupplierRepStateCodeType(8, "9");
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
/*     */   private SupplierRepStateCodeType(int type, String value) {
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
/*     */   
/*     */   public static SupplierRepStateCodeType valueOf(String string) {
/* 226 */     Object obj = null;
/* 227 */     if (string != null) {
/* 228 */       obj = _memberTable.get(string);
/*     */     }
/* 230 */     if (obj == null) {
/* 231 */       String err = string + " is not a valid SupplierRepStateCodeType";
/* 232 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 234 */     return (SupplierRepStateCodeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\types\SupplierRepStateCodeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */