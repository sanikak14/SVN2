/*     */ package com.metcash.webservices.eai.xml.globaltypes.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.MessageType;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SeverityType;
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
/*  60 */   private String _nsURI = "metcash/globalTypes";
/*  61 */   private String _xmlName = "MessageType";
/*     */   public MessageTypeDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(String.class, "_data", "data", NodeType.Attribute);
/*  70 */     desc.setImmutable(true);
/*  71 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  75 */           MessageType target = (MessageType)object;
/*  76 */           return target.getData();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             MessageType target = (MessageType)object;
/*  83 */             target.setData((String)value);
/*  84 */           } catch (Exception ex) {
/*  85 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  89 */           return null;
/*     */         }
/*     */       };
/*  92 */     desc.setSchemaType("string");
/*  93 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  94 */     desc.setRequired(true);
/*  95 */     desc.setMultivalued(false);
/*  96 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/*  99 */     fieldValidator = new FieldValidator();
/* 100 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 103 */     StringValidator typeValidator = new StringValidator();
/* 104 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 105 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 107 */     desc.setValidator(fieldValidator);
/*     */     
/* 109 */     desc = new XMLFieldDescriptorImpl(SeverityType.class, "_severity", "severity", NodeType.Attribute);
/* 110 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 114 */           MessageType target = (MessageType)object;
/* 115 */           return target.getSeverity();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 121 */             MessageType target = (MessageType)object;
/* 122 */             target.setSeverity((SeverityType)value);
/* 123 */           } catch (Exception ex) {
/* 124 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 128 */           return null;
/*     */         }
/*     */       };
/* 131 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(SeverityType.class, (FieldHandler)xMLFieldHandler);
/* 132 */     desc.setImmutable(true);
/* 133 */     desc.setSchemaType("SeverityType");
/* 134 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 135 */     desc.setRequired(true);
/* 136 */     desc.setMultivalued(false);
/* 137 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 140 */     fieldValidator = new FieldValidator();
/* 141 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 144 */     desc.setValidator(fieldValidator);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean _elementDefinition = false;
/*     */ 
/*     */   
/*     */   private String _nsPrefix;
/*     */ 
/*     */   
/*     */   private XMLFieldDescriptor _identity;
/*     */ 
/*     */ 
/*     */   
/*     */   public AccessMode getAccessMode() {
/* 161 */     return null;
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
/* 172 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 182 */     return MessageType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 192 */     return this._nsPrefix;
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
/* 203 */     return this._nsURI;
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
/* 214 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 224 */     return this._xmlName;
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
/* 236 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\descriptors\MessageTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */