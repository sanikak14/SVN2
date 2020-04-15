/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType;
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
/*     */ import org.exolab.castor.xml.handlers.EnumFieldHandler;
/*     */ import org.exolab.castor.xml.util.XMLClassDescriptorImpl;
/*     */ import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
/*     */ import org.exolab.castor.xml.validators.BooleanValidator;
/*     */ import org.exolab.castor.xml.validators.DateTimeValidator;
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
/*     */ public class OrderHeaderStatusDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/orderStatusResponse";
/*  61 */   private String _xmlName = "OrderHeaderStatus";
/*     */   public OrderHeaderStatusDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(int.class, "_webOrderId", "WebOrderId", NodeType.Attribute);
/*  70 */     XMLFieldHandler xMLFieldHandler7 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  74 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/*  75 */           if (!target.hasWebOrderId()) return null; 
/*  76 */           return new Integer(target.getWebOrderId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
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
/*  96 */     desc.setHandler((FieldHandler)xMLFieldHandler7);
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
/* 113 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerId", "CustomerId", NodeType.Attribute);
/* 114 */     desc.setImmutable(true);
/* 115 */     xMLFieldHandler7 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 119 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 120 */           return target.getCustomerId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 126 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 127 */             target.setCustomerId((String)value);
/* 128 */           } catch (Exception ex) {
/* 129 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 133 */           return null;
/*     */         }
/*     */       };
/* 136 */     desc.setSchemaType("string");
/* 137 */     desc.setHandler((FieldHandler)xMLFieldHandler7);
/* 138 */     desc.setRequired(true);
/* 139 */     desc.setMultivalued(false);
/* 140 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 143 */     fieldValidator = new FieldValidator();
/* 144 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 147 */     StringValidator stringValidator = new StringValidator();
/* 148 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 149 */     stringValidator.addPattern("\\d+");
/* 150 */     stringValidator.setWhiteSpace("preserve");
/* 151 */     stringValidator.setMaxLength(10);
/* 152 */     stringValidator.setMinLength(1);
/*     */     
/* 154 */     desc.setValidator(fieldValidator);
/*     */     
/* 156 */     desc = new XMLFieldDescriptorImpl(StateCodeType.class, "_customerStateCode", "CustomerStateCode", NodeType.Attribute);
/* 157 */     xMLFieldHandler7 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 161 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 162 */           return target.getCustomerStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 168 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 169 */             target.setCustomerStateCode((StateCodeType)value);
/* 170 */           } catch (Exception ex) {
/* 171 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 175 */           return null;
/*     */         }
/*     */       };
/* 178 */     EnumFieldHandler enumFieldHandler5 = new EnumFieldHandler(StateCodeType.class, (FieldHandler)xMLFieldHandler7);
/* 179 */     desc.setImmutable(true);
/* 180 */     desc.setSchemaType("com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType");
/* 181 */     desc.setHandler((FieldHandler)enumFieldHandler5);
/* 182 */     desc.setRequired(true);
/* 183 */     desc.setMultivalued(false);
/* 184 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 187 */     fieldValidator = new FieldValidator();
/* 188 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 191 */     desc.setValidator(fieldValidator);
/*     */     
/* 193 */     desc = new XMLFieldDescriptorImpl(Date.class, "_createDate", "CreateDate", NodeType.Attribute);
/* 194 */     XMLFieldHandler xMLFieldHandler6 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 198 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 199 */           return target.getCreateDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 205 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 206 */             target.setCreateDate((Date)value);
/* 207 */           } catch (Exception ex) {
/* 208 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 212 */           return new Date();
/*     */         }
/*     */       };
/* 215 */     DateFieldHandler dateFieldHandler = new DateFieldHandler((FieldHandler)xMLFieldHandler6);
/* 216 */     desc.setImmutable(true);
/* 217 */     desc.setSchemaType("dateTime");
/* 218 */     desc.setHandler((FieldHandler)dateFieldHandler);
/* 219 */     desc.setRequired(true);
/* 220 */     desc.setMultivalued(false);
/* 221 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 224 */     fieldValidator = new FieldValidator();
/* 225 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 228 */     DateTimeValidator dateTimeValidator1 = new DateTimeValidator();
/* 229 */     fieldValidator.setValidator((TypeValidator)dateTimeValidator1);
/*     */     
/* 231 */     desc.setValidator(fieldValidator);
/*     */     
/* 233 */     desc = new XMLFieldDescriptorImpl(OrderHeaderStatusTurnInOrderTypeType.class, "_turnInOrderType", "TurnInOrderType", NodeType.Attribute);
/* 234 */     XMLFieldHandler xMLFieldHandler5 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 238 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 239 */           return target.getTurnInOrderType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 245 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 246 */             target.setTurnInOrderType((OrderHeaderStatusTurnInOrderTypeType)value);
/* 247 */           } catch (Exception ex) {
/* 248 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 252 */           return null;
/*     */         }
/*     */       };
/* 255 */     EnumFieldHandler enumFieldHandler4 = new EnumFieldHandler(OrderHeaderStatusTurnInOrderTypeType.class, (FieldHandler)xMLFieldHandler5);
/* 256 */     desc.setImmutable(true);
/* 257 */     desc.setSchemaType("OrderHeaderStatusTurnInOrderTypeType");
/* 258 */     desc.setHandler((FieldHandler)enumFieldHandler4);
/* 259 */     desc.setRequired(true);
/* 260 */     desc.setMultivalued(false);
/* 261 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 264 */     fieldValidator = new FieldValidator();
/* 265 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 268 */     desc.setValidator(fieldValidator);
/*     */     
/* 270 */     desc = new XMLFieldDescriptorImpl(boolean.class, "_turnInOrderApproved", "TurnInOrderApproved", NodeType.Attribute);
/* 271 */     XMLFieldHandler xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 275 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 276 */           if (!target.hasTurnInOrderApproved()) return null; 
/* 277 */           return target.getTurnInOrderApproved() ? Boolean.TRUE : Boolean.FALSE;
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 283 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/*     */             
/* 285 */             if (value == null) {
/* 286 */               target.deleteTurnInOrderApproved();
/*     */               return;
/*     */             } 
/* 289 */             target.setTurnInOrderApproved(((Boolean)value).booleanValue());
/* 290 */           } catch (Exception ex) {
/* 291 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 295 */           return null;
/*     */         }
/*     */       };
/* 298 */     desc.setSchemaType("boolean");
/* 299 */     desc.setHandler((FieldHandler)xMLFieldHandler4);
/* 300 */     desc.setMultivalued(false);
/* 301 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 304 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 307 */     BooleanValidator booleanValidator = new BooleanValidator();
/* 308 */     fieldValidator.setValidator((TypeValidator)booleanValidator);
/*     */     
/* 310 */     desc.setValidator(fieldValidator);
/*     */     
/* 312 */     desc = new XMLFieldDescriptorImpl(OrderHeaderStatusOrderSourceType.class, "_orderSource", "OrderSource", NodeType.Attribute);
/* 313 */     xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 317 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 318 */           return target.getOrderSource();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 324 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 325 */             target.setOrderSource((OrderHeaderStatusOrderSourceType)value);
/* 326 */           } catch (Exception ex) {
/* 327 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 331 */           return null;
/*     */         }
/*     */       };
/* 334 */     EnumFieldHandler enumFieldHandler3 = new EnumFieldHandler(OrderHeaderStatusOrderSourceType.class, (FieldHandler)xMLFieldHandler4);
/* 335 */     desc.setImmutable(true);
/* 336 */     desc.setSchemaType("OrderHeaderStatusOrderSourceType");
/* 337 */     desc.setHandler((FieldHandler)enumFieldHandler3);
/* 338 */     desc.setMultivalued(false);
/* 339 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 342 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 345 */     desc.setValidator(fieldValidator);
/*     */     
/* 347 */     desc = new XMLFieldDescriptorImpl(OrderHeaderStatusStageType.class, "_stage", "Stage", NodeType.Attribute);
/* 348 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 352 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 353 */           return target.getStage();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 359 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 360 */             target.setStage((OrderHeaderStatusStageType)value);
/* 361 */           } catch (Exception ex) {
/* 362 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 366 */           return null;
/*     */         }
/*     */       };
/* 369 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(OrderHeaderStatusStageType.class, (FieldHandler)xMLFieldHandler3);
/* 370 */     desc.setImmutable(true);
/* 371 */     desc.setSchemaType("OrderHeaderStatusStageType");
/* 372 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 373 */     desc.setRequired(true);
/* 374 */     desc.setMultivalued(false);
/* 375 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 378 */     fieldValidator = new FieldValidator();
/* 379 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 382 */     desc.setValidator(fieldValidator);
/*     */     
/* 384 */     desc = new XMLFieldDescriptorImpl(OrderHeaderStatusStatusType.class, "_status", "Status", NodeType.Attribute);
/* 385 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 389 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 390 */           return target.getStatus();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 396 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 397 */             target.setStatus((OrderHeaderStatusStatusType)value);
/* 398 */           } catch (Exception ex) {
/* 399 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 403 */           return null;
/*     */         }
/*     */       };
/* 406 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(OrderHeaderStatusStatusType.class, (FieldHandler)xMLFieldHandler2);
/* 407 */     desc.setImmutable(true);
/* 408 */     desc.setSchemaType("OrderHeaderStatusStatusType");
/* 409 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 410 */     desc.setRequired(true);
/* 411 */     desc.setMultivalued(false);
/* 412 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 415 */     fieldValidator = new FieldValidator();
/* 416 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 419 */     desc.setValidator(fieldValidator);
/*     */     
/* 421 */     desc = new XMLFieldDescriptorImpl(Date.class, "_deliveryDate", "DeliveryDate", NodeType.Attribute);
/* 422 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 426 */           OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 427 */           return target.getDeliveryDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 433 */             OrderHeaderStatus target = (OrderHeaderStatus)object;
/* 434 */             target.setDeliveryDate(org.exolab.castor.types.Date.parseDate((String)value));
/* 435 */           } catch (Exception ex) {
/* 436 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 440 */           return new Date();
/*     */         }
/*     */       };
/* 443 */     desc.setSchemaType("date");
/* 444 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 445 */     desc.setMultivalued(false);
/* 446 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 449 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 452 */     DateTimeValidator typeValidator = new DateTimeValidator();
/* 453 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*     */     
/* 455 */     desc.setValidator(fieldValidator);
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
/* 472 */     return null;
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
/* 483 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 493 */     return OrderHeaderStatus.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 503 */     return this._nsPrefix;
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
/* 514 */     return this._nsURI;
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
/* 525 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 535 */     return this._xmlName;
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
/* 547 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\descriptors\OrderHeaderStatusDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */