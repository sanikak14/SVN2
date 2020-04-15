/*     */ package com.metcash.webservices.validation.orderhistory;
/*     */ 
/*     */ import com.metcash.common.services.OrderService;
/*     */ import com.metcash.common.services.SupplierRepOrderService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequest;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.Validator;
/*     */ import java.util.Calendar;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.exolab.castor.types.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderHistoryValidator
/*     */   extends Validator
/*     */ {
/*     */   private SupplierOrderHistoryRequest request;
/*     */   private SupplierOrderHistoryValidationResult currentResult;
/*     */   private OrderService orderService;
/*     */   private SupplierRepService supplierRepService;
/*  32 */   private static Log log = LogFactory.getLog(SupplierOrderHistoryValidator.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierOrderHistoryValidator(SupplierOrderHistoryRequest request, SupplierOrderHistoryValidationResult result, SupplierRepOrderService supplierRepOrderService, SupplierRepService supplierRepService) {
/*  38 */     this.request = request;
/*  39 */     this.currentResult = result;
/*  40 */     this.orderService = (OrderService)supplierRepOrderService;
/*  41 */     this.supplierRepService = supplierRepService;
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
/*     */   public SupplierRep validateSupplierRep(String xmlStateId, String xmlSuppRepId) {
/*  57 */     SupplierRep supplierRep = null;
/*     */     try {
/*  59 */       supplierRep = super.validateSupplierRep(xmlStateId, xmlSuppRepId);
/*  60 */     } catch (Exception e) {
/*  61 */       log.error("validateSupplierRep()", e);
/*     */     } 
/*     */     
/*  64 */     if (supplierRep == null) {
/*  65 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/*  66 */           String.valueOf(ValidationConfig.NO_REP_EXISTS) + ":SupplierRepId:" + 
/*  67 */           xmlSuppRepId + ":SupplierStateId:" + xmlStateId);
/*     */     }
/*  69 */     return supplierRep;
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
/*     */   public boolean validateAuthenticatedUser(String authenticatedUserId, String authenticatedUserStateId) {
/*  81 */     boolean isValid = false;
/*     */     
/*  83 */     String userIdFromRequest = null;
/*  84 */     String userStateIdFromRequest = null;
/*     */     
/*  86 */     userIdFromRequest = this.request.getSupplierRep().getId();
/*  87 */     userStateIdFromRequest = this.request.getSupplierRep().getStateCode()
/*  88 */       .toString();
/*     */     
/*  90 */     if (log.isDebugEnabled()) {
/*  91 */       log
/*  92 */         .debug("validateAuthenticatedUser() userIdFromRequest,userStateIdFromRequest :" + 
/*  93 */           userIdFromRequest + 
/*  94 */           "," + 
/*  95 */           userStateIdFromRequest + 
/*  96 */           " against authenticatedUserId,authenticatedUserStateId: " + 
/*  97 */           authenticatedUserId + 
/*  98 */           "," + 
/*  99 */           authenticatedUserStateId);
/*     */     }
/* 101 */     if (authenticatedUserId != null && !authenticatedUserId.equals("") && 
/* 102 */       authenticatedUserStateId != null && 
/* 103 */       !authenticatedUserStateId.equals(""))
/*     */     {
/*     */       
/* 106 */       if (userIdFromRequest.equals(authenticatedUserId) && 
/* 107 */         userStateIdFromRequest.equals(authenticatedUserStateId)) {
/* 108 */         isValid = true;
/*     */       }
/*     */     }
/*     */     
/* 112 */     if (!isValid) {
/* 113 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/* 114 */           ValidationConfig.AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH);
/*     */     }
/*     */     
/* 117 */     return isValid;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean validateDateRange() {
/* 122 */     boolean isValid = true;
/*     */     
/* 124 */     Date startDate = this.request.getStartDate();
/* 125 */     Date endDate = this.request.getEndDate();
/*     */     
/* 127 */     if (endDate == null) {
/* 128 */       endDate = new Date(
/* 129 */           System.currentTimeMillis());
/* 130 */       this.request.setEndDate(endDate);
/*     */     } 
/* 132 */     if (startDate == null) {
/* 133 */       Calendar c = endDate.toCalendar();
/* 134 */       c.set(11, 0);
/* 135 */       c.set(12, 0);
/* 136 */       c.set(13, 0);
/* 137 */       c.set(14, 0);
/* 138 */       c.add(5, -7);
/* 139 */       startDate = new Date(c.getTimeInMillis());
/* 140 */       this.request.setStartDate(startDate);
/*     */     } 
/*     */     
/* 143 */     if (startDate.toLong() >= endDate.toLong()) {
/* 144 */       isValid = false;
/*     */     }
/*     */     
/* 147 */     if (!isValid) {
/* 148 */       this.currentResult.setMessage(ValidationResult.ERROR, 
/* 149 */           ValidationConfig.INVALID_DATE_RANGE);
/*     */     }
/*     */     
/* 152 */     return isValid;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\orderhistory\SupplierOrderHistoryValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */