/*     */ package com.metcash.webservices.eai.xml.supplier.order;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType;
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
/*     */ public class LineItem
/*     */   implements Serializable
/*     */ {
/*     */   private int _lineId;
/*     */   private boolean _has_lineId;
/*     */   private OrderTypeType _orderType;
/*     */   private BackOrderType _backOrder;
/*     */   private String _productCode;
/*     */   private ProductCodeTypeType _productCodeType;
/*     */   private int _orderQuantity;
/*     */   private boolean _has_orderQuantity;
/*     */   private int _dealAmount;
/*     */   private boolean _has_dealAmount;
/*     */   private ApplyBonusType _applyBonus;
/*     */   private ApplyQdaType _applyQda;
/*     */   
/*     */   public void deleteDealAmount() {
/* 107 */     this._has_dealAmount = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteLineId() {
/* 114 */     this._has_lineId = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteOrderQuantity() {
/* 121 */     this._has_orderQuantity = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApplyBonusType getApplyBonus() {
/* 131 */     return this._applyBonus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApplyQdaType getApplyQda() {
/* 141 */     return this._applyQda;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BackOrderType getBackOrder() {
/* 151 */     return this._backOrder;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDealAmount() {
/* 161 */     return this._dealAmount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLineId() {
/* 171 */     return this._lineId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrderQuantity() {
/* 181 */     return this._orderQuantity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderTypeType getOrderType() {
/* 191 */     return this._orderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProductCode() {
/* 201 */     return this._productCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProductCodeTypeType getProductCodeType() {
/* 211 */     return this._productCodeType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasDealAmount() {
/* 221 */     return this._has_dealAmount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasLineId() {
/* 231 */     return this._has_lineId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasOrderQuantity() {
/* 241 */     return this._has_orderQuantity;
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
/* 252 */       validate();
/* 253 */     } catch (ValidationException vex) {
/* 254 */       return false;
/*     */     } 
/* 256 */     return true;
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
/* 271 */     Marshaller.marshal(this, out);
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
/* 288 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setApplyBonus(ApplyBonusType applyBonus) {
/* 298 */     this._applyBonus = applyBonus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setApplyQda(ApplyQdaType applyQda) {
/* 308 */     this._applyQda = applyQda;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBackOrder(BackOrderType backOrder) {
/* 318 */     this._backOrder = backOrder;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDealAmount(int dealAmount) {
/* 328 */     this._dealAmount = dealAmount;
/* 329 */     this._has_dealAmount = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLineId(int lineId) {
/* 339 */     this._lineId = lineId;
/* 340 */     this._has_lineId = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderQuantity(int orderQuantity) {
/* 350 */     this._orderQuantity = orderQuantity;
/* 351 */     this._has_orderQuantity = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderType(OrderTypeType orderType) {
/* 361 */     this._orderType = orderType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProductCode(String productCode) {
/* 371 */     this._productCode = productCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProductCodeType(ProductCodeTypeType productCodeType) {
/* 381 */     this._productCodeType = productCodeType;
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
/*     */   public static LineItem unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 398 */     return (LineItem)Unmarshaller.unmarshal(LineItem.class, reader);
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
/* 410 */     Validator validator = new Validator();
/* 411 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\order\LineItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */