/*     */ package com.metcash.webservices.eai.xml.retailer.order.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.order.OrderHeader;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.types.OrderApprovedType;
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
/*     */ public class OrderHeaderDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public OrderHeaderDescriptor() {
/*  60 */     this._xmlName = "OrderHeader";
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
/*  73 */     desc = new XMLFieldDescriptorImpl(String.class, "_externalOrderId", "ExternalOrderId", NodeType.Element);
/*  74 */     desc.setImmutable(true);
/*  75 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  79 */           OrderHeader target = (OrderHeader)object;
/*  80 */           return target.getExternalOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             OrderHeader target = (OrderHeader)object;
/*  87 */             target.setExternalOrderId((String)value);
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return null;
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("string");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  98 */     desc.setMultivalued(false);
/*  99 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 100 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 103 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 106 */     StringValidator typeValidator = new StringValidator();
/* 107 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 108 */     typeValidator.setWhiteSpace("preserve");
/* 109 */     typeValidator.setMaxLength(20);
/*     */     
/* 111 */     desc.setValidator(fieldValidator);
/*     */     
/* 113 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerOrderId", "CustomerOrderId", NodeType.Element);
/* 114 */     desc.setImmutable(true);
/* 115 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 119 */           OrderHeader target = (OrderHeader)object;
/* 120 */           return target.getCustomerOrderId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 126 */             OrderHeader target = (OrderHeader)object;
/* 127 */             target.setCustomerOrderId((String)value);
/* 128 */           } catch (Exception ex) {
/* 129 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 133 */           return null;
/*     */         }
/*     */       };
/* 136 */     desc.setSchemaType("string");
/* 137 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 138 */     desc.setMultivalued(false);
/* 139 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 140 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 143 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 146 */     typeValidator = new StringValidator();
/* 147 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 148 */     typeValidator.setWhiteSpace("preserve");
/* 149 */     typeValidator.setMaxLength(10);
/*     */     
/* 151 */     desc.setValidator(fieldValidator);
/*     */     
/* 153 */     desc = new XMLFieldDescriptorImpl(String.class, "_customerId", "CustomerId", NodeType.Element);
/* 154 */     desc.setImmutable(true);
/* 155 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 159 */           OrderHeader target = (OrderHeader)object;
/* 160 */           return target.getCustomerId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 166 */             OrderHeader target = (OrderHeader)object;
/* 167 */             target.setCustomerId((String)value);
/* 168 */           } catch (Exception ex) {
/* 169 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 173 */           return null;
/*     */         }
/*     */       };
/* 176 */     desc.setSchemaType("string");
/* 177 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 178 */     desc.setRequired(true);
/* 179 */     desc.setMultivalued(false);
/* 180 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 181 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 184 */     fieldValidator = new FieldValidator();
/* 185 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 188 */     typeValidator = new StringValidator();
/* 189 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 190 */     typeValidator.setWhiteSpace("preserve");
/* 191 */     typeValidator.setMaxLength(8);
/*     */     
/* 193 */     desc.setValidator(fieldValidator);
/*     */     
/* 195 */     desc = new XMLFieldDescriptorImpl(CustomerStateCodeType.class, "_customerStateCode", "CustomerStateCode", NodeType.Element);
/* 196 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 200 */           OrderHeader target = (OrderHeader)object;
/* 201 */           return target.getCustomerStateCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 207 */             OrderHeader target = (OrderHeader)object;
/* 208 */             target.setCustomerStateCode((CustomerStateCodeType)value);
/* 209 */           } catch (Exception ex) {
/* 210 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 214 */           return null;
/*     */         }
/*     */       };
/* 217 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(CustomerStateCodeType.class, (FieldHandler)xMLFieldHandler3);
/* 218 */     desc.setImmutable(true);
/* 219 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.types.CustomerStateCodeType");
/* 220 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 221 */     desc.setRequired(true);
/* 222 */     desc.setMultivalued(false);
/* 223 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 224 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 227 */     fieldValidator = new FieldValidator();
/* 228 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 231 */     desc.setValidator(fieldValidator);
/*     */     
/* 233 */     desc = new XMLFieldDescriptorImpl(OrderApprovedType.class, "_orderApproved", "OrderApproved", NodeType.Element);
/* 234 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 238 */           OrderHeader target = (OrderHeader)object;
/* 239 */           return target.getOrderApproved();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 245 */             OrderHeader target = (OrderHeader)object;
/* 246 */             target.setOrderApproved((OrderApprovedType)value);
/* 247 */           } catch (Exception ex) {
/* 248 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 252 */           return null;
/*     */         }
/*     */       };
/* 255 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(OrderApprovedType.class, (FieldHandler)xMLFieldHandler2);
/* 256 */     desc.setImmutable(true);
/* 257 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.types.OrderApprovedType");
/* 258 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 259 */     desc.setRequired(true);
/* 260 */     desc.setMultivalued(false);
/* 261 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 262 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 265 */     fieldValidator = new FieldValidator();
/* 266 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 269 */     desc.setValidator(fieldValidator);
/*     */     
/* 271 */     desc = new XMLFieldDescriptorImpl(String.class, "_specialInstructions", "SpecialInstructions", NodeType.Element);
/* 272 */     desc.setImmutable(true);
/* 273 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 277 */           OrderHeader target = (OrderHeader)object;
/* 278 */           return target.getSpecialInstructions();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 284 */             OrderHeader target = (OrderHeader)object;
/* 285 */             target.setSpecialInstructions((String)value);
/* 286 */           } catch (Exception ex) {
/* 287 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 291 */           return null;
/*     */         }
/*     */       };
/* 294 */     desc.setSchemaType("string");
/* 295 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 296 */     desc.setMultivalued(false);
/* 297 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 298 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 301 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 304 */     typeValidator = new StringValidator();
/* 305 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 306 */     typeValidator.setWhiteSpace("preserve");
/* 307 */     typeValidator.setMaxLength(90);
/*     */     
/* 309 */     desc.setValidator(fieldValidator);
/*     */     
/* 311 */     desc = new XMLFieldDescriptorImpl(String.class, "_deliveryDate", "DeliveryDate", NodeType.Element);
/* 312 */     desc.setImmutable(true);
/* 313 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 317 */           OrderHeader target = (OrderHeader)object;
/* 318 */           return target.getDeliveryDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 324 */             OrderHeader target = (OrderHeader)object;
/* 325 */             target.setDeliveryDate((String)value);
/* 326 */           } catch (Exception ex) {
/* 327 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 331 */           return null;
/*     */         }
/*     */       };
/* 334 */     desc.setSchemaType("string");
/* 335 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 336 */     desc.setMultivalued(false);
/* 337 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 338 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 341 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 344 */     typeValidator = new StringValidator();
/* 345 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 346 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 348 */     desc.setValidator(fieldValidator);
/*     */     
/* 350 */     desc = new XMLFieldDescriptorImpl(String.class, "_orderCreatedDate", "OrderCreatedDate", NodeType.Element);
/* 351 */     desc.setImmutable(true);
/* 352 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 356 */           OrderHeader target = (OrderHeader)object;
/* 357 */           return target.getOrderCreatedDate();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 363 */             OrderHeader target = (OrderHeader)object;
/* 364 */             target.setOrderCreatedDate((String)value);
/* 365 */           } catch (Exception ex) {
/* 366 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 370 */           return null;
/*     */         }
/*     */       };
/* 373 */     desc.setSchemaType("string");
/* 374 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 375 */     desc.setMultivalued(false);
/* 376 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 377 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 380 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 383 */     typeValidator = new StringValidator();
/* 384 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 385 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 387 */     desc.setValidator(fieldValidator);
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
/* 402 */     return null;
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
/* 413 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 423 */     return OrderHeader.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 433 */     return this._nsPrefix;
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
/* 444 */     return this._nsURI;
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
/* 455 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 465 */     return this._xmlName;
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
/* 477 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\descriptors\OrderHeaderDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */