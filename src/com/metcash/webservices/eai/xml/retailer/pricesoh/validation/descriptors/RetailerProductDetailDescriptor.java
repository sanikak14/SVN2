/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail;
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
/*     */ import org.exolab.castor.xml.validators.DateTimeValidator;
/*     */ import org.exolab.castor.xml.validators.LongValidator;
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
/*     */ public class RetailerProductDetailDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public RetailerProductDetailDescriptor() {
/*  60 */     this._nsURI = "metcash/retailerPriceSohResponse";
/*  61 */     this._xmlName = "RetailerProductDetail";
/*  62 */     this._elementDefinition = true;
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
/*  74 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Element);
/*  75 */     desc.setImmutable(true);
/*  76 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  80 */           RetailerProductDetail target = (RetailerProductDetail)object;
/*  81 */           return target.getProductCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  87 */             RetailerProductDetail target = (RetailerProductDetail)object;
/*  88 */             target.setProductCode((String)value);
/*  89 */           } catch (Exception ex) {
/*  90 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  94 */           return null;
/*     */         }
/*     */       };
/*  97 */     desc.setSchemaType("string");
/*  98 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  99 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 100 */     desc.setRequired(true);
/* 101 */     desc.setMultivalued(false);
/* 102 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 103 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 106 */     fieldValidator = new FieldValidator();
/* 107 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 110 */     StringValidator stringValidator2 = new StringValidator();
/* 111 */     fieldValidator.setValidator((TypeValidator)stringValidator2);
/* 112 */     stringValidator2.addPattern("\\d+");
/* 113 */     stringValidator2.setWhiteSpace("preserve");
/* 114 */     stringValidator2.setMaxLength(14);
/* 115 */     stringValidator2.setMinLength(1);
/*     */     
/* 117 */     desc.setValidator(fieldValidator);
/*     */     
/* 119 */     desc = new XMLFieldDescriptorImpl(String.class, "_productDescription", "ProductDescription", NodeType.Element);
/* 120 */     desc.setImmutable(true);
/* 121 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 125 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 126 */           return target.getProductDescription();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 132 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 133 */             target.setProductDescription((String)value);
/* 134 */           } catch (Exception ex) {
/* 135 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 139 */           return null;
/*     */         }
/*     */       };
/* 142 */     desc.setSchemaType("string");
/* 143 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 144 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 145 */     desc.setRequired(true);
/* 146 */     desc.setMultivalued(false);
/* 147 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 148 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 151 */     fieldValidator = new FieldValidator();
/* 152 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 155 */     stringValidator2 = new StringValidator();
/* 156 */     fieldValidator.setValidator((TypeValidator)stringValidator2);
/* 157 */     stringValidator2.setWhiteSpace("preserve");
/*     */     
/* 159 */     desc.setValidator(fieldValidator);
/*     */     
/* 161 */     desc = new XMLFieldDescriptorImpl(long.class, "_deal", "Deal", NodeType.Element);
/* 162 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 166 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 167 */           if (!target.hasDeal()) return null; 
/* 168 */           return new Long(target.getDeal());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 174 */             RetailerProductDetail target = (RetailerProductDetail)object;
/*     */             
/* 176 */             if (value == null) {
/* 177 */               target.deleteDeal();
/*     */               return;
/*     */             } 
/* 180 */             target.setDeal(((Long)value).longValue());
/* 181 */           } catch (Exception ex) {
/* 182 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 186 */           return null;
/*     */         }
/*     */       };
/* 189 */     desc.setSchemaType("long");
/* 190 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 191 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 192 */     desc.setMultivalued(false);
/* 193 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 194 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 197 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 200 */     LongValidator longValidator = new LongValidator();
/* 201 */     fieldValidator.setValidator((TypeValidator)longValidator);
/* 202 */     longValidator.setMinInclusive(0L);
/* 203 */     longValidator.setMaxInclusive(Long.MAX_VALUE);
/*     */     
/* 205 */     desc.setValidator(fieldValidator);
/*     */     
/* 207 */     desc = new XMLFieldDescriptorImpl(long.class, "_universalDeal", "UniversalDeal", NodeType.Element);
/* 208 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 212 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 213 */           if (!target.hasUniversalDeal()) return null; 
/* 214 */           return new Long(target.getUniversalDeal());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 220 */             RetailerProductDetail target = (RetailerProductDetail)object;
/*     */             
/* 222 */             if (value == null) {
/* 223 */               target.deleteUniversalDeal();
/*     */               return;
/*     */             } 
/* 226 */             target.setUniversalDeal(((Long)value).longValue());
/* 227 */           } catch (Exception ex) {
/* 228 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 232 */           return null;
/*     */         }
/*     */       };
/* 235 */     desc.setSchemaType("long");
/* 236 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 237 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 238 */     desc.setMultivalued(false);
/* 239 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 240 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 243 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 246 */     longValidator = new LongValidator();
/* 247 */     fieldValidator.setValidator((TypeValidator)longValidator);
/* 248 */     longValidator.setMinInclusive(0L);
/* 249 */     longValidator.setMaxInclusive(Long.MAX_VALUE);
/*     */     
/* 251 */     desc.setValidator(fieldValidator);
/*     */     
/* 253 */     desc = new XMLFieldDescriptorImpl(long.class, "_netWS", "NetWS", NodeType.Element);
/* 254 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 258 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 259 */           if (!target.hasNetWS()) return null; 
/* 260 */           return new Long(target.getNetWS());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 266 */             RetailerProductDetail target = (RetailerProductDetail)object;
/*     */             
/* 268 */             if (value == null)
/*     */               return; 
/* 270 */             target.setNetWS(((Long)value).longValue());
/* 271 */           } catch (Exception ex) {
/* 272 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 276 */           return null;
/*     */         }
/*     */       };
/* 279 */     desc.setSchemaType("long");
/* 280 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 281 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 282 */     desc.setRequired(true);
/* 283 */     desc.setMultivalued(false);
/* 284 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 285 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 288 */     fieldValidator = new FieldValidator();
/* 289 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 292 */     longValidator = new LongValidator();
/* 293 */     fieldValidator.setValidator((TypeValidator)longValidator);
/* 294 */     longValidator.setMinInclusive(0L);
/* 295 */     longValidator.setMaxInclusive(Long.MAX_VALUE);
/*     */     
/* 297 */     desc.setValidator(fieldValidator);
/*     */     
/* 299 */     desc = new XMLFieldDescriptorImpl(long.class, "_LUC", "LUC", NodeType.Element);
/* 300 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 304 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 305 */           if (!target.hasLUC()) return null; 
/* 306 */           return new Long(target.getLUC());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 312 */             RetailerProductDetail target = (RetailerProductDetail)object;
/*     */             
/* 314 */             if (value == null)
/*     */               return; 
/* 316 */             target.setLUC(((Long)value).longValue());
/* 317 */           } catch (Exception ex) {
/* 318 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 322 */           return null;
/*     */         }
/*     */       };
/* 325 */     desc.setSchemaType("long");
/* 326 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 327 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 328 */     desc.setRequired(true);
/* 329 */     desc.setMultivalued(false);
/* 330 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 331 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 334 */     fieldValidator = new FieldValidator();
/* 335 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 338 */     longValidator = new LongValidator();
/* 339 */     fieldValidator.setValidator((TypeValidator)longValidator);
/* 340 */     longValidator.setMinInclusive(0L);
/* 341 */     longValidator.setMaxInclusive(Long.MAX_VALUE);
/*     */     
/* 343 */     desc.setValidator(fieldValidator);
/*     */     
/* 345 */     desc = new XMLFieldDescriptorImpl(String.class, "_SOH", "SOH", NodeType.Element);
/* 346 */     desc.setImmutable(true);
/* 347 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 351 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 352 */           return target.getSOH();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 358 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 359 */             target.setSOH((String)value);
/* 360 */           } catch (Exception ex) {
/* 361 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 365 */           return null;
/*     */         }
/*     */       };
/* 368 */     desc.setSchemaType("string");
/* 369 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 370 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 371 */     desc.setMultivalued(false);
/* 372 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 373 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 376 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 379 */     StringValidator stringValidator1 = new StringValidator();
/* 380 */     fieldValidator.setValidator((TypeValidator)stringValidator1);
/* 381 */     stringValidator1.setWhiteSpace("preserve");
/*     */     
/* 383 */     desc.setValidator(fieldValidator);
/*     */     
/* 385 */     desc = new XMLFieldDescriptorImpl(SOHStatusType.class, "_SOHStatus", "SOHStatus", NodeType.Element);
/* 386 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 390 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 391 */           return target.getSOHStatus();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 397 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 398 */             target.setSOHStatus((SOHStatusType)value);
/* 399 */           } catch (Exception ex) {
/* 400 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 404 */           return null;
/*     */         }
/*     */       };
/* 407 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(SOHStatusType.class, (FieldHandler)xMLFieldHandler3);
/* 408 */     desc.setImmutable(true);
/* 409 */     desc.setSchemaType("com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType");
/* 410 */     desc.setHandler((FieldHandler)enumFieldHandler);
/* 411 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 412 */     desc.setRequired(true);
/* 413 */     desc.setMultivalued(false);
/* 414 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 415 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 418 */     fieldValidator = new FieldValidator();
/* 419 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 422 */     desc.setValidator(fieldValidator);
/*     */     
/* 424 */     desc = new XMLFieldDescriptorImpl(Date.class, "_SOHTimestamp", "SOHTimestamp", NodeType.Element);
/* 425 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 429 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 430 */           return target.getSOHTimestamp();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 436 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 437 */             target.setSOHTimestamp((Date)value);
/* 438 */           } catch (Exception ex) {
/* 439 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 443 */           return new Date();
/*     */         }
/*     */       };
/* 446 */     DateFieldHandler dateFieldHandler = new DateFieldHandler((FieldHandler)xMLFieldHandler2);
/* 447 */     desc.setImmutable(true);
/* 448 */     desc.setSchemaType("dateTime");
/* 449 */     desc.setHandler((FieldHandler)dateFieldHandler);
/* 450 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 451 */     desc.setMultivalued(false);
/* 452 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 453 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 456 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 459 */     DateTimeValidator typeValidator = new DateTimeValidator();
/* 460 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*     */     
/* 462 */     desc.setValidator(fieldValidator);
/*     */     
/* 464 */     desc = new XMLFieldDescriptorImpl(QDAList.class, "_QDAList", "QDAList", NodeType.Element);
/* 465 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 469 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 470 */           return target.getQDAList();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 476 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 477 */             target.setQDAList((QDAList)value);
/* 478 */           } catch (Exception ex) {
/* 479 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 483 */           return new QDAList();
/*     */         }
/*     */       };
/* 486 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList");
/* 487 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 488 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 489 */     desc.setMultivalued(false);
/* 490 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 491 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 494 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 497 */     desc.setValidator(fieldValidator);
/*     */     
/* 499 */     desc = new XMLFieldDescriptorImpl(BonusList.class, "_bonusList", "BonusList", NodeType.Element);
/* 500 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 504 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 505 */           return target.getBonusList();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 511 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 512 */             target.setBonusList((BonusList)value);
/* 513 */           } catch (Exception ex) {
/* 514 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 518 */           return new BonusList();
/*     */         }
/*     */       };
/* 521 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList");
/* 522 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 523 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 524 */     desc.setMultivalued(false);
/* 525 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 526 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 529 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 532 */     desc.setValidator(fieldValidator);
/*     */     
/* 534 */     desc = new XMLFieldDescriptorImpl(ParcelBuyList.class, "_parcelBuyList", "ParcelBuyList", NodeType.Element);
/* 535 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 539 */           RetailerProductDetail target = (RetailerProductDetail)object;
/* 540 */           return target.getParcelBuyList();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 546 */             RetailerProductDetail target = (RetailerProductDetail)object;
/* 547 */             target.setParcelBuyList((ParcelBuyList)value);
/* 548 */           } catch (Exception ex) {
/* 549 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 553 */           return new ParcelBuyList();
/*     */         }
/*     */       };
/* 556 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList");
/* 557 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 558 */     desc.setNameSpaceURI("metcash/retailerPriceSohResponse");
/* 559 */     desc.setMultivalued(false);
/* 560 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 561 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 564 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 567 */     desc.setValidator(fieldValidator);
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
/* 582 */     return null;
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
/* 593 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 603 */     return RetailerProductDetail.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 613 */     return this._nsPrefix;
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
/* 624 */     return this._nsURI;
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
/* 635 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 645 */     return this._xmlName;
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
/* 657 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\descriptors\RetailerProductDetailDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */