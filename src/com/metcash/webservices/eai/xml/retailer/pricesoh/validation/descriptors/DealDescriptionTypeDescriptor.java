/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.DealDescriptionType;
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
/*     */ public class DealDescriptionTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public DealDescriptionTypeDescriptor() {
/*  60 */     this._nsURI = "metcash/retailerPriceSohResponse";
/*  61 */     this._xmlName = "DealDescriptionType";
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
/*  72 */     desc = new XMLFieldDescriptorImpl(int.class, "_index", "index", NodeType.Attribute);
/*  73 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  77 */           DealDescriptionType target = (DealDescriptionType)object;
/*  78 */           if (!target.hasIndex()) return null; 
/*  79 */           return new Integer(target.getIndex());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  85 */             DealDescriptionType target = (DealDescriptionType)object;
/*     */             
/*  87 */             if (value == null)
/*     */               return; 
/*  89 */             target.setIndex(((Integer)value).intValue());
/*  90 */           } catch (Exception ex) {
/*  91 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  95 */           return null;
/*     */         }
/*     */       };
/*  98 */     desc.setSchemaType("int");
/*  99 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 100 */     desc.setRequired(true);
/* 101 */     desc.setMultivalued(false);
/* 102 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 105 */     fieldValidator = new FieldValidator();
/* 106 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 109 */     IntValidator intValidator = new IntValidator();
/* 110 */     fieldValidator.setValidator((TypeValidator)intValidator);
/* 111 */     intValidator.setMinInclusive(1);
/* 112 */     intValidator.setMaxInclusive(9999999);
/*     */     
/* 114 */     desc.setValidator(fieldValidator);
/*     */ 
/*     */ 
/*     */     
/* 118 */     desc = new XMLFieldDescriptorImpl(String.class, "_description", "Description", NodeType.Element);
/* 119 */     desc.setImmutable(true);
/* 120 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 124 */           DealDescriptionType target = (DealDescriptionType)object;
/* 125 */           return target.getDescription();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 131 */             DealDescriptionType target = (DealDescriptionType)object;
/* 132 */             target.setDescription((String)value);
/* 133 */           } catch (Exception ex) {
/* 134 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 138 */           return null;
/*     */         }
/*     */       };
/* 141 */     desc.setSchemaType("string");
/* 142 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 143 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 144 */     desc.setRequired(true);
/* 145 */     desc.setMultivalued(false);
/* 146 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 147 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 150 */     fieldValidator = new FieldValidator();
/* 151 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 154 */     StringValidator typeValidator = new StringValidator();
/* 155 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 156 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 158 */     desc.setValidator(fieldValidator);
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
/* 173 */     return null;
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
/* 184 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 194 */     return DealDescriptionType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 204 */     return this._nsPrefix;
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
/* 215 */     return this._nsURI;
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
/* 226 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 236 */     return this._xmlName;
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
/* 248 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\descriptors\DealDescriptionTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */