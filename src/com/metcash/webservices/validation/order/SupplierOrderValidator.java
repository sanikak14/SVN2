/*     */ package com.metcash.webservices.validation.order;
/*     */ 
/*     */ import com.metcash.common.filters.Ranging;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierId;
/*     */ import com.metcash.model.field.TurnInOrderType;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.OrderHeader;
/*     */ import com.metcash.model.segment.db.ProductDetail;
/*     */ import com.metcash.model.segment.db.SupplierRep;
import com.metcash.model.segment.db.SupplierRep.SupplierRepPK;
/*     */ import com.metcash.webservices.SupplierOrderHelper;
/*     */ import com.metcash.webservices.cache.OSCacheHelper;
/*     */ import com.metcash.webservices.cache.ProductOSCacheHelper;
/*     */ import com.metcash.webservices.config.O4Config;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.validation.ValidationResult;

/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
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
/*     */ public class SupplierOrderValidator
/*     */   extends OrderValidator
/*     */ {
/*  37 */   private Log log = LogFactory.getLog(SupplierOrderValidator.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierOrderValidationResult validateOrderSegment(OrderHeader orderHeader, SupplierOrderValidationResult currentResult, String authenticatedSupplierRepId) {
/*     */     try {
/*  49 */       this.currentResult = currentResult;
/*     */       log.info("***************************VALIDATEORDERSEGMEN******************************t");
				log.debug("****************OrderKey : "+orderHeader.getOrderKey().webOrderId);
/*  51 */       currentResult.setOrderHeaderResponseXml(orderHeader);
/*  52 */       currentResult.setSupplierLinesRequested(orderHeader.getOrderLines().size());
/*     */ 
/*     */       
/*  55 */       if (!validateOrderForAuthenticatedSupplier(orderHeader, authenticatedSupplierRepId)) {
/*  56 */         currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, ValidationConfig.AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH);
/*     */       }
/*     */       else {
/*     */         
/*  60 */         SupplierRep supplierRep = validateSupplierRep(orderHeader.suppRepStateId.getAsText(), orderHeader.supplierRepId.internalValue());
/*     */         
/*  62 */         if (supplierRep != null) {
/*  63 */           validateSupplierReference(orderHeader);
/*  64 */           validateNumericFields(orderHeader);
/*     */ 
/*     */           log.debug("******************VALIDATE CUSTOMER****************");
/*  67 */           Customer customer = validateCustomer(orderHeader.stateId.internalValue(), orderHeader.customerId.internalValue());
/*  68 */           if (customer == null) {
/*  69 */             currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NO_CUSTOMER_EXISTS) + " - CustomerId:" + orderHeader.customerId.internalValue() + ":CustomerState:" + orderHeader.stateId.internalValue());
/*     */           } else {
/*     */             
/*  72 */             this.log.debug("validateOrderSegment found customer...");
/*     */             log.info("*********************orderHeader.customerId :" + orderHeader.customerId.internalValue());
/*  73 */             validateCustomerOrderId(orderHeader.customerId.internalValue());
						log.info("*****************************O4Config*****************************");
/*  75 */             SupplierRepPK o4pk = new SupplierRepPK();
/*  76 */             o4pk.pillarId = O4Config.O4_PILLAR_ID;
/*  77 */             o4pk.stateId = O4Config.O4_STATE_ID;
/*  78 */             o4pk.supplierRepId = O4Config.O4_REP_ID;
/*     */             log.info("*****************************loaded O4Config*****************************");
					   log.info("O4Config.O4_PILLAR_ID "+ O4Config.O4_PILLAR_ID);
					   log.info("O4Config.O4_STATE_ID: "+ O4Config.O4_STATE_ID);
					   log.info("O4Config.O4_REP_ID "+ O4Config.O4_REP_ID);

/*  80 */             if (o4pk.equals(supplierRep.createKey()) && O4Config.O4_SUPPLIER_ID.equals(supplierRep.supplierId)) {
/*     */               log.info("*****************************equal and validateOrderLinesWithO4*****************************");
/*  84 */               validateOrderLinesWithO4(orderHeader, customer);
/*  85 */               currentResult.setO4Supplier(true);
/*     */             } else {
						log.info("*****************************Not equal and validateOrderLinesWithSupplier*****************************" + customer.stateId.internalValue());
/*  87 */               validateOrderLinesWithSupplier(orderHeader, supplierRep, customer);
/*  88 */               currentResult.setO4Supplier(false);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
				log.info("***********ORDER VALIDATED************************"+ currentResult);
/*     */       
/*  94 */       this.resultsList.add(currentResult);
/*     */     }
/*  96 */     catch (Exception e) {
/*  97 */       this.log.warn("validateOrderSegment()", e);
/*     */     } 
			log.debug("**************SupplierOrderValidator----------------------" + currentResult.getOrderDetailResponseXml().getOrderHeaderResponse().getWebOrderId());


/*  99 */     return currentResult;
/*     */   }
/*     */ 
/*     */   
/*     */   private void validateOrderLinesWithSupplier(OrderHeader orderHeader, SupplierRep supplierRep, Customer customer) {
/* 104 */     HashMap<Object, Object> orderLinesMap = null;
/*     */ 	  log.info("validateOrderLinesWithSupplier1*************************");
/*     */     
/* 107 */     ProductViewWrapper productCatalog = validateSupplierCatalog(supplierRep, customer);
/*     */     
/* 109 */     if (productCatalog != null) {
/* 110 */       this.log.debug("validateOrderLinesWithSupplier() found catalog...");
/*     */       log.info("validateOrderLinesWithSupplier2*************************");
/* 112 */       orderLinesMap = new HashMap<Object, Object>();
/* 113 */       ArrayList<OrderHeader.OrderLine> updatedLines = (ArrayList)orderHeader.getOrderLines();
/*     */       
/* 115 */       for (int k = 0; k < updatedLines.size(); k++) {
/* 116 */         OrderHeader.OrderLine orderLine = updatedLines.get(k);
/* 117 */         this.log.debug("validateOrderLinesWithSupplier() validating line..." + (orderLine.getOrderLineKey()).orderLineNumber);
/* 118 */         if (orderLine != null && orderLinesMap.containsKey(orderLine.productId.internalValue()) && (
/* 119 */           (String)orderLinesMap.get(orderLine.productId.internalValue())).equals(orderLine.orderQty.getAsText())) {
/*     */           
/* 121 */           this.currentResult.addLineMessageToOrderDetail(
/* 122 */               ValidationConfig.DUPLICATE_ORDER_LINE, 
/* 123 */               ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 124 */               orderLine.productId.internalValue(), 
/* 125 */               ValidationResult.ERROR, 
/* 126 */               orderLine.orderQty.internalValue(), 
/* 127 */               (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */         } else {
/*     */           
/* 130 */           orderLinesMap.put(orderLine.productId.internalValue(), orderLine.orderQty.getAsText());
/* 131 */           validateOrderLine(orderLine, supplierRep, customer, productCatalog);
/*     */         } 
/*     */       } 
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
/*     */   private void validateOrderLinesWithO4(OrderHeader orderHeader, Customer customer) {
/* 146 */     HashMap<Object, Object> orderLinesMap = null;
/*     */ 
/*     */ 
/*     */     this.log.debug("*************************validateOrderLinesWithO4*************************");
/* 150 */     if (!orderHeader.turnInOrderType.equals(TurnInOrderType.TURNIN_ORDER)) {
/* 151 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, ValidationConfig.REP_NOT_ALLOW_DEALS);
/*     */     } else {
/*     */       
/* 154 */       orderLinesMap = new HashMap<Object, Object>();
/* 155 */       ArrayList<OrderHeader.OrderLine> updatedLines = (ArrayList)orderHeader.getOrderLines();
/*     */       
/* 157 */       for (int k = 0; k < updatedLines.size(); k++) {
/* 158 */         OrderHeader.OrderLine orderLine = updatedLines.get(k);
/* 159 */         this.log.debug("validateOrderLinesWithO4() validating line..." + (orderLine.getOrderLineKey()).orderLineNumber);
/* 160 */         if (orderLine != null && orderLinesMap.containsKey(orderLine.productId.internalValue()) && (
/* 161 */           (String)orderLinesMap.get(orderLine.productId.internalValue())).equals(orderLine.orderQty.getAsText())) {
/*     */           
/* 163 */           this.currentResult.addLineMessageToOrderDetail(
/* 164 */               ValidationConfig.DUPLICATE_ORDER_LINE, 
/* 165 */               ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 166 */               orderLine.productId.internalValue(), 
/* 167 */               ValidationResult.ERROR, 
/* 168 */               orderLine.orderQty.internalValue(), 
/* 169 */               (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */         } else {
/*     */           
/* 172 */           orderLinesMap.put(orderLine.productId.internalValue(), orderLine.orderQty.getAsText());
/* 173 */           validateOrderLine(orderLine, customer);
/*     */         } 
/*     */       } 
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
/*     */   
/*     */   public boolean validateOrderLine(OrderHeader.OrderLine orderLine, SupplierRep supplierRep, Customer customer, ProductViewWrapper productCatalog) {
/* 192 */     boolean valid = true;
/*     */     
/*     */     try {
/* 195 */       String productCode = null;
/* 196 */       if (orderLine.productCodeType.internalValue().equals("M")) {
/* 197 */         productCode = orderLine.productId.internalValue();
/* 198 */       } else if (orderLine.productCodeType.internalValue().equals("V")) {
/* 199 */         productCode = SupplierOrderHelper.findCrossReferencedProduct(supplierRep, customer, orderLine.productId.internalValue());
/* 200 */         if (productCode == null || productCode.equals("")) {
/* 201 */           this.currentResult.addLineMessageToOrderDetail(
/* 202 */               String.valueOf(ValidationConfig.REP_PRODUCT_NOT_FOUND) + "No Metcash ProductCode found for:" + orderLine.productId.internalValue(), 
/* 203 */               ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 204 */               orderLine.productId.internalValue(), 
/* 205 */               ValidationResult.ERROR, 
/* 206 */               orderLine.orderQty.internalValue(), 
/* 207 */               (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 208 */           return false;
/*     */         } 
/*     */       } else {
/* 211 */         this.currentResult.addLineMessageToOrderDetail(
/* 212 */             String.valueOf(ValidationConfig.REP_PRODUCT_NOT_FOUND) + "Unsupported ProductCodeType.", 
/* 213 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 214 */             orderLine.productId.internalValue(), 
/* 215 */             ValidationResult.ERROR, 
/* 216 */             orderLine.orderQty.internalValue(), 
/* 217 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 218 */         return false;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 224 */       ProductView productView = null;
/*     */       try {
/* 226 */         productView = productCatalog.getProduct(productCode);
/*     */       }
/* 228 */       catch (Exception e) {
/* 229 */         this.log.error("Problem finding a product view for this order line - ProductId:" + orderLine.productId, e);
/* 230 */         valid = false;
/* 231 */         this.currentResult.addLineMessageToOrderDetail(
/* 232 */             ValidationConfig.REP_PRODUCT_NOT_FOUND, 
/* 233 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 234 */             orderLine.productId.internalValue(), 
/* 235 */             ValidationResult.ERROR, 
/* 236 */             orderLine.orderQty.internalValue(), 
/* 237 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 238 */         return false;
/*     */       } 
/*     */       
/* 241 */       if (productView != null) {
/*     */         
/* 243 */         this.log.debug("validateOrderLine about to validate the supplier deal..." + (orderLine.getOrderLineKey()).orderLineNumber);
/* 244 */         valid = validateSupplierDeal(productView, customer, orderLine);
/* 245 */         ProductDetail productDetail = productView.getProductDetail();
/*     */ 
/*     */         
/* 248 */         if (productDetail == null) {
/* 249 */           valid = false;
/* 250 */           this.currentResult.addLineMessageToOrderDetail(
/* 251 */               ValidationConfig.REP_PRODUCT_NOT_FOUND, 
/* 252 */               productDetail.productDescription.internalValue(), 
/* 253 */               orderLine.productId.internalValue(), 
/* 254 */               ValidationResult.ERROR, 
/* 255 */               orderLine.orderQty.internalValue(), 
/* 256 */               (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */           
/* 258 */           this.log.debug("validateOrderLine found NULL product ");
/*     */         } else {
/*     */           
/* 261 */           this.log.debug("validateOrderLine found product " + (productDetail.getProductKey()).productId);
/* 262 */           if (orderLine.turnInOrderType.internalValue().equalsIgnoreCase("o") || orderLine.turnInOrderType.internalValue().equalsIgnoreCase("t"))
/*     */           {
/* 264 */             if (!isInRange(productDetail, customer)) {
/* 265 */               valid = false;
/* 266 */               this.currentResult.addLineMessageToOrderDetail(
/* 267 */                   ValidationConfig.REP_PRODUCT_NOT_FOUND, 
/* 268 */                   productDetail.productDescription.internalValue(), 
/* 269 */                   orderLine.productId.internalValue(), 
/* 270 */                   ValidationResult.ERROR, 
/* 271 */                   orderLine.orderQty.internalValue(), 
/* 272 */                   (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */             } 
/*     */           }
/*     */           
/* 276 */           this.log.debug("validateOrderLine about to validate order Line QTY ");
/* 277 */           valid = validateOrderQuantity((orderLine.getOrderLineKey()).orderLineNumber.internalValue(), orderLine.orderQty.internalValue(), orderLine.productId.internalValue(), productDetail);
/*     */         }
/*     */       
/*     */       } 
/* 281 */     } catch (Exception e) {
/* 282 */       this.log.error("validateOrderLine Problem validating the order line.", e);
/*     */       
/* 284 */       valid = false;
/* 285 */       this.currentResult.addLineMessageToOrderDetail(
/* 286 */           ValidationConfig.UNEXPECTED_ERROR_PROCESSING_ORDER_LINE, 
/* 287 */           ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 288 */           orderLine.productId.internalValue(), 
/* 289 */           ValidationResult.ERROR, 
/* 290 */           orderLine.orderQty.internalValue(), (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */     } 
/* 292 */     return valid;
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
/*     */   protected boolean validateOrderLine(OrderHeader.OrderLine orderLine, Customer customer) {
/* 306 */     boolean valid = true;
/*     */ 
/*     */     
/*     */     try {
/* 310 */       ProductDetail productDetail = (new ProductOSCacheHelper()).findProductDetail(customer, orderLine.productId.internalValue());
/* 311 */       if (productDetail != null) {
/* 312 */         validateMetcashProductCode(productDetail.productDescription.internalValue(), orderLine.productId.internalValue(), orderLine.orderQty.internalValue(), (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */       }
/* 314 */       if (productDetail == null) {
/* 315 */         valid = false;
/* 316 */         this.currentResult.addLineMessageToOrderDetail(
/* 317 */             ValidationConfig.RETAILER_PRODUCT_NOT_FOUND, 
/* 318 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 319 */             orderLine.productId.internalValue(), 
/* 320 */             ValidationResult.ERROR, 
/* 321 */             orderLine.orderQty.internalValue(), 
/* 322 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 323 */         return valid;
/*     */       } 
/*     */ 
/*     */       
/* 327 */       if (!isInRange(productDetail, customer)) {
/* 328 */         valid = false;
/* 329 */         this.currentResult.addLineMessageToOrderDetail(
/* 330 */             ValidationConfig.RETAILER_PRODUCT_NOT_FOUND, 
/* 331 */             ValidationConfig.PRODUCT_DETAIL_UNAVAILABLE, 
/* 332 */             orderLine.productId.internalValue(), 
/* 333 */             ValidationResult.ERROR, 
/* 334 */             orderLine.orderQty.internalValue(), 
/* 335 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/* 336 */         return valid;
/*     */       } 
/*     */       
/* 339 */       valid = validateOrderQuantity((orderLine.getOrderLineKey()).orderLineNumber.internalValue(), orderLine.orderQty.internalValue(), orderLine.productId.internalValue(), productDetail);
/*     */     
/*     */     }
/* 342 */     catch (Exception e) {
/* 343 */       this.log.error("validateOrderLine Problem validating the order line.", e);
/*     */     } 
/* 345 */     return valid;
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
/*     */   public boolean validateSupplierDeal(ProductView productView, Customer customer, OrderHeader.OrderLine orderLine) {
/* 358 */     if (orderLine.turnInOrderType.internalValue().equalsIgnoreCase("B") || orderLine.turnInOrderType.internalValue().equalsIgnoreCase("T")) {
/*     */       
/* 360 */       if (orderLine.dealAmount.internalValue() > 0) {
/* 361 */         this.currentResult.addLineMessageToOrderDetail(
/* 362 */             String.valueOf(ValidationConfig.DEAL_AMT_OVERRIDE_ONLY) + "DealAmt:" + orderLine.dealAmount.internalValue(), 
/* 363 */             (productView.getProductDetail()).productDescription.internalValue(), 
/* 364 */             orderLine.productId.internalValue(), 
/* 365 */             ValidationResult.ERROR, 
/* 366 */             orderLine.orderQty.internalValue(), 
/* 367 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */         
/* 369 */         this.log.debug("validateSupplierDeal,  not a PO and we have received a deal amount! ");
/*     */       } 
/*     */     } else {
/*     */       
/* 373 */       this.log.debug("validateSupplierDeal validating PO, order line ..." + (orderLine.getOrderLineKey()).orderLineNumber);
/* 374 */       return validatePriceOverride(productView, customer, orderLine);
/*     */     } 
/* 376 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean validatePriceOverride(ProductView productView, Customer customer, OrderHeader.OrderLine orderLine) {
/* 387 */     if (orderLine.turnInOrderType.internalValue().equalsIgnoreCase("o")) {
/* 388 */       this.log.debug("validatePriceOverride - 1 ");
/* 389 */       String productId = orderLine.productId.internalValue();
/* 390 */       int dealAmount = orderLine.dealAmount.internalValue();
/*     */       
/* 392 */       if (dealAmount <= 0) {
/* 393 */         this.log.debug("validatePriceOverride - Deal <= 0 ");
/* 394 */         this.currentResult.addLineMessageToOrderDetail(
/* 395 */             String.valueOf(ValidationConfig.DEAL_AMT_EQUALS_ZERO) + "DealAmount:" + dealAmount + ":orderType:" + orderLine.turnInOrderType.internalValue(), 
/* 396 */             (productView.getProductDetail()).productDescription.internalValue(), 
/* 397 */             productId, 
/* 398 */             ValidationResult.ERROR, 
/* 399 */             orderLine.orderQty.internalValue(), 
/* 400 */             (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */       } else {
/*     */         
/* 403 */         this.log.debug("validatePriceOverride - Deal >=0 ");
/*     */         
/* 405 */         if (productView.getBaseCostPriceExGST() != null && dealAmount > productView.getBaseCostPriceExGST().internalValue()) {
/* 406 */           this.log.debug("validatePriceOverride - deal greater than costExGST ");
/* 407 */           this.currentResult.addLineMessageToOrderDetail(
/* 408 */               String.valueOf(ValidationConfig.DEAL_AMT_EXCEEDS_BASE_WSPR) + "DealAmount:" + dealAmount + ":BaseWholesalePrice:" + productView.getBaseCostPriceExGST(), 
/* 409 */               (productView.getProductDetail()).productDescription.internalValue(), 
/* 410 */               productId, 
/* 411 */               ValidationResult.ERROR, 
/* 412 */               orderLine.orderQty.internalValue(), 
/* 413 */               (orderLine.getOrderLineKey()).orderLineNumber.internalValue());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 466 */     this.log.debug("validatePriceOverride - returning true as its not an OVERRIDE.. ");
/* 467 */     return true;
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
/*     */   public boolean isInRange(ProductDetail product, Customer customer) throws MetException {
/*     */     try {
/* 482 */       String majorGroupString = "";
/* 483 */       int majorGroupId = 0;
/* 484 */       int IDS_MAJOR_GROUP_ID_SIZE = 5;
/* 485 */       if (customer.majorGroupId.internalValue().trim().length() == IDS_MAJOR_GROUP_ID_SIZE) {
/* 486 */         majorGroupString = customer.majorGroupId.internalValue().trim().substring(2, 5);
/* 487 */         majorGroupId = Integer.parseInt(majorGroupString);
/*     */       } else {
/*     */         
/* 490 */         majorGroupId = Integer.parseInt(customer.majorGroupId.internalValue());
/*     */       } 
/*     */       
/* 493 */       return Ranging.isInRange(product.availability.getBytes(), majorGroupId);
/*     */     
/*     */     }
/* 496 */     catch (Exception e) {
/* 497 */       this.log.error("Error doing Product Range Check.", e);
/*     */       
/* 499 */       return false;
/*     */     } 
/*     */   }
/*     */   public boolean validateNumericFields(OrderHeader orderHeader) {
/* 503 */     boolean valid = true;
/*     */     
/* 505 */     if (!isIntegerValue(orderHeader.supplierRepId.internalValue())) {
/* 506 */       valid = false;
/* 507 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + " - SupplierRepId:" + orderHeader.supplierRepId.internalValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 518 */     if (!isIntegerValue(orderHeader.suppRepStateId.internalValue())) {
/* 519 */       valid = false;
/* 520 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + " - SupplierStateId:" + orderHeader.suppRepStateId.internalValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 526 */     if (!isIntegerValue(orderHeader.customerId.internalValue())) {
/* 527 */       valid = false;
/* 528 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + " - CustomerId:" + orderHeader.customerId.internalValue());
/*     */     } 
/*     */ 
/*     */     
/* 532 */     if (!isIntegerValue(orderHeader.stateId.internalValue())) {
/* 533 */       valid = false;
/* 534 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NON_NUMERIC_VALUE) + " - CustomerStateId:" + orderHeader.stateId.internalValue());
/*     */     } 
/* 536 */     return valid;
/*     */   }
/*     */   
/*     */   public boolean validateSupplierReference(OrderHeader orderHeader) {
/* 540 */     boolean valid = true;
/*     */     
/* 542 */     if (!validateReferenceId(orderHeader.supplierRefCode.internalValue())) {
/* 543 */       valid = false;
/* 544 */       this.log.debug("checking suprepRefId found invalid reference id.");
/* 545 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, ValidationConfig.INVALID_CHARACTERS);
/*     */     } 
/* 547 */     return valid;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProductViewWrapper validateSupplierCatalog(SupplierRep supplierRep, Customer customer) {
/* 552 */     ProductViewWrapper productCatalog = (new SupplierOrderHelper()).getProductCatalogues(supplierRep, customer);
/*     */     
/* 554 */     if (productCatalog == null) {
/* 555 */       this.currentResult.addOrderHeaderResponseMessage(ValidationResult.ERROR, String.valueOf(ValidationConfig.NO_REP_PRODUCT_CATALOGUE) + " - SupplierRepId:" + (supplierRep.getSupplierRepKey()).supplierRepId.internalValue());
/*     */     }
/* 557 */     return productCatalog;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean validateOrderForAuthenticatedSupplier(OrderHeader orderHeader, String authenticatedSuppRepId) {
	log.info("********************************VALIDATEORDERFORAUTHENTICATEDSUPPLIER********************" + authenticatedSuppRepId);
/* 567 */     if (authenticatedSuppRepId != null && !authenticatedSuppRepId.equals("")) {
/* 568 */       String supplierFromOrder = orderHeader.supplierRepId.internalValue().substring(0, 5);
/* 569 */       authenticatedSuppRepId = authenticatedSuppRepId.substring(0, 5);
/*     */       
/* 571 */       List linkedSuppliers = OSCacheHelper.getChildSuppliersFromCache(orderHeader.pillarId, new StateId(orderHeader.suppRepStateId.getAsText()), 
/* 572 */           new SupplierId(authenticatedSuppRepId));
/*     */       log.info("**supplierFromOrder and authenticatedSuppRepId: "+ supplierFromOrder + "and" +authenticatedSuppRepId);
/* 574 */       if (supplierFromOrder.equals(authenticatedSuppRepId)) {
/* 575 */         return true;
/*     */       }
/* 577 */       if (linkedSuppliers != null) {
/*     */         
/* 579 */         for (int i = 0; i < linkedSuppliers.size(); i++) {
/* 580 */           if (supplierFromOrder.equals(linkedSuppliers.get(i))) {
/* 581 */             return true;
/*     */           }
/*     */         } 
/* 584 */         return false;
/*     */       } 
/*     */       
/* 587 */       return false;
/*     */     } 
/*     */     
/* 590 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\SupplierOrderValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */