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
/*     */ public class ParcelBuyList
/*     */   implements Serializable
/*     */ {
/*  41 */   private List _parcelBuyList = new ArrayList();
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
/*     */   public void addParcelBuy(ParcelBuy vParcelBuy) throws IndexOutOfBoundsException {
/*  59 */     this._parcelBuyList.add(vParcelBuy);
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
/*     */   public void addParcelBuy(int index, ParcelBuy vParcelBuy) throws IndexOutOfBoundsException {
/*  74 */     this._parcelBuyList.add(index, vParcelBuy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateParcelBuy() {
/*  85 */     return Collections.enumeration(this._parcelBuyList);
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
/*     */   public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy getParcelBuy(int index) throws IndexOutOfBoundsException {
/* 102 */     if (index < 0 || index >= this._parcelBuyList.size()) {
/* 103 */       throw new IndexOutOfBoundsException("getParcelBuy: Index value '" + index + "' not in range [0.." + (this._parcelBuyList.size() - 1) + "]");
/*     */     }
/*     */     
/* 106 */     return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy) this._parcelBuyList.get(index);
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
/*     */   public ParcelBuy[] getParcelBuy() {
/* 120 */     ParcelBuy[] array = new ParcelBuy[0];
/* 121 */     return (ParcelBuy[])this._parcelBuyList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParcelBuyCount() {
/* 131 */     return this._parcelBuyList.size();
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
/*     */   public Iterator iterateParcelBuy() {
/* 157 */     return this._parcelBuyList.iterator();
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
/*     */   public void removeAllParcelBuy() {
/* 196 */     this._parcelBuyList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeParcelBuy(ParcelBuy vParcelBuy) {
/* 207 */     boolean removed = this._parcelBuyList.remove(vParcelBuy);
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
/*     */   public ParcelBuy removeParcelBuyAt(int index) {
/* 219 */     Object obj = this._parcelBuyList.remove(index);
/* 220 */     return (ParcelBuy)obj;
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
/*     */   public void setParcelBuy(int index, ParcelBuy vParcelBuy) throws IndexOutOfBoundsException {
/* 236 */     if (index < 0 || index >= this._parcelBuyList.size()) {
/* 237 */       throw new IndexOutOfBoundsException("setParcelBuy: Index value '" + index + "' not in range [0.." + (this._parcelBuyList.size() - 1) + "]");
/*     */     }
/*     */     
/* 240 */     this._parcelBuyList.set(index, vParcelBuy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParcelBuy(ParcelBuy[] vParcelBuyArray) {
/* 251 */     this._parcelBuyList.clear();
/*     */     
/* 253 */     for (int i = 0; i < vParcelBuyArray.length; i++) {
/* 254 */       this._parcelBuyList.add(vParcelBuyArray[i]);
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
/*     */   public static ParcelBuyList unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 272 */     return (ParcelBuyList)Unmarshaller.unmarshal(ParcelBuyList.class, reader);
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\ParcelBuyList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */