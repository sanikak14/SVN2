/*     */ package com.metcash.webservices;
/*     */ /*     */ import java.sql.Connection;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.ValidationException;

import com.metcash.common.services.SupplierRepProductService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.common.services.SupplierService;
/*     */ import com.metcash.config.Config;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.framework.dao.firestorm.FirestormDAOFactory;
/*     */ import com.metcash.model.dao.dao.OrderHeaderDao;
/*     */ import com.metcash.model.dao.dao.OrderLineDao;
/*     */ import com.metcash.model.dao.dto.OrderHeader;
/*     */ import com.metcash.model.dao.dto.OrderHeaderPk;
/*     */ import com.metcash.model.dao.exceptions.OrderLineDaoException;
import com.metcash.model.dao.jdbc.ResourceManager;
/*     */ import com.metcash.model.dao.toa.TOAFactory;
/*     */ import com.metcash.model.field.OrderLineNumber;
/*     */ import com.metcash.model.field.OrderLineStatus;
/*     */ import com.metcash.model.field.OrderSource;
import com.metcash.model.field.OrderStage;
/*     */ import com.metcash.model.field.OrderStatus;
/*     */ import com.metcash.model.field.OrderType;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.ProductId;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierId;
import com.metcash.model.field.SupplierRepId;
import com.metcash.model.field.TurnInOrderType;
/*     */ import com.metcash.model.field.WebOrderId;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Allowance;
/*     */ import com.metcash.model.segment.db.Customer;
import com.metcash.model.segment.db.ProductDetail;
/*     */ import com.metcash.model.segment.db.PromotionalProduct;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.util.EncryptionUtility;
/*     */ import com.metcash.util.log.Trace;
/*     */ import com.metcash.webservices.cache.OSCacheHelper;
/*     */ import com.metcash.webservices.cache.ProductOSCacheHelper;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.validation.SupplierOrderResponse;
/*     */ import com.metcash.webservices.validation.order.SupplierOrderValidationResult;
/*     */ import com.metcash.webservices.validation.order.SupplierOrderValidator;
/*     */ 
/*     */ 
/*     */ public class SupplierOrderHelper {
/*  49 */   private String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SupplierOrderResponse xmlns=\"\"><OrderDetail><OrderHeaderResponse><WebOrderId>0</WebOrderId><SupplierRepCode></SupplierRepCode><SupplierRepStateCode></SupplierRepStateCode><SupplierReference></SupplierReference><OrderType></OrderType><CustomerId></CustomerId><CustomerStateCode></CustomerStateCode><WebCreatedTime/><ItemsAccepted></ItemsAccepted><ItemsRejected></ItemsRejected><OrderHeaderMessages><HeaderMessageData></HeaderMessageData><HeaderMessageSeverity>ERROR</HeaderMessageSeverity></OrderHeaderMessages></OrderHeaderResponse></OrderDetail></SupplierOrderResponse>";
/*     */  
/*  51 */   private FirestormDAOFactory daoFactory = new FirestormDAOFactory();
/*  52 */   private TOAFactory toaFactory = new TOAFactory();
/*     */   
/*     */   private OrderHeaderDao transOrderHeaderDao;
/*     */   
/*     */   private OrderLineDao transOrderLineDao;
/*     */   
/*     */   private SupplierOrderResponse xmlResponse;
/*     */   
/*     */   private SupplierOrderValidationAdapter supplierValidationAdapter;
/*     */   private Trace trace;
/*  62 */   private static Log log = LogFactory.getLog(SupplierOrderHelper.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierOrderHelper() {
/*  68 */     this.supplierValidationAdapter = new SupplierOrderValidationAdapter();
/*  69 */     this.xmlResponse = new SupplierOrderResponse();
/*  70 */     this.trace = new Trace(getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String submitSupplierOrder(String XMLOrder, String authenticatedSupplierRepId,String authenticatedSupplierRepStateId) throws ValidationException, MarshalException, Exception {
/*     */     try {
/*  81 */       com.metcash.model.segment.db.OrderHeader[] orders = (new SupplierOrderXmlAdapter()).parseOrderXML(XMLOrder);
/*  82 */       trace("SupplierOrderHelper - submitSupplierOrder: Inbound xml: " + XMLOrder);
/*     */ 		log.info("********************PROCESSING ORDERSSS********************");
/*     */       
/*  85 */       processOrders(orders, authenticatedSupplierRepId,authenticatedSupplierRepStateId);
/*     */     }
/*  87 */     catch (ValidationException ve) {
/*  88 */       throw ve;
/*     */     }
/*  90 */     catch (MarshalException me) {
/*  91 */       throw me;
/*     */     }
/*  93 */     catch (Exception e) {
/*  94 */       throw e;
/*     */     } 
/*     */     
/*     */     try {
/*  98 */       log.info("submitSupplierOrder():Response:" + this.supplierValidationAdapter.getSupplierOrderResponseXml(this.xmlResponse));
/*  99 */       trace("SupplierOrderHelper - submitSupplierOrder():Response:" + this.supplierValidationAdapter.getSupplierOrderResponseXml(this.xmlResponse));
/* 100 */       return this.supplierValidationAdapter.getSupplierOrderResponseXml(this.xmlResponse);
/* 101 */     } catch (Exception e) {
/* 102 */       log.error("Problem returning an XML Response to client:", e);
/*     */ 
/*     */       
/* 105 */       return this.DEFAULT_ERROR_RESPONSE;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List processOrders(com.metcash.model.segment.db.OrderHeader[] orders, String authenticatedSupplierRepId,String authenticatedSupplierRepStateId) {
/* 115 */     ArrayList<SupplierOrderValidationResult> validationResults = new ArrayList();
/* 116 */     ArrayList<WebOrderId> orderIdList = new ArrayList();
/* 117 */     int processed = 0;
/*     */ 
/*     */     
/*     */     try {
/* 121 */       if (orders != null && orders.length > 0) {
/* 122 */         log.info("Total orders inside service is " + orders.length);
/* 123 */         SupplierOrderValidationResult currentValidationResult = null;
/*     */         
/* 125 */         SupplierOrderValidator supplierOrderValidator = new SupplierOrderValidator();
/* 126 */         for (int i = 0; i < orders.length; i++)
/*     */         {
/*     */           log.info("********************PROCESSING ORDERSSS in for ********************");
/* 129 */           currentValidationResult = new SupplierOrderValidationResult();
/*     */           log.debug("*******************Only check for customer state : "+ orders[i].stateId.internalValue() + " " + " authenticatedSupplierRepStateId: "+ authenticatedSupplierRepStateId);
					//Sanika- To block NZ ALMiOrder					
					if(orders[i].stateId.internalValue().equals("9")){
						log.info("**********************STATE IS 9********************");
						currentValidationResult.addOrderHeaderResponseMessage(SupplierOrderValidationResult.ERROR, "We are unable to process order at the moment");
						currentValidationResult.setOrderHeaderResponseXml(orders[i]);
					}else{
						log.info("**********************STATE IS NOT 9*************************");
	/* 131 */           if (orders != null) {
	/*     */             try {
	/* 133 */               WebOrderId orderId = null;
	/*     */               log.info("********************PROCESSING ORDERSSS in if********************");
	/* 135 */               currentValidationResult = supplierOrderValidator.validateOrderSegment(orders[i], currentValidationResult, authenticatedSupplierRepId);
							
							log.info("********************PROCESSING ORDERSSS Validate order********************::::"+ currentValidationResult);
	/* 136 */               if (currentValidationResult != null && !currentValidationResult.orderHeaderHasErrors() && !currentValidationResult.allLinesInError(orders[i])) {
	/*     */                 log.info("**********************************CALLING DATABASEINSERTORDR*****************************");
	/* 138 */                 orderId = databaseInsertOrder(orders[i], currentValidationResult);
								log.info("****************************ORDER ID********************************"+ orderId);
	/*     */               } else {
	/*     */                 log.info("***************************VALIDATIONRESULT IS FALSE**********************");
	/* 141 */                 currentValidationResult.addOrderHeaderResponseMessage(SupplierOrderValidationResult.ERROR, 
	/* 142 */                     "Errors Detected, this order could not be processed. Please review the details you have submitted. For further assistance, please contact your ALM account administrator.");
	/* 143 */                 	currentValidationResult.setOrderHeaderResponseXml(orders[i]);
	/*     */               } 
	/* 145 */               processed++;
	/*     */ 
	/*     */               
	/* 148 */               orderIdList.add(orderId);
							log.info("********orderIdList*******:" + orderIdList.size());
							log.debug("***********************OrderIdList*********************");
							for(int j= 0;j<orderIdList.size();j++){
								log.debug("Data------------------"+ orderIdList.get(i) );
							}
							log.info("********currentValidationResult*************"+ currentValidationResult);
	/*     */             }
	/* 150 */             catch (Exception se) {
	/* 151 */               log.error("processOrders()", se);
	/* 152 */               throw new ServletException(se);
	/*     */             } 
	/*     */           }
/*     */           }
					log.info("****************************************************************");
					log.info(currentValidationResult.getOrderDetailResponseXml().toString());
					log.info("****************************************************************");
/* 156 */           validationResults.add(currentValidationResult);
/*     */ 
/*     */           log.info("****************************VALIDATIONRESULT*******************************");
/* 159 */           this.xmlResponse.addOrderDetail(currentValidationResult.getOrderDetailResponseXml());
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 168 */     catch (Exception e) {
/* 169 */       log.error("Error in processing Supplier WebService Orders.", e);
/*     */     } 
/* 171 */     return validationResults;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public WebOrderId databaseInsertOrder(com.metcash.model.segment.db.OrderHeader updatedOrder, SupplierOrderValidationResult currentValidationResult) throws MetException {
/* 177 */     Connection transConn = null;
/* 178 */     log.info("inside databaseInsertOrder " + updatedOrder);
/* 179 */     WebOrderId orderId = new WebOrderId();
/*     */ 
/*     */ 	  log.info("****************************updatedOrder state ID********************* : "+ updatedOrder.stateId);
/*     */ 
/*     */ 	  log.info("IN DATABASEINSERTORDER*****************************"+orderId);
/*     */ 
/*     */ 
/*     */     
/* 187 */     try { 
				if(updatedOrder.stateId.equals("9"))
					return new WebOrderId(0);
				log.info("************************In TRY*******************************");
				transConn = ResourceManager.getCursorConnection();
/* 188 */       transConn.setAutoCommit(false);
/*     */       
/* 190 */       this.transOrderHeaderDao = (OrderHeaderDao)this.daoFactory.getFirestormDAO(OrderHeaderDao.class, transConn);
/* 191 */       this.transOrderLineDao = (OrderLineDao)this.daoFactory.getFirestormDAO(OrderLineDao.class, transConn);
/*     */       
/* 193 */       ArrayList<com.metcash.model.segment.db.OrderHeader.OrderLine> updatedLines = (ArrayList)updatedOrder.getOrderLines();
/* 194 */       int numLineItems = updatedLines.size();
/*     */       log.info("*******************************UPDATED LINES***********************"+ numLineItems);
/* 196 */       if (numLineItems > 0) {
/* 197 */         com.metcash.model.segment.db.OrderHeader.OrderLine orderLine = (com.metcash.model.segment.db.OrderHeader.OrderLine) updatedLines.get(0);
/* 198 */         orderLine.pillarId = new PillarId("ALM");
/* 199 */         updatedOrder.orderSource = OrderSource.WSE;
					log.info("orderLine : "+ orderLine.mfOrderId);
/*     */       } else {
/*     */         
/* 202 */         log.info("Order contains no order lines: Could not update order: " + updatedOrder);
/* 203 */         return new WebOrderId(0);
/*     */       } 
/*     */       log.info("*********************SET ORDER STAGE*******************************");
/* 206 */       if (updatedOrder.createdDate == null) {
/* 207 */         updatedOrder.createdDate.internalValue(new Date());
/*     */       }
/* 209 */       updatedOrder.stage = OrderStage.RECEIVED;
/* 210 */       updatedOrder.status = OrderStatus.PENDING;
/* 211 */       updatedOrder.dateSent.internalValue(null);
/* 212 */       updatedOrder.processedDate.internalValue(null);
				log.info("****************************Config Class*****************************");
				log.info("********************Config: "+ Config.CONFIG_DEFAULT_ROOT);
				log.info("**************Config class value: "+ Config.IDS_SWITCH);
/* 213 */       if (Config.IDS_SWITCH.equals("on") && Config.IDS_STATES_MAP.containsKey(updatedOrder.stateId.internalValue())) {
/* 214 */         updatedOrder.orderType = OrderType.WEB_ORDER;
/*     */       } else {
/*     */         
/* 217 */         updatedOrder.orderType = OrderType.LIQUOR;
/*     */       } 
/* 219 */       updatedOrder.turnInSource.setAsText("TIOWS");

/*     */       log.info("****************************Config Class2*****************************");
/* 221 */       OrderHeaderPk orderDtoPK = this.transOrderHeaderDao.insert(this.toaFactory.getOrderHeaderDTO(updatedOrder));
/*     */       log.info("***************orderDtoPK************************:"+ orderDtoPK);
/* 223 */       OrderHeader orderDto = this.transOrderHeaderDao.findByPrimaryKey(orderDtoPK);
/* 224 */       updatedOrder = this.toaFactory.getOrderHeaderSegment(orderDto);
/* 225 */       orderId = (updatedOrder.getOrderKey()).webOrderId;
/*     */       log.info("*****************updatedOrder.getOrderKey()).webOrderId*******************"+ (updatedOrder.getOrderKey()).webOrderId);
/* 227 */       updatedOrder.trnParentId.internalValue((updatedOrder.getOrderKey()).webOrderId.internalValue());

/* 228 */       this.transOrderHeaderDao.update(orderDtoPK, this.toaFactory.getOrderHeaderDTO(updatedOrder));
/*     */       log.info("****************************Config Class3*****************************: orderId: "+ orderId);
/* 230 */       createOrderLines(updatedOrder, updatedLines, currentValidationResult);
/*     */ 
/*     */ 
/*     */       
/* 234 */       transConn.commit();
/*     */ 		log.info("****************************Config Class4*****************************");      
/*     */        }
/*     */     
/* 238 */     catch (Exception e)
/* 239 */     { log.warn("databaseInsertOrder()", e);
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 244 */         transConn.rollback();
/*     */       }
/* 246 */       catch (SQLException se) {
/*     */         
/* 248 */         log.info("Failed to close transactional database connection for createOrder() method!");
/*     */       
/*     */       }
/*     */       
/*     */        }
/*     */     
/*     */     finally
/*     */     
/* 256 */     { if (transConn != null)
/*     */         
/* 258 */         try { transConn.close(); }
/*     */         
/* 260 */         catch (SQLException se)
/* 261 */         { log.info("Failed to close transactional database connection for createOrder() method!"); }   }  if (transConn != null) try { transConn.close(); } catch (SQLException se) { log.info("Failed to close transactional database connection for createOrder() method!"); }
/*     */     
/*     */ 		log.info("************************************ORDER ID: *********************************"+ orderId);
/*     */     
/* 265 */     return orderId;
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
/*     */   public SupplierOrderValidationResult createOrderLines(com.metcash.model.segment.db.OrderHeader updatedOrder, List<com.metcash.model.segment.db.OrderHeader.OrderLine> updatedLines, SupplierOrderValidationResult currentValidationResult) throws OrderLineDaoException {
/* 279 */      HashMap<Object, Object> orderLinesMap = orderLinesMap = new HashMap<Object, Object>();//Used for duplicate tracking
/* 280 */     int numLineItems = updatedLines.size();
			  log.debug("*************************numLineItems -----"+ numLineItems);
/* 281 */     int validLines = 0;
/* 282 */     for (int i = 0; i < numLineItems; i++) {
/* 283 */        com.metcash.model.segment.db.OrderHeader.OrderLine updatedOrderLine =  (com.metcash.model.segment.db.OrderHeader.OrderLine)updatedLines.get(i);
/* 284 */       OrderLineNumber lineNumber = (updatedOrderLine.getOrderLineKey()).orderLineNumber;
/*     */       
/* 286 */       if (!orderLinesMap.containsKey(updatedOrderLine.productId.internalValue()) || 
/* 287 */         !((String)orderLinesMap.get(updatedOrderLine.productId.internalValue())).equals(updatedOrderLine.orderQty.getAsText())) {
/*     */ 
/*     */         log.debug("********************************createOrderLines*************************");
/* 290 */         orderLinesMap.put(updatedOrderLine.productId.internalValue(), updatedOrderLine.orderQty.getAsText());
/*     */         
/* 292 */         if (!currentValidationResult.lineHasErrors(lineNumber.internalValue())) {
/*     */           log.debug("*************************updatedOrder.getOrderKey()).webOrderId*************************"+(updatedOrder.getOrderKey()).webOrderId);
/* 294 */           validLines++;
/* 295 */            com.metcash.model.segment.db.OrderHeader.OrderLine orderLine = 
/* 296 */             updatedOrder.newOrderLine(new OrderLineNumber(validLines));
/* 297 */           orderLine.status = OrderLineStatus.UNDEFINED;
/* 298 */           (orderLine.getOrderLineKey()).webOrderId = (updatedOrder.getOrderKey()).webOrderId;
/* 299 */           orderLine.mfOrderId = updatedOrderLine.mfOrderId;
/* 300 */           orderLine.orderQty = updatedOrderLine.orderQty;
/* 301 */           String crossRefProductId = findCrossReferencedProduct(updatedOrder.pillarId, updatedOrder.stateId, new SupplierId(updatedOrder.supplierRepId.internalValue().substring(0, 5)), updatedOrderLine.productId);
/* 302 */           log.debug("****************crossRefProductId---------------"+ crossRefProductId);
					if (crossRefProductId != null && !crossRefProductId.equals("")) {
/* 303 */             orderLine.productId.setAsText(crossRefProductId);
/*     */           } else {
/* 305 */             orderLine.productId = updatedOrderLine.productId;
/*     */           } 
/* 307 */           orderLine.pillarId = updatedOrderLine.pillarId;
/* 308 */           orderLine.backOrderFlag = updatedOrderLine.backOrderFlag;
/*     */           
/* 310 */           if (!currentValidationResult.isO4Supplier()) {
/*     */             
/* 312 */             orderLine = setTurnInFields(updatedOrder, orderLine, updatedOrderLine);
/*     */           } else {
/*     */             log.debug("########################Is not O4 supplier###############");
/* 315 */             orderLine.turnInOrderType = TurnInOrderType.TURNIN_ORDER;
/* 316 */             orderLine.dealAmount.internalValue(0);
/* 317 */             orderLine.ongoingDealAmount.internalValue(0);
/*     */           } 
/*     */           
/* 320 */           log.info("inside createOrderLines " + orderLine);
/* 320 */           log.info("inside createOrderLines:: " + orderLine.getOrderLineKey().webOrderId);
/*     */           
/* 322 */           this.transOrderLineDao.insert(this.toaFactory.getOrderLineDTO(orderLine));
/*     */         } else {
/*     */           
/* 325 */           log.info("Skipping order line: failed validation..." + lineNumber.internalValue());
/*     */         } 
/*     */       } 
/*     */     } 
				log.debug("#########################currentValidationResult$$$$$$$$$$$$$$$$$$$$$$$$$$"+ currentValidationResult.getOrderDetailResponseXml().getOrderHeaderResponse().getWebOrderId());
/* 329 */     return currentValidationResult;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */    public com.metcash.model.segment.db.OrderHeader.OrderLine setTurnInFields(com.metcash.model.segment.db.OrderHeader updatedOrder,
	      com.metcash.model.segment.db.OrderHeader.OrderLine orderLine, com.metcash.model.segment.db.OrderHeader.OrderLine updatedOrderLine) {
/* 340 */     orderLine.turnInOrderType = updatedOrderLine.turnInOrderType;
/*     */ 
/*     */     
/* 343 */     SupplierRep supplierRep = OSCacheHelper.getSupplierRepFromCache(updatedOrder.pillarId, new StateId(updatedOrder.suppRepStateId.getAsText()), updatedOrder.supplierRepId);
/* 344 */     Customer customer = OSCacheHelper.getCustomerFromCache(updatedOrder.pillarId, updatedOrder.stateId, updatedOrder.customerId);
/* 345 */     ProductViewWrapper wrapper = getProductCatalogues(supplierRep, customer);
/* 346 */     ProductView productView = wrapper.getProduct(orderLine.productId.internalValue());
/* 347 */     ProductDetail productDetail = productView.getProductDetail();
/*     */     
/* 349 */     if (updatedOrderLine.turnInOrderType.internalValue().equals("O") && updatedOrderLine.dealAmount.internalValue() > 0) {
/*     */       
/* 351 */       int dealAmount = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 357 */       if (productView.getUniversalDeal() != null && 
/* 358 */         updatedOrderLine.dealAmount.internalValue() > productView.getUniversalDeal().getUniversalDealExGST()) {
/* 359 */         dealAmount = updatedOrderLine.dealAmount.internalValue() - productView.getUniversalDeal().getUniversalDealExGST();
/*     */       } else {
/*     */         
/* 362 */         dealAmount = updatedOrderLine.dealAmount.internalValue();
/*     */       } 
/* 364 */       orderLine.dealAmount.internalValue(dealAmount);
/*     */       
/* 366 */       int suppDeal = updatedOrderLine.suppDeal.internalValue();
/* 367 */       orderLine.suppDeal.internalValue(suppDeal);
/*     */ 
/*     */ 
/*     */       
/* 371 */       if (productView.getUniversalDeal() != null) {
/* 372 */         orderLine.ongoingDealAmount.internalValue(productView.getUniversalDeal().getUniversalDealExGST());
/*     */       } else {
/*     */         
/* 375 */         orderLine.ongoingDealAmount.internalValue(0);
/*     */       } 
/* 377 */     } else if (updatedOrderLine.turnInOrderType.internalValue().equals("T")) {
/*     */       
/* 379 */       if (productView.getUniversalDeal() != null) {
/* 380 */         orderLine.dealAmount.internalValue(productView.getUniversalDeal().getUniversalDealExGST());
/*     */       } else {
/*     */         
/* 383 */         orderLine.dealAmount.internalValue(0);
/*     */       } 
/* 385 */       int onGoingDealAmount = 0;
/* 386 */       if (productView.getAllowance() != null && (productView.getAllowance()).alwAllowanceExGst.internalValue() > 0)
/*     */       {
/* 388 */         onGoingDealAmount = (productView.getAllowance()).alwAllowanceExGst.internalValue();
/*     */         
/* 390 */         orderLine.ongoingDealAmount.internalValue(onGoingDealAmount);
/*     */       }
/* 392 */       else if (productView.getAllowance() == null && productView.getPromotionalProduct() != null && 
/* 393 */         (productView.getPromotionalProduct()).allowanceExGST.internalValue() > 0)
/*     */       {
/* 395 */         onGoingDealAmount = (productView.getPromotionalProduct()).allowanceExGST.internalValue();
/*     */         
/* 397 */         orderLine.ongoingDealAmount.internalValue(onGoingDealAmount);
/*     */       }
/* 399 */       else if (productView.getAllowance() == null && productView.getPromotionalProduct() == null)
/*     */       {
/* 401 */         orderLine.ongoingDealAmount.internalValue(0);
/*     */       }
/*     */     
/* 404 */     } else if (updatedOrderLine.turnInOrderType.internalValue().equals("B")) {
/* 405 */       orderLine.dealAmount.internalValue((int)(100.0F * getApplicableWholesalePrice(orderLine, productView)));
/*     */     } 
/* 407 */     orderLine.applicablePrice.internalValue((int)(100.0F * getApplicableWholesalePrice(orderLine, productView)));
/*     */     
/* 409 */     orderLine.isBonus = updatedOrderLine.isBonus;
/* 410 */     orderLine.applyQda = updatedOrderLine.applyQda;
/*     */     
/* 412 */     return orderLine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getApplicableWholesalePrice(com.metcash.model.segment.db.OrderHeader.OrderLine orderLine, ProductView productView) {
/* 421 */     float allowancePrice = 0.0F;
/* 422 */     Allowance allowance = productView.getAllowance();
/*     */     
/* 424 */     PromotionalProduct promoProduct = null;
/* 425 */     if (allowance == null) {
/* 426 */       promoProduct = productView
/* 427 */         .getPromotionalProduct();
/*     */     }
/* 429 */     if (allowance == null && promoProduct == null) {
/* 430 */       allowancePrice = 0.0F;
/*     */     }
/* 432 */     else if (allowance != null && promoProduct == null) {
/* 433 */       allowancePrice = Float.parseFloat(allowance.alwAllowanceExGst
/* 434 */           .toString());
/*     */     }
/* 436 */     else if (allowance == null && promoProduct != null) {
/* 437 */       allowancePrice = Float.parseFloat(promoProduct.allowanceExGST
/* 438 */           .toString());
/*     */     } 
/* 440 */     float basePrice = productView.getBaseCostPriceExGST().internalValue();
/*     */     
/* 442 */     basePrice /= 100.0F;
/* 443 */     int universalDealExGst = 0;
/* 444 */     if (productView.getUniversalDeal() != null) {
/* 445 */       universalDealExGst = productView.getUniversalDeal().getUniversalDealExGST();
/*     */     }
/*     */     
/* 448 */     float netWSPrice = basePrice - allowancePrice + universalDealExGst / 100.0F;
/*     */ 
/*     */     
/* 451 */     float applicablePrice = netWSPrice;
/*     */ 
/*     */     
/* 454 */     if (orderLine.turnInOrderType.internalValue().equals("O") && orderLine.dealAmount.internalValue() > 0) {
/*     */ 
/*     */       
/* 457 */       applicablePrice = basePrice;
/*     */     
/*     */     }
/* 460 */     else if (orderLine.turnInOrderType.internalValue().equals("B")) {
/*     */ 
/*     */       
/* 463 */       applicablePrice = basePrice;
/*     */     } 
/*     */     
/* 466 */     return applicablePrice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProductViewWrapper getProductCatalogues(SupplierRep supplierRep, Customer customer) {
/*     */     try {
				log.debug("*******************getProductCatalogues*******************"+ customer.stateId);
/* 478 */       SupplierRepProductService repProductService = new SupplierRepProductService();
/* 479 */       SupplierService supplierService = new SupplierService();
/* 480 */       List supplierChildIds = supplierService.findChildSupplierIds(
/* 481 */           (supplierRep.getSupplierRepKey()).pillarId, 
/* 482 */           customer.stateId, 
/* 483 */           supplierRep.supplierId);
					
/* 484 */       if (supplierChildIds == null)
/*     */       {
/*     */ 
/*     */          log.debug("*******************getProductCatalogues11*******************");
/*     */         
/* 489 */         return ProductOSCacheHelper.getSupplierCatalogueFromCache((supplierRep.getSupplierRepKey()).pillarId, 
/* 490 */             customer.stateId, 
/* 491 */             customer.customerId, 
/* 492 */             supplierRep.supplierId);
/*     */       }
/*     */ 
/*     */ log.debug("ChildSuppId: "+supplierChildIds.size());
/*     */ 
/*     */       
/* 498 */       return ProductOSCacheHelper.getSupplierCatalogueFromCache((supplierRep.getSupplierRepKey()).pillarId, 
/* 499 */           customer.stateId, 
/* 500 */           customer.customerId, 
/* 501 */           supplierChildIds, supplierRep.supplierId);
/*     */ 
/*     */     
/*     */     }
/* 505 */     catch (Exception e) {
/* 506 */       log.warn("getProductCatalogues()", e);
/*     */       
/* 508 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String findCrossReferencedProduct(SupplierRep supplierRep, Customer customer, String productCode) {
/* 519 */     return findCrossReferencedProduct((supplierRep.getSupplierRepKey()).pillarId, customer.stateId, supplierRep.supplierId, new ProductId(productCode));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String findCrossReferencedProduct(PillarId pillarId, StateId stateId, SupplierId supplierId, ProductId productCode) {
/* 530 */     HashMap crossRefMap = ProductOSCacheHelper.getSupplierCrossReferenceMapFromCache(pillarId, stateId, supplierId);
/*     */     
/* 532 */     if (crossRefMap.containsKey(productCode.internalValue())) {
/* 533 */       return (String)crossRefMap.get(productCode.internalValue());
/*     */     }
/*     */     
/* 536 */     return null;
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
/*     */   public boolean authenticateSupplier(String stateId, String supplierRepId, String passwordStr) {
/*     */     try {
/* 550 */       SupplierRepService supplierRepService = new SupplierRepService();
/* 551 */       SupplierRep supplierRep = supplierRepService.findSupplierRep(PillarId.ALM, new StateId(stateId), new SupplierRepId(supplierRepId));
/* 552 */       if (supplierRep != null) {
/* 553 */         String storedPassword = null;
/* 554 */         storedPassword = supplierRep.password.internalValue();
/* 555 */         log.debug("Stored Password: " + storedPassword);
/* 556 */         if (EncryptionUtility.isEncrypted(storedPassword)) {
/* 557 */           log.debug("Encryption Present. Now enc the supplied pass.");
/* 558 */           passwordStr = EncryptionUtility.hashWithAlgorithm(passwordStr);
/* 559 */           log.debug("Pass: " + passwordStr);
/*     */         } 
/* 561 */         if (storedPassword != null && passwordStr != null) {
/* 562 */           return passwordStr.equals(storedPassword);
/*     */         }
/* 564 */         return false;
/*     */       }
/*     */     
/*     */     }
/* 568 */     catch (Exception ex) {
/* 569 */       log.warn("authenticateSupplier()", ex);
/*     */     } 
/* 571 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void trace(String message) {
/* 582 */     trace(message, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void trace(String message, boolean write) {
/* 593 */     log.info(message);
/* 594 */     this.trace.put(message);
/*     */     
/* 596 */     if (write)
/* 597 */       this.trace.write(); 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\SupplierOrderHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */