/*     */ package com.metcash.webservices.validation.order;
/*     */ 
/*     */ import com.metcash.model.segment.db.OrderHeader;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.LineMessages;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderDetail;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderValidationResult
/*     */   extends OrderValidationResult
/*     */ {
/*     */   private OrderDetail orderDetailResponseXml;
/*     */   private boolean hasHeaderErrors;
/*     */   private int supplierLinesRequested;
/*  30 */   private HashMap linesInErrorMap = new HashMap<Object, Object>();
/*  31 */   public String DUPLICATE_LINE_KEY_PREFIX = "Duplicate:";
/*  32 */   public String BROKEN_PACK_ROUND_UP_KEY_PREFIX = "BrokenPack:";
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isO4Supplier;
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierOrderValidationResult() {
/*  41 */     this.orderDetailResponseXml = new OrderDetail();
/*  42 */     this.orderDetailResponseXml.setOrderHeaderResponse(new OrderHeaderResponse());
/*     */   }
/*     */   
/*     */   public void setSupplierLinesRequested(int supplierLinesRequested) {
/*  46 */     this.supplierLinesRequested = supplierLinesRequested;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderDetail getOrderDetailResponseXml() {
/*  54 */     return this.orderDetailResponseXml;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOrderHeaderResponseMessage(int severity, String message) {
/*  63 */     if (severity == OrderValidationResult.ERROR) {
/*  64 */       this.hasHeaderErrors = true;
/*     */     }
/*     */     
/*  67 */     OrderHeaderMessages orderHeaderMessage = new OrderHeaderMessages();
/*  68 */     orderHeaderMessage.setHeaderMessageData(message);
/*  69 */     orderHeaderMessage.setHeaderMessageSeverity(severityToString(severity));
/*     */     
/*  71 */     OrderHeaderResponse orderHeaderResponse = this.orderDetailResponseXml.getOrderHeaderResponse();
/*  72 */     orderHeaderResponse.addOrderHeaderMessages(orderHeaderMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHeaderResponseXml(OrderHeader orderHeader) {
/*  81 */     OrderHeaderResponse orderHeaderResponse = this.orderDetailResponseXml.getOrderHeaderResponse();
/*  82 */     orderHeaderResponse.setCustomerId(orderHeader.customerId.getAsText());
/*  83 */     orderHeaderResponse.setCustomerStateCode(CustomerStateCodeType.valueOf(orderHeader.stateId.getAsText()));
/*  84 */     orderHeaderResponse.setItemsAccepted(this.supplierLinesRequested - this.linesInErrorMap.size());
/*  85 */     orderHeaderResponse.setItemsRejected(this.linesInErrorMap.size());
/*  86 */     orderHeaderResponse.setVendorOrderId(orderHeader.externalOrderId.internalValue());
/*  87 */     orderHeaderResponse.setWebCreatedTime(orderHeader.createdDate.xmlFormat());
/*  88 */     orderHeaderResponse.setWebOrderId((orderHeader.getOrderKey()).webOrderId.internalValue());
/*     */     
/*  90 */     if (!orderHeader.supplierRepId.internalValue().equals(orderHeader.refSupplierRepId.internalValue())) {
/*  91 */       orderHeaderResponse.setSupplierRepCode(orderHeader.refSupplierRepId.internalValue());
/*     */     } else {
/*  93 */       orderHeaderResponse.setSupplierRepCode(orderHeader.supplierRepId.internalValue());
/*     */     } 
/*  95 */     orderHeaderResponse.setSupplierRepStateCode(SupplierRepStateCodeType.valueOf(orderHeader.suppRepStateId.internalValue()));
/*  96 */     orderHeaderResponse.setSupplierReference(orderHeader.supplierRefCode.getAsText());
/*  97 */     orderHeaderResponse.setTurnInOrderType(TurnInOrderTypeType.valueOf(orderHeader.turnInOrderType.internalValue()));
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
/*     */   public void addLineMessageToOrderDetail(String messageData, String productDescription, String productId, int severity, int orderQty, int clientLineId) {
/* 113 */     if (severity == OrderValidationResult.ERROR) {
/* 114 */       if (messageData.equals(ValidationConfig.DUPLICATE_ORDER_LINE)) {
/*     */         
/* 116 */         this.linesInErrorMap.put("Duplicate:" + Integer.toString(clientLineId), String.valueOf(messageData) + "- Product:" + productId);
/*     */       } else {
/* 118 */         this.linesInErrorMap.put(Integer.toString(clientLineId), String.valueOf(messageData) + "- Product:" + productId);
/*     */       } 
/*     */     }
/* 121 */     LineMessages lineMessages = new LineMessages();
/* 122 */     lineMessages = new LineMessages();
/* 123 */     lineMessages.setLineId(clientLineId);
/* 124 */     lineMessages.setLineMessageData(messageData);
/* 125 */     lineMessages.setProductDescription(productDescription);
/* 126 */     lineMessages.setProductCode(productId);
/* 127 */     lineMessages.setLineMessageSeverity(severityToString(severity));
/* 128 */     lineMessages.setOrderQuantity(orderQty);
/* 129 */     this.orderDetailResponseXml.addLineMessages(lineMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean orderHeaderHasErrors() {
/* 137 */     return this.hasHeaderErrors;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int linesInError() {
/* 145 */     return this.linesInErrorMap.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean allLinesInError(OrderHeader orderHeader) {
/* 154 */     return (this.linesInErrorMap.size() >= orderHeader.getOrderLines().size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean lineHasErrors(int lineId) {
/* 162 */     return this.linesInErrorMap.containsKey(Integer.toString(lineId));
/*     */   }
/*     */   
/*     */   public boolean isO4Supplier() {
/* 166 */     return this.isO4Supplier;
/*     */   }
/*     */   
/*     */   public void setO4Supplier(boolean isO4Supplier) {
/* 170 */     this.isO4Supplier = isO4Supplier;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\SupplierOrderValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */