/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequest;
/*    */ import java.io.StringReader;
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
/*    */ public class SupplierOrderHistoryXmlAdapter
/*    */ {
/*    */   public SupplierOrderHistoryRequest parseXml(String xmlSupplierOrderHistoryRequest) throws Exception {
/* 18 */     StringReader stringReader = new StringReader(
/* 19 */         xmlSupplierOrderHistoryRequest);
/*    */     
/* 21 */     SupplierOrderHistoryRequest request = 
/* 22 */       (SupplierOrderHistoryRequest)SupplierOrderHistoryRequest.unmarshal(stringReader);
/*    */     
/* 24 */     return request;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierOrderHistoryXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */