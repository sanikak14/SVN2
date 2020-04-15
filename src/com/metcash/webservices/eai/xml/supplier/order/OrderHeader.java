/*     */ package com.metcash.webservices.eai.xml.supplier.order;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderHeader
/*     */   implements Serializable
/*     */ {
/*     */   private String _vendorOrderId;
/*     */   private String _customerOrderId;
/*     */   private String _customerId;
/*     */   private CustomerStateCodeType _customerStateCode;
/*     */   private String _supplierRepId;
/*     */   private String _supplierReference;
/*     */   private String _supplierStateId;
/*     */   private TrnApprovedType _trnApproved;
/*     */   private String _refSupplierStateId;
/*     */   private String _refSupplierRepId;
/*     */   private String _specialInstructions;
/*     */   private String _deliveryDate;
/*     */   private String _orderCreatedDate;
/*     */   
/*     */   public String getCustomerId() {
/* 115 */     return this._customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomerOrderId() {
/* 125 */     return this._customerOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CustomerStateCodeType getCustomerStateCode() {
/* 135 */     return this._customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeliveryDate() {
/* 145 */     return this._deliveryDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOrderCreatedDate() {
/* 155 */     return this._orderCreatedDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRefSupplierRepId() {
/* 165 */     return this._refSupplierRepId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRefSupplierStateId() {
/* 175 */     return this._refSupplierStateId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSpecialInstructions() {
/* 185 */     return this._specialInstructions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierReference() {
/* 195 */     return this._supplierReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierRepId() {
/* 205 */     return this._supplierRepId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupplierStateId() {
/* 215 */     return this._supplierStateId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrnApprovedType getTrnApproved() {
/* 225 */     return this._trnApproved;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVendorOrderId() {
/* 235 */     return this._vendorOrderId;
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
/* 246 */       validate();
/* 247 */     } catch (ValidationException vex) {
/* 248 */       return false;
/*     */     } 
/* 250 */     return true;
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
/* 265 */     Marshaller.marshal(this, out);
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
/* 282 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerId(String customerId) {
/* 292 */     this._customerId = customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerOrderId(String customerOrderId) {
/* 302 */     this._customerOrderId = customerOrderId;
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
/* 313 */     this._customerStateCode = customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeliveryDate(String deliveryDate) {
/* 323 */     this._deliveryDate = deliveryDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderCreatedDate(String orderCreatedDate) {
/* 333 */     this._orderCreatedDate = orderCreatedDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRefSupplierRepId(String refSupplierRepId) {
/* 343 */     this._refSupplierRepId = refSupplierRepId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRefSupplierStateId(String refSupplierStateId) {
/* 354 */     this._refSupplierStateId = refSupplierStateId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpecialInstructions(String specialInstructions) {
/* 365 */     this._specialInstructions = specialInstructions;
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
/* 376 */     this._supplierReference = supplierReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierRepId(String supplierRepId) {
/* 386 */     this._supplierRepId = supplierRepId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierStateId(String supplierStateId) {
/* 396 */     this._supplierStateId = supplierStateId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrnApproved(TrnApprovedType trnApproved) {
/* 406 */     this._trnApproved = trnApproved;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVendorOrderId(String vendorOrderId) {
/* 416 */     this._vendorOrderId = vendorOrderId;
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
/*     */   public static OrderHeader unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 433 */     return (OrderHeader)Unmarshaller.unmarshal(OrderHeader.class, reader);
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
/* 445 */     Validator validator = new Validator();
/* 446 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\OrderHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */