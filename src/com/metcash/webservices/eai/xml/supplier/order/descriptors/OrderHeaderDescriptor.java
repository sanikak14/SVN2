/*     */ package com.metcash.webservices.eai.xml.supplier.order.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.OrderHeader;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderHeaderDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private XMLFieldDescriptor _identity;
/*  60 */   private String _xmlName = "OrderHeader";
/*     */   public OrderHeaderDescriptor() {
/*  62 */     XMLFieldDescriptorImpl desc = null;
/*  63 */     FieldHandler handler = null;
/*  64 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     desc = new XMLFieldDescriptorImpl(String.class, "_vendorOrderId", "VendorOrderId", NodeType.Element);
/*  71 */     desc.setImmutable(true);
/*  72 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  76 */           OrderHeader target = (OrderHeader)object;
/*  77 */           return target.getVendorOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  83 */             OrderHeader target = (OrderHeader)object;
/*  84 */             target.setVendorOrderId((String)value);
/*  85 */           } catch (Exception ex) {
/*  86 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  90 */           return null;
/*     */         }
/*     */       };
/*  93 */     desc.setSchemaType("string");
/*  94 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  95 */     desc.setMultivalued(false);
/*  96 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*  97 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 100 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 103 */     StringValidator typeValidator = new StringValidator();
/* 104 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 105 */     typeValidator.setWhiteSpace("preserve");
/* 106 */     typeValidator.setMaxLength(20);
/*     */     
/* 108 */     desc.setValidator(fieldValidator);
/*     */     
/* 110 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerOrderId", "CustomerOrderId", NodeType.Element);
/* 111 */     desc.setImmutable(true);
/* 112 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 116 */           OrderHeader target = (OrderHeader)object;
/* 117 */           return target.getCustomerOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 123 */             OrderHeader target = (OrderHeader)object;
/* 124 */             target.setCustomerOrderId((String)value);
/* 125 */           } catch (Exception ex) {
/* 126 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 130 */           return null;
/*     */         }
/*     */       };
/* 133 */     desc.setSchemaType("string");
/* 134 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 135 */     desc.setMultivalued(false);
/* 136 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 137 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 140 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 143 */     typeValidator = new StringValidator();
/* 144 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 145 */     typeValidator.setWhiteSpace("preserve");
/* 146 */     typeValidator.setMaxLength(10);
/*     */     
/* 148 */     desc.setValidator(fieldValidator);
/*     */     
/* 150 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerId", "CustomerId", NodeType.Element);
/* 151 */     desc.setImmutable(true);
/* 152 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 156 */           OrderHeader target = (OrderHeader)object;
/* 157 */           return target.getCustomerId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 163 */             OrderHeader target = (OrderHeader)object;
/* 164 */             target.setCustomerId((String)value);
/* 165 */           } catch (Exception ex) {
/* 166 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 170 */           return null;
/*     */         }
/*     */       };
/* 173 */     desc.setSchemaType("string");
/* 174 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 175 */     desc.setRequired(true);
/* 176 */     desc.setMultivalued(false);
/* 177 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 178 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 181 */     fieldValidator = new FieldValidator();
/* 182 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 185 */     typeValidator = new StringValidator();
/* 186 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 187 */     typeValidator.setWhiteSpace("preserve");
/* 188 */     typeValidator.setMaxLength(8);
/*     */     
/* 190 */     desc.setValidator(fieldValidator);
/*     */     
/* 192 */     desc = new XMLFieldDescriptorImpl(CustomerStateCodeType.class, "_customerStateCode", "CustomerStateCode", NodeType.Element);
/* 193 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 197 */           OrderHeader target = (OrderHeader)object;
/* 198 */           return target.getCustomerStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 204 */             OrderHeader target = (OrderHeader)object;
/* 205 */             target.setCustomerStateCode((CustomerStateCodeType)value);
/* 206 */           } catch (Exception ex) {
/* 207 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 211 */           return null;
/*     */         }
/*     */       };
/* 214 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(CustomerStateCodeType.class, (FieldHandler)xMLFieldHandler3);
/* 215 */     desc.setImmutable(true);
/* 216 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType");
/* 217 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 218 */     desc.setRequired(true);
/* 219 */     desc.setMultivalued(false);
/* 220 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 221 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 224 */     fieldValidator = new FieldValidator();
/* 225 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 228 */     desc.setValidator(fieldValidator);
/*     */     
/* 230 */     desc = new XMLFieldDescriptorImpl(String.class, "_supplierRepId", "SupplierRepId", NodeType.Element);
/* 231 */     desc.setImmutable(true);
/* 232 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 236 */           OrderHeader target = (OrderHeader)object;
/* 237 */           return target.getSupplierRepId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 243 */             OrderHeader target = (OrderHeader)object;
/* 244 */             target.setSupplierRepId((String)value);
/* 245 */           } catch (Exception ex) {
/* 246 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 250 */           return null;
/*     */         }
/*     */       };
/* 253 */     desc.setSchemaType("string");
/* 254 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 255 */     desc.setRequired(true);
/* 256 */     desc.setMultivalued(false);
/* 257 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 258 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 261 */     fieldValidator = new FieldValidator();
/* 262 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 265 */     typeValidator = new StringValidator();
/* 266 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 267 */     typeValidator.setWhiteSpace("preserve");
/* 268 */     typeValidator.setMaxLength(10);
/*     */     
/* 270 */     desc.setValidator(fieldValidator);
/*     */     
/* 272 */     desc = new XMLFieldDescriptorImpl(String.class, "_supplierReference", "SupplierReference", NodeType.Element);
/* 273 */     desc.setImmutable(true);
/* 274 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 278 */           OrderHeader target = (OrderHeader)object;
/* 279 */           return target.getSupplierReference();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 285 */             OrderHeader target = (OrderHeader)object;
/* 286 */             target.setSupplierReference((String)value);
/* 287 */           } catch (Exception ex) {
/* 288 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 292 */           return null;
/*     */         }
/*     */       };
/* 295 */     desc.setSchemaType("string");
/* 296 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 297 */     desc.setRequired(true);
/* 298 */     desc.setMultivalued(false);
/* 299 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 300 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 303 */     fieldValidator = new FieldValidator();
/* 304 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 307 */     typeValidator = new StringValidator();
/* 308 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 309 */     typeValidator.setWhiteSpace("preserve");
/* 310 */     typeValidator.setMaxLength(20);
/*     */     
/* 312 */     desc.setValidator(fieldValidator);
/*     */     
/* 314 */     desc = new XMLFieldDescriptorImpl(String.class, "_supplierStateId", "SupplierStateId", NodeType.Element);
/* 315 */     desc.setImmutable(true);
/* 316 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 320 */           OrderHeader target = (OrderHeader)object;
/* 321 */           return target.getSupplierStateId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 327 */             OrderHeader target = (OrderHeader)object;
/* 328 */             target.setSupplierStateId((String)value);
/* 329 */           } catch (Exception ex) {
/* 330 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 334 */           return null;
/*     */         }
/*     */       };
/* 337 */     desc.setSchemaType("string");
/* 338 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 339 */     desc.setRequired(true);
/* 340 */     desc.setMultivalued(false);
/* 341 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 342 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 345 */     fieldValidator = new FieldValidator();
/* 346 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 349 */     typeValidator = new StringValidator();
/* 350 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 351 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 353 */     desc.setValidator(fieldValidator);
/*     */     
/* 355 */     desc = new XMLFieldDescriptorImpl(TrnApprovedType.class, "_trnApproved", "TrnApproved", NodeType.Element);
/* 356 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 360 */           OrderHeader target = (OrderHeader)object;
/* 361 */           return target.getTrnApproved();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 367 */             OrderHeader target = (OrderHeader)object;
/* 368 */             target.setTrnApproved((TrnApprovedType)value);
/* 369 */           } catch (Exception ex) {
/* 370 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 374 */           return null;
/*     */         }
/*     */       };
/* 377 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(TrnApprovedType.class, (FieldHandler)xMLFieldHandler2);
/* 378 */     desc.setImmutable(true);
/* 379 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType");
/* 380 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 381 */     desc.setRequired(true);
/* 382 */     desc.setMultivalued(false);
/* 383 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 384 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 387 */     fieldValidator = new FieldValidator();
/* 388 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 391 */     desc.setValidator(fieldValidator);
/*     */     
/* 393 */     desc = new XMLFieldDescriptorImpl(String.class, "_refSupplierStateId", "RefSupplierStateId", NodeType.Element);
/* 394 */     desc.setImmutable(true);
/* 395 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 399 */           OrderHeader target = (OrderHeader)object;
/* 400 */           return target.getRefSupplierStateId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 406 */             OrderHeader target = (OrderHeader)object;
/* 407 */             target.setRefSupplierStateId((String)value);
/* 408 */           } catch (Exception ex) {
/* 409 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 413 */           return null;
/*     */         }
/*     */       };
/* 416 */     desc.setSchemaType("string");
/* 417 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 418 */     desc.setMultivalued(false);
/* 419 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 420 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 423 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 426 */     typeValidator = new StringValidator();
/* 427 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 428 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 430 */     desc.setValidator(fieldValidator);
/*     */     
/* 432 */     desc = new XMLFieldDescriptorImpl(String.class, "_refSupplierRepId", "RefSupplierRepId", NodeType.Element);
/* 433 */     desc.setImmutable(true);
/* 434 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 438 */           OrderHeader target = (OrderHeader)object;
/* 439 */           return target.getRefSupplierRepId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 445 */             OrderHeader target = (OrderHeader)object;
/* 446 */             target.setRefSupplierRepId((String)value);
/* 447 */           } catch (Exception ex) {
/* 448 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 452 */           return null;
/*     */         }
/*     */       };
/* 455 */     desc.setSchemaType("string");
/* 456 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 457 */     desc.setMultivalued(false);
/* 458 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 459 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 462 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 465 */     typeValidator = new StringValidator();
/* 466 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 467 */     typeValidator.setWhiteSpace("preserve");
/* 468 */     typeValidator.setMaxLength(3);
/*     */     
/* 470 */     desc.setValidator(fieldValidator);
/*     */     
/* 472 */     desc = new XMLFieldDescriptorImpl(String.class, "_specialInstructions", "SpecialInstructions", NodeType.Element);
/* 473 */     desc.setImmutable(true);
/* 474 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 478 */           OrderHeader target = (OrderHeader)object;
/* 479 */           return target.getSpecialInstructions();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 485 */             OrderHeader target = (OrderHeader)object;
/* 486 */             target.setSpecialInstructions((String)value);
/* 487 */           } catch (Exception ex) {
/* 488 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 492 */           return null;
/*     */         }
/*     */       };
/* 495 */     desc.setSchemaType("string");
/* 496 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 497 */     desc.setMultivalued(false);
/* 498 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 499 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 502 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 505 */     typeValidator = new StringValidator();
/* 506 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 507 */     typeValidator.setWhiteSpace("preserve");
/* 508 */     typeValidator.setMaxLength(90);
/*     */     
/* 510 */     desc.setValidator(fieldValidator);
/*     */     
/* 512 */     desc = new XMLFieldDescriptorImpl(String.class, "_deliveryDate", "DeliveryDate", NodeType.Element);
/* 513 */     desc.setImmutable(true);
/* 514 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 518 */           OrderHeader target = (OrderHeader)object;
/* 519 */           return target.getDeliveryDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 525 */             OrderHeader target = (OrderHeader)object;
/* 526 */             target.setDeliveryDate((String)value);
/* 527 */           } catch (Exception ex) {
/* 528 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 532 */           return null;
/*     */         }
/*     */       };
/* 535 */     desc.setSchemaType("string");
/* 536 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 537 */     desc.setMultivalued(false);
/* 538 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 539 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 542 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 545 */     typeValidator = new StringValidator();
/* 546 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 547 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 549 */     desc.setValidator(fieldValidator);
/*     */     
/* 551 */     desc = new XMLFieldDescriptorImpl(String.class, "_orderCreatedDate", "OrderCreatedDate", NodeType.Element);
/* 552 */     desc.setImmutable(true);
/* 553 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 557 */           OrderHeader target = (OrderHeader)object;
/* 558 */           return target.getOrderCreatedDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 564 */             OrderHeader target = (OrderHeader)object;
/* 565 */             target.setOrderCreatedDate((String)value);
/* 566 */           } catch (Exception ex) {
/* 567 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 571 */           return null;
/*     */         }
/*     */       };
/* 574 */     desc.setSchemaType("string");
/* 575 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 576 */     desc.setMultivalued(false);
/* 577 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 578 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 581 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 584 */     typeValidator = new StringValidator();
/* 585 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 586 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 588 */     desc.setValidator(fieldValidator);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String _nsURI;
/*     */ 
/*     */   
/*     */   private String _nsPrefix;
/*     */ 
/*     */   
/*     */   private boolean _elementDefinition = true;
/*     */ 
/*     */   
/*     */   public AccessMode getAccessMode() {
/* 603 */     return null;
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
/* 614 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 624 */     return OrderHeader.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 634 */     return this._nsPrefix;
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
/* 645 */     return this._nsURI;
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
/* 656 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 666 */     return this._xmlName;
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
/* 678 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\descriptors\OrderHeaderDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */