/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderResponse;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.types.CustomerStateCodeType;
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
/*     */ public class OrderHeaderResponseDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public OrderHeaderResponseDescriptor() {
/*  60 */     this._xmlName = "OrderHeaderResponse";
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
/*  73 */     desc = new XMLFieldDescriptorImpl(int.class, "_webOrderId", "WebOrderId", NodeType.Element);
/*  74 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  78 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/*  79 */           if (!target.hasWebOrderId()) return null; 
/*  80 */           return new Integer(target.getWebOrderId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/*     */             
/*  88 */             if (value == null) {
/*  89 */               target.deleteWebOrderId();
/*     */               return;
/*     */             } 
/*  92 */             target.setWebOrderId(((Integer)value).intValue());
/*  93 */           } catch (Exception ex) {
/*  94 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  98 */           return null;
/*     */         }
/*     */       };
/* 101 */     desc.setSchemaType("int");
/* 102 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 103 */     desc.setMultivalued(false);
/* 104 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 105 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 108 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 111 */     IntValidator intValidator1 = new IntValidator();
/* 112 */     fieldValidator.setValidator((TypeValidator)intValidator1);
/* 113 */     intValidator1.setMinInclusive(-2147483648);
/* 114 */     intValidator1.setMaxInclusive(2147483647);
/*     */     
/* 116 */     desc.setValidator(fieldValidator);
/*     */     
/* 118 */     desc = new XMLFieldDescriptorImpl(String.class, "_externalOrderId", "ExternalOrderId", NodeType.Element);
/* 119 */     desc.setImmutable(true);
/* 120 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 124 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 125 */           return target.getExternalOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 131 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 132 */             target.setExternalOrderId((String)value);
/* 133 */           } catch (Exception ex) {
/* 134 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 138 */           return null;
/*     */         }
/*     */       };
/* 141 */     desc.setSchemaType("string");
/* 142 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 143 */     desc.setMultivalued(false);
/* 144 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 145 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 148 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 151 */     StringValidator stringValidator = new StringValidator();
/* 152 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 153 */     stringValidator.setWhiteSpace("preserve");
/* 154 */     stringValidator.setMaxLength(10);
/*     */     
/* 156 */     desc.setValidator(fieldValidator);
/*     */     
/* 158 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerId", "CustomerId", NodeType.Element);
/* 159 */     desc.setImmutable(true);
/* 160 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 164 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 165 */           return target.getCustomerId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 171 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 172 */             target.setCustomerId((String)value);
/* 173 */           } catch (Exception ex) {
/* 174 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 178 */           return null;
/*     */         }
/*     */       };
/* 181 */     desc.setSchemaType("string");
/* 182 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 183 */     desc.setMultivalued(false);
/* 184 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 185 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 188 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 191 */     stringValidator = new StringValidator();
/* 192 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 193 */     stringValidator.setWhiteSpace("preserve");
/* 194 */     stringValidator.setMaxLength(8);
/*     */     
/* 196 */     desc.setValidator(fieldValidator);
/*     */     
/* 198 */     desc = new XMLFieldDescriptorImpl(CustomerStateCodeType.class, "_customerStateCode", "CustomerStateCode", NodeType.Element);
/* 199 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 203 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 204 */           return target.getCustomerStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 210 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 211 */             target.setCustomerStateCode((CustomerStateCodeType)value);
/* 212 */           } catch (Exception ex) {
/* 213 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 217 */           return null;
/*     */         }
/*     */       };
/* 220 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(CustomerStateCodeType.class, (FieldHandler)xMLFieldHandler2);
/* 221 */     desc.setImmutable(true);
/* 222 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.validation.types.CustomerStateCodeType");
/* 223 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 224 */     desc.setMultivalued(false);
/* 225 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 226 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 229 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 232 */     desc.setValidator(fieldValidator);
/*     */     
/* 234 */     desc = new XMLFieldDescriptorImpl(String.class, "_webCreatedTime", "WebCreatedTime", NodeType.Element);
/* 235 */     desc.setImmutable(true);
/* 236 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 240 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 241 */           return target.getWebCreatedTime();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 247 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 248 */             target.setWebCreatedTime((String)value);
/* 249 */           } catch (Exception ex) {
/* 250 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 254 */           return null;
/*     */         }
/*     */       };
/* 257 */     desc.setSchemaType("string");
/* 258 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 259 */     desc.setMultivalued(false);
/* 260 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 261 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 264 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 267 */     stringValidator = new StringValidator();
/* 268 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 269 */     stringValidator.setWhiteSpace("preserve");
/*     */     
/* 271 */     desc.setValidator(fieldValidator);
/*     */     
/* 273 */     desc = new XMLFieldDescriptorImpl(int.class, "_itemsAccepted", "ItemsAccepted", NodeType.Element);
/* 274 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 278 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 279 */           if (!target.hasItemsAccepted()) return null; 
/* 280 */           return new Integer(target.getItemsAccepted());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 286 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/*     */             
/* 288 */             if (value == null) {
/* 289 */               target.deleteItemsAccepted();
/*     */               return;
/*     */             } 
/* 292 */             target.setItemsAccepted(((Integer)value).intValue());
/* 293 */           } catch (Exception ex) {
/* 294 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 298 */           return null;
/*     */         }
/*     */       };
/* 301 */     desc.setSchemaType("int");
/* 302 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 303 */     desc.setMultivalued(false);
/* 304 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 305 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 308 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 311 */     IntValidator typeValidator = new IntValidator();
/* 312 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 313 */     typeValidator.setMinInclusive(-2147483648);
/* 314 */     typeValidator.setMaxInclusive(2147483647);
/*     */     
/* 316 */     desc.setValidator(fieldValidator);
/*     */     
/* 318 */     desc = new XMLFieldDescriptorImpl(int.class, "_itemsRejected", "ItemsRejected", NodeType.Element);
/* 319 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 323 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 324 */           if (!target.hasItemsRejected()) return null; 
/* 325 */           return new Integer(target.getItemsRejected());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 331 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/*     */             
/* 333 */             if (value == null) {
/* 334 */               target.deleteItemsRejected();
/*     */               return;
/*     */             } 
/* 337 */             target.setItemsRejected(((Integer)value).intValue());
/* 338 */           } catch (Exception ex) {
/* 339 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 343 */           return null;
/*     */         }
/*     */       };
/* 346 */     desc.setSchemaType("int");
/* 347 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 348 */     desc.setMultivalued(false);
/* 349 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 350 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 353 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 356 */     typeValidator = new IntValidator();
/* 357 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 358 */     typeValidator.setMinInclusive(-2147483648);
/* 359 */     typeValidator.setMaxInclusive(2147483647);
/*     */     
/* 361 */     desc.setValidator(fieldValidator);
/*     */     
/* 363 */     desc = new XMLFieldDescriptorImpl(OrderHeaderMessages.class, "_orderHeaderMessagesList", "OrderHeaderMessages", NodeType.Element);
/* 364 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 368 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 369 */           return target.getOrderHeaderMessages();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 375 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 376 */             target.addOrderHeaderMessages((OrderHeaderMessages)value);
/* 377 */           } catch (Exception ex) {
/* 378 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 383 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 384 */             target.removeAllOrderHeaderMessages();
/* 385 */           } catch (Exception ex) {
/* 386 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 390 */           return new OrderHeaderMessages();
/*     */         }
/*     */       };
/* 393 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages");
/* 394 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 395 */     desc.setMultivalued(true);
/* 396 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 397 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 400 */     fieldValidator = new FieldValidator();
/* 401 */     fieldValidator.setMinOccurs(0);
/*     */ 
/*     */     
/* 404 */     desc.setValidator(fieldValidator);
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
/* 419 */     return null;
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
/* 430 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 440 */     return OrderHeaderResponse.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 450 */     return this._nsPrefix;
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
/* 461 */     return this._nsURI;
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
/* 472 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 482 */     return this._xmlName;
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
/* 494 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\descriptors\OrderHeaderResponseDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */