/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation;
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
/*     */ public class RetailerOrderResponse
/*     */   implements Serializable
/*     */ {
/*  41 */   private List _orderDetailList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrderDetail(OrderDetail vOrderDetail) throws IndexOutOfBoundsException {
/*  59 */     this._orderDetailList.add(vOrderDetail);
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
/*     */   public void addOrderDetail(int index, OrderDetail vOrderDetail) throws IndexOutOfBoundsException {
/*  74 */     this._orderDetailList.add(index, vOrderDetail);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrderDetail() {
/*  85 */     return Collections.enumeration(this._orderDetailList);
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
/*     */   public com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail getOrderDetail(int index) throws IndexOutOfBoundsException {
/* 102 */     if (index < 0 || index >= this._orderDetailList.size()) {
/* 103 */       throw new IndexOutOfBoundsException("getOrderDetail: Index value '" + index + "' not in range [0.." + (this._orderDetailList.size() - 1) + "]");
/*     */     }
/*     */     
/* 106 */     return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail) this._orderDetailList.get(index);
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
/*     */   public OrderDetail[] getOrderDetail() {
/* 120 */     OrderDetail[] array = new OrderDetail[0];
/* 121 */     return (OrderDetail[])this._orderDetailList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderDetailCount() {
/* 131 */     return this._orderDetailList.size();
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
/*     */   public Iterator iterateOrderDetail() {
/* 157 */     return this._orderDetailList.iterator();
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
/*     */   public void removeAllOrderDetail() {
/* 196 */     this._orderDetailList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrderDetail(OrderDetail vOrderDetail) {
/* 207 */     boolean removed = this._orderDetailList.remove(vOrderDetail);
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
/*     */   public OrderDetail removeOrderDetailAt(int index) {
/* 219 */     Object obj = this._orderDetailList.remove(index);
/* 220 */     return (OrderDetail)obj;
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
/*     */   public void setOrderDetail(int index, OrderDetail vOrderDetail) throws IndexOutOfBoundsException {
/* 236 */     if (index < 0 || index >= this._orderDetailList.size()) {
/* 237 */       throw new IndexOutOfBoundsException("setOrderDetail: Index value '" + index + "' not in range [0.." + (this._orderDetailList.size() - 1) + "]");
/*     */     }
/*     */     
/* 240 */     this._orderDetailList.set(index, vOrderDetail);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderDetail(OrderDetail[] vOrderDetailArray) {
/* 251 */     this._orderDetailList.clear();
/*     */     
/* 253 */     for (int i = 0; i < vOrderDetailArray.length; i++) {
/* 254 */       this._orderDetailList.add(vOrderDetailArray[i]);
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
/*     */   public static RetailerOrderResponse unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 272 */     return (RetailerOrderResponse)Unmarshaller.unmarshal(RetailerOrderResponse.class, reader);
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\RetailerOrderResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */