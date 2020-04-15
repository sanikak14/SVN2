/*     */ package com.metcash.webservices.eai.xml.supplier.pricesoh.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.Customer;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.Product;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierPriceSohRequestType;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierRep;
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
/*     */ public class SupplierPriceSohRequestTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public SupplierPriceSohRequestTypeDescriptor() {
/*  60 */     this._nsURI = "metcash/supplierPriceSoh";
/*  61 */     this._xmlName = "SupplierPriceSohRequestType";
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
/*  74 */     desc = new XMLFieldDescriptorImpl(SupplierRep.class, "_supplierRep", "SupplierRep", NodeType.Element);
/*  75 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  79 */           SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/*  80 */           return target.getSupplierRep();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/*  87 */             target.setSupplierRep((SupplierRep)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return new SupplierRep();
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierRep");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  98 */     desc.setNameSpaceURI("metcash/supplierPriceSoh");
/*  99 */     desc.setRequired(true);
/* 100 */     desc.setMultivalued(false);
/* 101 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 102 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 105 */     fieldValidator = new FieldValidator();
/* 106 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 109 */     desc.setValidator(fieldValidator);
/*     */     
/* 111 */     desc = new XMLFieldDescriptorImpl(Customer.class, "_customer", "Customer", NodeType.Element);
/* 112 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 116 */           SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/* 117 */           return target.getCustomer();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 123 */             SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/* 124 */             target.setCustomer((Customer)value);
/* 125 */           } catch (Exception ex) {
/* 126 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 130 */           return new Customer();
/*     */         }
/*     */       };
/* 133 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.Customer");
/* 134 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 135 */     desc.setNameSpaceURI("metcash/supplierPriceSoh");
/* 136 */     desc.setRequired(true);
/* 137 */     desc.setMultivalued(false);
/* 138 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 139 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 142 */     fieldValidator = new FieldValidator();
/* 143 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 146 */     desc.setValidator(fieldValidator);
/*     */     
/* 148 */     desc = new XMLFieldDescriptorImpl(Product.class, "_productList", "Product", NodeType.Element);
/* 149 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 153 */           SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/* 154 */           return target.getProduct();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 160 */             SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/* 161 */             target.addProduct((Product)value);
/* 162 */           } catch (Exception ex) {
/* 163 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 168 */             SupplierPriceSohRequestType target = (SupplierPriceSohRequestType)object;
/* 169 */             target.removeAllProduct();
/* 170 */           } catch (Exception ex) {
/* 171 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 175 */           return new Product();
/*     */         }
/*     */       };
/* 178 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.Product");
/* 179 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 180 */     desc.setNameSpaceURI("metcash/supplierPriceSoh");
/* 181 */     desc.setRequired(true);
/* 182 */     desc.setMultivalued(true);
/* 183 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 184 */     addSequenceElement((XMLFieldDescriptor)desc);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AccessMode getAccessMode() {
/* 206 */     return null;
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
/* 217 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 227 */     return SupplierPriceSohRequestType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 237 */     return this._nsPrefix;
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
/* 248 */     return this._nsURI;
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
/* 259 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 269 */     return this._xmlName;
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
/* 281 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\descriptors\SupplierPriceSohRequestTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */