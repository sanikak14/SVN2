/*     */ package com.metcash.webservices.eai.xml.globaltypes.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.CustomerType;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType;
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
/*     */ public class CustomerTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/globalTypes";
/*  61 */   private String _xmlName = "CustomerType";
/*     */   public CustomerTypeDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(String.class, "_id", "id", NodeType.Attribute);
/*  70 */     desc.setImmutable(true);
/*  71 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  75 */           CustomerType target = (CustomerType)object;
/*  76 */           return target.getId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             CustomerType target = (CustomerType)object;
/*  83 */             target.setId((String)value);
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
/* 105 */     typeValidator.addPattern("\\d+");
/* 106 */     typeValidator.setWhiteSpace("preserve");
/* 107 */     typeValidator.setMaxLength(10);
/* 108 */     typeValidator.setMinLength(1);
/*     */     
/* 110 */     desc.setValidator(fieldValidator);
/*     */     
/* 112 */     desc = new XMLFieldDescriptorImpl(StateCodeType.class, "_stateCode", "stateCode", NodeType.Attribute);
/* 113 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 117 */           CustomerType target = (CustomerType)object;
/* 118 */           return target.getStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 124 */             CustomerType target = (CustomerType)object;
/* 125 */             target.setStateCode((StateCodeType)value);
/* 126 */           } catch (Exception ex) {
/* 127 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 131 */           return null;
/*     */         }
/*     */       };
/* 134 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(StateCodeType.class, (FieldHandler)xMLFieldHandler);
/* 135 */     desc.setImmutable(true);
/* 136 */     desc.setSchemaType("StateCodeType");
/* 137 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 138 */     desc.setRequired(true);
/* 139 */     desc.setMultivalued(false);
/* 140 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 143 */     fieldValidator = new FieldValidator();
/* 144 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 147 */     desc.setValidator(fieldValidator);
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
/* 185 */     return CustomerType.class;
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\descriptors\CustomerTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */