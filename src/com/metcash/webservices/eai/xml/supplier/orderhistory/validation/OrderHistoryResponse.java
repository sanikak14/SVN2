/*     */ package com.metcash.webservices.eai.xml.supplier.orderhistory.validation;
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
/*     */ 
/*     */ public class OrderHistoryResponse
/*     */   implements Serializable
/*     */ {
/*  46 */   private List _orderHistoryList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Message _message;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrderHistory(OrderHistory vOrderHistory) throws IndexOutOfBoundsException {
/*  64 */     this._orderHistoryList.add(vOrderHistory);
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
/*     */   public void addOrderHistory(int index, OrderHistory vOrderHistory) throws IndexOutOfBoundsException {
/*  79 */     this._orderHistoryList.add(index, vOrderHistory);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrderHistory() {
/*  90 */     return Collections.enumeration(this._orderHistoryList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Message getMessage() {
/* 100 */     return this._message;
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
/*     */   public com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory getOrderHistory(int index) throws IndexOutOfBoundsException {
/* 117 */     if (index < 0 || index >= this._orderHistoryList.size()) {
/* 118 */       throw new IndexOutOfBoundsException("getOrderHistory: Index value '" + index + "' not in range [0.." + (this._orderHistoryList.size() - 1) + "]");
/*     */     }
/*     */     
/* 121 */     return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory) this._orderHistoryList.get(index);
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
/*     */   public OrderHistory[] getOrderHistory() {
/* 136 */     OrderHistory[] array = new OrderHistory[0];
/* 137 */     return (OrderHistory[])this._orderHistoryList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderHistoryCount() {
/* 147 */     return this._orderHistoryList.size();
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
/*     */   public Iterator iterateOrderHistory() {
/* 173 */     return this._orderHistoryList.iterator();
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
/*     */   public void removeAllOrderHistory() {
/* 212 */     this._orderHistoryList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrderHistory(OrderHistory vOrderHistory) {
/* 223 */     boolean removed = this._orderHistoryList.remove(vOrderHistory);
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
/*     */   public OrderHistory removeOrderHistoryAt(int index) {
/* 235 */     Object obj = this._orderHistoryList.remove(index);
/* 236 */     return (OrderHistory)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMessage(Message message) {
/* 246 */     this._message = message;
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
/*     */   public void setOrderHistory(int index, OrderHistory vOrderHistory) throws IndexOutOfBoundsException {
/* 262 */     if (index < 0 || index >= this._orderHistoryList.size()) {
/* 263 */       throw new IndexOutOfBoundsException("setOrderHistory: Index value '" + index + "' not in range [0.." + (this._orderHistoryList.size() - 1) + "]");
/*     */     }
/*     */     
/* 266 */     this._orderHistoryList.set(index, vOrderHistory);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHistory(OrderHistory[] vOrderHistoryArray) {
/* 277 */     this._orderHistoryList.clear();
/*     */     
/* 279 */     for (int i = 0; i < vOrderHistoryArray.length; i++) {
/* 280 */       this._orderHistoryList.add(vOrderHistoryArray[i]);
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
/*     */   public static OrderHistoryResponse unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 298 */     return (OrderHistoryResponse)Unmarshaller.unmarshal(OrderHistoryResponse.class, reader);
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
/* 310 */     Validator validator = new Validator();
/* 311 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderhistory\validation\OrderHistoryResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */