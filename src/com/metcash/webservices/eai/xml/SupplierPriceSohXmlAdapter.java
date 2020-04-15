/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.supplier.pricesoh.SupplierPriceSohRequest;
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
/*    */ public class SupplierPriceSohXmlAdapter
/*    */ {
/*    */   public SupplierPriceSohRequest parseXml(String xmlSupplierPriceSohRequest) throws Exception {
/* 18 */     StringReader stringReader = new StringReader(xmlSupplierPriceSohRequest);
/*    */     
/* 20 */     SupplierPriceSohRequest request = 
/* 21 */       (SupplierPriceSohRequest)SupplierPriceSohRequest.unmarshal(stringReader);
/*    */     
/* 23 */     return request;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierPriceSohXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */