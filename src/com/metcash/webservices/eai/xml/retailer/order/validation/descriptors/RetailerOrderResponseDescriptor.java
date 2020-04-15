/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse;
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
/*     */ 
/*     */ public class RetailerOrderResponseDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public RetailerOrderResponseDescriptor() {
/*  60 */     this._xmlName = "RetailerOrderResponse";
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
/*  73 */     desc = new XMLFieldDescriptorImpl(OrderDetail.class, "_orderDetailList", "OrderDetail", NodeType.Element);
/*  74 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  78 */           RetailerOrderResponse target = (RetailerOrderResponse)object;
/*  79 */           return target.getOrderDetail();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  85 */             RetailerOrderResponse target = (RetailerOrderResponse)object;
/*  86 */             target.addOrderDetail((OrderDetail)value);
/*  87 */           } catch (Exception ex) {
/*  88 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  93 */             RetailerOrderResponse target = (RetailerOrderResponse)object;
/*  94 */             target.removeAllOrderDetail();
/*  95 */           } catch (Exception ex) {
/*  96 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 100 */           return new OrderDetail();
/*     */         }
/*     */       };
/* 103 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail");
/* 104 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 105 */     desc.setRequired(true);
/* 106 */     desc.setNillable(true);
/* 107 */     desc.setMultivalued(true);
/* 108 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 109 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 112 */     fieldValidator = new FieldValidator();
/* 113 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 116 */     desc.setValidator(fieldValidator);
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
/* 131 */     return null;
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
/* 142 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 152 */     return RetailerOrderResponse.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 162 */     return this._nsPrefix;
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
/* 173 */     return this._nsURI;
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
/* 184 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 194 */     return this._xmlName;
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
/* 206 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\descriptors\RetailerOrderResponseDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */