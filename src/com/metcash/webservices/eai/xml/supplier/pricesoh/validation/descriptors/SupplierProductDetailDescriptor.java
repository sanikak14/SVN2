/*      */ package com.metcash.webservices.eai.xml.supplier.pricesoh.validation.descriptors;
/*      */ 
/*      */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*      */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList;
/*      */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList;
/*      */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList;
/*      */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail;
/*      */ import java.util.Date;
/*      */ import org.exolab.castor.mapping.AccessMode;
/*      */ import org.exolab.castor.mapping.FieldDescriptor;
/*      */ import org.exolab.castor.mapping.FieldHandler;
/*      */ import org.exolab.castor.xml.FieldValidator;
/*      */ import org.exolab.castor.xml.NodeType;
/*      */ import org.exolab.castor.xml.TypeValidator;
/*      */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*      */ import org.exolab.castor.xml.XMLFieldHandler;
/*      */ import org.exolab.castor.xml.handlers.DateFieldHandler;
/*      */ import org.exolab.castor.xml.handlers.EnumFieldHandler;
/*      */ import org.exolab.castor.xml.util.XMLClassDescriptorImpl;
/*      */ import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;
/*      */ import org.exolab.castor.xml.validators.BooleanValidator;
/*      */ import org.exolab.castor.xml.validators.DateTimeValidator;
/*      */ import org.exolab.castor.xml.validators.IntValidator;
/*      */ import org.exolab.castor.xml.validators.LongValidator;
/*      */ import org.exolab.castor.xml.validators.StringValidator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SupplierProductDetailDescriptor
/*      */   extends XMLClassDescriptorImpl
/*      */ {
/*   60 */   private String _nsURI = "metcash/supplierPriceSohResponse";
/*   61 */   private String _xmlName = "SupplierProductDetail";
/*      */   public SupplierProductDetailDescriptor() {
/*   63 */     XMLFieldDescriptorImpl desc = null;
/*   64 */     FieldHandler handler = null;
/*   65 */     FieldValidator fieldValidator = null;
/*      */ 
/*      */ 
/*      */     
/*   69 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Attribute);
/*   70 */     desc.setImmutable(true);
/*   71 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*   75 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*   76 */           return target.getProductCode();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*   82 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*   83 */             target.setProductCode((String)value);
/*   84 */           } catch (Exception ex) {
/*   85 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*   89 */           return null;
/*      */         }
/*      */       };
/*   92 */     desc.setSchemaType("string");
/*   93 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*   94 */     desc.setRequired(true);
/*   95 */     desc.setMultivalued(false);
/*   96 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*   99 */     fieldValidator = new FieldValidator();
/*  100 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  103 */     StringValidator stringValidator3 = new StringValidator();
/*  104 */     fieldValidator.setValidator((TypeValidator)stringValidator3);
/*  105 */     stringValidator3.addPattern("\\d+");
/*  106 */     stringValidator3.setWhiteSpace("preserve");
/*  107 */     stringValidator3.setMaxLength(14);
/*  108 */     stringValidator3.setMinLength(1);
/*      */     
/*  110 */     desc.setValidator(fieldValidator);
/*      */     
/*  112 */     desc = new XMLFieldDescriptorImpl(String.class, "_productDescription", "ProductDescription", NodeType.Attribute);
/*  113 */     desc.setImmutable(true);
/*  114 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  118 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  119 */           return target.getProductDescription();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  125 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  126 */             target.setProductDescription((String)value);
/*  127 */           } catch (Exception ex) {
/*  128 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  132 */           return null;
/*      */         }
/*      */       };
/*  135 */     desc.setSchemaType("string");
/*  136 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  137 */     desc.setRequired(true);
/*  138 */     desc.setMultivalued(false);
/*  139 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  142 */     fieldValidator = new FieldValidator();
/*  143 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  146 */     stringValidator3 = new StringValidator();
/*  147 */     fieldValidator.setValidator((TypeValidator)stringValidator3);
/*  148 */     stringValidator3.setWhiteSpace("preserve");
/*      */     
/*  150 */     desc.setValidator(fieldValidator);
/*      */     
/*  152 */     desc = new XMLFieldDescriptorImpl(long.class, "_baseWS", "BaseWS", NodeType.Attribute);
/*  153 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  157 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  158 */           if (!target.hasBaseWS()) return null; 
/*  159 */           return new Long(target.getBaseWS());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  165 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  167 */             if (value == null)
/*      */               return; 
/*  169 */             target.setBaseWS(((Long)value).longValue());
/*  170 */           } catch (Exception ex) {
/*  171 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  175 */           return null;
/*      */         }
/*      */       };
/*  178 */     desc.setSchemaType("long");
/*  179 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  180 */     desc.setRequired(true);
/*  181 */     desc.setMultivalued(false);
/*  182 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  185 */     fieldValidator = new FieldValidator();
/*  186 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  189 */     LongValidator longValidator2 = new LongValidator();
/*  190 */     fieldValidator.setValidator((TypeValidator)longValidator2);
/*  191 */     longValidator2.setMinInclusive(0L);
/*  192 */     longValidator2.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  194 */     desc.setValidator(fieldValidator);
/*      */     
/*  196 */     desc = new XMLFieldDescriptorImpl(long.class, "_deal", "Deal", NodeType.Attribute);
/*  197 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  201 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  202 */           if (!target.hasDeal()) return null; 
/*  203 */           return new Long(target.getDeal());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  209 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  211 */             if (value == null) {
/*  212 */               target.deleteDeal();
/*      */               return;
/*      */             } 
/*  215 */             target.setDeal(((Long)value).longValue());
/*  216 */           } catch (Exception ex) {
/*  217 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  221 */           return null;
/*      */         }
/*      */       };
/*  224 */     desc.setSchemaType("long");
/*  225 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  226 */     desc.setMultivalued(false);
/*  227 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  230 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  233 */     longValidator2 = new LongValidator();
/*  234 */     fieldValidator.setValidator((TypeValidator)longValidator2);
/*  235 */     longValidator2.setMinInclusive(0L);
/*  236 */     longValidator2.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  238 */     desc.setValidator(fieldValidator);
/*      */     
/*  240 */     desc = new XMLFieldDescriptorImpl(String.class, "_dealDescription", "DealDescription", NodeType.Attribute);
/*  241 */     desc.setImmutable(true);
/*  242 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  246 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  247 */           return target.getDealDescription();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  253 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  254 */             target.setDealDescription((String)value);
/*  255 */           } catch (Exception ex) {
/*  256 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  260 */           return null;
/*      */         }
/*      */       };
/*  263 */     desc.setSchemaType("string");
/*  264 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  265 */     desc.setMultivalued(false);
/*  266 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  269 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  272 */     StringValidator stringValidator2 = new StringValidator();
/*  273 */     fieldValidator.setValidator((TypeValidator)stringValidator2);
/*  274 */     stringValidator2.setWhiteSpace("preserve");
/*      */     
/*  276 */     desc.setValidator(fieldValidator);
/*      */     
/*  278 */     desc = new XMLFieldDescriptorImpl(long.class, "_universalDeal", "UniversalDeal", NodeType.Attribute);
/*  279 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  283 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  284 */           if (!target.hasUniversalDeal()) return null; 
/*  285 */           return new Long(target.getUniversalDeal());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  291 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  293 */             if (value == null) {
/*  294 */               target.deleteUniversalDeal();
/*      */               return;
/*      */             } 
/*  297 */             target.setUniversalDeal(((Long)value).longValue());
/*  298 */           } catch (Exception ex) {
/*  299 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  303 */           return null;
/*      */         }
/*      */       };
/*  306 */     desc.setSchemaType("long");
/*  307 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  308 */     desc.setMultivalued(false);
/*  309 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  312 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  315 */     LongValidator longValidator1 = new LongValidator();
/*  316 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  317 */     longValidator1.setMinInclusive(0L);
/*  318 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  320 */     desc.setValidator(fieldValidator);
/*      */     
/*  322 */     desc = new XMLFieldDescriptorImpl(long.class, "_WET", "WET", NodeType.Attribute);
/*  323 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  327 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  328 */           if (!target.hasWET()) return null; 
/*  329 */           return new Long(target.getWET());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  335 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  337 */             if (value == null) {
/*  338 */               target.deleteWET();
/*      */               return;
/*      */             } 
/*  341 */             target.setWET(((Long)value).longValue());
/*  342 */           } catch (Exception ex) {
/*  343 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  347 */           return null;
/*      */         }
/*      */       };
/*  350 */     desc.setSchemaType("long");
/*  351 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  352 */     desc.setMultivalued(false);
/*  353 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  356 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  359 */     longValidator1 = new LongValidator();
/*  360 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  361 */     longValidator1.setMinInclusive(0L);
/*  362 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  364 */     desc.setValidator(fieldValidator);
/*      */     
/*  366 */     desc = new XMLFieldDescriptorImpl(long.class, "_netWS", "NetWS", NodeType.Attribute);
/*  367 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  371 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  372 */           if (!target.hasNetWS()) return null; 
/*  373 */           return new Long(target.getNetWS());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  379 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  381 */             if (value == null)
/*      */               return; 
/*  383 */             target.setNetWS(((Long)value).longValue());
/*  384 */           } catch (Exception ex) {
/*  385 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  389 */           return null;
/*      */         }
/*      */       };
/*  392 */     desc.setSchemaType("long");
/*  393 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  394 */     desc.setRequired(true);
/*  395 */     desc.setMultivalued(false);
/*  396 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  399 */     fieldValidator = new FieldValidator();
/*  400 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  403 */     longValidator1 = new LongValidator();
/*  404 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  405 */     longValidator1.setMinInclusive(0L);
/*  406 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  408 */     desc.setValidator(fieldValidator);
/*      */     
/*  410 */     desc = new XMLFieldDescriptorImpl(long.class, "_deliveryFee", "DeliveryFee", NodeType.Attribute);
/*  411 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  415 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  416 */           if (!target.hasDeliveryFee()) return null; 
/*  417 */           return new Long(target.getDeliveryFee());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  423 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  425 */             if (value == null) {
/*  426 */               target.deleteDeliveryFee();
/*      */               return;
/*      */             } 
/*  429 */             target.setDeliveryFee(((Long)value).longValue());
/*  430 */           } catch (Exception ex) {
/*  431 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  435 */           return null;
/*      */         }
/*      */       };
/*  438 */     desc.setSchemaType("long");
/*  439 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  440 */     desc.setMultivalued(false);
/*  441 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  444 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  447 */     longValidator1 = new LongValidator();
/*  448 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  449 */     longValidator1.setMinInclusive(0L);
/*  450 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  452 */     desc.setValidator(fieldValidator);
/*      */     
/*  454 */     desc = new XMLFieldDescriptorImpl(long.class, "_GST", "GST", NodeType.Attribute);
/*  455 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  459 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  460 */           if (!target.hasGST()) return null; 
/*  461 */           return new Long(target.getGST());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  467 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  469 */             if (value == null)
/*      */               return; 
/*  471 */             target.setGST(((Long)value).longValue());
/*  472 */           } catch (Exception ex) {
/*  473 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  477 */           return null;
/*      */         }
/*      */       };
/*  480 */     desc.setSchemaType("long");
/*  481 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  482 */     desc.setRequired(true);
/*  483 */     desc.setMultivalued(false);
/*  484 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  487 */     fieldValidator = new FieldValidator();
/*  488 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  491 */     longValidator1 = new LongValidator();
/*  492 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  493 */     longValidator1.setMinInclusive(0L);
/*  494 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  496 */     desc.setValidator(fieldValidator);
/*      */     
/*  498 */     desc = new XMLFieldDescriptorImpl(long.class, "_casePrice", "CasePrice", NodeType.Attribute);
/*  499 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  503 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  504 */           if (!target.hasCasePrice()) return null; 
/*  505 */           return new Long(target.getCasePrice());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  511 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  513 */             if (value == null)
/*      */               return; 
/*  515 */             target.setCasePrice(((Long)value).longValue());
/*  516 */           } catch (Exception ex) {
/*  517 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  521 */           return null;
/*      */         }
/*      */       };
/*  524 */     desc.setSchemaType("long");
/*  525 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  526 */     desc.setRequired(true);
/*  527 */     desc.setMultivalued(false);
/*  528 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  531 */     fieldValidator = new FieldValidator();
/*  532 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  535 */     longValidator1 = new LongValidator();
/*  536 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  537 */     longValidator1.setMinInclusive(0L);
/*  538 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  540 */     desc.setValidator(fieldValidator);
/*      */     
/*  542 */     desc = new XMLFieldDescriptorImpl(long.class, "_adminFee", "AdminFee", NodeType.Attribute);
/*  543 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  547 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  548 */           if (!target.hasAdminFee()) return null; 
/*  549 */           return new Long(target.getAdminFee());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  555 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  557 */             if (value == null) {
/*  558 */               target.deleteAdminFee();
/*      */               return;
/*      */             } 
/*  561 */             target.setAdminFee(((Long)value).longValue());
/*  562 */           } catch (Exception ex) {
/*  563 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  567 */           return null;
/*      */         }
/*      */       };
/*  570 */     desc.setSchemaType("long");
/*  571 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  572 */     desc.setMultivalued(false);
/*  573 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  576 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  579 */     longValidator1 = new LongValidator();
/*  580 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  581 */     longValidator1.setMinInclusive(0L);
/*  582 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  584 */     desc.setValidator(fieldValidator);
/*      */     
/*  586 */     desc = new XMLFieldDescriptorImpl(long.class, "_financeFee", "FinanceFee", NodeType.Attribute);
/*  587 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  591 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  592 */           if (!target.hasFinanceFee()) return null; 
/*  593 */           return new Long(target.getFinanceFee());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  599 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  601 */             if (value == null) {
/*  602 */               target.deleteFinanceFee();
/*      */               return;
/*      */             } 
/*  605 */             target.setFinanceFee(((Long)value).longValue());
/*  606 */           } catch (Exception ex) {
/*  607 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  611 */           return null;
/*      */         }
/*      */       };
/*  614 */     desc.setSchemaType("long");
/*  615 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  616 */     desc.setMultivalued(false);
/*  617 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  620 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  623 */     longValidator1 = new LongValidator();
/*  624 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  625 */     longValidator1.setMinInclusive(0L);
/*  626 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  628 */     desc.setValidator(fieldValidator);
/*      */     
/*  630 */     desc = new XMLFieldDescriptorImpl(long.class, "_totalCasePrice", "TotalCasePrice", NodeType.Attribute);
/*  631 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  635 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  636 */           if (!target.hasTotalCasePrice()) return null; 
/*  637 */           return new Long(target.getTotalCasePrice());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  643 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  645 */             if (value == null)
/*      */               return; 
/*  647 */             target.setTotalCasePrice(((Long)value).longValue());
/*  648 */           } catch (Exception ex) {
/*  649 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  653 */           return null;
/*      */         }
/*      */       };
/*  656 */     desc.setSchemaType("long");
/*  657 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  658 */     desc.setRequired(true);
/*  659 */     desc.setMultivalued(false);
/*  660 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  663 */     fieldValidator = new FieldValidator();
/*  664 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  667 */     longValidator1 = new LongValidator();
/*  668 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  669 */     longValidator1.setMinInclusive(0L);
/*  670 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  672 */     desc.setValidator(fieldValidator);
/*      */     
/*  674 */     desc = new XMLFieldDescriptorImpl(long.class, "_LUC", "LUC", NodeType.Attribute);
/*  675 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  679 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  680 */           if (!target.hasLUC()) return null; 
/*  681 */           return new Long(target.getLUC());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  687 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  689 */             if (value == null)
/*      */               return; 
/*  691 */             target.setLUC(((Long)value).longValue());
/*  692 */           } catch (Exception ex) {
/*  693 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  697 */           return null;
/*      */         }
/*      */       };
/*  700 */     desc.setSchemaType("long");
/*  701 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  702 */     desc.setRequired(true);
/*  703 */     desc.setMultivalued(false);
/*  704 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  707 */     fieldValidator = new FieldValidator();
/*  708 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  711 */     longValidator1 = new LongValidator();
/*  712 */     fieldValidator.setValidator((TypeValidator)longValidator1);
/*  713 */     longValidator1.setMinInclusive(0L);
/*  714 */     longValidator1.setMaxInclusive(Long.MAX_VALUE);
/*      */     
/*  716 */     desc.setValidator(fieldValidator);
/*      */     
/*  718 */     desc = new XMLFieldDescriptorImpl(boolean.class, "_applyQDA", "ApplyQDA", NodeType.Attribute);
/*  719 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  723 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  724 */           if (!target.hasApplyQDA()) return null; 
/*  725 */           return target.getApplyQDA() ? Boolean.TRUE : Boolean.FALSE;
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  731 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  733 */             if (value == null) {
/*  734 */               target.deleteApplyQDA();
/*      */               return;
/*      */             } 
/*  737 */             target.setApplyQDA(((Boolean)value).booleanValue());
/*  738 */           } catch (Exception ex) {
/*  739 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  743 */           return null;
/*      */         }
/*      */       };
/*  746 */     desc.setSchemaType("boolean");
/*  747 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  748 */     desc.setMultivalued(false);
/*  749 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  752 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  755 */     BooleanValidator booleanValidator = new BooleanValidator();
/*  756 */     fieldValidator.setValidator((TypeValidator)booleanValidator);
/*      */     
/*  758 */     desc.setValidator(fieldValidator);
/*      */     
/*  760 */     desc = new XMLFieldDescriptorImpl(boolean.class, "_applyBonus", "ApplyBonus", NodeType.Attribute);
/*  761 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  765 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  766 */           if (!target.hasApplyBonus()) return null; 
/*  767 */           return target.getApplyBonus() ? Boolean.TRUE : Boolean.FALSE;
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  773 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  775 */             if (value == null) {
/*  776 */               target.deleteApplyBonus();
/*      */               return;
/*      */             } 
/*  779 */             target.setApplyBonus(((Boolean)value).booleanValue());
/*  780 */           } catch (Exception ex) {
/*  781 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  785 */           return null;
/*      */         }
/*      */       };
/*  788 */     desc.setSchemaType("boolean");
/*  789 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  790 */     desc.setMultivalued(false);
/*  791 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  794 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  797 */     booleanValidator = new BooleanValidator();
/*  798 */     fieldValidator.setValidator((TypeValidator)booleanValidator);
/*      */     
/*  800 */     desc.setValidator(fieldValidator);
/*      */     
/*  802 */     desc = new XMLFieldDescriptorImpl(String.class, "_SOH", "SOH", NodeType.Attribute);
/*  803 */     desc.setImmutable(true);
/*  804 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  808 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  809 */           return target.getSOH();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  815 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  816 */             target.setSOH((String)value);
/*  817 */           } catch (Exception ex) {
/*  818 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  822 */           return null;
/*      */         }
/*      */       };
/*  825 */     desc.setSchemaType("string");
/*  826 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/*  827 */     desc.setRequired(true);
/*  828 */     desc.setMultivalued(false);
/*  829 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  832 */     fieldValidator = new FieldValidator();
/*  833 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  836 */     StringValidator stringValidator1 = new StringValidator();
/*  837 */     fieldValidator.setValidator((TypeValidator)stringValidator1);
/*  838 */     stringValidator1.setWhiteSpace("preserve");
/*      */     
/*  840 */     desc.setValidator(fieldValidator);
/*      */     
/*  842 */     desc = new XMLFieldDescriptorImpl(SOHStatusType.class, "_SOHStatus", "SOHStatus", NodeType.Attribute);
/*  843 */     xMLFieldHandler3 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  847 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  848 */           return target.getSOHStatus();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  854 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  855 */             target.setSOHStatus((SOHStatusType)value);
/*  856 */           } catch (Exception ex) {
/*  857 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  861 */           return null;
/*      */         }
/*      */       };
/*  864 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(SOHStatusType.class, (FieldHandler)xMLFieldHandler3);
/*  865 */     desc.setImmutable(true);
/*  866 */     desc.setSchemaType("com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType");
/*  867 */     desc.setHandler((FieldHandler)enumFieldHandler);
/*  868 */     desc.setRequired(true);
/*  869 */     desc.setMultivalued(false);
/*  870 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  873 */     fieldValidator = new FieldValidator();
/*  874 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  877 */     desc.setValidator(fieldValidator);
/*      */     
/*  879 */     desc = new XMLFieldDescriptorImpl(Date.class, "_SOHTimestamp", "SOHTimestamp", NodeType.Attribute);
/*  880 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  884 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  885 */           return target.getSOHTimestamp();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  891 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  892 */             target.setSOHTimestamp((Date)value);
/*  893 */           } catch (Exception ex) {
/*  894 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  898 */           return new Date();
/*      */         }
/*      */       };
/*  901 */     DateFieldHandler dateFieldHandler = new DateFieldHandler((FieldHandler)xMLFieldHandler2);
/*  902 */     desc.setImmutable(true);
/*  903 */     desc.setSchemaType("dateTime");
/*  904 */     desc.setHandler((FieldHandler)dateFieldHandler);
/*  905 */     desc.setRequired(true);
/*  906 */     desc.setMultivalued(false);
/*  907 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  910 */     fieldValidator = new FieldValidator();
/*  911 */     fieldValidator.setMinOccurs(1);
/*      */ 
/*      */     
/*  914 */     DateTimeValidator dateTimeValidator = new DateTimeValidator();
/*  915 */     fieldValidator.setValidator((TypeValidator)dateTimeValidator);
/*      */     
/*  917 */     desc.setValidator(fieldValidator);
/*      */     
/*  919 */     desc = new XMLFieldDescriptorImpl(int.class, "_onOrderQty", "OnOrderQty", NodeType.Attribute);
/*  920 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  924 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  925 */           if (!target.hasOnOrderQty()) return null; 
/*  926 */           return new Integer(target.getOnOrderQty());
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  932 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*      */             
/*  934 */             if (value == null) {
/*  935 */               target.deleteOnOrderQty();
/*      */               return;
/*      */             } 
/*  938 */             target.setOnOrderQty(((Integer)value).intValue());
/*  939 */           } catch (Exception ex) {
/*  940 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  944 */           return null;
/*      */         }
/*      */       };
/*  947 */     desc.setSchemaType("int");
/*  948 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/*  949 */     desc.setMultivalued(false);
/*  950 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  953 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  956 */     IntValidator typeValidator = new IntValidator();
/*  957 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/*  958 */     typeValidator.setMinInclusive(-2147483648);
/*  959 */     typeValidator.setMaxInclusive(2147483647);
/*      */     
/*  961 */     desc.setValidator(fieldValidator);
/*      */ 
/*      */ 
/*      */     
/*  965 */     desc = new XMLFieldDescriptorImpl(QDAList.class, "_QDAList", "QDAList", NodeType.Element);
/*  966 */     xMLFieldHandler1 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/*  970 */           SupplierProductDetail target = (SupplierProductDetail)object;
/*  971 */           return target.getQDAList();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/*  977 */             SupplierProductDetail target = (SupplierProductDetail)object;
/*  978 */             target.setQDAList((QDAList)value);
/*  979 */           } catch (Exception ex) {
/*  980 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/*  984 */           return new QDAList();
/*      */         }
/*      */       };
/*  987 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList");
/*  988 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/*  989 */     desc.setNameSpaceURI("metcash/supplierPriceSohResponse");
/*  990 */     desc.setMultivalued(false);
/*  991 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*  992 */     addSequenceElement((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/*  995 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/*  998 */     desc.setValidator(fieldValidator);
/*      */     
/* 1000 */     desc = new XMLFieldDescriptorImpl(BonusList.class, "_bonusList", "BonusList", NodeType.Element);
/* 1001 */     xMLFieldHandler1 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/* 1005 */           SupplierProductDetail target = (SupplierProductDetail)object;
/* 1006 */           return target.getBonusList();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/* 1012 */             SupplierProductDetail target = (SupplierProductDetail)object;
/* 1013 */             target.setBonusList((BonusList)value);
/* 1014 */           } catch (Exception ex) {
/* 1015 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/* 1019 */           return new BonusList();
/*      */         }
/*      */       };
/* 1022 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList");
/* 1023 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 1024 */     desc.setNameSpaceURI("metcash/supplierPriceSohResponse");
/* 1025 */     desc.setMultivalued(false);
/* 1026 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 1027 */     addSequenceElement((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/* 1030 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/* 1033 */     desc.setValidator(fieldValidator);
/*      */     
/* 1035 */     desc = new XMLFieldDescriptorImpl(ParcelBuyList.class, "_parcelBuyList", "ParcelBuyList", NodeType.Element);
/* 1036 */     xMLFieldHandler1 = new XMLFieldHandler()
/*      */       {
/*      */         public Object getValue(Object object) throws IllegalStateException
/*      */         {
/* 1040 */           SupplierProductDetail target = (SupplierProductDetail)object;
/* 1041 */           return target.getParcelBuyList();
/*      */         }
/*      */ 
/*      */         
/*      */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*      */           try {
/* 1047 */             SupplierProductDetail target = (SupplierProductDetail)object;
/* 1048 */             target.setParcelBuyList((ParcelBuyList)value);
/* 1049 */           } catch (Exception ex) {
/* 1050 */             throw new IllegalStateException(ex.toString());
/*      */           } 
/*      */         }
/*      */         public Object newInstance(Object parent) {
/* 1054 */           return new ParcelBuyList();
/*      */         }
/*      */       };
/* 1057 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList");
/* 1058 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 1059 */     desc.setNameSpaceURI("metcash/supplierPriceSohResponse");
/* 1060 */     desc.setMultivalued(false);
/* 1061 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 1062 */     addSequenceElement((XMLFieldDescriptor)desc);
/*      */ 
/*      */     
/* 1065 */     fieldValidator = new FieldValidator();
/*      */ 
/*      */     
/* 1068 */     desc.setValidator(fieldValidator);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean _elementDefinition = true;
/*      */ 
/*      */   
/*      */   private String _nsPrefix;
/*      */ 
/*      */   
/*      */   private XMLFieldDescriptor _identity;
/*      */ 
/*      */   
/*      */   public AccessMode getAccessMode() {
/* 1083 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FieldDescriptor getIdentity() {
/* 1094 */     return (FieldDescriptor)this._identity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Class getJavaClass() {
/* 1104 */     return SupplierProductDetail.class;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNameSpacePrefix() {
/* 1114 */     return this._nsPrefix;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNameSpaceURI() {
/* 1125 */     return this._nsURI;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TypeValidator getValidator() {
/* 1136 */     return (TypeValidator)this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getXMLName() {
/* 1146 */     return this._xmlName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isElementDefinition() {
/* 1158 */     return this._elementDefinition;
/*      */   }
/*      */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\descriptors\SupplierProductDetailDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */