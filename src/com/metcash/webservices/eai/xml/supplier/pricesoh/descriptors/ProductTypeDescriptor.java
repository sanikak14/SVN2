/*     */ package com.metcash.webservices.eai.xml.supplier.pricesoh.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.ProductCodeTypeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.ProductType;
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
/*     */ import org.exolab.castor.xml.validators.IntValidator;
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
/*     */ public class ProductTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/supplierPriceSoh";
/*  61 */   private String _xmlName = "ProductType";
/*     */   public ProductTypeDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(int.class, "_index", "index", NodeType.Attribute);
/*  70 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  74 */           ProductType target = (ProductType)object;
/*  75 */           if (!target.hasIndex()) return null; 
/*  76 */           return new Integer(target.getIndex());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             ProductType target = (ProductType)object;
/*     */             
/*  84 */             if (value == null)
/*     */               return; 
/*  86 */             target.setIndex(((Integer)value).intValue());
/*  87 */           } catch (Exception ex) {
/*  88 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  92 */           return null;
/*     */         }
/*     */       };
/*  95 */     desc.setSchemaType("int");
/*  96 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  97 */     desc.setRequired(true);
/*  98 */     desc.setMultivalued(false);
/*  99 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 102 */     fieldValidator = new FieldValidator();
/* 103 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 106 */     IntValidator intValidator = new IntValidator();
/* 107 */     fieldValidator.setValidator((TypeValidator)intValidator);
/* 108 */     intValidator.setMinInclusive(1);
/* 109 */     intValidator.setMaxInclusive(9999999);
/*     */     
/* 111 */     desc.setValidator(fieldValidator);
/*     */     
/* 113 */     desc = new XMLFieldDescriptorImpl(String.class, "_code", "code", NodeType.Attribute);
/* 114 */     desc.setImmutable(true);
/* 115 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 119 */           ProductType target = (ProductType)object;
/* 120 */           return target.getCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 126 */             ProductType target = (ProductType)object;
/* 127 */             target.setCode((String)value);
/* 128 */           } catch (Exception ex) {
/* 129 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 133 */           return null;
/*     */         }
/*     */       };
/* 136 */     desc.setSchemaType("string");
/* 137 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 138 */     desc.setRequired(true);
/* 139 */     desc.setMultivalued(false);
/* 140 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 143 */     fieldValidator = new FieldValidator();
/* 144 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 147 */     StringValidator typeValidator = new StringValidator();
/* 148 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 149 */     typeValidator.addPattern("\\d+");
/* 150 */     typeValidator.setWhiteSpace("preserve");
/* 151 */     typeValidator.setMaxLength(14);
/* 152 */     typeValidator.setMinLength(1);
/*     */     
/* 154 */     desc.setValidator(fieldValidator);
/*     */     
/* 156 */     desc = new XMLFieldDescriptorImpl(ProductCodeTypeType.class, "_codeType", "codeType", NodeType.Attribute);
/* 157 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 161 */           ProductType target = (ProductType)object;
/* 162 */           return target.getCodeType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 168 */             ProductType target = (ProductType)object;
/* 169 */             target.setCodeType((ProductCodeTypeType)value);
/* 170 */           } catch (Exception ex) {
/* 171 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 175 */           return null;
/*     */         }
/*     */       };
/* 178 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(ProductCodeTypeType.class, (FieldHandler)xMLFieldHandler);
/* 179 */     desc.setImmutable(true);
/* 180 */     desc.setSchemaType("com.metcash.webservices.eai.xml.globaltypes.types.ProductCodeTypeType");
/* 181 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 182 */     desc.setRequired(true);
/* 183 */     desc.setMultivalued(false);
/* 184 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 187 */     fieldValidator = new FieldValidator();
/* 188 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 191 */     desc.setValidator(fieldValidator);
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
/* 208 */     return null;
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
/* 219 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 229 */     return ProductType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 239 */     return this._nsPrefix;
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
/* 250 */     return this._nsURI;
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
/* 261 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 271 */     return this._xmlName;
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
/* 283 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\descriptors\ProductTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */