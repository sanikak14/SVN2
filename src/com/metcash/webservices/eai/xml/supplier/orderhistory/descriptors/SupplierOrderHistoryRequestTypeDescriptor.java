/*     */ package com.metcash.webservices.eai.xml.supplier.orderhistory.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.Customer;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequestType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierRep;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.mapping.FieldHandler;
/*     */ import org.exolab.castor.types.Date;
/*     */ import org.exolab.castor.xml.FieldValidator;
/*     */ import org.exolab.castor.xml.NodeType;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldHandler;
/*     */ import org.exolab.castor.xml.util.XMLClassDescriptorImpl;
/*     */ import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
/*     */ import org.exolab.castor.xml.validators.DateTimeValidator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderHistoryRequestTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public SupplierOrderHistoryRequestTypeDescriptor() {
/*  60 */     this._nsURI = "metcash/supplierOrderHistory";
/*  61 */     this._xmlName = "SupplierOrderHistoryRequestType";
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
/*  79 */           SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/*  80 */           return target.getSupplierRep();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/*  87 */             target.setSupplierRep((SupplierRep)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return new SupplierRep();
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierRep");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  98 */     desc.setNameSpaceURI("metcash/supplierOrderHistory");
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
/* 116 */           SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 117 */           return target.getCustomer();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 123 */             SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 124 */             target.setCustomer((Customer)value);
/* 125 */           } catch (Exception ex) {
/* 126 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 130 */           return new Customer();
/*     */         }
/*     */       };
/* 133 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.orderhistory.Customer");
/* 134 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 135 */     desc.setNameSpaceURI("metcash/supplierOrderHistory");
/* 136 */     desc.setMultivalued(false);
/* 137 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 138 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 141 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 144 */     desc.setValidator(fieldValidator);
/*     */     
/* 146 */     desc = new XMLFieldDescriptorImpl(Date.class, "_startDate", "startDate", NodeType.Element);
/* 147 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 151 */           SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 152 */           return target.getStartDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 158 */             SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 159 */             target.setStartDate((Date)value);
/* 160 */           } catch (Exception ex) {
/* 161 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 165 */           return new Date();
/*     */         }
/*     */       };
/* 168 */     desc.setSchemaType("date");
/* 169 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 170 */     desc.setNameSpaceURI("metcash/supplierOrderHistory");
/* 171 */     desc.setMultivalued(false);
/* 172 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 173 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 176 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 179 */     DateTimeValidator typeValidator = new DateTimeValidator();
/* 180 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*     */     
/* 182 */     desc.setValidator(fieldValidator);
/*     */     
/* 184 */     desc = new XMLFieldDescriptorImpl(Date.class, "_endDate", "endDate", NodeType.Element);
/* 185 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 189 */           SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 190 */           return target.getEndDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 196 */             SupplierOrderHistoryRequestType target = (SupplierOrderHistoryRequestType)object;
/* 197 */             target.setEndDate((Date)value);
/* 198 */           } catch (Exception ex) {
/* 199 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 203 */           return new Date();
/*     */         }
/*     */       };
/* 206 */     desc.setSchemaType("date");
/* 207 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 208 */     desc.setNameSpaceURI("metcash/supplierOrderHistory");
/* 209 */     desc.setMultivalued(false);
/* 210 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 211 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 214 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 217 */     typeValidator = new DateTimeValidator();
/* 218 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*     */     
/* 220 */     desc.setValidator(fieldValidator);
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
/* 235 */     return null;
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
/* 246 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 256 */     return SupplierOrderHistoryRequestType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 266 */     return this._nsPrefix;
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
/* 277 */     return this._nsURI;
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
/* 288 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 298 */     return this._xmlName;
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
/* 310 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderhistory\descriptors\SupplierOrderHistoryRequestTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */