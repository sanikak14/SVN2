/*     */ package com.metcash.webservices.eai.xml.supplier.pricesoh.validation;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.Marshaller;
/*     */ import org.exolab.castor.xml.Unmarshaller;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ import org.exolab.castor.xml.Validator;
/*     */ import org.xml.sax.ContentHandler;
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
/*     */ public class QDAList
/*     */   implements Serializable
/*     */ {
/*  41 */   private List _QDAList = new ArrayList();
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
/*     */   public void addQDA(QDA vQDA) throws IndexOutOfBoundsException {
/*  59 */     this._QDAList.add(vQDA);
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
/*     */   public void addQDA(int index, QDA vQDA) throws IndexOutOfBoundsException {
/*  74 */     this._QDAList.add(index, vQDA);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateQDA() {
/*  85 */     return Collections.enumeration(this._QDAList);
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
/*     */ 
/*     */   
/*     */   public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDA getQDA(int index) throws IndexOutOfBoundsException {
/* 102 */     if (index < 0 || index >= this._QDAList.size()) {
/* 103 */       throw new IndexOutOfBoundsException("getQDA: Index value '" + index + "' not in range [0.." + (this._QDAList.size() - 1) + "]");
/*     */     }
/*     */     
/* 106 */     return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDA) this._QDAList.get(index);
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
/*     */   public QDA[] getQDA() {
/* 120 */     QDA[] array = new QDA[0];
/* 121 */     return (QDA[])this._QDAList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getQDACount() {
/* 131 */     return this._QDAList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/*     */     try {
/* 142 */       validate();
/* 143 */     } catch (ValidationException vex) {
/* 144 */       return false;
/*     */     } 
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateQDA() {
/* 157 */     return this._QDAList.iterator();
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
/*     */   public void marshal(Writer out) throws MarshalException, ValidationException {
/* 172 */     Marshaller.marshal(this, out);
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
/*     */ 
/*     */   
/*     */   public void marshal(ContentHandler handler) throws IOException, MarshalException, ValidationException {
/* 189 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllQDA() {
/* 196 */     this._QDAList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeQDA(QDA vQDA) {
/* 207 */     boolean removed = this._QDAList.remove(vQDA);
/* 208 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QDA removeQDAAt(int index) {
/* 219 */     Object obj = this._QDAList.remove(index);
/* 220 */     return (QDA)obj;
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
/*     */   
/*     */   public void setQDA(int index, QDA vQDA) throws IndexOutOfBoundsException {
/* 236 */     if (index < 0 || index >= this._QDAList.size()) {
/* 237 */       throw new IndexOutOfBoundsException("setQDA: Index value '" + index + "' not in range [0.." + (this._QDAList.size() - 1) + "]");
/*     */     }
/*     */     
/* 240 */     this._QDAList.set(index, vQDA);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQDA(QDA[] vQDAArray) {
/* 251 */     this._QDAList.clear();
/*     */     
/* 253 */     for (int i = 0; i < vQDAArray.length; i++) {
/* 254 */       this._QDAList.add(vQDAArray[i]);
/*     */     }
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
/*     */ 
/*     */   
/*     */   public static QDAList unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 272 */     return (QDAList)Unmarshaller.unmarshal(QDAList.class, reader);
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
/*     */   public void validate() throws ValidationException {
/* 284 */     Validator validator = new Validator();
/* 285 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\QDAList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */