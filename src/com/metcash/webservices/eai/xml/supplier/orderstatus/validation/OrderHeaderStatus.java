/*     */ package com.metcash.webservices.eai.xml.supplier.orderstatus.validation;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ import java.util.Date;
/*     */
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
/*     */ public class OrderHeaderStatus
/*     */   implements Serializable
/*     */ {
/*     */   private int _webOrderId;
/*     */   private boolean _has_webOrderId;
/*     */   private String _customerId;
/*     */   private StateCodeType _customerStateCode;
/*     */   private Date _createDate;
/*     */   private OrderHeaderStatusTurnInOrderTypeType _turnInOrderType;
/*     */   private boolean _turnInOrderApproved;
/*     */   private boolean _has_turnInOrderApproved;
/*     */   private OrderHeaderStatusOrderSourceType _orderSource;
/*     */   private OrderHeaderStatusStageType _stage;
/*     */   private OrderHeaderStatusStatusType _status;
/*     */   private org.exolab.castor.types.Date _deliveryDate;
/*     */   
/*     */   public void deleteTurnInOrderApproved() {
/* 110 */     this._has_turnInOrderApproved = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteWebOrderId() {
/* 117 */     this._has_webOrderId = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/* 127 */     return this._createDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomerId() {
/* 137 */     return this._customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StateCodeType getCustomerStateCode() {
/* 147 */     return this._customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public org.exolab.castor.types.Date getDeliveryDate() {
/* 157 */     return this._deliveryDate;
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
/*     */   public OrderHeaderStatusOrderSourceType getOrderSource() {
/* 169 */     return this._orderSource;
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
/*     */   public OrderHeaderStatusStageType getStage() {
/* 181 */     return this._stage;
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
/*     */   public OrderHeaderStatusStatusType getStatus() {
/* 193 */     return this._status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getTurnInOrderApproved() {
/* 203 */     return this._turnInOrderApproved;
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
/*     */   public OrderHeaderStatusTurnInOrderTypeType getTurnInOrderType() {
/* 216 */     return this._turnInOrderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWebOrderId() {
/* 226 */     return this._webOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasTurnInOrderApproved() {
/* 237 */     return this._has_turnInOrderApproved;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasWebOrderId() {
/* 247 */     return this._has_webOrderId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTurnInOrderApproved() {
/* 257 */     return this._turnInOrderApproved;
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
/* 268 */       validate();
/* 269 */     } catch (ValidationException vex) {
/* 270 */       return false;
/*     */     } 
/* 272 */     return true;
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
/* 287 */     Marshaller.marshal(this, out);
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
/* 304 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date createDate) {
/* 314 */     this._createDate = createDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerId(String customerId) {
/* 324 */     this._customerId = customerId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomerStateCode(StateCodeType customerStateCode) {
/* 335 */     this._customerStateCode = customerStateCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeliveryDate(org.exolab.castor.types.Date deliveryDate) {
/* 345 */     this._deliveryDate = deliveryDate;
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
/*     */   public void setOrderSource(OrderHeaderStatusOrderSourceType orderSource) {
/* 357 */     this._orderSource = orderSource;
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
/*     */   public void setStage(OrderHeaderStatusStageType stage) {
/* 369 */     this._stage = stage;
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
/*     */   public void setStatus(OrderHeaderStatusStatusType status) {
/* 381 */     this._status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTurnInOrderApproved(boolean turnInOrderApproved) {
/* 392 */     this._turnInOrderApproved = turnInOrderApproved;
/* 393 */     this._has_turnInOrderApproved = true;
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
/*     */   public void setTurnInOrderType(OrderHeaderStatusTurnInOrderTypeType turnInOrderType) {
/* 406 */     this._turnInOrderType = turnInOrderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWebOrderId(int webOrderId) {
/* 416 */     this._webOrderId = webOrderId;
/* 417 */     this._has_webOrderId = true;
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
/*     */   public static OrderHeaderStatus unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 434 */     return (OrderHeaderStatus)Unmarshaller.unmarshal(OrderHeaderStatus.class, reader);
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
/* 446 */     Validator validator = new Validator();
/* 447 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\orderstatus\validation\OrderHeaderStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */