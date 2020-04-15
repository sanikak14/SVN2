/*     */ package com.metcash.webservices.eai.xml.globaltypes.descriptors;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.BranchType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BranchTypeDescriptor
/*     */   extends XMLClassDescriptorImpl
/*     */ {
/*  60 */   private String _nsURI = "metcash/globalTypes";
/*  61 */   private String _xmlName = "BranchType";
/*     */   public BranchTypeDescriptor() {
/*  63 */     XMLFieldDescriptorImpl desc = null;
/*  64 */     FieldHandler handler = null;
/*  65 */     FieldValidator fieldValidator = null;
/*     */ 
/*     */ 
/*     */     
/*  69 */     desc = new XMLFieldDescriptorImpl(String.class, "_id", "id", NodeType.Attribute);
/*  70 */     desc.setImmutable(true);
/*  71 */     XMLFieldHandler xMLFieldHandler = new XMLFieldHandler()
/*     */       {
/*     */         public Object getValue(Object object) throws IllegalStateException
/*     */         {
/*  75 */           BranchType target = (BranchType)object;
/*  76 */           return target.getId();
/*     */         }
/*     */ 
/*     */         
/*     */         public void setValue(Object object, Object value) throws IllegalStateException, IllegalArgumentException {
/*     */           try {
/*  82 */             BranchType target = (BranchType)object;
/*  83 */             target.setId((String)value);
/*  84 */           } catch (Exception ex) {
/*  85 */             throw new IllegalStateException(ex.toString());
/*     */           } 
/*     */         }
/*     */         public Object newInstance(Object parent) {
/*  89 */           return null;
/*     */         }
/*     */       };
/*  92 */     desc.setSchemaType("string");
/*  93 */     desc.setHandler((FieldHandler)xMLFieldHandler);
/*  94 */     desc.setRequired(true);
/*  95 */     desc.setMultivalued(false);
/*  96 */     addFieldDescriptor((XMLFieldDescriptor)desc);
/*     */ 
/*     */     
/*  99 */     fieldValidator = new FieldValidator();
/* 100 */     fieldValidator.setMinOccurs(1);
/*     */ 
/*     */     
/* 103 */     StringValidator typeValidator = new StringValidator();
/* 104 */     fieldValidator.setValidator((TypeValidator)typeValidator);
/* 105 */     typeValidator.addPattern("\\d+");
/* 106 */     typeValidator.setWhiteSpace("preserve");
/* 107 */     typeValidator.setLength(3);
/*     */     
/* 109 */     desc.setValidator(fieldValidator);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean _elementDefinition = false;
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
/* 126 */     return null;
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
/* 137 */     return (FieldDescriptor)this._identity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class getJavaClass() {
/* 147 */     return BranchType.class;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNameSpacePrefix() {
/* 157 */     return this._nsPrefix;
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
/* 168 */     return this._nsURI;
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
/* 179 */     return (TypeValidator)this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMLName() {
/* 189 */     return this._xmlName;
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
/* 201 */     return this._elementDefinition;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\globaltypes\descriptors\BranchTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */