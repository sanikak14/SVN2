/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequest;
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
/*    */ public class RetailerPriceSohXmlAdapter
/*    */ {
/*    */   public RetailerPriceSohRequest parseXml(String xmlRetailerPriceSohRequest) throws Exception {
/* 18 */     StringReader stringReader = new StringReader(xmlRetailerPriceSohRequest);
/*    */     
/* 20 */     RetailerPriceSohRequest request = 
/* 21 */       (RetailerPriceSohRequest)RetailerPriceSohRequest.unmarshal(stringReader);
/*    */     
/* 23 */     return request;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\RetailerPriceSohXmlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */