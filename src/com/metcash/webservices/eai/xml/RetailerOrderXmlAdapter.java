/*     */ package com.metcash.webservices.eai.xml;
/*     */ 
/*     */ import com.metcash.model.field.OrderLineNumber;
/*     */ import com.metcash.model.field.OrderSource;
/*     */ import com.metcash.model.segment.db.OrderHeader;
/*     */ import com.metcash.util.system.Log;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.LineItem;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.Msg;
/*     */ import com.metcash.webservices.eai.xml.retailer.order.Order;

/*     */ import com.metcash.webservices.eai.xml.retailer.order.types.OrderApprovedType;
/*     */ import java.io.StringReader;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Vector;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.ValidationException;
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
/*     */ public class RetailerOrderXmlAdapter
/*     */ {
/*     */   public synchronized OrderHeader[] parseOrderXML(String xmlString) throws MarshalException, ValidationException, Exception {
/*  38 */     StringReader stringReader = new StringReader(xmlString);
/*  39 */     Vector<OrderHeader> vOrders = new Vector();
/*     */     
/*  41 */     Msg xmlMsg = Msg.unmarshal(stringReader);
/*  42 */     Order[] xmlOrders = xmlMsg.getOrder();
/*     */     
/*  44 */     for (int k = 0; k < xmlOrders.length; k++) {
/*     */       
/*  46 */       Order xmlOrder = xmlOrders[k];
/*  47 */       com.metcash.webservices.eai.xml.retailer.order.OrderHeader xmlOrderHdr = xmlOrder.getOrderHeader();
/*  48 */       OrderHeader order = new OrderHeader();
/*  49 */       order.externalOrderId.internalValue(xmlOrderHdr.getExternalOrderId());
/*  50 */       order.orderSource = OrderSource.WSE;
/*  51 */       order.pillarId.setAsText("ALM");
/*  52 */       order.customerRef.setAsText(xmlOrderHdr.getCustomerOrderId());
/*  53 */       order.customerId.setAsText(xmlOrderHdr.getCustomerId());
/*  54 */       order.stateId.setAsText(xmlOrderHdr.getCustomerStateCode().toString());
/*     */       
/*  56 */       order.turnInOrderApproved.internalValue(xmlOrderHdr.getOrderApproved().equals(OrderApprovedType.Y));
/*  57 */       String date = validateOrderCreatedDateTimeString(xmlOrderHdr.getOrderCreatedDate());
/*  58 */       order.createdDate.setAsText(date);
/*  59 */       order.specialInstructions.setAsText(xmlOrderHdr.getSpecialInstructions());
/*  60 */       date = validateDeliveryDateString(xmlOrderHdr.getDeliveryDate());
/*  61 */       if (date != null) {
/*  62 */         order.deliveryDate.setAsText(date);
/*     */       }
/*  64 */       order.stage.setAsText("R");
/*     */ 
/*     */       
/*  67 */       LineItem[] xmlLineItems = xmlOrder.getLineItem();
/*     */       
/*  69 */       for (int i = 0; i < xmlLineItems.length; i++) {
/*     */         
/*  71 */         OrderLineNumber lineNumber = new OrderLineNumber();
/*  72 */         lineNumber.setAsText(Integer.toString(xmlLineItems[i].getLineId()));
/*  73 */         OrderHeader.OrderLine orderLine = order.newOrderLine(lineNumber);
/*  74 */         orderLine.pillarId.setAsText(order.pillarId.internalValue());
/*  75 */         orderLine.orderQty.setAsText(Integer.toString(xmlLineItems[i].getOrderQuantity()));
/*  76 */         orderLine.productId.setAsText(xmlLineItems[i].getProductCode());
/*  77 */         orderLine.productCodeType.setAsText(xmlLineItems[i].getProductCodeType().toString());
/*  78 */         orderLine.turnInOrderType.internalValue(" ");
/*  79 */         orderLine.isBonus.setAsText("N");
/*  80 */         orderLine.applyQda.setAsText("N");
/*  81 */         if (xmlLineItems[i].getBackOrder() != null && !xmlLineItems[i].getBackOrder().equals("")) {
/*  82 */           String backOrderFlag = xmlLineItems[i].getBackOrder().toString();
/*     */           
/*  84 */           orderLine.backOrderFlag.internalValue(backOrderFlag.equalsIgnoreCase("Y"));
/*     */         } else {
/*     */           
/*  87 */           orderLine.backOrderFlag.internalValue(false);
/*     */         } 
/*     */       } 
/*  90 */       vOrders.addElement(order);
/*  91 */       Log.debug(this, "RetailerXMLAdapter vector of parsed orders is " + vOrders);
/*     */     } 
/*     */     
/*  94 */     OrderHeader[] orders = new OrderHeader[vOrders.size()];
/*  95 */     vOrders.copyInto((Object[])orders);
/*     */     
/*  97 */     return orders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String validateDeliveryDateString(String date) {
/* 106 */     date = String.valueOf(date) + "000000";
/* 107 */     String INTERNAL_DATETIME_FORMAT = "yyyyMMddHHmmss";
/* 108 */     SimpleDateFormat df = new SimpleDateFormat(INTERNAL_DATETIME_FORMAT);
/*     */     try {
/* 110 */       df.parse(date);
/* 111 */       return date;
/* 112 */     } catch (ParseException pe) {
/* 113 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String validateOrderCreatedDateTimeString(String clientCreatedTime) {
/* 123 */     String INTERNAL_DATETIME_FORMAT = "yyyyMMddHHmmss";
/* 124 */     SimpleDateFormat df = new SimpleDateFormat(INTERNAL_DATETIME_FORMAT);
/* 125 */     if (clientCreatedTime == null || clientCreatedTime.equals("")) {
/* 126 */       String currentDateTime = df.format(new Date());
/* 127 */       return currentDateTime;
/*     */     } 
/*     */     try {
/* 130 */       df.parse(clientCreatedTime);
/* 131 */       return clientCreatedTime;
/* 132 */     } catch (ParseException pe) {
/* 133 */       String currentDateTime = df.format(new Date());
/* 134 */       return currentDateTime;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\RetailerOrderXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */