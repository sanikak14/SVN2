/*     */ package com.metcash.webservices;
/*     */ 
/*     */ import com.metcash.common.services.SupplierRepOrderService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.model.field.WebOrderId;
/*     */ import com.metcash.model.segment.ViewOrder;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderStatusValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderStatusXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierOrderStatusRequest;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.orderstatus.OrderStatusValidationResult;
/*     */ import com.metcash.webservices.validation.orderstatus.SupplierOrderStatusValidationResult;
/*     */ import com.metcash.webservices.validation.orderstatus.SupplierOrderStatusValidator;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderStatusHelper
/*     */ {
/*     */   private static final String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><OrderStatusResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></OrderStatusResponse>";
/*  28 */   private static Log log = LogFactory.getLog(SupplierOrderStatusHelper.class);
/*     */   
/*     */   protected SupplierRepOrderService orderService;
/*     */   protected SupplierRepService supplierRepService;
/*     */   
/*     */   public SupplierOrderStatusHelper() {
/*     */     try {
/*  35 */       this.orderService = new SupplierRepOrderService();
/*  36 */       this.supplierRepService = new SupplierRepService();
/*  37 */     } catch (Exception e) {
/*  38 */       log.error("SupplierOrderStatusHelper()", e);
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
/*     */   public String getSupplierOrderStatus(String xmlSupplierOrderStatusRequest, String authenticatedSupplierId, String authenticatedSupplierStateId) {
/*  50 */     SupplierOrderStatusRequest request = null;
/*  51 */     SupplierOrderStatusValidationResult result = new SupplierOrderStatusValidationResult();
/*  52 */     OrderStatusResponse response = null;
/*     */ 
/*     */     
/*     */     try {
/*  56 */       request = (new SupplierOrderStatusXmlAdapter())
/*  57 */         .parseXml(xmlSupplierOrderStatusRequest);
/*  58 */     } catch (Exception e) {
/*  59 */       result.setMessage(ValidationResult.ERROR, 
/*  60 */           ValidationConfig.ERROR_PARSING_REQUEST_XML);
/*     */     } 
/*     */ 
/*     */     
/*  64 */     if (!result.isInError()) {
/*  65 */       processRequest(request, authenticatedSupplierId, 
/*  66 */           authenticatedSupplierStateId, result);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  72 */       response = result.getResponse();
/*  73 */       SupplierOrderStatusValidationAdapter responseValidationAdapter = new SupplierOrderStatusValidationAdapter();
/*  74 */       String xmlResponse = responseValidationAdapter.getXml(response);
/*  75 */       log.info("getSupplierOrderStatus() Response: " + xmlResponse);
/*  76 */       return xmlResponse;
/*     */     }
/*  78 */     catch (Exception e) {
/*  79 */       log.error("Problem returning an XML Response to client:", e);
/*     */ 
/*     */       
/*  82 */       return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><OrderStatusResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></OrderStatusResponse>";
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
/*     */   public void processRequest(SupplierOrderStatusRequest request, String authenticatedSupplierId, String authenticatedSupplierStateId, SupplierOrderStatusValidationResult result) {
/*  98 */     SupplierOrderStatusValidator validator = null;
/*     */     try {
/* 100 */       validator = new SupplierOrderStatusValidator(request, (OrderStatusValidationResult)result, 
/* 101 */           this.orderService, this.supplierRepService);
/*     */ 
/*     */       
/* 104 */       boolean isValid = validator.validateAuthenticatedSupplier(
/* 105 */           authenticatedSupplierId, authenticatedSupplierStateId);
/*     */       
/* 107 */       if (isValid) {
/*     */         
/* 109 */         Map orders = validator.validateAllOrders();
/* 110 */         if (!result.isInError() && orders != null) {
/* 111 */           int requestOrderId = -1;
/* 112 */           ViewOrder order = null;
/* 113 */           for (int i = 0; i < request.getOrderCount(); i++) {
/*     */             
/* 115 */             requestOrderId = request.getOrder(i).getWebOrderId();
/* 116 */             order = (ViewOrder)orders.get(new WebOrderId(
/* 117 */                   requestOrderId));
/*     */ 
/*     */             
/* 120 */             result.createOrderResponse();
/* 121 */             if (order != null) {
/*     */               
/* 123 */               result.setOrderStatsDetail(order);
/*     */             } else {
/* 125 */               result.setOrderResponseMessage(
/* 126 */                   ValidationResult.WARN, "Invalid order " + 
/* 127 */                   requestOrderId);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 132 */     } catch (Exception e) {
/* 133 */       log.error("processRequest()", e);
/* 134 */       result.setMessage(ValidationResult.ERROR, 
/* 135 */           "Unexpected error occurred while processing request.");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\SupplierOrderStatusHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */