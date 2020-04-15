/*     */ package com.metcash.webservices.validation.orderstatus;
/*     */ 
/*     */ import com.metcash.common.services.OrderService;
/*     */ import com.metcash.common.services.SupplierRepOrderService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierRepId;
/*     */ import com.metcash.model.field.WebOrderId;
/*     */ import com.metcash.model.segment.ViewOrder;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.webservices.config.O4Config;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.Order;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierOrderStatusRequest;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class SupplierOrderStatusValidator
/*     */   extends OrderStatusValidator
/*     */ {
/*  35 */   private Log log = LogFactory.getLog(SupplierOrderStatusValidator.class);
/*     */ 
/*     */   
/*     */   private SupplierOrderStatusRequest request;
/*     */   
/*     */   private SupplierRepService supplierRepService;
/*     */ 
/*     */   
/*     */   public SupplierOrderStatusValidator(SupplierOrderStatusRequest request, OrderStatusValidationResult result, SupplierRepOrderService supplierRepOrderService, SupplierRepService supplierRepService) {
/*  44 */     super((OrderService)supplierRepOrderService);
/*  45 */     this.request = request;
/*  46 */     this.currentResult = result;
/*  47 */     this.supplierRepService = supplierRepService;
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
/*     */   public boolean validateAuthenticatedSupplier(String authenticatedSupplierId, String authenticatedSupplierStateId) {
/*  61 */     boolean isValid = false;
/*     */     
/*  63 */     String supplierIdFromRequest = null;
/*  64 */     String supplierStateIdFromRequest = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     supplierIdFromRequest = this.request.getSupplierRep().getId();
/*  78 */     supplierStateIdFromRequest = this.request.getSupplierRep().getStateCode()
/*  79 */       .toString();
/*     */     
/*  81 */     if (this.log.isDebugEnabled()) {
/*  82 */       this.log
/*  83 */         .debug("validateAuthenticatedSupplier() supplierIdFromRequest,supplierStateIdFromRequest :" + 
/*  84 */           supplierIdFromRequest + 
/*  85 */           "," + 
/*  86 */           supplierStateIdFromRequest + 
/*  87 */           " against authenticatedSupplierId,authenticatedSupplierStateId: " + 
/*  88 */           authenticatedSupplierId + 
/*  89 */           "," + 
/*  90 */           authenticatedSupplierStateId);
/*     */     }
/*  92 */     if (authenticatedSupplierId != null && 
/*  93 */       !authenticatedSupplierId.equals("") && 
/*  94 */       authenticatedSupplierStateId != null && 
/*  95 */       !authenticatedSupplierStateId.equals(""))
/*     */     {
/*     */       
/*  98 */       if (supplierIdFromRequest.equals(authenticatedSupplierId) && 
/*  99 */         supplierStateIdFromRequest
/* 100 */         .equals(authenticatedSupplierStateId)) {
/* 101 */         isValid = true;
/*     */       }
/*     */     }
/*     */     
/* 105 */     if (!isValid) {
/* 106 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/* 107 */           ValidationConfig.AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH);
/*     */     }
/*     */     
/* 110 */     return isValid;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map validateAllOrders() {
/* 115 */     Order[] xmlOrders = this.request.getOrder();
/* 116 */     WebOrderId[] webOrderIds = new WebOrderId[xmlOrders.length];
/* 117 */     for (int i = 0; i < xmlOrders.length; i++) {
/* 118 */       webOrderIds[i] = new WebOrderId(xmlOrders[i].getWebOrderId());
/*     */     }
/*     */     try {
/* 121 */       if (this.request.getSupplierRep().getId().equals(
/* 122 */           O4Config.O4_REP_ID.toString())) {
/* 123 */         if (this.request.getSupplierRep().getStateCode().toString()
/* 124 */           .equals(O4Config.O4_STATE_ID.internalValue()))
/*     */         {
/* 126 */           return validateAllOrders(webOrderIds);
/*     */         }
/*     */       }
/* 129 */       SupplierRep supplierRep = this.supplierRepService.findSupplierRep(
/* 130 */           PillarId.ALM, new StateId(this.request.getSupplierRep()
/* 131 */             .getStateCode().toString()), new SupplierRepId(
/* 132 */             this.request.getSupplierRep().getId()));
/*     */       
/* 134 */       return validateAllOrders(supplierRep, webOrderIds);
/*     */     
/*     */     }
/* 137 */     catch (Exception e) {
/* 138 */       this.log.error("validateAllOrders()", e);
/*     */ 
/*     */       
/* 141 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map validateAllOrders(SupplierRep supplierRep, WebOrderId[] webOrderIds) {
/* 146 */     Map<Object, Object> orders = new HashMap<Object, Object>();
/* 147 */     ViewOrder order = null;
/* 148 */     for (int i = 0; i < webOrderIds.length; i++) {
/*     */       try {
/* 150 */         order = ((SupplierRepOrderService)this.orderService).findViewOrder(
/* 151 */             supplierRep, webOrderIds[i]);
/* 152 */       } catch (Exception e) {
/* 153 */         order = null;
/* 154 */         this.log.error("validateAllOrders()", e);
/*     */       } 
/* 156 */       if (order != null) {
/* 157 */         orders.put(webOrderIds[i], order);
/*     */       }
/*     */     } 
/*     */     
/* 161 */     return orders;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderstatus\SupplierOrderStatusValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */