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
/*     */ public class StateCodeType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int VALUE_1_TYPE = 0;
/*  36 */   public static final StateCodeType VALUE_1 = new StateCodeType(0, "1");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_2_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final StateCodeType VALUE_2 = new StateCodeType(1, "2");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_3_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final StateCodeType VALUE_3 = new StateCodeType(2, "3");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_4_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final StateCodeType VALUE_4 = new StateCodeType(3, "4");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_5_TYPE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static final StateCodeType VALUE_5 = new StateCodeType(4, "5");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_6_TYPE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static final StateCodeType VALUE_6 = new StateCodeType(5, "6");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_7_TYPE = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final StateCodeType VALUE_7 = new StateCodeType(6, "7");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_8_TYPE = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final StateCodeType VALUE_8 = new StateCodeType(7, "8");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int VALUE_9_TYPE = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public static final StateCodeType VALUE_9 = new StateCodeType(8, "9");
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
/*     */   private StateCodeType(int type, String value) {
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
/*     */   public int getType() {
/* 168 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 178 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 179 */     members.put("1", VALUE_1);
/* 180 */     members.put("2", VALUE_2);
/* 181 */     members.put("3", VALUE_3);
/* 182 */     members.put("4", VALUE_4);
/* 183 */     members.put("5", VALUE_5);
/* 184 */     members.put("6", VALUE_6);
/* 185 */     members.put("7", VALUE_7);
/* 186 */     members.put("8", VALUE_8);
/* 187 */     members.put("9", VALUE_9);
/* 188 */     return members;
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
/* 200 */     return valueOf(this.stringValue);
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
/* 211 */     return this.stringValue;
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
/*     */   public static StateCodeType valueOf(String string) {
/* 223 */     Object obj = null;
/* 224 */     if (string != null) {
/* 225 */       obj = _memberTable.get(string);
/*     */     }
/* 227 */     if (obj == null) {
/* 228 */       String err = string + " is not a valid StateCodeType";
/* 229 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 231 */     return (StateCodeType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\types\StateCodeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */