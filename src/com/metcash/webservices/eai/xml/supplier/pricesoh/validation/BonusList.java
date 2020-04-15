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
/*     */ public class BonusList
/*     */   implements Serializable
/*     */ {
/*  41 */   private List _bonusList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addBonus(Bonus vBonus) throws IndexOutOfBoundsException {
/*  59 */     this._bonusList.add(vBonus);
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
/*     */   public void addBonus(int index, Bonus vBonus) throws IndexOutOfBoundsException {
/*  74 */     this._bonusList.add(index, vBonus);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateBonus() {
/*  85 */     return Collections.enumeration(this._bonusList);
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
/*     */   public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Bonus getBonus(int index) throws IndexOutOfBoundsException {
/* 102 */     if (index < 0 || index >= this._bonusList.size()) {
/* 103 */       throw new IndexOutOfBoundsException("getBonus: Index value '" + index + "' not in range [0.." + (this._bonusList.size() - 1) + "]");
/*     */     }
/*     */     
/* 106 */     return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Bonus) this._bonusList.get(index);
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
/*     */   public Bonus[] getBonus() {
/* 120 */     Bonus[] array = new Bonus[0];
/* 121 */     return (Bonus[])this._bonusList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBonusCount() {
/* 131 */     return this._bonusList.size();
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
/*     */   public Iterator iterateBonus() {
/* 157 */     return this._bonusList.iterator();
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
/*     */   public void removeAllBonus() {
/* 196 */     this._bonusList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeBonus(Bonus vBonus) {
/* 207 */     boolean removed = this._bonusList.remove(vBonus);
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
/*     */   public Bonus removeBonusAt(int index) {
/* 219 */     Object obj = this._bonusList.remove(index);
/* 220 */     return (Bonus)obj;
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
/*     */   public void setBonus(int index, Bonus vBonus) throws IndexOutOfBoundsException {
/* 236 */     if (index < 0 || index >= this._bonusList.size()) {
/* 237 */       throw new IndexOutOfBoundsException("setBonus: Index value '" + index + "' not in range [0.." + (this._bonusList.size() - 1) + "]");
/*     */     }
/*     */     
/* 240 */     this._bonusList.set(index, vBonus);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBonus(Bonus[] vBonusArray) {
/* 251 */     this._bonusList.clear();
/*     */     
/* 253 */     for (int i = 0; i < vBonusArray.length; i++) {
/* 254 */       this._bonusList.add(vBonusArray[i]);
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
/*     */   public static BonusList unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 272 */     return (BonusList)Unmarshaller.unmarshal(BonusList.class, reader);
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\BonusList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */