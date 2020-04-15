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
/*     */ 
/*     */ 
/*     */ public class SOHStatusType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int N_TYPE = 0;
/*  38 */   public static final SOHStatusType N = new SOHStatusType(0, "N");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int A_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   public static final SOHStatusType A = new SOHStatusType(1, "A");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int O_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   public static final SOHStatusType O = new SOHStatusType(2, "O");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int S_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   public static final SOHStatusType S = new SOHStatusType(3, "S");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  73 */   private static Hashtable _memberTable = init();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int type;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   private String stringValue = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SOHStatusType(int type, String value) {
/*  92 */     this.type = type;
/*  93 */     this.stringValue = value;
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
/* 110 */     return _memberTable.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 120 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Hashtable init() {
/* 130 */     Hashtable<Object, Object> members = new Hashtable<Object, Object>();
/* 131 */     members.put("N", N);
/* 132 */     members.put("A", A);
/* 133 */     members.put("O", O);
/* 134 */     members.put("S", S);
/* 135 */     return members;
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
/* 147 */     return valueOf(this.stringValue);
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
/* 158 */     return this.stringValue;
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
/*     */   public static SOHStatusType valueOf(String string) {
/* 170 */     Object obj = null;
/* 171 */     if (string != null) {
/* 172 */       obj = _memberTable.get(string);
/*     */     }
/* 174 */     if (obj == null) {
/* 175 */       String err = string + " is not a valid SOHStatusType";
/* 176 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 178 */     return (SOHStatusType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\types\SOHStatusType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */