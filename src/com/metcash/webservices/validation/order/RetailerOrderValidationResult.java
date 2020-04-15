/*     */ package com.metcash.webservices.validation.order;
/*     */ 
/*     */ import com.metcash.model.segment.db.OrderHeader;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderResponse;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.types.CustomerStateCodeType;
/*     */ import java.util.HashMap;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RetailerOrderValidationResult
/*     */   extends OrderValidationResult
/*     */ {
/*     */   private OrderDetail orderDetailResponseXml;
/*     */   private boolean hasHeaderErrors;
/*     */   private int retailerLinesRequested;
/*  28 */   private HashMap linesInErrorMap = new HashMap<Object, Object>();
/*     */   
/*  30 */   private static Log log = LogFactory.getLog(RetailerOrderValidationResult.class);
/*     */ 
/*     */   
/*     */   public RetailerOrderValidationResult() {
/*  34 */     this.orderDetailResponseXml = new OrderDetail();
/*  35 */     this.orderDetailResponseXml.setOrderHeaderResponse(new OrderHeaderResponse());
/*     */     try {
/*  37 */       jbInit();
/*     */     }
/*  39 */     catch (Exception ex) {
/*  40 */       log.warn("RetailerValidationResult()", ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setRetailerLinesRequested(int retailerLinesRequested) {
/*  45 */     this.retailerLinesRequested = retailerLinesRequested;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderDetail getOrderDetailResponseXml() {
/*  53 */     return this.orderDetailResponseXml;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderHeaderResponseXml(OrderHeader orderHeader) {
/*  62 */     OrderHeaderResponse orderHeaderResponse = this.orderDetailResponseXml.getOrderHeaderResponse();
/*  63 */     orderHeaderResponse.setCustomerId(orderHeader.customerId.getAsText());
/*  64 */     orderHeaderResponse.setCustomerStateCode(CustomerStateCodeType.valueOf(orderHeader.stateId.getAsText()));
/*  65 */     orderHeaderResponse.setItemsAccepted(this.retailerLinesRequested - this.linesInErrorMap.size());
/*  66 */     orderHeaderResponse.setItemsRejected(this.linesInErrorMap.size());
/*  67 */     orderHeaderResponse.setExternalOrderId(orderHeader.externalOrderId.internalValue());
/*  68 */     orderHeaderResponse.setWebCreatedTime(orderHeader.createdDate.getAsText());
/*  69 */     orderHeaderResponse.setWebOrderId((orderHeader.getOrderKey()).webOrderId.internalValue());
/*     */   }
/*     */   
/*     */   public void addOrderHeaderResponseMessage(int severity, String message) {
/*  73 */     if (severity == OrderValidationResult.ERROR) {
/*  74 */       this.hasHeaderErrors = true;
/*     */     }
/*     */     
/*  77 */     OrderHeaderMessages orderHeaderMessage = new OrderHeaderMessages();
/*  78 */     orderHeaderMessage.setHeaderMessageData(message);
/*  79 */     orderHeaderMessage.setHeaderMessageSeverity(severityToString(severity));
/*     */     
/*  81 */     OrderHeaderResponse orderHeaderResponse = this.orderDetailResponseXml.getOrderHeaderResponse();
/*  82 */     orderHeaderResponse.addOrderHeaderMessages(orderHeaderMessage);
/*     */   }
/*     */   
/*     */   public void addLineMessageToOrderDetail(String messageData, String productDescription, String productId, int severity, int orderQty, int lineId) {
/*  86 */     if (severity == OrderValidationResult.ERROR) {
/*  87 */       if (messageData.equals(ValidationConfig.DUPLICATE_ORDER_LINE)) {
/*     */         
/*  89 */         this.linesInErrorMap.put("Duplicate:" + Integer.toString(lineId), String.valueOf(messageData) + "- Product:" + productId);
/*     */       } else {
/*  91 */         this.linesInErrorMap.put(Integer.toString(lineId), String.valueOf(messageData) + "- Product:" + productId);
/*     */       } 
/*     */     }
/*  94 */     LineMessages lineMessages = new LineMessages();
/*  95 */     lineMessages = new LineMessages();
/*  96 */     lineMessages.setLineId(lineId);
/*  97 */     lineMessages.setLineMessageData(messageData);
/*  98 */     lineMessages.setProductDescription(productDescription);
/*  99 */     lineMessages.setProductCode(productId);
/* 100 */     lineMessages.setLineMessageSeverity(severityToString(severity));
/* 101 */     lineMessages.setOrderQuantity(orderQty);
/* 102 */     this.orderDetailResponseXml.addLineMessages(lineMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addLineMessageToOrderDetail(String messageData, String productDescription, String productId, int severity, int orderQty) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean orderHeaderHasErrors() {
/* 114 */     return this.hasHeaderErrors;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int linesInError() {
/* 122 */     return this.linesInErrorMap.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean allLinesInError(OrderHeader orderHeader) {
/* 131 */     return (this.linesInErrorMap.size() >= orderHeader.getOrderLines().size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean lineHasErrors(int lineId) {
/* 139 */     return this.linesInErrorMap.containsKey(Integer.toString(lineId));
/*     */   }
/*     */   
/*     */   private void jbInit() throws Exception {}
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\RetailerOrderValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */