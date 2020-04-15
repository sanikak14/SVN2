/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.LineMessages;
/*     */ import org.exolab.castor.mapping.AccessMode;
/*     */ import org.exolab.castor.mapping.FieldDescriptor;
/*     */ import org.exolab.castor.mapping.FieldHandler;
/*     */ import org.exolab.castor.xml.FieldValidator;
/*     */ import org.exolab.castor.xml.NodeType;
/*     */ import org.exolab.castor.xml.TypeValidator;
/*     */ import org.exolab.castor.xml.XMLFieldDescriptor;
/*     */ import org.exolab.castor.xml.XMLFieldHandler;
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
/*     */ public class LineMessagesDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*     */   private boolean _elementDefinition;
/*     */   private String _nsPrefix;
/*     */   private String _nsURI;
/*     */   private String _xmlName;
/*     */   private XMLFieldDescriptor _identity;
/*     */   
/*     */   public LineMessagesDescriptor() {
/*  60 */     this._xmlName = "LineMessages";
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
/*  73 */     desc = new XMLFieldDescriptorImpl(int.class, "_lineId", "LineId", NodeType.Element);
/*  74 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  78 */           LineMessages target = (LineMessages)object;
/*  79 */           if (!target.hasLineId()) return null; 
/*  80 */           return new Integer(target.getLineId());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  86 */             LineMessages target = (LineMessages)object;
/*     */             
/*  88 */             if (value == null)
/*     */               return; 
/*  90 */             target.setLineId(((Integer)value).intValue());
/*  91 */           } catch (Exception ex) {
/*  92 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  96 */           return null;
/*     */         }
/*     */       };
/*  99 */     desc.setSchemaType("int");
/* 100 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 101 */     desc.setRequired(true);
/* 102 */     desc.setMultivalued(false);
/* 103 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 104 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 107 */     fieldValidator = new FieldValidator();
/* 108 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 111 */     IntValidator intValidator2 = new IntValidator();
/* 112 */     fieldValidator.setValidator((TypeValidator)intValidator2);
/* 113 */     intValidator2.setMinInclusive(-2147483648);
/* 114 */     intValidator2.setMaxInclusive(9999999);
/*     */     
/* 116 */     desc.setValidator(fieldValidator);
/*     */     
/* 118 */     desc = new XMLFieldDescriptorImpl(String.class, "_productCode", "ProductCode", NodeType.Element);
/* 119 */     desc.setImmutable(true);
/* 120 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 124 */           LineMessages target = (LineMessages)object;
/* 125 */           return target.getProductCode();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 131 */             LineMessages target = (LineMessages)object;
/* 132 */             target.setProductCode((String)value);
/* 133 */           } catch (Exception ex) {
/* 134 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 138 */           return null;
/*     */         }
/*     */       };
/* 141 */     desc.setSchemaType("string");
/* 142 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 143 */     desc.setMultivalued(false);
/* 144 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 145 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 148 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 151 */     StringValidator stringValidator1 = new StringValidator();
/* 152 */     fieldValidator.setValidator((TypeValidator)stringValidator1);
/* 153 */     stringValidator1.setWhiteSpace("preserve");
/* 154 */     stringValidator1.setMaxLength(14);
/*     */     
/* 156 */     desc.setValidator(fieldValidator);
/*     */     
/* 158 */     desc = new XMLFieldDescriptorImpl(String.class, "_productDescription", "ProductDescription", NodeType.Element);
/* 159 */     desc.setImmutable(true);
/* 160 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 164 */           LineMessages target = (LineMessages)object;
/* 165 */           return target.getProductDescription();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 171 */             LineMessages target = (LineMessages)object;
/* 172 */             target.setProductDescription((String)value);
/* 173 */           } catch (Exception ex) {
/* 174 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 178 */           return null;
/*     */         }
/*     */       };
/* 181 */     desc.setSchemaType("string");
/* 182 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 183 */     desc.setMultivalued(false);
/* 184 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 185 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 188 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 191 */     stringValidator1 = new StringValidator();
/* 192 */     fieldValidator.setValidator((TypeValidator)stringValidator1);
/* 193 */     stringValidator1.setWhiteSpace("preserve");
/*     */     
/* 195 */     desc.setValidator(fieldValidator);
/*     */     
/* 197 */     desc = new XMLFieldDescriptorImpl(int.class, "_orderQuantity", "OrderQuantity", NodeType.Element);
/* 198 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 202 */           LineMessages target = (LineMessages)object;
/* 203 */           if (!target.hasOrderQuantity()) return null; 
/* 204 */           return new Integer(target.getOrderQuantity());
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 210 */             LineMessages target = (LineMessages)object;
/*     */             
/* 212 */             if (value == null) {
/* 213 */               target.deleteOrderQuantity();
/*     */               return;
/*     */             } 
/* 216 */             target.setOrderQuantity(((Integer)value).intValue());
/* 217 */           } catch (Exception ex) {
/* 218 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 222 */           return null;
/*     */         }
/*     */       };
/* 225 */     desc.setSchemaType("int");
/* 226 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 227 */     desc.setMultivalued(false);
/* 228 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 229 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 232 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 235 */     IntValidator intValidator1 = new IntValidator();
/* 236 */     fieldValidator.setValidator((TypeValidator)intValidator1);
/* 237 */     intValidator1.setMinInclusive(-2147483648);
/* 238 */     intValidator1.setMaxInclusive(99999);
/*     */     
/* 240 */     desc.setValidator(fieldValidator);
/*     */     
/* 242 */     desc = new XMLFieldDescriptorImpl(String.class, "_lineMessageData", "LineMessageData", NodeType.Element);
/* 243 */     desc.setImmutable(true);
/* 244 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 248 */           LineMessages target = (LineMessages)object;
/* 249 */           return target.getLineMessageData();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 255 */             LineMessages target = (LineMessages)object;
/* 256 */             target.setLineMessageData((String)value);
/* 257 */           } catch (Exception ex) {
/* 258 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 262 */           return null;
/*     */         }
/*     */       };
/* 265 */     desc.setSchemaType("string");
/* 266 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 267 */     desc.setMultivalued(false);
/* 268 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 269 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 272 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 275 */     StringValidator typeValidator = new StringValidator();
/* 276 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 277 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 279 */     desc.setValidator(fieldValidator);
/*     */     
/* 281 */     desc = new XMLFieldDescriptorImpl(String.class, "_lineMessageSeverity", "LineMessageSeverity", NodeType.Element);
/* 282 */     desc.setImmutable(true);
/* 283 */     xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/* 287 */           LineMessages target = (LineMessages)object;
/* 288 */           return target.getLineMessageSeverity();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/* 294 */             LineMessages target = (LineMessages)object;
/* 295 */             target.setLineMessageSeverity((String)value);
/* 296 */           } catch (Exception ex) {
/* 297 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/* 301 */           return null;
/*     */         }
/*     */       };
/* 304 */     desc.setSchemaType("string");
/* 305 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/* 306 */     desc.setMultivalued(false);
/* 307 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/* 308 */     addSequenceElement((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/* 311 */     fieldValidator = new FieldValidator();
/*     */ 
/*     */     
/* 314 */     typeValidator = new StringValidator();
/* 315 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 316 */     typeValidator.setWhiteSpace("preserve");
/*     */     
/* 318 */     desc.setValidator(fieldValidator);
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
/* 333 */     return null;
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
/* 344 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 354 */     return LineMessages.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 364 */     return this._nsPrefix;
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
/* 375 */     return this._nsURI;
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
/* 386 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 396 */     return this._xmlName;
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
/* 408 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\descriptors\LineMessagesDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */