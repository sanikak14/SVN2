/*     */ package com.metcash.webservices.eai.xml.supplier.pricesoh.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierPriceSohResponseDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public SupplierPriceSohResponseDescriptor() {
/*  60 */     this._nsURI = "metcash/supplierPriceSohResponse";
/*  61 */     this._xmlName = "SupplierPriceSohResponse";
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
/*     */ 
/*     */     
/*  74 */     desc = new XMLFieldDescriptorImpl(ProductResponse.class, "_productResponseList", "ProductResponse", NodeType.Element);
/*  75 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  79 */           SupplierPriceSohResponse target = (SupplierPriceSohResponse)object;
/*  80 */           return target.getProductResponse();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             SupplierPriceSohResponse target = (SupplierPriceSohResponse)object;
/*  87 */             target.addProductResponse((ProductResponse)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  94 */             SupplierPriceSohResponse target = (SupplierPriceSohResponse)object;
/*  95 */             target.removeAllProductResponse();
/*  96 */           } catch (Exception ex) {
/*  97 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 101 */           return new ProductResponse();
/*     */         }
/*     */       };
/* 104 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse");
/* 105 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 106 */     desc.setNameSpaceURI("metcash/supplierPriceSohResponse");
/* 107 */     desc.setMultivalued(true);
/* 108 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 109 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 112 */     fieldValidator = new FieldValidator();
/* 113 */     fieldValidator.setMinOccurs(0);
/*     */ 
/*     */     
/* 116 */     desc.setValidator(fieldValidator);
/*     */     
/* 118 */     desc = new XMLFieldDescriptorImpl(Message.class, "_message", "Message", NodeType.Element);
/* 119 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 123 */           SupplierPriceSohResponse target = (SupplierPriceSohResponse)object;
/* 124 */           return target.getMessage();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 130 */             SupplierPriceSohResponse target = (SupplierPriceSohResponse)object;
/* 131 */             target.setMessage((Message)value);
/* 132 */           } catch (Exception ex) {
/* 133 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 137 */           return new Message();
/*     */         }
/*     */       };
/* 140 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message");
/* 141 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 142 */     desc.setNameSpaceURI("metcash/supplierPriceSohResponse");
/* 143 */     desc.setMultivalued(false);
/* 144 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 145 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 148 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 151 */     desc.setValidator(fieldValidator);
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
/* 166 */     return null;
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
/* 177 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 187 */     return SupplierPriceSohResponse.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 197 */     return this._nsPrefix;
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
/* 208 */     return this._nsURI;
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
/* 219 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 229 */     return this._xmlName;
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
/* 241 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\descriptors\SupplierPriceSohResponseDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */