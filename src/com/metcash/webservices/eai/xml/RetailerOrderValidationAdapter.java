/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse;
/*    */ import java.io.StringWriter;
/*    */ import org.exolab.castor.xml.MarshalException;
/*    */ import org.exolab.castor.xml.ValidationException;
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
/*    */ public class RetailerOrderValidationAdapter
/*    */ {
/*    */   public String getRetailerOrderResponseXml(RetailerOrderResponse retailerOrderResponse) throws ValidationException, MarshalException {
/* 22 */     StringWriter stringWriter = new StringWriter();
/* 23 */     retailerOrderResponse.validate();
/* 24 */     retailerOrderResponse.marshal(stringWriter);
/* 25 */     return stringWriter.toString();
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\RetailerOrderValidationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */