/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.Order;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierOrderStatusRequestType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierRep;
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
/*     */ public class SupplierOrderStatusRequestTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public SupplierOrderStatusRequestTypeDescriptor() {
/*  60 */     this._nsURI = "metcash/supplierOrderStatus";
/*  61 */     this._xmlName = "SupplierOrderStatusRequestType";
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
/*  79 */           SupplierOrderStatusRequestType target = (SupplierOrderStatusRequestType)object;
/*  80 */           return target.getSupplierRep();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             SupplierOrderStatusRequestType target = (SupplierOrderStatusRequestType)object;
/*  87 */             target.setSupplierRep((SupplierRep)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return new SupplierRep();
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierRep");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  98 */     desc.setNameSpaceURI("metcash/supplierOrderStatus");
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
/* 111 */     desc = new XMLFieldDescriptorImpl(Order.class, "_orderList", "Order", NodeType.Element);
/* 112 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 116 */           SupplierOrderStatusRequestType target = (SupplierOrderStatusRequestType)object;
/* 117 */           return target.getOrder();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 123 */             SupplierOrderStatusRequestType target = (SupplierOrderStatusRequestType)object;
/* 124 */             target.addOrder((Order)value);
/* 125 */           } catch (Exception ex) {
/* 126 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 131 */             SupplierOrderStatusRequestType target = (SupplierOrderStatusRequestType)object;
/* 132 */             target.removeAllOrder();
/* 133 */           } catch (Exception ex) {
/* 134 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 138 */           return new Order();
/*     */         }
/*     */       };
/* 141 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.orderstatus.Order");
/* 142 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 143 */     desc.setNameSpaceURI("metcash/supplierOrderStatus");
/* 144 */     desc.setRequired(true);
/* 145 */     desc.setMultivalued(true);
/* 146 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 147 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 150 */     fieldValidator = new FieldValidator();
/* 151 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 154 */     desc.setValidator(fieldValidator);
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
/* 169 */     return null;
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
/* 180 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 190 */     return SupplierOrderStatusRequestType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 200 */     return this._nsPrefix;
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
/* 211 */     return this._nsURI;
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
/* 222 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 232 */     return this._xmlName;
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
/* 244 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\descriptors\SupplierOrderStatusRequestTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */