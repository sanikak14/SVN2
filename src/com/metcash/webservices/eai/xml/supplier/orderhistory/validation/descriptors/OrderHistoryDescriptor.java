/*     */ package com.metcash.webservices.eai.xml.supplier.orderhistory.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory;
/*     */ import java.util.Date;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.mapping.FieldHandler;
/*     */ import org.exolab.castor.xml.FieldValidator;
/*     */ import org.exolab.castor.xml.NodeType;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldHandler;
/*     */ import org.exolab.castor.xml.handlers.DateFieldHandler;
/*     */ import org.exolab.castor.xml.util.XMLClassDescriptorImpl;
/*     */ import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
/*     */ import org.exolab.castor.xml.validators.DateTimeValidator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderHistoryDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/orderHistoryResponse";
/*  61 */   private String _xmlName = "OrderHistory";
/*     */   public OrderHistoryDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(int.class, "_webOrderId", "WebOrderId", NodeType.Attribute);
/*  70 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  74 */           OrderHistory target = (OrderHistory)object;
/*  75 */           if (!target.hasWebOrderId()) return null; 
/*  76 */           return new Integer(target.getWebOrderId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             OrderHistory target = (OrderHistory)object;
/*     */             
/*  84 */             if (value == null)
/*     */               return; 
/*  86 */             target.setWebOrderId(((Integer)value).intValue());
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
/* 108 */     intValidator.setMinInclusive(0);
/* 109 */     intValidator.setMaxInclusive(2147483647);
/*     */     
/* 111 */     desc.setValidator(fieldValidator);
/*     */     
/* 113 */     desc = new XMLFieldDescriptorImpl(Date.class, "_createdDate", "CreatedDate", NodeType.Attribute);
/* 114 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 118 */           OrderHistory target = (OrderHistory)object;
/* 119 */           return target.getCreatedDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 125 */             OrderHistory target = (OrderHistory)object;
/* 126 */             target.setCreatedDate((Date)value);
/* 127 */           } catch (Exception ex) {
/* 128 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 132 */           return new Date();
/*     */         }
/*     */       };
/* 135 */     DateFieldHandler dateFieldHandler = new DateFieldHandler((FieldHandler)xMLFieldHandler);
/* 136 */     desc.setImmutable(true);
/* 137 */     desc.setSchemaType("dateTime");
/* 138 */     desc.setHandler((FieldHandler)dateFieldHandler);
/* 139 */     desc.setRequired(true);
/* 140 */     desc.setMultivalued(false);
/* 141 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 144 */     fieldValidator = new FieldValidator();
/* 145 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 148 */     DateTimeValidator typeValidator = new DateTimeValidator();
/* 149 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*     */     
/* 151 */     desc.setValidator(fieldValidator);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean _elementDefinition = true;
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
/* 168 */     return null;
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
/* 179 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 189 */     return OrderHistory.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 199 */     return this._nsPrefix;
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
/* 210 */     return this._nsURI;
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
/* 221 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 231 */     return this._xmlName;
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
/* 243 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderhistory\validation\descriptors\OrderHistoryDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */