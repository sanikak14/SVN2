/*     */ package com.metcash.webservices.eai.xml.supplier.order.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.LineItem;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LineItemDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private XMLFieldDescriptor _identity;
/*  60 */   private String _xmlName = "LineItem";
/*     */   public LineItemDescriptor() {
/*  62 */     XMLFieldDescriptorImpl desc = null;
/*  63 */     FieldHandler handler = null;
/*  64 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     desc = new XMLFieldDescriptorImpl(int.class, "_lineId", "LineId", NodeType.Element);
/*  71 */     XMLFieldHandler xMLFieldHandler5 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  75 */           LineItem target = (LineItem)object;
/*  76 */           if (!target.hasLineId()) return null; 
/*  77 */           return new Integer(target.getLineId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  83 */             LineItem target = (LineItem)object;
/*     */             
/*  85 */             if (value == null)
/*     */               return; 
/*  87 */             target.setLineId(((Integer)value).intValue());
/*  88 */           } catch (Exception ex) {
/*  89 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  93 */           return null;
/*     */         }
/*     */       };
/*  96 */     desc.setSchemaType("int");
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler5);
/*  98 */     desc.setRequired(true);
/*  99 */     desc.setMultivalued(false);
/* 100 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 101 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 104 */     fieldValidator = new FieldValidator();
/* 105 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 108 */     IntValidator intValidator1 = new IntValidator();
/* 109 */     fieldValidator.setValidator((TypeValidator)intValidator1);
/* 110 */     intValidator1.setMinInclusive(-2147483648);
/* 111 */     intValidator1.setMaxInclusive(9999999);
/*     */     
/* 113 */     desc.setValidator(fieldValidator);
/*     */     
/* 115 */     desc = new XMLFieldDescriptorImpl(OrderTypeType.class, "_orderType", "OrderType", NodeType.Element);
/* 116 */     xMLFieldHandler5 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 120 */           LineItem target = (LineItem)object;
/* 121 */           return target.getOrderType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 127 */             LineItem target = (LineItem)object;
/* 128 */             target.setOrderType((OrderTypeType)value);
/* 129 */           } catch (Exception ex) {
/* 130 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 134 */           return null;
/*     */         }
/*     */       };
/* 137 */     EnumFieldHandler enumFieldHandler5 = new EnumFieldHandler(OrderTypeType.class, (FieldHandler)xMLFieldHandler5);
/* 138 */     desc.setImmutable(true);
/* 139 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType");
/* 140 */     desc.setHandler((FieldHandler)enumFieldHandler5);
/* 141 */     desc.setRequired(true);
/* 142 */     desc.setMultivalued(false);
/* 143 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 144 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 147 */     fieldValidator = new FieldValidator();
/* 148 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 151 */     desc.setValidator(fieldValidator);
/*     */     
/* 153 */     desc = new XMLFieldDescriptorImpl(BackOrderType.class, "_backOrder", "BackOrder", NodeType.Element);
/* 154 */     XMLFieldHandler xMLFieldHandler4 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 158 */           LineItem target = (LineItem)object;
/* 159 */           return target.getBackOrder();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 165 */             LineItem target = (LineItem)object;
/* 166 */             target.setBackOrder((BackOrderType)value);
/* 167 */           } catch (Exception ex) {
/* 168 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 172 */           return null;
/*     */         }
/*     */       };
/* 175 */     EnumFieldHandler enumFieldHandler4 = new EnumFieldHandler(BackOrderType.class, (FieldHandler)xMLFieldHandler4);
/* 176 */     desc.setImmutable(true);
/* 177 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType");
/* 178 */     desc.setHandler((FieldHandler)enumFieldHandler4);
/* 179 */     desc.setRequired(true);
/* 180 */     desc.setMultivalued(false);
/* 181 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 182 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 185 */     fieldValidator = new FieldValidator();
/* 186 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 189 */     desc.setValidator(fieldValidator);
/*     */     
/* 191 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Element);
/* 192 */     desc.setImmutable(true);
/* 193 */     XMLFieldHandler xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 197 */           LineItem target = (LineItem)object;
/* 198 */           return target.getProductCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 204 */             LineItem target = (LineItem)object;
/* 205 */             target.setProductCode((String)value);
/* 206 */           } catch (Exception ex) {
/* 207 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 211 */           return null;
/*     */         }
/*     */       };
/* 214 */     desc.setSchemaType("string");
/* 215 */     desc.setHandler((FieldHandler)xMLFieldHandler3);
/* 216 */     desc.setRequired(true);
/* 217 */     desc.setMultivalued(false);
/* 218 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 219 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 222 */     fieldValidator = new FieldValidator();
/* 223 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 226 */     StringValidator stringValidator = new StringValidator();
/* 227 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 228 */     stringValidator.setWhiteSpace("preserve");
/* 229 */     stringValidator.setMaxLength(14);
/*     */     
/* 231 */     desc.setValidator(fieldValidator);
/*     */     
/* 233 */     desc = new XMLFieldDescriptorImpl(ProductCodeTypeType.class, "_productCodeType", "ProductCodeType", NodeType.Element);
/* 234 */     xMLFieldHandler3 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 238 */           LineItem target = (LineItem)object;
/* 239 */           return target.getProductCodeType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 245 */             LineItem target = (LineItem)object;
/* 246 */             target.setProductCodeType((ProductCodeTypeType)value);
/* 247 */           } catch (Exception ex) {
/* 248 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 252 */           return null;
/*     */         }
/*     */       };
/* 255 */     EnumFieldHandler enumFieldHandler3 = new EnumFieldHandler(ProductCodeTypeType.class, (FieldHandler)xMLFieldHandler3);
/* 256 */     desc.setImmutable(true);
/* 257 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType");
/* 258 */     desc.setHandler((FieldHandler)enumFieldHandler3);
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
/* 271 */     desc = new XMLFieldDescriptorImpl(int.class, "_orderQuantity", "OrderQuantity", NodeType.Element);
/* 272 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 276 */           LineItem target = (LineItem)object;
/* 277 */           if (!target.hasOrderQuantity()) return null; 
/* 278 */           return new Integer(target.getOrderQuantity());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 284 */             LineItem target = (LineItem)object;
/*     */             
/* 286 */             if (value == null)
/*     */               return; 
/* 288 */             target.setOrderQuantity(((Integer)value).intValue());
/* 289 */           } catch (Exception ex) {
/* 290 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 294 */           return null;
/*     */         }
/*     */       };
/* 297 */     desc.setSchemaType("int");
/* 298 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 299 */     desc.setRequired(true);
/* 300 */     desc.setMultivalued(false);
/* 301 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 302 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 305 */     fieldValidator = new FieldValidator();
/* 306 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 309 */     IntValidator typeValidator = new IntValidator();
/* 310 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 311 */     typeValidator.setMinInclusive(-2147483648);
/* 312 */     typeValidator.setMaxInclusive(99999);
/*     */     
/* 314 */     desc.setValidator(fieldValidator);
/*     */     
/* 316 */     desc = new XMLFieldDescriptorImpl(int.class, "_dealAmount", "DealAmount", NodeType.Element);
/* 317 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 321 */           LineItem target = (LineItem)object;
/* 322 */           if (!target.hasDealAmount()) return null; 
/* 323 */           return new Integer(target.getDealAmount());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 329 */             LineItem target = (LineItem)object;
/*     */             
/* 331 */             if (value == null) {
/* 332 */               target.deleteDealAmount();
/*     */               return;
/*     */             } 
/* 335 */             target.setDealAmount(((Integer)value).intValue());
/* 336 */           } catch (Exception ex) {
/* 337 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 341 */           return null;
/*     */         }
/*     */       };
/* 344 */     desc.setSchemaType("int");
/* 345 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 346 */     desc.setMultivalued(false);
/* 347 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 348 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 351 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 354 */     typeValidator = new IntValidator();
/* 355 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 356 */     typeValidator.setMinInclusive(-2147483648);
/* 357 */     typeValidator.setMaxInclusive(99999);
/*     */     
/* 359 */     desc.setValidator(fieldValidator);
/*     */     
/* 361 */     desc = new XMLFieldDescriptorImpl(ApplyBonusType.class, "_applyBonus", "ApplyBonus", NodeType.Element);
/* 362 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 366 */           LineItem target = (LineItem)object;
/* 367 */           return target.getApplyBonus();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 373 */             LineItem target = (LineItem)object;
/* 374 */             target.setApplyBonus((ApplyBonusType)value);
/* 375 */           } catch (Exception ex) {
/* 376 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 380 */           return null;
/*     */         }
/*     */       };
/* 383 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(ApplyBonusType.class, (FieldHandler)xMLFieldHandler2);
/* 384 */     desc.setImmutable(true);
/* 385 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType");
/* 386 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 387 */     desc.setMultivalued(false);
/* 388 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 389 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 392 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 395 */     desc.setValidator(fieldValidator);
/*     */     
/* 397 */     desc = new XMLFieldDescriptorImpl(ApplyQdaType.class, "_applyQda", "ApplyQda", NodeType.Element);
/* 398 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 402 */           LineItem target = (LineItem)object;
/* 403 */           return target.getApplyQda();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 409 */             LineItem target = (LineItem)object;
/* 410 */             target.setApplyQda((ApplyQdaType)value);
/* 411 */           } catch (Exception ex) {
/* 412 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 416 */           return null;
/*     */         }
/*     */       };
/* 419 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(ApplyQdaType.class, (FieldHandler)xMLFieldHandler1);
/* 420 */     desc.setImmutable(true);
/* 421 */     desc.setSchemaType("com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType");
/* 422 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 423 */     desc.setMultivalued(false);
/* 424 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 425 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 428 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 431 */     desc.setValidator(fieldValidator);
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
/* 446 */     return null;
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
/* 457 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 467 */     return LineItem.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 477 */     return this._nsPrefix;
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
/* 488 */     return this._nsURI;
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
/* 499 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 509 */     return this._xmlName;
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
/* 521 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\descriptors\LineItemDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */