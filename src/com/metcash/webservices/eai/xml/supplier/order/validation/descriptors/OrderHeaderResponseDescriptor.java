/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType;
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
/*  74 */     XMLFieldHandler xMLFieldHandler4 = new XMLFieldHandler()
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
/* 102 */     desc.setHandler((FieldHandler)xMLFieldHandler4);
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
/* 118 */     desc = new XMLFieldDescriptorImpl(String.class, "_vendorOrderId", "VendorOrderId", NodeType.Element);
/* 119 */     desc.setImmutable(true);
/* 120 */     xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 124 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 125 */           return target.getVendorOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 131 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 132 */             target.setVendorOrderId((String)value);
/* 133 */           } catch (Exception ex) {
/* 134 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 138 */           return null;
/*     */         }
/*     */       };
/* 141 */     desc.setSchemaType("string");
/* 142 */     desc.setHandler((FieldHandler)xMLFieldHandler4);
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
/* 158 */     desc = new XMLFieldDescriptorImpl(String.class, "_supplierRepCode", "SupplierRepCode", NodeType.Element);
/* 159 */     desc.setImmutable(true);
/* 160 */     xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 164 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 165 */           return target.getSupplierRepCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 171 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 172 */             target.setSupplierRepCode((String)value);
/* 173 */           } catch (Exception ex) {
/* 174 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 178 */           return null;
/*     */         }
/*     */       };
/* 181 */     desc.setSchemaType("string");
/* 182 */     desc.setHandler((FieldHandler)xMLFieldHandler4);
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
/* 194 */     stringValidator.setMaxLength(10);
/*     */     
/* 196 */     desc.setValidator(fieldValidator);
/*     */     
/* 198 */     desc = new XMLFieldDescriptorImpl(SupplierRepStateCodeType.class, "_supplierRepStateCode", "SupplierRepStateCode", NodeType.Element);
/* 199 */     xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 203 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 204 */           return target.getSupplierRepStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 210 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 211 */             target.setSupplierRepStateCode((SupplierRepStateCodeType)value);
/* 212 */           } catch (Exception ex) {
/* 213 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 217 */           return null;
/*     */         }
/*     */       };
/* 220 */     EnumFieldHandler enumFieldHandler3 = new EnumFieldHandler(SupplierRepStateCodeType.class, (FieldHandler)xMLFieldHandler4);
/* 221 */     desc.setImmutable(true);
/* 222 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType");
/* 223 */     desc.setHandler((FieldHandler)enumFieldHandler3);
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
/* 234 */     desc = new XMLFieldDescriptorImpl(String.class, "_supplierReference", "SupplierReference", NodeType.Element);
/* 235 */     desc.setImmutable(true);
/* 236 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 240 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 241 */           return target.getSupplierReference();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 247 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 248 */             target.setSupplierReference((String)value);
/* 249 */           } catch (Exception ex) {
/* 250 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 254 */           return null;
/*     */         }
/*     */       };
/* 257 */     desc.setSchemaType("string");
/* 258 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
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
/* 270 */     stringValidator.setMaxLength(20);
/*     */     
/* 272 */     desc.setValidator(fieldValidator);
/*     */     
/* 274 */     desc = new XMLFieldDescriptorImpl(TurnInOrderTypeType.class, "_turnInOrderType", "TurnInOrderType", NodeType.Element);
/* 275 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 279 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 280 */           return target.getTurnInOrderType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 286 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 287 */             target.setTurnInOrderType((TurnInOrderTypeType)value);
/* 288 */           } catch (Exception ex) {
/* 289 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 293 */           return null;
/*     */         }
/*     */       };
/* 296 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(TurnInOrderTypeType.class, (FieldHandler)xMLFieldHandler3);
/* 297 */     desc.setImmutable(true);
/* 298 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType");
/* 299 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 300 */     desc.setRequired(true);
/* 301 */     desc.setMultivalued(false);
/* 302 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 303 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 306 */     fieldValidator = new FieldValidator();
/* 307 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 310 */     desc.setValidator(fieldValidator);
/*     */     
/* 312 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerId", "CustomerId", NodeType.Element);
/* 313 */     desc.setImmutable(true);
/* 314 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 318 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 319 */           return target.getCustomerId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 325 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 326 */             target.setCustomerId((String)value);
/* 327 */           } catch (Exception ex) {
/* 328 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 332 */           return null;
/*     */         }
/*     */       };
/* 335 */     desc.setSchemaType("string");
/* 336 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 337 */     desc.setMultivalued(false);
/* 338 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 339 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 342 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 345 */     stringValidator = new StringValidator();
/* 346 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 347 */     stringValidator.setWhiteSpace("preserve");
/* 348 */     stringValidator.setMaxLength(8);
/*     */     
/* 350 */     desc.setValidator(fieldValidator);
/*     */     
/* 352 */     desc = new XMLFieldDescriptorImpl(CustomerStateCodeType.class, "_customerStateCode", "CustomerStateCode", NodeType.Element);
/* 353 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 357 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 358 */           return target.getCustomerStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 364 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 365 */             target.setCustomerStateCode((CustomerStateCodeType)value);
/* 366 */           } catch (Exception ex) {
/* 367 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 371 */           return null;
/*     */         }
/*     */       };
/* 374 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(CustomerStateCodeType.class, (FieldHandler)xMLFieldHandler2);
/* 375 */     desc.setImmutable(true);
/* 376 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType");
/* 377 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 378 */     desc.setMultivalued(false);
/* 379 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 380 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 383 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 386 */     desc.setValidator(fieldValidator);
/*     */     
/* 388 */     desc = new XMLFieldDescriptorImpl(String.class, "_webCreatedTime", "WebCreatedTime", NodeType.Element);
/* 389 */     desc.setImmutable(true);
/* 390 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 394 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 395 */           return target.getWebCreatedTime();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 401 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 402 */             target.setWebCreatedTime((String)value);
/* 403 */           } catch (Exception ex) {
/* 404 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 408 */           return null;
/*     */         }
/*     */       };
/* 411 */     desc.setSchemaType("string");
/* 412 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 413 */     desc.setMultivalued(false);
/* 414 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 415 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 418 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 421 */     stringValidator = new StringValidator();
/* 422 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 423 */     stringValidator.setWhiteSpace("preserve");
/*     */     
/* 425 */     desc.setValidator(fieldValidator);
/*     */     
/* 427 */     desc = new XMLFieldDescriptorImpl(int.class, "_itemsAccepted", "ItemsAccepted", NodeType.Element);
/* 428 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 432 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 433 */           if (!target.hasItemsAccepted()) return null; 
/* 434 */           return new Integer(target.getItemsAccepted());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 440 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/*     */             
/* 442 */             if (value == null) {
/* 443 */               target.deleteItemsAccepted();
/*     */               return;
/*     */             } 
/* 446 */             target.setItemsAccepted(((Integer)value).intValue());
/* 447 */           } catch (Exception ex) {
/* 448 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 452 */           return null;
/*     */         }
/*     */       };
/* 455 */     desc.setSchemaType("int");
/* 456 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 457 */     desc.setMultivalued(false);
/* 458 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 459 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 462 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 465 */     IntValidator typeValidator = new IntValidator();
/* 466 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 467 */     typeValidator.setMinInclusive(-2147483648);
/* 468 */     typeValidator.setMaxInclusive(2147483647);
/*     */     
/* 470 */     desc.setValidator(fieldValidator);
/*     */     
/* 472 */     desc = new XMLFieldDescriptorImpl(int.class, "_itemsRejected", "ItemsRejected", NodeType.Element);
/* 473 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 477 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 478 */           if (!target.hasItemsRejected()) return null; 
/* 479 */           return new Integer(target.getItemsRejected());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 485 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/*     */             
/* 487 */             if (value == null) {
/* 488 */               target.deleteItemsRejected();
/*     */               return;
/*     */             } 
/* 491 */             target.setItemsRejected(((Integer)value).intValue());
/* 492 */           } catch (Exception ex) {
/* 493 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 497 */           return null;
/*     */         }
/*     */       };
/* 500 */     desc.setSchemaType("int");
/* 501 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 502 */     desc.setMultivalued(false);
/* 503 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 504 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 507 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 510 */     typeValidator = new IntValidator();
/* 511 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 512 */     typeValidator.setMinInclusive(-2147483648);
/* 513 */     typeValidator.setMaxInclusive(2147483647);
/*     */     
/* 515 */     desc.setValidator(fieldValidator);
/*     */     
/* 517 */     desc = new XMLFieldDescriptorImpl(OrderHeaderMessages.class, "_orderHeaderMessagesList", "OrderHeaderMessages", NodeType.Element);
/* 518 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 522 */           OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 523 */           return target.getOrderHeaderMessages();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 529 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 530 */             target.addOrderHeaderMessages((OrderHeaderMessages)value);
/* 531 */           } catch (Exception ex) {
/* 532 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 537 */             OrderHeaderResponse target = (OrderHeaderResponse)object;
/* 538 */             target.removeAllOrderHeaderMessages();
/* 539 */           } catch (Exception ex) {
/* 540 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 544 */           return new OrderHeaderMessages();
/*     */         }
/*     */       };
/* 547 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages");
/* 548 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 549 */     desc.setMultivalued(true);
/* 550 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 551 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 554 */     fieldValidator = new FieldValidator();
/* 555 */     fieldValidator.setMinOccurs(0);
/*     */ 
/*     */     
/* 558 */     desc.setValidator(fieldValidator);
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
/* 573 */     return null;
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
/* 584 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 594 */     return OrderHeaderResponse.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 604 */     return this._nsPrefix;
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
/* 615 */     return this._nsURI;
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
/* 626 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 636 */     return this._xmlName;
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
/* 648 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\descriptors\OrderHeaderResponseDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */