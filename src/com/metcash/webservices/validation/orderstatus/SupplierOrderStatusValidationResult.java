/*     */ package com.metcash.webservices.validation.orderstatus;
/*     */ 
/*     */ import com.metcash.model.segment.ViewOrder;
/*     */ import com.metcash.model.segment.ViewOrderLine;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SeverityType;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.Message;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusDetail;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderLineStatusLineStatusType;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderStatusValidationResult
/*     */   extends OrderStatusValidationResult
/*     */ {
/*  39 */   private static Log log = LogFactory.getLog(SupplierOrderStatusValidationResult.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   private OrderStatusResponse response = new OrderStatusResponse();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderStatusResponse getResponse() {
/*  56 */     return this.response;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int createOrderResponse() {
/*  67 */     OrderResponse orderResponse = new OrderResponse();
/*  68 */     int index = increaseOrderResponseIndex();
/*  69 */     orderResponse.setIndex(index + 1);
/*  70 */     this.response.addOrderResponse(orderResponse);
/*     */     
/*  72 */     return getCurrentOrderResponseIndex();
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
/*     */   public void setMessage(int severity, String message) {
/*  84 */     if (severity == ValidationResult.ERROR) {
/*  85 */       setInError(true);
/*     */     }
/*     */     
/*  88 */     Message xmlMessage = new Message();
/*  89 */     xmlMessage.setData(message);
/*  90 */     xmlMessage
/*  91 */       .setSeverity(SeverityType.valueOf(severityToString(severity)));
/*     */     
/*  93 */     this.response.setMessage(xmlMessage);
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
/*     */   public void setOrderResponseMessage(int severity, String message) {
/* 107 */     if (severity == ValidationResult.ERROR) {
/* 108 */       setInError(true);
/*     */     }
/*     */     
/* 111 */     OrderResponse orderResponse = this.response
/* 112 */       .getOrderResponse(getCurrentOrderResponseIndex());
/* 113 */     Message xmlMessage = new Message();
/* 114 */     xmlMessage.setData(message);
/* 115 */     xmlMessage
/* 116 */       .setSeverity(SeverityType.valueOf(severityToString(severity)));
/* 117 */     orderResponse.setMessage(xmlMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderStatusDetail getCurrentOrderStatusDetail() {
/* 125 */     OrderResponse orderResponse = this.response
/* 126 */       .getOrderResponse(getCurrentOrderResponseIndex());
/* 127 */     OrderStatusDetail orderStatusDetail = orderResponse
/* 128 */       .getOrderStatusDetail();
/*     */     
/* 130 */     if (orderStatusDetail == null) {
/* 131 */       orderStatusDetail = new OrderStatusDetail();
/* 132 */       orderResponse.setOrderStatusDetail(orderStatusDetail);
/*     */     } 
/*     */     
/* 135 */     return orderStatusDetail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderStatsDetail(ViewOrder order) {
/* 145 */     OrderStatusDetail orderStatusDetail = getCurrentOrderStatusDetail();
/* 146 */     OrderHeaderStatus orderHeaderStatus = new OrderHeaderStatus();
/* 147 */     orderHeaderStatus.setWebOrderId(order.orderId.internalValue());
/* 148 */     orderHeaderStatus.setCustomerId((order.getCustomer()).customerId
/* 149 */         .internalValue());
/* 150 */     orderHeaderStatus.setCustomerStateCode(StateCodeType.valueOf(
/* 151 */           (order.getCustomer()).stateId.internalValue()));
/* 152 */     orderHeaderStatus.setCreateDate(order.createdDate.internalValue());
/* 153 */     orderHeaderStatus
/* 154 */       .setTurnInOrderType(
/* 155 */         OrderHeaderStatusTurnInOrderTypeType.valueOf(order.turnInOrderType.internalValue()));
/* 156 */     orderHeaderStatus.setTurnInOrderApproved(order.turnInOrderApproved
/* 157 */         .internalValue());
/* 158 */     orderHeaderStatus.setOrderSource(
/* 159 */         OrderHeaderStatusOrderSourceType.valueOf(order.orderSource.internalValue()));
/* 160 */     orderHeaderStatus.setStage(
/* 161 */         OrderHeaderStatusStageType.valueOf(order.stage.internalValue()));
/* 162 */     orderHeaderStatus.setStatus(
/* 163 */         OrderHeaderStatusStatusType.valueOf(order.orderStatus.internalValue()));
/* 164 */     orderStatusDetail.setOrderHeaderStatus(orderHeaderStatus);
/*     */     
/* 166 */     OrderLineStatus orderLineStatus = null;
/* 167 */     List<ViewOrderLine> lines = new ArrayList();
/* 168 */     List unavailableLines = order.getLinesUnavailable();
/* 169 */     lines.addAll(unavailableLines);
/* 170 */     List availableLines = order.getLinesAvailable();
/* 171 */     lines.addAll(availableLines);
/* 172 */     ViewOrderLine viewOrderLine = null;
/* 173 */     for (int i = 0; i < lines.size(); i++) {
/* 174 */       viewOrderLine = lines.get(i);
/* 175 */       orderLineStatus = new OrderLineStatus();
/* 176 */       orderLineStatus
/* 177 */         .setId(viewOrderLine.orderLineNumber.internalValue());
/* 178 */       orderLineStatus.setProductCode(viewOrderLine.getProductId()
/* 179 */           .internalValue());
/* 180 */       orderLineStatus.setLineStatus(
/* 181 */           OrderLineStatusLineStatusType.valueOf(viewOrderLine.status.internalValue()));
/* 182 */       orderLineStatus.setQtyReserved(viewOrderLine
/* 183 */           .getReserveQtyCartonsStr());
/* 184 */       orderLineStatus.setQtyUnreserved(viewOrderLine
/* 185 */           .getUnreserveQtyCartonsStr());
/* 186 */       orderStatusDetail.addOrderLineStatus(orderLineStatus);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderstatus\SupplierOrderStatusValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */