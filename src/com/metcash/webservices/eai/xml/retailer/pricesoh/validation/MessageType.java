/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.Marshaller;
/*     */ import org.exolab.castor.xml.Unmarshaller;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ import org.exolab.castor.xml.Validator;
/*     */ import org.xml.sax.ContentHandler;
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
/*     */ public class MessageType
/*     */   implements Serializable
/*     */ {
/*     */   private String _messageData;
/*     */   private MessageSeverityType _messageSeverity;
/*     */   
/*     */   public String getMessageData() {
/*  60 */     return this._messageData;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MessageSeverityType getMessageSeverity() {
/*  70 */     return this._messageSeverity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/*     */     try {
/*  81 */       validate();
/*  82 */     } catch (ValidationException vex) {
/*  83 */       return false;
/*     */     } 
/*  85 */     return true;
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
/*     */   public void marshal(Writer out) throws MarshalException, ValidationException {
/* 100 */     Marshaller.marshal(this, out);
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
/*     */   public void marshal(ContentHandler handler) throws IOException, MarshalException, ValidationException {
/* 117 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMessageData(String messageData) {
/* 127 */     this._messageData = messageData;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMessageSeverity(MessageSeverityType messageSeverity) {
/* 137 */     this._messageSeverity = messageSeverity;
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
/*     */   public static MessageType unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 154 */     return (MessageType)Unmarshaller.unmarshal(MessageType.class, reader);
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
/*     */   public void validate() throws ValidationException {
/* 166 */     Validator validator = new Validator();
/* 167 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\MessageType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */