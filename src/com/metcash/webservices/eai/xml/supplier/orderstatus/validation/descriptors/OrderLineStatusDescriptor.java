/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderLineStatusLineStatusType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderLineStatusDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/orderStatusResponse";
/*  61 */   private String _xmlName = "OrderLineStatus";
/*     */   public OrderLineStatusDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(int.class, "_id", "id", NodeType.Attribute);
/*  70 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  74 */           OrderLineStatus target = (OrderLineStatus)object;
/*  75 */           if (!target.hasId()) return null; 
/*  76 */           return new Integer(target.getId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             OrderLineStatus target = (OrderLineStatus)object;
/*     */             
/*  84 */             if (value == null)
/*     */               return; 
/*  86 */             target.setId(((Integer)value).intValue());
/*  87 */           } catch (Exception ex) {
/*  88 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  92 */           return null;
/*     */         }
/*     */       };
/*  95 */     desc.setSchemaType("int");
/*  96 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
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
/* 109 */     intValidator.setMaxInclusive(9999999);
/*     */     
/* 111 */     desc.setValidator(fieldValidator);
/*     */     
/* 113 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Attribute);
/* 114 */     desc.setImmutable(true);
/* 115 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 119 */           OrderLineStatus target = (OrderLineStatus)object;
/* 120 */           return target.getProductCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 126 */             OrderLineStatus target = (OrderLineStatus)object;
/* 127 */             target.setProductCode((String)value);
/* 128 */           } catch (Exception ex) {
/* 129 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 133 */           return null;
/*     */         }
/*     */       };
/* 136 */     desc.setSchemaType("string");
/* 137 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 138 */     desc.setRequired(true);
/* 139 */     desc.setMultivalued(false);
/* 140 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 143 */     fieldValidator = new FieldValidator();
/* 144 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 147 */     StringValidator typeValidator = new StringValidator();
/* 148 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 149 */     typeValidator.addPattern("\\d+");
/* 150 */     typeValidator.setWhiteSpace("preserve");
/* 151 */     typeValidator.setMaxLength(14);
/* 152 */     typeValidator.setMinLength(1);
/*     */     
/* 154 */     desc.setValidator(fieldValidator);
/*     */     
/* 156 */     desc = new XMLFieldDescriptorImpl(OrderLineStatusLineStatusType.class, "_lineStatus", "LineStatus", NodeType.Attribute);
/* 157 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 161 */           OrderLineStatus target = (OrderLineStatus)object;
/* 162 */           return target.getLineStatus();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 168 */             OrderLineStatus target = (OrderLineStatus)object;
/* 169 */             target.setLineStatus((OrderLineStatusLineStatusType)value);
/* 170 */           } catch (Exception ex) {
/* 171 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 175 */           return null;
/*     */         }
/*     */       };
/* 178 */     EnumFieldHandler enumFieldHandler = new EnumFieldHandler(OrderLineStatusLineStatusType.class, (FieldHandler)xMLFieldHandler2);
/* 179 */     desc.setImmutable(true);
/* 180 */     desc.setSchemaType("OrderLineStatusLineStatusType");
/* 181 */     desc.setHandler((FieldHandler)enumFieldHandler);
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
/* 193 */     desc = new XMLFieldDescriptorImpl(String.class, "_qtyReserved", "QtyReserved", NodeType.Attribute);
/* 194 */     desc.setImmutable(true);
/* 195 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 199 */           OrderLineStatus target = (OrderLineStatus)object;
/* 200 */           return target.getQtyReserved();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 206 */             OrderLineStatus target = (OrderLineStatus)object;
/* 207 */             target.setQtyReserved((String)value);
/* 208 */           } catch (Exception ex) {
/* 209 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 213 */           return null;
/*     */         }
/*     */       };
/* 216 */     desc.setSchemaType("string");
/* 217 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 218 */     desc.setRequired(true);
/* 219 */     desc.setMultivalued(false);
/* 220 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 223 */     fieldValidator = new FieldValidator();
/* 224 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 227 */     typeValidator = new StringValidator();
/* 228 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 229 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 231 */     desc.setValidator(fieldValidator);
/*     */     
/* 233 */     desc = new XMLFieldDescriptorImpl(String.class, "_qtyUnreserved", "QtyUnreserved", NodeType.Attribute);
/* 234 */     desc.setImmutable(true);
/* 235 */     xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 239 */           OrderLineStatus target = (OrderLineStatus)object;
/* 240 */           return target.getQtyUnreserved();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 246 */             OrderLineStatus target = (OrderLineStatus)object;
/* 247 */             target.setQtyUnreserved((String)value);
/* 248 */           } catch (Exception ex) {
/* 249 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 253 */           return null;
/*     */         }
/*     */       };
/* 256 */     desc.setSchemaType("string");
/* 257 */     desc.setHandler((FieldHandler)xMLFieldHandler1);
/* 258 */     desc.setRequired(true);
/* 259 */     desc.setMultivalued(false);
/* 260 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 263 */     fieldValidator = new FieldValidator();
/* 264 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 267 */     typeValidator = new StringValidator();
/* 268 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 269 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 271 */     desc.setValidator(fieldValidator);
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
/* 288 */     return null;
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
/* 299 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 309 */     return OrderLineStatus.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 319 */     return this._nsPrefix;
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
/* 330 */     return this._nsURI;
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
/* 341 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 351 */     return this._xmlName;
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
/* 363 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\descriptors\OrderLineStatusDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */