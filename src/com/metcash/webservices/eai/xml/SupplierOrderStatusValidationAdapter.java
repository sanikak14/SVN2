/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SupplierOrderStatusValidationAdapter
/*    */ {
/*    */   public String getXml(OrderStatusResponse response) throws Exception {
/* 26 */     StringWriter stringWriter = new StringWriter();
/* 27 */     response.validate();
/* 28 */     response.marshal(stringWriter);
/* 29 */     return stringWriter.toString();
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierOrderStatusValidationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */