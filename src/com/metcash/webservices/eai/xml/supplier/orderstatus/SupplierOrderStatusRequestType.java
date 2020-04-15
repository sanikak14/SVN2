/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderStatusRequestType
/*     */   implements Serializable
/*     */ {
/*     */   private SupplierRep _supplierRep;
/*  46 */   private List _orderList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrder(Order vOrder) throws IndexOutOfBoundsException {
/*  64 */     this._orderList.add(vOrder);
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
/*     */   public void addOrder(int index, Order vOrder) throws IndexOutOfBoundsException {
/*  79 */     this._orderList.add(index, vOrder);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrder() {
/*  90 */     return Collections.enumeration(this._orderList);
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
/*     */   public com.metcash.webservices.eai.xml.supplier.orderstatus.Order getOrder(int index) throws IndexOutOfBoundsException {
/* 107 */     if (index < 0 || index >= this._orderList.size()) {
/* 108 */       throw new IndexOutOfBoundsException("getOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
/*     */     }
/*     */     
/* 111 */     return (com.metcash.webservices.eai.xml.supplier.orderstatus.Order) this._orderList.get(index);
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
/*     */   public Order[] getOrder() {
/* 125 */     Order[] array = new Order[0];
/* 126 */     return (Order[])this._orderList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderCount() {
/* 136 */     return this._orderList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierRep getSupplierRep() {
/* 146 */     return this._supplierRep;
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
/* 157 */       validate();
/* 158 */     } catch (ValidationException vex) {
/* 159 */       return false;
/*     */     } 
/* 161 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateOrder() {
/* 172 */     return this._orderList.iterator();
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
/* 187 */     Marshaller.marshal(this, out);
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
/* 204 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllOrder() {
/* 211 */     this._orderList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrder(Order vOrder) {
/* 222 */     boolean removed = this._orderList.remove(vOrder);
/* 223 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Order removeOrderAt(int index) {
/* 234 */     Object obj = this._orderList.remove(index);
/* 235 */     return (Order)obj;
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
/*     */   public void setOrder(int index, Order vOrder) throws IndexOutOfBoundsException {
/* 251 */     if (index < 0 || index >= this._orderList.size()) {
/* 252 */       throw new IndexOutOfBoundsException("setOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
/*     */     }
/*     */     
/* 255 */     this._orderList.set(index, vOrder);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrder(Order[] vOrderArray) {
/* 266 */     this._orderList.clear();
/*     */     
/* 268 */     for (int i = 0; i < vOrderArray.length; i++) {
/* 269 */       this._orderList.add(vOrderArray[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierRep(SupplierRep supplierRep) {
/* 280 */     this._supplierRep = supplierRep;
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
/*     */   public static SupplierOrderStatusRequestType unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 297 */     return (SupplierOrderStatusRequestType)Unmarshaller.unmarshal(SupplierOrderStatusRequestType.class, reader);
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
/* 309 */     Validator validator = new Validator();
/* 310 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\SupplierOrderStatusRequestType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */