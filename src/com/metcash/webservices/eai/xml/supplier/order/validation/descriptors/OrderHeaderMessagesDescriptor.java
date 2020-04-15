/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.mapping.FieldHandler;
/*     */ import org.exolab.castor.xml.FieldValidator;
/*     */ import org.exolab.castor.xml.NodeType;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldHandler;
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
/*     */ public class OrderHeaderMessagesDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public OrderHeaderMessagesDescriptor() {
/*  60 */     this._xmlName = "OrderHeaderMessages";
/*  61 */     this._elementDefinition = true;
/*     */ 
/*     */     
/*  64 */     setCompositorAsSequence();
/*  65 */     XMLFieldDescriptorImpl desc = null;
/*  66 */     FieldHandler handler = null;
/*  67 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     desc = new XMLFieldDescriptorImpl(String.class, "_headerMessageData", "HeaderMessageData", NodeType.Element);
/*  74 */     desc.setImmutable(true);
/*  75 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  79 */           OrderHeaderMessages target = (OrderHeaderMessages)object;
/*  80 */           return target.getHeaderMessageData();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             OrderHeaderMessages target = (OrderHeaderMessages)object;
/*  87 */             target.setHeaderMessageData((String)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return null;
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("string");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  98 */     desc.setMultivalued(false);
/*  99 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 100 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 103 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 106 */     StringValidator typeValidator = new StringValidator();
/* 107 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 108 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 110 */     desc.setValidator(fieldValidator);
/*     */     
/* 112 */     desc = new XMLFieldDescriptorImpl(String.class, "_headerMessageSeverity", "HeaderMessageSeverity", NodeType.Element);
/* 113 */     desc.setImmutable(true);
/* 114 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 118 */           OrderHeaderMessages target = (OrderHeaderMessages)object;
/* 119 */           return target.getHeaderMessageSeverity();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 125 */             OrderHeaderMessages target = (OrderHeaderMessages)object;
/* 126 */             target.setHeaderMessageSeverity((String)value);
/* 127 */           } catch (Exception ex) {
/* 128 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 132 */           return null;
/*     */         }
/*     */       };
/* 135 */     desc.setSchemaType("string");
/* 136 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 137 */     desc.setMultivalued(false);
/* 138 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 139 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 142 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 145 */     typeValidator = new StringValidator();
/* 146 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 147 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 149 */     desc.setValidator(fieldValidator);
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
/* 164 */     return null;
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
/* 175 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 185 */     return OrderHeaderMessages.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 195 */     return this._nsPrefix;
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
/* 206 */     return this._nsURI;
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
/* 217 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 227 */     return this._xmlName;
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
/* 239 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\descriptors\OrderHeaderMessagesDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */