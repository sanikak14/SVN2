/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.types.CustomerStateCodeType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderHeaderResponse
/*     */   implements Serializable
/*     */ {
/*     */   private int _webOrderId;
/*     */   private boolean _has_webOrderId;
/*     */   private String _externalOrderId;
/*     */   private String _customerId;
/*     */   private CustomerStateCodeType _customerStateCode;
/*     */   private String _webCreatedTime;
/*     */   private int _itemsAccepted;
/*     */   private boolean _has_itemsAccepted;
/*     */   private int _itemsRejected;
/*     */   private boolean _has_itemsRejected;
/*  91 */   private List _orderHeaderMessagesList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrderHeaderMessages(OrderHeaderMessages vOrderHeaderMessages) throws IndexOutOfBoundsException {
/* 109 */     this._orderHeaderMessagesList.add(vOrderHeaderMessages);
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
/*     */   public void addOrderHeaderMessages(int index, OrderHeaderMessages vOrderHeaderMessages) throws IndexOutOfBoundsException {
/* 124 */     this._orderHeaderMessagesList.add(index, vOrderHeaderMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteItemsAccepted() {
/* 131 */     this._has_itemsAccepted = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteItemsRejected() {
/* 138 */     this._has_itemsRejected = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteWebOrderId() {
/* 145 */     this._has_webOrderId = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateOrderHeaderMessages() {
/* 156 */     return Collections.enumeration(this._orderHeaderMessagesList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomerId() {
/* 166 */     return this._customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CustomerStateCodeType getCustomerStateCode() {
/* 176 */     return this._customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExternalOrderId() {
/* 186 */     return this._externalOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getItemsAccepted() {
/* 196 */     return this._itemsAccepted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getItemsRejected() {
/* 206 */     return this._itemsRejected;
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
/*     */   public com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages getOrderHeaderMessages(int index) throws IndexOutOfBoundsException {
/* 223 */     if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
/* 224 */       throw new IndexOutOfBoundsException("getOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
/*     */     }
/*     */     
/* 227 */     return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages) this._orderHeaderMessagesList.get(index);
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
/*     */   public OrderHeaderMessages[] getOrderHeaderMessages() {
/* 242 */     OrderHeaderMessages[] array = new OrderHeaderMessages[0];
/* 243 */     return (OrderHeaderMessages[])this._orderHeaderMessagesList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderHeaderMessagesCount() {
/* 253 */     return this._orderHeaderMessagesList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWebCreatedTime() {
/* 263 */     return this._webCreatedTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWebOrderId() {
/* 273 */     return this._webOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasItemsAccepted() {
/* 283 */     return this._has_itemsAccepted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasItemsRejected() {
/* 293 */     return this._has_itemsRejected;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasWebOrderId() {
/* 303 */     return this._has_webOrderId;
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
/* 314 */       validate();
/* 315 */     } catch (ValidationException vex) {
/* 316 */       return false;
/*     */     } 
/* 318 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateOrderHeaderMessages() {
/* 329 */     return this._orderHeaderMessagesList.iterator();
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
/* 344 */     Marshaller.marshal(this, out);
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
/* 361 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllOrderHeaderMessages() {
/* 368 */     this._orderHeaderMessagesList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeOrderHeaderMessages(OrderHeaderMessages vOrderHeaderMessages) {
/* 379 */     boolean removed = this._orderHeaderMessagesList.remove(vOrderHeaderMessages);
/* 380 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderHeaderMessages removeOrderHeaderMessagesAt(int index) {
/* 391 */     Object obj = this._orderHeaderMessagesList.remove(index);
/* 392 */     return (OrderHeaderMessages)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerId(String customerId) {
/* 402 */     this._customerId = customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerStateCode(CustomerStateCodeType customerStateCode) {
/* 413 */     this._customerStateCode = customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExternalOrderId(String externalOrderId) {
/* 423 */     this._externalOrderId = externalOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemsAccepted(int itemsAccepted) {
/* 433 */     this._itemsAccepted = itemsAccepted;
/* 434 */     this._has_itemsAccepted = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemsRejected(int itemsRejected) {
/* 444 */     this._itemsRejected = itemsRejected;
/* 445 */     this._has_itemsRejected = true;
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
/*     */   public void setOrderHeaderMessages(int index, OrderHeaderMessages vOrderHeaderMessages) throws IndexOutOfBoundsException {
/* 461 */     if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
/* 462 */       throw new IndexOutOfBoundsException("setOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
/*     */     }
/*     */     
/* 465 */     this._orderHeaderMessagesList.set(index, vOrderHeaderMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHeaderMessages(OrderHeaderMessages[] vOrderHeaderMessagesArray) {
/* 476 */     this._orderHeaderMessagesList.clear();
/*     */     
/* 478 */     for (int i = 0; i < vOrderHeaderMessagesArray.length; i++) {
/* 479 */       this._orderHeaderMessagesList.add(vOrderHeaderMessagesArray[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWebCreatedTime(String webCreatedTime) {
/* 490 */     this._webCreatedTime = webCreatedTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWebOrderId(int webOrderId) {
/* 500 */     this._webOrderId = webOrderId;
/* 501 */     this._has_webOrderId = true;
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
/*     */   public static OrderHeaderResponse unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 518 */     return (OrderHeaderResponse)Unmarshaller.unmarshal(OrderHeaderResponse.class, reader);
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
/* 530 */     Validator validator = new Validator();
/* 531 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\OrderHeaderResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */