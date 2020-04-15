/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.MessageType;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.mapping.FieldHandler;
/*     */ import org.exolab.castor.xml.FieldValidator;
/*     */ import org.exolab.castor.xml.NodeType;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldHandler;
/*     */ import org.exolab.castor.xml.handlers.EnumFieldHandler;
/*     */ import org.exolab.castor.xml.util.XMLClassDescriptorImpl;
/*     */ import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
/*     */ import org.exolab.castor.xml.validators.StringValidator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MessageTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public MessageTypeDescriptor() {
/*  60 */     this._nsURI = "metcash/retailerPriceSohResponse";
/*  61 */     this._xmlName = "MessageType";
/*  62 */     this._elementDefinition = false;
/*     */ 
/*     */     
/*  65 */     setCompositorAsSequence();
/*  66 */     XMLFieldDescriptorImpl desc = null;
/*  67 */     FieldHandler handler = null;
/*  68 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     desc = new XMLFieldDescriptorImpl(String.class, "_messageData", "MessageData", NodeType.Element);
/*  75 */     desc.setImmutable(true);
/*  76 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  80 */           MessageType target = (MessageType)object;
/*  81 */           return target.getMessageData();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  87 */             MessageType target = (MessageType)object;
/*  88 */             target.setMessageData((String)value);
/*  89 */           } catch (Exception ex) {
/*  90 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  94 */           return null;
/*     */         }
/*     */       };
/*  97 */     desc.setSchemaType("string");
/*  98 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  99 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 100 */     desc.setRequired(true);
/* 101 */     desc.setMultivalued(false);
/* 102 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 103 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 106 */     fieldValidator = new FieldValidator();
/* 107 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 110 */     StringValidator typeValidator = new StringValidator();
/* 111 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 112 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 114 */     desc.setValidator(fieldValidator);
/*     */     
/* 116 */     desc = new XMLFieldDescriptorImpl(MessageSeverityType.class, "_messageSeverity", "MessageSeverity", NodeType.Element);
/* 117 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 121 */           MessageType target = (MessageType)object;
/* 122 */           return target.getMessageSeverity();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 128 */             MessageType target = (MessageType)object;
/* 129 */             target.setMessageSeverity((MessageSeverityType)value);
/* 130 */           } catch (Exception ex) {
/* 131 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 135 */           return null;
/*     */         }
/*     */       };
/* 138 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(MessageSeverityType.class, (FieldHandler)xMLFieldHandler);
/* 139 */     desc.setImmutable(true);
/* 140 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType");
/* 141 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 142 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 143 */     desc.setRequired(true);
/* 144 */     desc.setMultivalued(false);
/* 145 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 146 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 149 */     fieldValidator = new FieldValidator();
/* 150 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 153 */     desc.setValidator(fieldValidator);
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
/* 168 */     return null;
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
/* 179 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 189 */     return MessageType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 199 */     return this._nsPrefix;
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
/* 210 */     return this._nsURI;
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
/* 221 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 231 */     return this._xmlName;
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
/* 243 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\descriptors\MessageTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */