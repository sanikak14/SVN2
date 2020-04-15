/*     */ package com.metcash.webservices.eai.xml.retailer.order.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.order.LineItem;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.types.BackOrderType;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.types.ProductCodeTypeType;
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
/*  71 */     XMLFieldHandler xMLFieldHandler2 = new XMLFieldHandler()
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
/*  97 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
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
/* 115 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Element);
/* 116 */     desc.setImmutable(true);
/* 117 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 121 */           LineItem target = (LineItem)object;
/* 122 */           return target.getProductCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 128 */             LineItem target = (LineItem)object;
/* 129 */             target.setProductCode((String)value);
/* 130 */           } catch (Exception ex) {
/* 131 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 135 */           return null;
/*     */         }
/*     */       };
/* 138 */     desc.setSchemaType("string");
/* 139 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 140 */     desc.setRequired(true);
/* 141 */     desc.setMultivalued(false);
/* 142 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 143 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 146 */     fieldValidator = new FieldValidator();
/* 147 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 150 */     StringValidator stringValidator = new StringValidator();
/* 151 */     fieldValidator.setValidator((TypeValidator)stringValidator);
/* 152 */     stringValidator.setWhiteSpace("preserve");
/* 153 */     stringValidator.setMaxLength(14);
/*     */     
/* 155 */     desc.setValidator(fieldValidator);
/*     */     
/* 157 */     desc = new XMLFieldDescriptorImpl(int.class, "_orderQuantity", "OrderQuantity", NodeType.Element);
/* 158 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 162 */           LineItem target = (LineItem)object;
/* 163 */           if (!target.hasOrderQuantity()) return null; 
/* 164 */           return new Integer(target.getOrderQuantity());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 170 */             LineItem target = (LineItem)object;
/*     */             
/* 172 */             if (value == null)
/*     */               return; 
/* 174 */             target.setOrderQuantity(((Integer)value).intValue());
/* 175 */           } catch (Exception ex) {
/* 176 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 180 */           return null;
/*     */         }
/*     */       };
/* 183 */     desc.setSchemaType("int");
/* 184 */     desc.setHandler((FieldHandler)xMLFieldHandler2);
/* 185 */     desc.setRequired(true);
/* 186 */     desc.setMultivalued(false);
/* 187 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 188 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 191 */     fieldValidator = new FieldValidator();
/* 192 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 195 */     IntValidator typeValidator = new IntValidator();
/* 196 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 197 */     typeValidator.setMinInclusive(-2147483648);
/* 198 */     typeValidator.setMaxInclusive(99999);
/*     */     
/* 200 */     desc.setValidator(fieldValidator);
/*     */     
/* 202 */     desc = new XMLFieldDescriptorImpl(BackOrderType.class, "_backOrder", "BackOrder", NodeType.Element);
/* 203 */     xMLFieldHandler2 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 207 */           LineItem target = (LineItem)object;
/* 208 */           return target.getBackOrder();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 214 */             LineItem target = (LineItem)object;
/* 215 */             target.setBackOrder((BackOrderType)value);
/* 216 */           } catch (Exception ex) {
/* 217 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 221 */           return null;
/*     */         }
/*     */       };
/* 224 */     EnumFieldHandler enumFieldHandler2 = new EnumFieldHandler(BackOrderType.class, (FieldHandler)xMLFieldHandler2);
/* 225 */     desc.setImmutable(true);
/* 226 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.types.BackOrderType");
/* 227 */     desc.setHandler((FieldHandler)enumFieldHandler2);
/* 228 */     desc.setRequired(true);
/* 229 */     desc.setMultivalued(false);
/* 230 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 231 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 234 */     fieldValidator = new FieldValidator();
/* 235 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 238 */     desc.setValidator(fieldValidator);
/*     */     
/* 240 */     desc = new XMLFieldDescriptorImpl(ProductCodeTypeType.class, "_productCodeType", "ProductCodeType", NodeType.Element);
/* 241 */     XMLFieldHandler xMLFieldHandler1 = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 245 */           LineItem target = (LineItem)object;
/* 246 */           return target.getProductCodeType();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 252 */             LineItem target = (LineItem)object;
/* 253 */             target.setProductCodeType((ProductCodeTypeType)value);
/* 254 */           } catch (Exception ex) {
/* 255 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 259 */           return null;
/*     */         }
/*     */       };
/* 262 */     EnumFieldHandler enumFieldHandler1 = new EnumFieldHandler(ProductCodeTypeType.class, (FieldHandler)xMLFieldHandler1);
/* 263 */     desc.setImmutable(true);
/* 264 */     desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.order.types.ProductCodeTypeType");
/* 265 */     desc.setHandler((FieldHandler)enumFieldHandler1);
/* 266 */     desc.setRequired(true);
/* 267 */     desc.setMultivalued(false);
/* 268 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 269 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 272 */     fieldValidator = new FieldValidator();
/* 273 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 276 */     desc.setValidator(fieldValidator);
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
/* 291 */     return null;
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
/* 302 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 312 */     return LineItem.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 322 */     return this._nsPrefix;
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
/* 333 */     return this._nsURI;
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
/* 344 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 354 */     return this._xmlName;
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
/* 366 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\descriptors\LineItemDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */