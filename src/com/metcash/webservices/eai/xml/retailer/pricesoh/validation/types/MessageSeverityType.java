/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types;
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
/*     */ public class MessageSeverityType
/*     */   implements Serializable
/*     */ {
/*     */   public static final int ERROR_TYPE = 0;
/*  36 */   public static final MessageSeverityType ERROR = new MessageSeverityType(0, "ERROR");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int WARN_TYPE = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final MessageSeverityType WARN = new MessageSeverityType(1, "WARN");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int INFO_TYPE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final MessageSeverityType INFO = new MessageSeverityType(2, "INFO");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int DEBUG_TYPE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   public static final MessageSeverityType DEBUG = new MessageSeverityType(3, "DEBUG");
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
/*     */   private MessageSeverityType(int type, String value) {
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
/* 129 */     members.put("ERROR", ERROR);
/* 130 */     members.put("WARN", WARN);
/* 131 */     members.put("INFO", INFO);
/* 132 */     members.put("DEBUG", DEBUG);
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
/*     */   public static MessageSeverityType valueOf(String string) {
/* 168 */     Object obj = null;
/* 169 */     if (string != null) {
/* 170 */       obj = _memberTable.get(string);
/*     */     }
/* 172 */     if (obj == null) {
/* 173 */       String err = string + " is not a valid MessageSeverityType";
/* 174 */       throw new IllegalArgumentException(err);
/*     */     } 
/* 176 */     return (MessageSeverityType)obj;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\types\MessageSeverityType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */