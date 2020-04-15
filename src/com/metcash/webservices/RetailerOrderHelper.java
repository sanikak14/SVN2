/*     */ package com.metcash.webservices;
/*     */ /*     */ import java.sql.Connection;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;

/*     */ import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.ValidationException;

import com.metcash.common.services.CustomerService;
/*     */ import com.metcash.config.Config;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.framework.dao.firestorm.FirestormDAOFactory;
/*     */ import com.metcash.model.dao.dao.OrderHeaderDao;
/*     */ import com.metcash.model.dao.dao.OrderLineDao;
import com.metcash.model.dao.exceptions.OrderLineDaoException;
/*     */ import com.metcash.model.dao.jdbc.ResourceManager;
/*     */ import com.metcash.model.dao.toa.TOAFactory;
/*     */ import com.metcash.model.field.CustomerId;
/*     */ import com.metcash.model.field.OrderLineNumber;
/*     */ import com.metcash.model.field.OrderLineStatus;
/*     */ import com.metcash.model.field.OrderSource;
/*     */ import com.metcash.model.field.OrderStage;
/*     */ import com.metcash.model.field.OrderStatus;
/*     */ import com.metcash.model.field.OrderType;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.StateId;
import com.metcash.model.field.TurnInOrderType;
/*     */ import com.metcash.model.field.WebOrderId;
/*     */ import com.metcash.model.segment.db.CustomerProfile;
/*     */ import com.metcash.util.EncryptionUtility;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.RetailerOrderValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.RetailerOrderXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse;
/*     */ import com.metcash.webservices.validation.order.RetailerOrderValidationResult;
/*     */ import com.metcash.webservices.validation.order.RetailerOrderValidator;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RetailerOrderHelper {
/*  43 */   private FirestormDAOFactory daoFactory = new FirestormDAOFactory();
/*  44 */   private TOAFactory toaFactory = new TOAFactory();
/*     */   
/*     */   private OrderLineDao transOrderLineDao;
/*     */   private OrderHeaderDao transOrderHeaderDao;
/*     */   private RetailerOrderResponse xmlResponse;
/*  49 */   private String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RetailerOrderResponse xmlns=\"\"><ResponseHeader><Pillar>ALM</Pillar><Customer></Customer><StateCode></StateCode><StatusMessage/></ResponseHeader><OrderDetail><OrderHeaderResponse><WebOrderId>0</WebOrderId><CustomerId></CustomerId><CustomerStateCode></CustomerStateCode><WebCreatedTime/><ItemsAccepted></ItemsAccepted><ItemsRejected></ItemsRejected><OrderHeaderMessages><HeaderMessageData></HeaderMessageData><HeaderMessageSeverity>ERROR</HeaderMessageSeverity></OrderHeaderMessages></OrderHeaderResponse></OrderDetail></RetailerOrderResponse>";
/*     */   private RetailerOrderValidationAdapter retailerValidationAdapter;
/*  52 */   private static Log log = LogFactory.getLog(RetailerOrderHelper.class);
/*     */ 
/*     */ 
/*     */   public RetailerOrderHelper() {
/*  58 */     this.retailerValidationAdapter = new RetailerOrderValidationAdapter();
/*  59 */     this.xmlResponse = new RetailerOrderResponse();
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
/*     */   public String submitRetailerOrder(String XMLOrder, String authenticatedRetailerId, String authenticatedRetailerStateId) throws ValidationException, MarshalException, Exception {
/*     */     try {
				log.info("submitRetailerOrder :: authenticatedRetailerId: "+ authenticatedRetailerId);
				log.info("submitRetailerOrder::XMLString" + XMLOrder);
				
				log.info("submitRetailerOrder :: processOrder"+ XMLOrder);
	/*  77 */   com.metcash.model.segment.db.OrderHeader[] orders = (new RetailerOrderXmlAdapter()).parseOrderXML(XMLOrder);
	/*     */       
	/*  79 */   processOrders(orders, authenticatedRetailerId, authenticatedRetailerStateId);
			
/*     */     }
/*  81 */     catch (ValidationException ve) {
/*  82 */       throw ve;
/*     */     }
/*  84 */     catch (MarshalException me) {
/*  85 */       throw me;
/*     */     }
/*  87 */     catch (Exception e) {
/*  88 */       throw e;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/*  93 */       log.info("submitRetailerOrder():Response:" + this.retailerValidationAdapter.getRetailerOrderResponseXml(this.xmlResponse));
/*  94 */       return this.retailerValidationAdapter.getRetailerOrderResponseXml(this.xmlResponse);
/*     */     }
/*  96 */     catch (Exception e) {
/*  97 */       log.error("Problem returning an XML Response to client:", e);
/*     */       
/*  99 */       return this.DEFAULT_ERROR_RESPONSE;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List processOrders(com.metcash.model.segment.db.OrderHeader[] orders, String authenticatedRetailerId, String authenticatedRetailerStateId) {
/* 109 */     ArrayList<WebOrderId> orderIdList = new ArrayList();
/* 110 */     List<RetailerOrderValidationResult> validationResults = new ArrayList();
/* 111 */     int processed = 0;
/*     */     
/*     */     try {
/* 114 */       if (orders != null && orders.length > 0) {
/* 115 */         log.debug("processOrders:Total orders inside service is " + orders.length);
/* 116 */         RetailerOrderValidationResult currentValidationResult = null;
/* 117 */         RetailerOrderValidator retailerOrderValidator = new RetailerOrderValidator();
/* 118 */         for (int i = 0; i < orders.length; i++) {
/* 119 */           currentValidationResult = new RetailerOrderValidationResult();
/* 120 */           currentValidationResult = retailerOrderValidator.validateOrderSegment(orders[i], currentValidationResult, authenticatedRetailerId, authenticatedRetailerStateId);
/* 121 */           if (orders != null) {
/*     */             try {
/* 123 */               WebOrderId orderId = null;
						log.info("***********************************Customer State ID: "+ orders[i].stateId.internalValue());
/*     */               //Sanika- To block NZ ALMiOrder	
						if(orders[i].stateId.internalValue().equals("9")){
							currentValidationResult.addOrderHeaderResponseMessage(RetailerOrderValidationResult.ERROR, "We are unable to process order at the moment");
			/* 130 */                 currentValidationResult.setOrderHeaderResponseXml(orders[i]);
						}
						else{
	/* 125 */               if (currentValidationResult != null && !currentValidationResult.orderHeaderHasErrors() && !currentValidationResult.allLinesInError(orders[i])) {
	/* 126 */                 orderId = databaseInsertOrder(orders[i], currentValidationResult);
	/*     */               } else {
	/* 128 */                 currentValidationResult.addOrderHeaderResponseMessage(RetailerOrderValidationResult.ERROR, 
	/* 129 */                     "Errors Detected, this order was not processed please review details submitted.");
	/* 130 */                 currentValidationResult.setOrderHeaderResponseXml(orders[i]);
	/*     */               } 
	/* 132 */               processed++;
	/* 133 */               orderIdList.add(orderId);
	/* 134 */               log.debug("Weborder id is " + orderId + " Order number is " + processed);
						}
/*     */             }
/* 136 */             catch (Exception se) {
/* 137 */               log.error("processOrders()", se);
/* 138 */               throw new ServletException(se);
/*     */             } 
/*     */           }
/*     */           
/* 142 */           validationResults.add(currentValidationResult);
/*     */           
/* 144 */           this.xmlResponse.addOrderDetail(currentValidationResult.getOrderDetailResponseXml());
/*     */         
/*     */         }
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 151 */     catch (Exception e) {
/* 152 */       log.error("Error in processing Retailer WebService Orders.", e);
/*     */     } 
/* 154 */     return validationResults;
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
/*     */   public WebOrderId databaseInsertOrder(com.metcash.model.segment.db.OrderHeader updatedOrder, RetailerOrderValidationResult validationResult) throws MetException {
/* 167 */     Connection transConn = null;
/* 168 */     log.debug("inside RetailOrderHelper:databaseInsertOrder() " + updatedOrder);
/* 169 */     WebOrderId orderId = new WebOrderId();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     try { transConn = ResourceManager.getCursorConnection();
/* 178 */       transConn.setAutoCommit(false);
/*     */       
/* 180 */       this.transOrderHeaderDao = (OrderHeaderDao)this.daoFactory.getFirestormDAO(OrderHeaderDao.class, transConn);
/* 181 */       this.transOrderLineDao = (OrderLineDao)this.daoFactory.getFirestormDAO(OrderLineDao.class, transConn);
/*     */       
/* 183 */       ArrayList updatedLines = (ArrayList)updatedOrder.getOrderLines();
/* 184 */       int numLineItems = updatedLines.size();
/* 185 */       log.debug("databaseInsertOrder() " + numLineItems);
/* 186 */       com.metcash.model.segment.db.OrderHeader order = new  com.metcash.model.segment.db.OrderHeader();
/*     */       
/* 188 */       if (numLineItems > 0) {
/* 189 */         log.debug("databaseInsertOrder() if num of lines is >0");
/* 190 */         com.metcash.model.segment.db.OrderHeader.OrderLine orderLine =  (com.metcash.model.segment.db.OrderHeader.OrderLine) updatedLines.get(0);
/* 191 */         log.debug("databaseInsertOrder() orderline is " + orderLine);
/* 192 */         orderLine.pillarId = new PillarId("ALM");
/* 193 */         order.orderSource = OrderSource.WSE;
/*     */       } else {
/* 195 */         log.debug("databaseInsertOrder() order contains no order lines: Could not update order");
/* 196 */         return new WebOrderId(0);
/*     */       } 
/*     */       
/* 199 */       order.externalOrderId = updatedOrder.externalOrderId;
/* 200 */       order.customerRef = updatedOrder.customerRef;
/* 201 */       order.customerId = updatedOrder.customerId;
/* 202 */       order.stateId = updatedOrder.stateId;
/* 203 */       order.createdDate.internalValue(new Date());
/* 204 */       order.stage = OrderStage.RECEIVED;
/* 205 */       order.status = OrderStatus.PENDING;
/* 206 */       order.alternativeOrder = updatedOrder.alternativeOrder;
/* 207 */       order.orderType = new OrderType("05");
/* 208 */       order.dateSent.internalValue(null);
/* 209 */       order.processedDate.internalValue(null);
/* 210 */       order.specialInstructions = updatedOrder.specialInstructions;
/* 211 */       order.pillarId = updatedOrder.pillarId;
/* 212 */       if (Config.IDS_SWITCH.equals("on") && Config.IDS_STATES_MAP.containsKey(order.stateId.internalValue())) {
/* 213 */         order.orderType = OrderType.WEB_ORDER;
/*     */       } else {
/*     */         
/* 216 */         order.orderType = OrderType.LIQUOR;
/*     */       } 
/*     */       
/* 219 */       order.turnInOrderType.internalValue(TurnInOrderType.NORMAL_ORDER.internalValue());
/*     */       
/* 221 */       order.turnInOrderApproved.internalValue(updatedOrder.turnInOrderApproved.internalValue());
/*     */ 
/*     */       
/* 224 */       
/*     */ 		com.metcash.model.dao.dto.OrderHeaderPk orderDtoPK = transOrderHeaderDao.insert(toaFactory.getOrderHeaderDTO(order));

/*     */       
/* 227 */      com.metcash.model.dao.dto.OrderHeader orderDto = this.transOrderHeaderDao.findByPrimaryKey(orderDtoPK);
/* 228 */       order = this.toaFactory.getOrderHeaderSegment(orderDto);
/* 229 */       orderId = (order.getOrderKey()).webOrderId;
/* 230 */       log.debug("databaseInsertOrder() order retreived after insert " + order);
/*     */       
/* 232 */       createOrderLines(order, updatedLines, validationResult);
/*     */ 
/*     */ 
/*     */       
/* 236 */       transConn.commit();
/*     */        }
/*     */     
/* 239 */     catch (Exception e)
/* 240 */     { log.warn("databaseInsertOrder()", e);
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 245 */         transConn.rollback();
/* 246 */       } catch (SQLException se) {
/*     */         
/* 248 */         log.debug("Failed to rollback transaction for createOrder() method!");
/*     */       
/*     */       }
/*     */        }
/*     */     
/*     */     finally
/*     */     
/* 255 */     { if (transConn != null)
/*     */         
/* 257 */         try { transConn.close(); }
/* 258 */         catch (SQLException se)
/* 259 */         { log.debug("Failed to close transactional database connection for createOrder() method!"); }   }  if (transConn != null) try { transConn.close(); } catch (SQLException se) { log.debug("Failed to close transactional database connection for createOrder() method!"); }
/*     */     
/*     */ 
/*     */     
/* 263 */     return orderId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RetailerOrderValidationResult createOrderLines(com.metcash.model.segment.db.OrderHeader order, List updatedLines, RetailerOrderValidationResult validationResult) throws OrderLineDaoException {
/* 269 */     HashMap orderLinesMap = orderLinesMap = new HashMap();
/* 270 */     int numLineItems = updatedLines.size();
/* 271 */     int validLines = 0;
/* 272 */     for (int i = 0; i < numLineItems; i++) {
/* 273 */       com.metcash.model.segment.db.OrderHeader.OrderLine updatedOrderLine = (com.metcash.model.segment.db.OrderHeader.OrderLine)updatedLines.get(i);
/* 274 */       OrderLineNumber lineNumber = (updatedOrderLine.getOrderLineKey()).orderLineNumber;
/*     */ 
/*     */       
/* 277 */       if (!validationResult.lineHasErrors(lineNumber.internalValue())) {
/* 278 */         com.metcash.model.segment.db.OrderHeader.OrderLine orderLine = order.getOrderLine(lineNumber);
/* 279 */         if (orderLine == null) {
/* 280 */           validLines++;
/* 281 */           orderLine = order.newOrderLine(new OrderLineNumber(validLines));
/* 282 */           (orderLine.getOrderLineKey()).webOrderId = (order.getOrderKey()).webOrderId;
/* 283 */           orderLine.mfOrderId.internalValue(0L);
/* 284 */           orderLine.orderQty = updatedOrderLine.orderQty;
/* 285 */           orderLine.productId = updatedOrderLine.productId;
/* 286 */           orderLine.reserveQty.internalValue(0);
/* 287 */           orderLine.status = OrderLineStatus.UNDEFINED;
/* 288 */           orderLine.pillarId = updatedOrderLine.pillarId;
/*     */ 
/*     */           
/* 291 */           orderLine.turnInOrderType = updatedOrderLine.turnInOrderType;
/* 292 */           log.debug("databaseInsertOrder() Orderline turn in order type for update order line = " + updatedOrderLine.turnInOrderType);
/* 293 */           orderLine.dealAmount.internalValue(0);
/* 294 */           orderLine.ongoingDealAmount.internalValue(0);
/*     */ 
/*     */           
/* 297 */           this.transOrderLineDao.insert(this.toaFactory.getOrderLineDTO(orderLine));
/* 298 */           log.debug("DatabaseInsertOrder() after orderline inserted");
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 306 */         log.debug("Skipping this order line because it has errors " + lineNumber.internalValue());
/*     */       } 
/*     */     } 
/* 309 */     return validationResult;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean authenticateRetailer(String stateId, String customerId, String password) {
/*     */     try {
/* 321 */       log.debug("inside the authenticate retailer method");
/*     */ 
/*     */       
/* 324 */       if (authenticateSalesForce(customerId, password)) {
/* 325 */         return true;
/*     */       }
/*     */       
/* 328 */       CustomerService service = new CustomerService();
/* 329 */       CustomerProfile customerProfile = service.findCustomerProfile(PillarId.ALM, new StateId(stateId), new CustomerId(customerId));
/*     */       
/* 331 */       if (customerProfile != null) {
/* 332 */         log.debug("If customer is not null");
/* 333 */         String storedPassword = null;
/* 334 */         storedPassword = customerProfile.password.internalValue();
/* 335 */         log.debug("Stored customer Password: " + storedPassword);
/* 336 */         if (EncryptionUtility.isEncrypted(storedPassword)) {
/* 337 */           log.debug("Encryption Present. Now enc the customer pass.");
/* 338 */           password = EncryptionUtility.hashWithAlgorithm(password);
/* 339 */           log.debug("Password is : " + password);
/*     */         } 
/* 341 */         if (storedPassword != null && password != null) {
/* 342 */           return password.equals(storedPassword);
/*     */         }
/*     */         
/* 345 */         return false;
/*     */       }
/*     */     
/*     */     }
/* 349 */     catch (Exception ex) {
/* 350 */       log.warn("authenticateRetailer", ex);
/*     */     } 
/* 352 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean authenticateSalesForce(String user, String password) {
/* 363 */     if (user.equalsIgnoreCase("o4") && password.equals(ValidationConfig.SFAP_O4_PASSWORD)) {
/* 364 */       return true;
/*     */     }
/* 366 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\RetailerOrderHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */