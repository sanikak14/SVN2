/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerPriceSohResponse;
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
/*    */ 
/*    */ public class RetailerPriceSohValidationAdapter
/*    */ {
/*    */   public String getXml(RetailerPriceSohResponse response) throws Exception {
/* 27 */     StringWriter stringWriter = new StringWriter();
/* 28 */     response.validate();
/* 29 */     response.marshal(stringWriter);
/* 30 */     return stringWriter.toString();
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\RetailerPriceSohValidationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */