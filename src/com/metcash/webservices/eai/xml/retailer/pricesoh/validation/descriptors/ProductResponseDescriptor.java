/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Message;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ProductResponse;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProductResponseDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public ProductResponseDescriptor() {
/*  60 */     this._nsURI = "metcash/retailerPriceSohResponse";
/*  61 */     this._xmlName = "ProductResponse";
/*  62 */     this._elementDefinition = true;
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
/*  77 */           ProductResponse target = (ProductResponse)object;
/*  78 */           if (!target.hasIndex()) return null; 
/*  79 */           return new Integer(target.getIndex());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  85 */             ProductResponse target = (ProductResponse)object;
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
/* 109 */     IntValidator typeValidator = new IntValidator();
/* 110 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 111 */     typeValidator.setMinInclusive(1);
/* 112 */     typeValidator.setMaxInclusive(9999999);
/*     */     
/* 114 */     desc.setValidator(fieldValidator);
/*     */ 
/*     */ 
/*     */     
/* 118 */     desc = new XMLFieldDescriptorImpl(RetailerProductDetail.class, "_retailerProductDetail", "RetailerProductDetail", NodeType.Element);
/* 119 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 123 */           ProductResponse target = (ProductResponse)object;
/* 124 */           return target.getRetailerProductDetail();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 130 */             ProductResponse target = (ProductResponse)object;
/* 131 */             target.setRetailerProductDetail((RetailerProductDetail)value);
/* 132 */           } catch (Exception ex) {
/* 133 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 137 */           return new RetailerProductDetail();
/*     */         }
/*     */       };
/* 140 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail");
/* 141 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 142 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 143 */     desc.setMultivalued(false);
/* 144 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 145 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 148 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 151 */     desc.setValidator(fieldValidator);
/*     */     
/* 153 */     desc = new XMLFieldDescriptorImpl(Message.class, "_message", "Message", NodeType.Element);
/* 154 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 158 */           ProductResponse target = (ProductResponse)object;
/* 159 */           return target.getMessage();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 165 */             ProductResponse target = (ProductResponse)object;
/* 166 */             target.setMessage((Message)value);
/* 167 */           } catch (Exception ex) {
/* 168 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 172 */           return new Message();
/*     */         }
/*     */       };
/* 175 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Message");
/* 176 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 177 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 178 */     desc.setMultivalued(false);
/* 179 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 180 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 183 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 186 */     desc.setValidator(fieldValidator);
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
/* 201 */     return null;
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
/* 212 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 222 */     return ProductResponse.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 232 */     return this._nsPrefix;
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
/* 243 */     return this._nsURI;
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
/* 254 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 264 */     return this._xmlName;
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
/* 276 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\descriptors\ProductResponseDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */