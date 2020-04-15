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
/*     */ public class Msg
/*     */   implements Serializable
/*     */ {
/*  42 */   private List _orderList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  60 */     this._orderList.add(vOrder);
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
/*  75 */     this._orderList.add(index, vOrder);
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
/*  86 */     return Collections.enumeration(this._orderList);
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
/*     */   public com.metcash.webservices.eai.xml.retailer.order.Order getOrder(int index) throws IndexOutOfBoundsException {
/* 103 */     if (index < 0 || index >= this._orderList.size()) {
/* 104 */       throw new IndexOutOfBoundsException("getOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
/*     */     }
/*     */     
/* 107 */    return (com.metcash.webservices.eai.xml.retailer.order.Order) _orderList.get(index);
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
/* 121 */     Order[] array = new Order[0];
/* 122 */     return (Order[])this._orderList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderCount() {
/* 132 */     return this._orderList.size();
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
/* 143 */       validate();
/* 144 */     } catch (ValidationException vex) {
/* 145 */       return false;
/*     */     } 
/* 147 */     return true;
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
/* 158 */     return this._orderList.iterator();
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
/* 173 */     Marshaller.marshal(this, out);
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
/* 190 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllOrder() {
/* 197 */     this._orderList.clear();
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
/* 208 */     boolean removed = this._orderList.remove(vOrder);
/* 209 */     return removed;
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
/* 220 */     Object obj = this._orderList.remove(index);
/* 221 */     return (Order)obj;
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
/* 237 */     if (index < 0 || index >= this._orderList.size()) {
/* 238 */       throw new IndexOutOfBoundsException("setOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
/*     */     }
/*     */     
/* 241 */     this._orderList.set(index, vOrder);
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
/* 252 */     this._orderList.clear();
/*     */     
/* 254 */     for (int i = 0; i < vOrderArray.length; i++) {
/* 255 */       this._orderList.add(vOrderArray[i]);
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
/*     */   public static Msg unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 273 */     return (Msg)Unmarshaller.unmarshal(Msg.class, reader);
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
/* 285 */     Validator validator = new Validator();
/* 286 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\Msg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */