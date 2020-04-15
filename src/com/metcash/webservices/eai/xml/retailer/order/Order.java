/*     */ package com.metcash.webservices.eai.xml.retailer.order;
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
/*     */ public class Order
/*     */   implements Serializable
/*     */ {
/*     */   private OrderHeader _orderHeader;
/*  46 */   private List _lineItemList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addLineItem(LineItem vLineItem) throws IndexOutOfBoundsException {
/*  64 */     this._lineItemList.add(vLineItem);
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
/*     */   public void addLineItem(int index, LineItem vLineItem) throws IndexOutOfBoundsException {
/*  79 */     this._lineItemList.add(index, vLineItem);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateLineItem() {
/*  90 */     return Collections.enumeration(this._lineItemList);
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
/*     */   public  com.metcash.webservices.eai.xml.retailer.order.LineItem getLineItem(int index) throws IndexOutOfBoundsException {
/* 107 */     if (index < 0 || index >= this._lineItemList.size()) {
/* 108 */       throw new IndexOutOfBoundsException("getLineItem: Index value '" + index + "' not in range [0.." + (this._lineItemList.size() - 1) + "]");
/*     */     }
/*     */     
/* 111 */    return (com.metcash.webservices.eai.xml.retailer.order.LineItem) _lineItemList.get(index);
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
/*     */   public LineItem[] getLineItem() {
/* 125 */     LineItem[] array = new LineItem[0];
/* 126 */     return (LineItem[])this._lineItemList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLineItemCount() {
/* 136 */     return this._lineItemList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderHeader getOrderHeader() {
/* 146 */     return this._orderHeader;
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
/*     */   public Iterator iterateLineItem() {
/* 172 */     return this._lineItemList.iterator();
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
/*     */   public void removeAllLineItem() {
/* 211 */     this._lineItemList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeLineItem(LineItem vLineItem) {
/* 222 */     boolean removed = this._lineItemList.remove(vLineItem);
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
/*     */   public LineItem removeLineItemAt(int index) {
/* 234 */     Object obj = this._lineItemList.remove(index);
/* 235 */     return (LineItem)obj;
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
/*     */   public void setLineItem(int index, LineItem vLineItem) throws IndexOutOfBoundsException {
/* 251 */     if (index < 0 || index >= this._lineItemList.size()) {
/* 252 */       throw new IndexOutOfBoundsException("setLineItem: Index value '" + index + "' not in range [0.." + (this._lineItemList.size() - 1) + "]");
/*     */     }
/*     */     
/* 255 */     this._lineItemList.set(index, vLineItem);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLineItem(LineItem[] vLineItemArray) {
/* 266 */     this._lineItemList.clear();
/*     */     
/* 268 */     for (int i = 0; i < vLineItemArray.length; i++) {
/* 269 */       this._lineItemList.add(vLineItemArray[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHeader(OrderHeader orderHeader) {
/* 280 */     this._orderHeader = orderHeader;
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
/*     */   public static Order unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 297 */     return (Order)Unmarshaller.unmarshal(Order.class, reader);
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


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\Order.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */