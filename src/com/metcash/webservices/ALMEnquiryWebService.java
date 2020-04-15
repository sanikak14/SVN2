/*    */ package com.metcash.webservices;
/*    */ 
/*    */ import com.metcash.webservices.utils.jndi.AlmWebServiceManager;
/*    */ import com.metcash.webservices.utils.jndi.JndiWebServiceManager;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.rpc.soap.SOAPFaultException;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ALMEnquiryWebService
/*    */ {
/* 18 */   public static String DEFAULT_XML_MESSAGE = "Unexpected Errors were encountered please contact your ALM administration team.";
/* 19 */   public static String BAD_REQUEST_MESSAGE = "Service Unavailable, Bad Request.";
/* 20 */   public static String DEFAULT_NAME_SPACE = "http://metcash";
/*    */   
/* 22 */   private static Log log = LogFactory.getLog(ALMEnquiryWebService.class);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getSupplierPriceSoh(String xmlSupplierPriceSohRequest, String authenticatedSupplierRepId, String authenticatedSupplierRepStateId) throws SOAPFaultException {
/*    */     try {
/* 78 */       AlmWebServiceManager almWsManager = 
/* 79 */         JndiWebServiceManager.getAlmWebServiceManager();
/* 80 */       if (almWsManager == null || 
/* 81 */         almWsManager.isAvailableGetSupplierPriceSoh()) {
/* 82 */         return (new SupplierPriceSohHelper()).getSupplierPriceSoh(
/* 83 */             xmlSupplierPriceSohRequest, authenticatedSupplierRepId, 
/* 84 */             authenticatedSupplierRepStateId);
/*    */       }
/* 86 */     } catch (Exception e) {
/* 87 */       log.error("getSupplierPriceSoh()", e);
/*    */     } 
/* 89 */     throw new SOAPFaultException(new QName(
/* 90 */           "http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 91 */         DEFAULT_XML_MESSAGE, DEFAULT_NAME_SPACE, 
/*    */ 
/*    */         
/* 94 */         null);
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\ALMEnquiryWebService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */