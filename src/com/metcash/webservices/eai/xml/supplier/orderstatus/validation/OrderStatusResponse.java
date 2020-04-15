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
/*     */ 
/*     */ public class OrderStatusResponse
/*     */   implements Serializable
/*     */ {
/*  46 */   private List _orderResponseList = new ArrayList();
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
/*     */   public void addOrderResponse(OrderResponse vOrderResponse) throws IndexOutOfBoundsException {
/*  64 */     this._orderResponseList.add(vOrderResponse);
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
/*     */   public void addOrderResponse(int index, OrderResponse vOrderResponse) throws IndexOutOfBoundsException {
/*  79 */     this._orderResponseList.add(index, vOrderResponse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrderResponse() {
/*  90 */     return Collections.enumeration(this._orderResponseList);
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
/*     */   public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse getOrderResponse(int index) throws IndexOutOfBoundsException {
/* 117 */     if (index < 0 || index >= this._orderResponseList.size()) {
/* 118 */       throw new IndexOutOfBoundsException("getOrderResponse: Index value '" + index + "' not in range [0.." + (this._orderResponseList.size() - 1) + "]");
/*     */     }
/*     */     
/* 121 */     return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse) this._orderResponseList.get(index);
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
/*     */   public OrderResponse[] getOrderResponse() {
/* 136 */     OrderResponse[] array = new OrderResponse[0];
/* 137 */     return (OrderResponse[])this._orderResponseList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderResponseCount() {
/* 147 */     return this._orderResponseList.size();
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
/*     */   public Iterator iterateOrderResponse() {
/* 173 */     return this._orderResponseList.iterator();
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
/*     */   public void removeAllOrderResponse() {
/* 212 */     this._orderResponseList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrderResponse(OrderResponse vOrderResponse) {
/* 223 */     boolean removed = this._orderResponseList.remove(vOrderResponse);
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
/*     */   public OrderResponse removeOrderResponseAt(int index) {
/* 235 */     Object obj = this._orderResponseList.remove(index);
/* 236 */     return (OrderResponse)obj;
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
/*     */   public void setOrderResponse(int index, OrderResponse vOrderResponse) throws IndexOutOfBoundsException {
/* 262 */     if (index < 0 || index >= this._orderResponseList.size()) {
/* 263 */       throw new IndexOutOfBoundsException("setOrderResponse: Index value '" + index + "' not in range [0.." + (this._orderResponseList.size() - 1) + "]");
/*     */     }
/*     */     
/* 266 */     this._orderResponseList.set(index, vOrderResponse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderResponse(OrderResponse[] vOrderResponseArray) {
/* 277 */     this._orderResponseList.clear();
/*     */     
/* 279 */     for (int i = 0; i < vOrderResponseArray.length; i++) {
/* 280 */       this._orderResponseList.add(vOrderResponseArray[i]);
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
/*     */   public static OrderStatusResponse unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 298 */     return (OrderStatusResponse)Unmarshaller.unmarshal(OrderStatusResponse.class, reader);
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\OrderStatusResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */