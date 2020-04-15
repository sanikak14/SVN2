/*     */ package com.metcash.webservices.eai.xml.supplier.order.validation;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private String _vendorOrderId;
/*     */   private String _supplierRepCode;
/*     */   private SupplierRepStateCodeType _supplierRepStateCode;
/*     */   private String _supplierReference;
/*     */   private TurnInOrderTypeType _turnInOrderType;
/*     */   private String _customerId;
/*     */   private CustomerStateCodeType _customerStateCode;
/*     */   private String _webCreatedTime;
/*     */   private int _itemsAccepted;
/*     */   private boolean _has_itemsAccepted;
/*     */   private int _itemsRejected;
/*     */   private boolean _has_itemsRejected;
/* 111 */   private List _orderHeaderMessagesList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 129 */     this._orderHeaderMessagesList.add(vOrderHeaderMessages);
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
/* 144 */     this._orderHeaderMessagesList.add(index, vOrderHeaderMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteItemsAccepted() {
/* 151 */     this._has_itemsAccepted = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteItemsRejected() {
/* 158 */     this._has_itemsRejected = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteWebOrderId() {
/* 165 */     this._has_webOrderId = false;
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
/* 176 */     return Collections.enumeration(this._orderHeaderMessagesList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomerId() {
/* 186 */     return this._customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CustomerStateCodeType getCustomerStateCode() {
/* 196 */     return this._customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getItemsAccepted() {
/* 206 */     return this._itemsAccepted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getItemsRejected() {
/* 216 */     return this._itemsRejected;
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
/*     */   public com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages getOrderHeaderMessages(int index) throws IndexOutOfBoundsException {
/* 233 */     if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
/* 234 */       throw new IndexOutOfBoundsException("getOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
/*     */     }
/*     */     
/* 237 */     return (com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages) this._orderHeaderMessagesList.get(index);
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
/* 252 */     OrderHeaderMessages[] array = new OrderHeaderMessages[0];
/* 253 */     return (OrderHeaderMessages[])this._orderHeaderMessagesList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderHeaderMessagesCount() {
/* 263 */     return this._orderHeaderMessagesList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierReference() {
/* 273 */     return this._supplierReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierRepCode() {
/* 283 */     return this._supplierRepCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierRepStateCodeType getSupplierRepStateCode() {
/* 293 */     return this._supplierRepStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TurnInOrderTypeType getTurnInOrderType() {
/* 303 */     return this._turnInOrderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVendorOrderId() {
/* 313 */     return this._vendorOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWebCreatedTime() {
/* 323 */     return this._webCreatedTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWebOrderId() {
/* 333 */     return this._webOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasItemsAccepted() {
/* 343 */     return this._has_itemsAccepted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasItemsRejected() {
/* 353 */     return this._has_itemsRejected;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasWebOrderId() {
/* 363 */     return this._has_webOrderId;
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
/* 374 */       validate();
/* 375 */     } catch (ValidationException vex) {
/* 376 */       return false;
/*     */     } 
/* 378 */     return true;
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
/* 389 */     return this._orderHeaderMessagesList.iterator();
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
/* 404 */     Marshaller.marshal(this, out);
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
/* 421 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllOrderHeaderMessages() {
/* 428 */     this._orderHeaderMessagesList.clear();
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
/* 439 */     boolean removed = this._orderHeaderMessagesList.remove(vOrderHeaderMessages);
/* 440 */     return removed;
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
/* 451 */     Object obj = this._orderHeaderMessagesList.remove(index);
/* 452 */     return (OrderHeaderMessages)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerId(String customerId) {
/* 462 */     this._customerId = customerId;
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
/* 473 */     this._customerStateCode = customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemsAccepted(int itemsAccepted) {
/* 483 */     this._itemsAccepted = itemsAccepted;
/* 484 */     this._has_itemsAccepted = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemsRejected(int itemsRejected) {
/* 494 */     this._itemsRejected = itemsRejected;
/* 495 */     this._has_itemsRejected = true;
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
/* 511 */     if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
/* 512 */       throw new IndexOutOfBoundsException("setOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
/*     */     }
/*     */     
/* 515 */     this._orderHeaderMessagesList.set(index, vOrderHeaderMessages);
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
/* 526 */     this._orderHeaderMessagesList.clear();
/*     */     
/* 528 */     for (int i = 0; i < vOrderHeaderMessagesArray.length; i++) {
/* 529 */       this._orderHeaderMessagesList.add(vOrderHeaderMessagesArray[i]);
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
/*     */   public void setSupplierReference(String supplierReference) {
/* 541 */     this._supplierReference = supplierReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierRepCode(String supplierRepCode) {
/* 551 */     this._supplierRepCode = supplierRepCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierRepStateCode(SupplierRepStateCodeType supplierRepStateCode) {
/* 562 */     this._supplierRepStateCode = supplierRepStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTurnInOrderType(TurnInOrderTypeType turnInOrderType) {
/* 572 */     this._turnInOrderType = turnInOrderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVendorOrderId(String vendorOrderId) {
/* 582 */     this._vendorOrderId = vendorOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWebCreatedTime(String webCreatedTime) {
/* 592 */     this._webCreatedTime = webCreatedTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWebOrderId(int webOrderId) {
/* 602 */     this._webOrderId = webOrderId;
/* 603 */     this._has_webOrderId = true;
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
/* 620 */     return (OrderHeaderResponse)Unmarshaller.unmarshal(OrderHeaderResponse.class, reader);
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
/* 632 */     Validator validator = new Validator();
/* 633 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\validation\OrderHeaderResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */