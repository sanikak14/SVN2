/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.LineMessages;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderDetail;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse;
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
/*     */ public class OrderDetailDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public OrderDetailDescriptor() {
/*  60 */     this._xmlName = "OrderDetail";
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
/*  73 */     desc = new XMLFieldDescriptorImpl(OrderHeaderResponse.class, "_orderHeaderResponse", "OrderHeaderResponse", NodeType.Element);
/*  74 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  78 */           OrderDetail target = (OrderDetail)object;
/*  79 */           return target.getOrderHeaderResponse();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  85 */             OrderDetail target = (OrderDetail)object;
/*  86 */             target.setOrderHeaderResponse((OrderHeaderResponse)value);
/*  87 */           } catch (Exception ex) {
/*  88 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  92 */           return new OrderHeaderResponse();
/*     */         }
/*     */       };
/*  95 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse");
/*  96 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  97 */     desc.setRequired(true);
/*  98 */     desc.setMultivalued(false);
/*  99 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 100 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 103 */     fieldValidator = new FieldValidator();
/* 104 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 107 */     desc.setValidator(fieldValidator);
/*     */     
/* 109 */     desc = new XMLFieldDescriptorImpl(LineMessages.class, "_lineMessagesList", "LineMessages", NodeType.Element);
/* 110 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 114 */           OrderDetail target = (OrderDetail)object;
/* 115 */           return target.getLineMessages();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 121 */             OrderDetail target = (OrderDetail)object;
/* 122 */             target.addLineMessages((LineMessages)value);
/* 123 */           } catch (Exception ex) {
/* 124 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 129 */             OrderDetail target = (OrderDetail)object;
/* 130 */             target.removeAllLineMessages();
/* 131 */           } catch (Exception ex) {
/* 132 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 136 */           return new LineMessages();
/*     */         }
/*     */       };
/* 139 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.LineMessages");
/* 140 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 141 */     desc.setMultivalued(true);
/* 142 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 143 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 146 */     fieldValidator = new FieldValidator();
/* 147 */     fieldValidator.setMinOccurs(0);
/*     */ 
/*     */     
/* 150 */     desc.setValidator(fieldValidator);
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
/* 165 */     return null;
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
/* 176 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 186 */     return OrderDetail.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 196 */     return this._nsPrefix;
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
/* 207 */     return this._nsURI;
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
/* 218 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 228 */     return this._xmlName;
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
/* 240 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\descriptors\OrderDetailDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */