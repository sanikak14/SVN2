/*     */ package com.metcash.webservices.eai.xml.supplier.orderhistory.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.descriptors.MessageTypeDescriptor;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.Message;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLClassDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
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
/*     */ 
/*     */ public class MessageDescriptor
/*     */   extends MessageTypeDescriptor
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public MessageDescriptor() {
/*  60 */     setExtendsWithoutFlatten((XMLClassDescriptor)new MessageTypeDescriptor());
/*  61 */     this._nsURI = "metcash/orderHistoryResponse";
/*  62 */     this._xmlName = "Message";
/*  63 */     this._elementDefinition = true;
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
/*     */   public AccessMode getAccessMode() {
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FieldDescriptor getIdentity() {
/*  89 */     if (this._identity == null) {
/*  90 */       return super.getIdentity();
/*     */     }
/*  92 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 102 */     return Message.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 112 */     return this._nsPrefix;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpaceURI() {
/* 123 */     return this._nsURI;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeValidator getValidator() {
/* 134 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 144 */     return this._xmlName;
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
/*     */   public boolean isElementDefinition() {
/* 156 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderhistory\validation\descriptors\MessageDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */