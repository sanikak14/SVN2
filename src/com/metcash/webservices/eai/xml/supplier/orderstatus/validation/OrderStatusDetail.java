/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.validation;
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
/*     */ public class OrderStatusDetail
/*     */   implements Serializable
/*     */ {
/*     */   private OrderHeaderStatus _orderHeaderStatus;
/*  46 */   private List _orderLineStatusList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrderLineStatus(OrderLineStatus vOrderLineStatus) throws IndexOutOfBoundsException {
/*  64 */     this._orderLineStatusList.add(vOrderLineStatus);
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
/*     */   public void addOrderLineStatus(int index, OrderLineStatus vOrderLineStatus) throws IndexOutOfBoundsException {
/*  79 */     this._orderLineStatusList.add(index, vOrderLineStatus);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrderLineStatus() {
/*  90 */     return Collections.enumeration(this._orderLineStatusList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderHeaderStatus getOrderHeaderStatus() {
/* 100 */     return this._orderHeaderStatus;
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
/*     */   public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus getOrderLineStatus(int index) throws IndexOutOfBoundsException {
/* 117 */     if (index < 0 || index >= this._orderLineStatusList.size()) {
/* 118 */       throw new IndexOutOfBoundsException("getOrderLineStatus: Index value '" + index + "' not in range [0.." + (this._orderLineStatusList.size() - 1) + "]");
/*     */     }
/*     */     
/* 121 */     return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus) this._orderLineStatusList.get(index);
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
/*     */   public OrderLineStatus[] getOrderLineStatus() {
/* 136 */     OrderLineStatus[] array = new OrderLineStatus[0];
/* 137 */     return (OrderLineStatus[])this._orderLineStatusList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderLineStatusCount() {
/* 147 */     return this._orderLineStatusList.size();
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
/* 158 */       validate();
/* 159 */     } catch (ValidationException vex) {
/* 160 */       return false;
/*     */     } 
/* 162 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateOrderLineStatus() {
/* 173 */     return this._orderLineStatusList.iterator();
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
/* 188 */     Marshaller.marshal(this, out);
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
/* 205 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllOrderLineStatus() {
/* 212 */     this._orderLineStatusList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrderLineStatus(OrderLineStatus vOrderLineStatus) {
/* 223 */     boolean removed = this._orderLineStatusList.remove(vOrderLineStatus);
/* 224 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderLineStatus removeOrderLineStatusAt(int index) {
/* 235 */     Object obj = this._orderLineStatusList.remove(index);
/* 236 */     return (OrderLineStatus)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHeaderStatus(OrderHeaderStatus orderHeaderStatus) {
/* 247 */     this._orderHeaderStatus = orderHeaderStatus;
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
/*     */   public void setOrderLineStatus(int index, OrderLineStatus vOrderLineStatus) throws IndexOutOfBoundsException {
/* 263 */     if (index < 0 || index >= this._orderLineStatusList.size()) {
/* 264 */       throw new IndexOutOfBoundsException("setOrderLineStatus: Index value '" + index + "' not in range [0.." + (this._orderLineStatusList.size() - 1) + "]");
/*     */     }
/*     */     
/* 267 */     this._orderLineStatusList.set(index, vOrderLineStatus);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderLineStatus(OrderLineStatus[] vOrderLineStatusArray) {
/* 278 */     this._orderLineStatusList.clear();
/*     */     
/* 280 */     for (int i = 0; i < vOrderLineStatusArray.length; i++) {
/* 281 */       this._orderLineStatusList.add(vOrderLineStatusArray[i]);
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
/*     */   public static OrderStatusDetail unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 299 */     return (OrderStatusDetail)Unmarshaller.unmarshal(OrderStatusDetail.class, reader);
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
/* 311 */     Validator validator = new Validator();
/* 312 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\OrderStatusDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */