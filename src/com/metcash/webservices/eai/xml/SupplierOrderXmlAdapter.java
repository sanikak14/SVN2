/*     */ package com.metcash.webservices.eai.xml;
/*     */ 
/*     */ import com.metcash.model.field.OrderLineNumber;
/*     */ import com.metcash.model.field.OrderSource;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.OrderHeader;
/*     */ import com.metcash.util.system.Log;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.LineItem;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.Msg;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.Order;

/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType;
/*     */ import com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType;
/*     */ import java.io.StringReader;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ 
/*     */ public class SupplierOrderXmlAdapter
/*     */ {
/*  28 */   private String BONUS = "B";
/*  29 */   private String OVERRIDE = "O";
/*  30 */   private String TURNIN = "T";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized com.metcash.model.segment.db.OrderHeader[] parseOrderXML(String xmlString) throws MarshalException, ValidationException, Exception {
/*  36 */     StringReader stringReader = new StringReader(xmlString);
/*  37 */     Vector vOrders = new Vector();
/*  38 */     Msg xmlMsg = Msg.unmarshal(stringReader);
/*  39 */     Order[] xmlOrders = xmlMsg.getOrder();
/*  40 */     for (int k = 0; k < xmlOrders.length; k++) {
/*  41 */       Order xmlOrder = xmlOrders[k];
/*  42 */       vOrders = splitLinesByTurninOrderType(xmlOrder, vOrders);
/*     */     } 
/*     */     
/*  45 */    com.metcash.model.segment.db.OrderHeader[] orders = new com.metcash.model.segment.db.OrderHeader[vOrders.size()];
/*  46 */     vOrders.copyInto((Object[])orders);
/*  47 */     return orders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public com.metcash.model.segment.db.OrderHeader parseOrderHeader(OrderHeader xmlOrderHdr, String turnInOrderType) {
/*  58 */     com.metcash.model.segment.db.OrderHeader orderHeaderSeg = new com.metcash.model.segment.db.OrderHeader();
/*  59 */     orderHeaderSeg.externalOrderId.internalValue(xmlOrderHdr.getVendorOrderId());
/*  60 */     orderHeaderSeg.orderSource = OrderSource.WSE;
/*  61 */     orderHeaderSeg.pillarId.setAsText("ALM");
/*  62 */     orderHeaderSeg.customerRef.setAsText(xmlOrderHdr.getCustomerOrderId());
/*  63 */     orderHeaderSeg.customerId.setAsText(xmlOrderHdr.getCustomerId());
/*  64 */     orderHeaderSeg.stateId.setAsText(xmlOrderHdr.getCustomerStateCode().toString());
/*     */     
/*  66 */     String date = validateOrderCreatedDateTimeString(xmlOrderHdr.getOrderCreatedDate());
/*  67 */     orderHeaderSeg.createdDate.setAsText(date);
/*  68 */     orderHeaderSeg.stage.setAsText("R");
/*  69 */     orderHeaderSeg.specialInstructions.setAsText(xmlOrderHdr.getSpecialInstructions());
/*  70 */     date = validateDeliveryDateString(xmlOrderHdr.getDeliveryDate());
/*  71 */     if (date != null) {
/*  72 */       orderHeaderSeg.deliveryDate.setAsText(date);
/*     */     }
/*     */     
/*  75 */     orderHeaderSeg.turnInOrderType.internalValue(turnInOrderType);
/*  76 */     orderHeaderSeg.supplierRepId.internalValue(xmlOrderHdr.getSupplierRepId());
/*     */     
/*  78 */     if (xmlOrderHdr.getRefSupplierRepId() != null && !xmlOrderHdr.getRefSupplierRepId().equals("")) {
/*  79 */       orderHeaderSeg.refSupplierRepId.internalValue(xmlOrderHdr.getRefSupplierRepId());
/*     */     } else {
/*  81 */       orderHeaderSeg.refSupplierRepId.internalValue(xmlOrderHdr.getSupplierRepId());
/*     */     } 
/*  83 */     if (xmlOrderHdr.getRefSupplierStateId() != null && !xmlOrderHdr.getRefSupplierStateId().equals("")) {
/*  84 */       orderHeaderSeg.suppRepStateId.internalValue(xmlOrderHdr.getRefSupplierStateId());
/*     */     } else {
/*  86 */       orderHeaderSeg.suppRepStateId.internalValue(xmlOrderHdr.getSupplierStateId());
/*     */     } 
/*  88 */     orderHeaderSeg.supplierRefCode.internalValue(xmlOrderHdr.getSupplierReference());
/*  89 */     orderHeaderSeg.turnInOrderApproved.internalValue(xmlOrderHdr.getTrnApproved().equals(TrnApprovedType.Y));
/*     */     
/*  91 */     return orderHeaderSeg;
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
/*     */   public com.metcash.model.segment.db.OrderHeader parseOrderLines(List<LineItem> orderLinesList, com.metcash.model.segment.db.OrderHeader orderHeaderSeg) {
/* 144 */     LineItem currentXmlLine = null;
/* 145 */     for (int i = 0; i < orderLinesList.size(); i++) {
/* 146 */       currentXmlLine = orderLinesList.get(i);
/*     */       
/* 148 */       OrderLineNumber lineNumber = new OrderLineNumber();
/* 149 */       lineNumber.setAsText(Integer.toString(currentXmlLine.getLineId()));
/* 150 */       com.metcash.model.segment.db.OrderHeader.OrderLine orderLine = orderHeaderSeg.newOrderLine(lineNumber);
/* 151 */       orderLine.pillarId.setAsText(orderHeaderSeg.pillarId.internalValue());
/* 152 */       orderLine.orderQty.setAsText(Integer.toString(currentXmlLine.getOrderQuantity()));
/* 153 */       orderLine.productId.setAsText(currentXmlLine.getProductCode());
/* 154 */       orderLine.productCodeType.setAsText(currentXmlLine.getProductCodeType().toString());
/* 155 */       orderLine.turnInOrderType.internalValue(currentXmlLine.getOrderType().toString());
/* 156 */       orderLine.dealAmount.internalValue(currentXmlLine.getDealAmount());
/*     */       
/* 158 */       if (orderLine.dealAmount.internalValue() > 0 && orderHeaderSeg.turnInOrderType.internalValue().equals(this.OVERRIDE) && 
/* 159 */         !orderHeaderSeg.stateId.equals(StateId.NZ)) {
/* 160 */         orderLine.suppDeal.internalValue(orderLine.dealAmount.internalValue());
/*     */       }
/*     */ 
/*     */       
/* 164 */       if (currentXmlLine.getApplyBonus() == null) {
/*     */         
/* 166 */         orderLine.isBonus.internalValue(false);
/*     */       }
/*     */       else {
/*     */         
/* 170 */         orderLine.isBonus.internalValue(currentXmlLine.getApplyBonus().equals(ApplyBonusType.Y));
/*     */       } 
/* 172 */       if (currentXmlLine.getApplyQda() == null) {
/* 173 */         orderLine.applyQda.internalValue(false);
/*     */       } else {
/*     */         
/* 176 */         orderLine.applyQda.internalValue(currentXmlLine.getApplyQda().equals(ApplyQdaType.Y));
/*     */       } 
/*     */       
/* 179 */       if (currentXmlLine.getBackOrder() != null) {
/* 180 */         orderLine.backOrderFlag.internalValue(currentXmlLine.getBackOrder().equals(BackOrderType.Y));
/*     */       } else {
/* 182 */         orderLine.backOrderFlag.internalValue(false);
/*     */       } 
/*     */     } 
/* 185 */     return orderHeaderSeg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String validateDeliveryDateString(String date) {
/* 194 */     date = String.valueOf(date) + "000000";
/* 195 */     String INTERNAL_DATETIME_FORMAT = "yyyyMMddHHmmss";
/* 196 */     SimpleDateFormat df = new SimpleDateFormat(INTERNAL_DATETIME_FORMAT);
/*     */     try {
/* 198 */       df.parse(date);
/* 199 */       return date;
/* 200 */     } catch (ParseException pe) {
/* 201 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String validateOrderCreatedDateTimeString(String clientCreatedTime) {
/* 211 */     String INTERNAL_DATETIME_FORMAT = "yyyyMMddHHmmss";
/* 212 */     SimpleDateFormat df = new SimpleDateFormat(INTERNAL_DATETIME_FORMAT);
/* 213 */     if (clientCreatedTime == null || clientCreatedTime.equals("")) {
/* 214 */       String currentDateTime = df.format(new Date());
/* 215 */       return currentDateTime;
/*     */     } 
/*     */     try {
/* 218 */       df.parse(clientCreatedTime);
/* 219 */       return clientCreatedTime;
/* 220 */     } catch (ParseException pe) {
/* 221 */       String currentDateTime = df.format(new Date());
/* 222 */       return currentDateTime;
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
/*     */   public Vector splitLinesByTurninOrderType(Order xmlOrder, Vector vOrders) {
/* 234 */     LineItem[] xmlLineItems = xmlOrder.getLineItem();
/* 235 */     ArrayList<LineItem> xmlBonusLineItems = new ArrayList();
/* 236 */     ArrayList<LineItem> xmlTurninLineItems = new ArrayList();
/* 237 */     ArrayList<LineItem> xmlOverrideLineItems = new ArrayList();
/* 238 */     OrderHeader xmlOrderHdr = xmlOrder.getOrderHeader();
/* 239 */     com.metcash.model.segment.db.OrderHeader orderHeaderSeg = null;
/* 240 */     for (int i = 0; i < xmlLineItems.length; i++) {
/* 241 */       Log.debug(this, "SXA:splitLinesByTurninOrderType:Type: " + xmlLineItems[i].getOrderType().toString());
/* 242 */       if (xmlLineItems[i].getOrderType().toString().equalsIgnoreCase(this.BONUS)) {
/* 243 */         xmlBonusLineItems.add(xmlLineItems[i]);
/* 244 */       } else if (xmlLineItems[i].getOrderType().toString().equalsIgnoreCase(this.OVERRIDE)) {
/* 245 */         xmlOverrideLineItems.add(xmlLineItems[i]);
/* 246 */       } else if (xmlLineItems[i].getOrderType().toString().equalsIgnoreCase(this.TURNIN)) {
/* 247 */         xmlTurninLineItems.add(xmlLineItems[i]);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     if (xmlBonusLineItems.size() > 0) {
/* 255 */       orderHeaderSeg = parseOrderHeader(xmlOrderHdr, "B");
/* 256 */       orderHeaderSeg = parseOrderLines(xmlBonusLineItems, orderHeaderSeg);
/* 257 */       vOrders.addElement(orderHeaderSeg);
/*     */     } 
/* 259 */     if (xmlOverrideLineItems.size() > 0) {
/* 260 */       orderHeaderSeg = parseOrderHeader(xmlOrderHdr, "O");
/* 261 */       orderHeaderSeg = parseOrderLines(xmlOverrideLineItems, orderHeaderSeg);
/* 262 */       vOrders.addElement(orderHeaderSeg);
/*     */     } 
/* 264 */     if (xmlTurninLineItems.size() > 0) {
/* 265 */       orderHeaderSeg = parseOrderHeader(xmlOrderHdr, "T");
/* 266 */       orderHeaderSeg = parseOrderLines(xmlTurninLineItems, orderHeaderSeg);
/* 267 */       vOrders.addElement(orderHeaderSeg);
/*     */     } 
/* 269 */     return vOrders;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierOrderXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */