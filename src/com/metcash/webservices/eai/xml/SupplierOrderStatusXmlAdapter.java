/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.supplier.orderstatus.SupplierOrderStatusRequest;
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
/*    */ public class SupplierOrderStatusXmlAdapter
/*    */ {
/*    */   public SupplierOrderStatusRequest parseXml(String xmlSupplierOrderStatusRequest) throws Exception {
/* 18 */     StringReader stringReader = new StringReader(
/* 19 */         xmlSupplierOrderStatusRequest);
/*    */     
/* 21 */     SupplierOrderStatusRequest request = 
/* 22 */       (SupplierOrderStatusRequest)SupplierOrderStatusRequest.unmarshal(stringReader);
/*    */     
/* 24 */     return request;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierOrderStatusXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */