/*    */ package com.metcash.webservices.eai.xml;
/*    */ 
/*    */ import com.metcash.webservices.eai.xml.supplier.order.validation.SupplierOrderResponse;
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
/*    */ public class SupplierOrderValidationAdapter
/*    */ {
/*    */   public String getSupplierOrderResponseXml(SupplierOrderResponse supplierOrderResponse) throws ValidationException, MarshalException {
/* 33 */     StringWriter stringWriter = new StringWriter();
/* 34 */     supplierOrderResponse.validate();
/* 35 */     supplierOrderResponse.marshal(stringWriter);
/* 36 */     return stringWriter.toString();
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\SupplierOrderValidationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */