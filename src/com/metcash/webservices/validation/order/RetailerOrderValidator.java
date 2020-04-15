/*     */ package com.metcash.webservices.validation.order;
/*     */ 
/*     */ import com.metcash.common.filters.Ranging;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.framework.dao.firestorm.FirestormDAOFactory;
/*     */ import com.metcash.model.dao.dao.VProductDetailDao;
/*     */ import com.metcash.model.dao.toa.TOAFactory;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.OrderHeader;
/*     */ import com.metcash.model.segment.db.ProductDetail;
/*     */ import com.metcash.webservices.cache.ProductOSCacheHelper;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import java.util.ArrayList;
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
/*     */ public class RetailerOrderValidator
/*     */   extends OrderValidator
/*     */ {
/*     */   private FirestormDAOFactory daoFactory;
/*  29 */   private TOAFactory toaFactory = new TOAFactory();
/*     */   
/*     */   private VProductDetailDao vProductDetailDao;
/*  32 */   private static Log log = LogFactory.getLog(RetailerOrderValidator.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RetailerOrderValidationResult validateOrderSegment(OrderHeader orderHeader, RetailerOrderValidationResult currentResult, String authenticatedRetailerId, String authenticatedRetailerStateId) {
/*  45 */     currentResult = validateOrderSegment(orderHeader, currentResult);
/*  46 */     if (!validateOrderForAuthenticatedRetailer(orderHeader, authenticatedRetailerId, authenticatedRetailerStateId)) {
/*  47 */       currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, ValidationConfig.AUTHENTICATED_RETAILER_DOES_NOT_MATCH);
/*     */     }
/*  49 */     return currentResult;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean validateOrderForAuthenticatedRetailer(OrderHeader orderHeader, String authenticatedRetailerId, String authenticatedRetailerStateId) {
/*  59 */     String retailerIdFromOrder = orderHeader.customerId.internalValue();
/*  60 */     String retailerStateFromOrder = orderHeader.stateId.internalValue();
/*  61 */     log.debug("Validating retailerIdFromOrder,retailerStateFromOrder :" + retailerIdFromOrder + "," + retailerStateFromOrder + " against authenticatedRetailerStateId,authenticatedRetailerStateId" + authenticatedRetailerId + "," + authenticatedRetailerStateId);
/*  62 */     if (authenticatedRetailerId != null && !authenticatedRetailerId.equals("") && authenticatedRetailerStateId != null && !authenticatedRetailerStateId.equals("")) {
/*     */       
/*  64 */       if ((retailerIdFromOrder.equals(authenticatedRetailerId) && retailerStateFromOrder.equals(authenticatedRetailerStateId)) || 
/*  65 */         retailerIdFromOrder.equalsIgnoreCase("o4")) {
/*  66 */         return true;
/*     */       }
/*     */       
/*  69 */       return false;
/*     */     } 
/*     */     
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RetailerOrderValidationResult validateOrderSegment(OrderHeader orderHeader, RetailerOrderValidationResult currentResult) {
/*  81 */     this.currentResult = currentResult;
/*     */     try {
/*  83 */       HashMap<Object, Object> orderLinesMap = null;
/*  84 */       currentResult.setOrderHeaderResponseXml(orderHeader);
/*  85 */       currentResult.setRetailerLinesRequested(orderHeader.getOrderLines().size());
/*     */       
/*  87 */       validateNumericFields(orderHeader);
/*     */ 
/*     */       
/*  90 */       Customer customer = validateCustomer(orderHeader.stateId.internalValue(), orderHeader.customerId.internalValue());
/*  91 */       log.info("ORDER VALIDATED***************"+ orderHeader.stateId.internalValue() );
				if (customer == null) {
/*  92 */         currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NO_CUSTOMER_EXISTS) + ":CustomerId:" + orderHeader.customerId.internalValue() + ":CustomerState:" + orderHeader.stateId.internalValue().toString());
/*     */       }
/*     */       else {
/*     */         
/*  96 */         validateCustomerOrderId(orderHeader.customerId.internalValue());
/*     */ 
/*     */         
/*  99 */         orderLinesMap = new HashMap<Object, Object>();
/* 100 */         ArrayList<OrderHeader.OrderLine> updatedLines = (ArrayList)orderHeader.getOrderLines();
/* 101 */         for (int k = 0; k < updatedLines.size(); k++) {
/* 102 */           OrderHeader.OrderLine orderLine = updatedLines.get(k);
/*     */           
/* 104 */           if (orderLine != null && orderLinesMap.containsKey(orderLine.productId.internalValue()) && (
/* 105 */             (String)orderLinesMap.get(orderLine.productId.internalValue())).equals(orderLine.orderQty.getAsText())) {
/*     */             
/* 107 */             currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.DUPLICATE_ORDER_LINE) + "CustomerOrderId" + orderHeader.customerId.internalValue() + ":LineId:" + (orderLine.getOrderLineKey()).orderLineNumber);
/*     */           }
/*     */           else {
/*     */             
/* 111 */             validateOrderLine(orderLine, customer, currentResult);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 116 */       this.resultsList.add(currentResult);
/*     */     
/*     */     }
/* 119 */     catch (Exception e) {
/* 120 */       log.warn("validateOrderSegment()", e);
/*     */     } 
/* 122 */     return currentResult;
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
/*     */   public boolean validateOrderLine(OrderHeader.OrderLine orderLine, Customer customer, RetailerOrderValidationResult currentResult) {
/* 135 */     boolean valid = true;
/*     */ 
/*     */     
/*     */     try {
/* 139 */       ProductDetail productDetail = (new ProductOSCacheHelper()).findProductDetail(customer, orderLine.productId.internalValue());
/* 140 */       if (productDetail != null) {
/* 141 */         validateMetcashProductCode(productDetail.productDescription.internalValue(), orderLine.productId.internalValue(), orderLine.orderQty.internalValue(), (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */       }
/* 143 */       if (productDetail == null) {
/* 144 */         valid = false;
/* 145 */         currentResult.addLineMessageToOrderDetail(
/* 146 */             ValidationConfig.RETAILER_PRODUCT_NOT_FOUND, 
/* 147 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 148 */             orderLine.productId.internalValue(), 
/* 149 */             ValidationResult.ERROR, 
/* 150 */             orderLine.orderQty.internalValue(), 
/* 151 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 152 */         return valid;
/*     */       } 
/*     */ 
/*     */       
/* 156 */       if (!isInRange(productDetail, customer)) {
/* 157 */         valid = false;
/* 158 */         currentResult.addLineMessageToOrderDetail(
/* 159 */             ValidationConfig.RETAILER_PRODUCT_NOT_FOUND, 
/* 160 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 161 */             orderLine.productId.internalValue(), 
/* 162 */             ValidationResult.ERROR, 
/* 163 */             orderLine.orderQty.internalValue(), 
/* 164 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 165 */         return valid;
/*     */       } 
/*     */       
/* 168 */       valid = validateOrderQuantity((orderLine.getOrderLineKey()).orderLineNumber.internalValue(), orderLine.orderQty.internalValue(), orderLine.productId.internalValue(), productDetail);
/*     */     
/*     */     }
/* 171 */     catch (Exception e) {
/* 172 */       log.error("Problem validating the order line.", e);
/*     */     } 
/* 174 */     return valid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInRange(ProductDetail product, Customer customer) throws MetException {
/*     */     try {
/* 186 */       String majorGroupString = "";
/* 187 */       int majorGroupId = 0;
/* 188 */       int IDS_MAJOR_GROUP_ID_SIZE = 5;
/* 189 */       if (customer.majorGroupId.internalValue().trim().length() == IDS_MAJOR_GROUP_ID_SIZE) {
/* 190 */         majorGroupString = customer.majorGroupId.internalValue().trim().substring(2, 5);
/* 191 */         majorGroupId = Integer.parseInt(majorGroupString);
/*     */       } else {
/*     */         
/* 194 */         majorGroupId = Integer.parseInt(customer.majorGroupId.internalValue());
/*     */       } 
/*     */       
/* 197 */       return Ranging.isInRange(product.availability.getBytes(), majorGroupId);
/*     */     
/*     */     }
/* 200 */     catch (Exception e) {
/* 201 */       log.error("Error doing Product Range Check.", e);
/*     */       
/* 203 */       return false;
/*     */     } 
/*     */   }
/*     */   public boolean validateNumericFields(OrderHeader order) {
/* 207 */     boolean valid = true;
/*     */     
/* 209 */     if (!isIntegerValue(order.customerId.internalValue())) {
/* 210 */       valid = false;
/* 211 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + ":CustomerId:" + order.customerId.internalValue() + ":CustomerState:" + order.stateId.internalValue().toString());
/*     */     } 
/*     */     
/* 214 */     if (!isIntegerValue(order.stateId.internalValue())) {
/* 215 */       valid = false;
/* 216 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + ":CustomerId:" + order.customerId.internalValue() + ":CustomerState:" + order.stateId.internalValue().toString());
/*     */     } 
/* 218 */     return valid;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\RetailerOrderValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */