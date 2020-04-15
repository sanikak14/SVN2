/*     */ package com.metcash.webservices;
/*     */ 
/*     */ import com.metcash.webservices.utils.jndi.AlmWebServiceManager;
/*     */ import com.metcash.webservices.utils.jndi.JndiWebServiceManager;

/*     */ import javax.jws.WebService;
/*     */ import javax.xml.namespace.QName;
/*     */ import javax.xml.rpc.soap.SOAPFaultException;

/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ 
/*     */ @WebService(endpointInterface = "com.metcash.webservices.ALMService", serviceName = "ALMOrderWebService")
/*     */  public class ALMOrderWebService
/*     */   implements ALMService {
/*  16 */   public static String DEFAULT_XML_MESSAGE = "Unexpected Errors were encountered please contact your ALM administration team.";
/*  17 */   public static String BAD_REQUEST_MESSAGE = "Service Unavailable, Bad Request.";
/*  18 */   public static String DEFAULT_NAME_SPACE = "http://metcash";
/*     */   
			private static Log log = LogFactory.getLog(ALMOrderWebService.class);
/*     */  
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String submitRetailerOrder(String XMLOrder, String authenticatedRetailerId, String authenticatedRetailerStateId) throws SOAPFaultException {
/*     */     try {
				log.info("authenticatedRetailerStateId : "+ authenticatedRetailerStateId + "authenticatedRetailerId : "+ authenticatedRetailerId);
			    log.info("************"+XMLOrder );
			  
/*  32 */       AlmWebServiceManager almWsManager = JndiWebServiceManager.getAlmWebServiceManager();
/*  33 */       if (almWsManager == null || almWsManager.getSubmitRetailerOrderIsAvailable()) {
/*  34 */         return (new RetailerOrderHelper()).submitRetailerOrder(XMLOrder, authenticatedRetailerId, authenticatedRetailerStateId);
/*     */       }
			   
/*     */     }
/*  37 */     catch (Exception e) {
/*  38 */       log.error("submitRetailerOrder()", e);
/*     */     } 
/*  40 */     throw new SOAPFaultException(
/*  41 */         new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/*  42 */         DEFAULT_XML_MESSAGE, 
/*  43 */         DEFAULT_NAME_SPACE, 
/*     */         
/*  45 */         null);
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
/*     */   public String submitSupplierOrder(String XMLOrder, String authenticatedSupplierRepId, String authenticatedSupplierRepStateId) throws SOAPFaultException {
/*     */     try {
				log.info("************submitSupplierOrder:: authenticatedSupplierRepId : "+ authenticatedSupplierRepId);
				log.info("submitSupplierOrder::Process Order");
	/*  59 */       AlmWebServiceManager almWsManager = JndiWebServiceManager.getAlmWebServiceManager();
	/*  60 */       if (almWsManager == null || almWsManager.getSubmitSupplierOrderIsAvailable()) {
	/*  61 */         log.info("submitSupplierOrder() parsing SUPPLIER Order: authd supplier: : " + XMLOrder);
	/*  62 */         return (new SupplierOrderHelper()).submitSupplierOrder(XMLOrder, authenticatedSupplierRepId,authenticatedSupplierRepStateId);
	/*     */       }
/*     */    // }
/*  65 */     } catch (ValidationException ve) {
/*  66 */       log.error("submitSupplierOrder()", (Throwable)ve);
/*  67 */       throw new SOAPFaultException(
/*  68 */           new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/*  69 */           BAD_REQUEST_MESSAGE, 
/*  70 */           DEFAULT_NAME_SPACE, 
/*     */           
/*  72 */           null);
/*     */     }
/*  74 */     catch (MarshalException me) {
/*  75 */       log.error("submitSupplierOrder()", (Throwable)me);
/*  76 */       throw new SOAPFaultException(
/*  77 */           new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/*  78 */           BAD_REQUEST_MESSAGE, 
/*  79 */           DEFAULT_NAME_SPACE, 
/*     */           
/*  81 */           null);
/*     */     }
/*  83 */     catch (Exception e) {
/*  84 */       log.error("submitSupplierOrder()", e);
/*     */     } 
/*  86 */     throw new SOAPFaultException(
/*  87 */         new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/*  88 */         DEFAULT_XML_MESSAGE, 
/*  89 */         DEFAULT_NAME_SPACE, 
/*     */         
/*  91 */         null);
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
/*     */   public boolean authenticateUser(String stateCode, String userId, String password, String businessType) {
/* 105 */     boolean authenticated = false;
/* 106 */     log.info("authenticateUser:");
/* 107 */     log.info("...stateCode:" + stateCode);
/* 108 */     log.info("... userId:" + userId);
/* 109 */     log.info("... password:" + password);
/* 110 */     log.info("... businessType:" + businessType);
/* 111 */     if (businessType.equalsIgnoreCase("Retailer")) {
/* 112 */       log.info("Calling authenticate Retailer...");
/* 113 */       authenticated = (new RetailerOrderHelper()).authenticateRetailer(stateCode, userId, password);
/* 114 */       if (authenticated) {
/* 115 */         return authenticated;
/*     */       }
/*     */       
/* 118 */       throw new SOAPFaultException(
/* 119 */           new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 120 */           DEFAULT_XML_MESSAGE, 
/* 121 */           DEFAULT_NAME_SPACE, 
/*     */           
/* 123 */           null);
/*     */     } 
/*     */     
/* 126 */     if (businessType.equalsIgnoreCase("Supplier")) {
/* 127 */       log.info("authenticateUser:Calling authenticate Supplier...");
/* 128 */       authenticated = (new SupplierOrderHelper()).authenticateSupplier(stateCode, userId, password);
/* 129 */       if (authenticated) {
/* 130 */         return authenticated;
/*     */       }
/*     */       
/* 133 */       throw new SOAPFaultException(
/* 134 */           new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 135 */           DEFAULT_XML_MESSAGE, 
/* 136 */           DEFAULT_NAME_SPACE, 
/*     */           
/* 138 */           null);
/*     */     } 
/*     */     
/* 141 */     log.debug("RetailerOrderHelper - authentication was not for Supplier or Retailer therefore cannot process");
/* 142 */     throw new SOAPFaultException(
/* 143 */         new QName("http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 144 */         "Invalid User Credentials", 
/* 145 */         DEFAULT_NAME_SPACE, 
/*     */         
/* 147 */         null);
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
/*     */   public String getSupplierOrderStatus(String xmlSupplierOrderStatusRequest, String authenticatedSupplierRepId, String authenticatedSupplierRepStateId) throws SOAPFaultException {
/*     */     try {
/* 169 */       AlmWebServiceManager almWsManager = 
/* 170 */         JndiWebServiceManager.getAlmWebServiceManager();
/* 171 */       if (almWsManager == null || 
/* 172 */         almWsManager.isAvailableGetSupplierOrderStatus()) {
/* 173 */         return (new SupplierOrderStatusHelper()).getSupplierOrderStatus(
/* 174 */             xmlSupplierOrderStatusRequest, authenticatedSupplierRepId, 
/* 175 */             authenticatedSupplierRepStateId);
/*     */       }
/* 177 */     } catch (Exception e) {
/* 178 */       log.error("getSupplierOrderStatus()", e);
/*     */     } 
/* 180 */     throw new SOAPFaultException(new QName(
/* 181 */           "http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 182 */         DEFAULT_XML_MESSAGE, DEFAULT_NAME_SPACE, 
/*     */ 
/*     */         
/* 185 */         null);
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
/*     */   public String getSupplierOrderHistory(String xmlOrderHistoryRequest, String authenticatedUserId, String authenticatedUserStateId) throws SOAPFaultException {
/*     */     try {
/* 206 */       AlmWebServiceManager almWsManager = 
/* 207 */         JndiWebServiceManager.getAlmWebServiceManager();
/* 208 */       if (almWsManager == null || 
/* 209 */         almWsManager.isAvailableGetOrderHistory()) {
/* 210 */         return (new SupplierOrderHistoryHelper()).getOrderHistory(
/* 211 */             xmlOrderHistoryRequest, authenticatedUserId, 
/* 212 */             authenticatedUserStateId);
/*     */       }
/* 214 */     } catch (Exception e) {
/* 215 */       log.error("getOrderHistory()", e);
/*     */     } 
/* 217 */     throw new SOAPFaultException(new QName(
/* 218 */           "http://schemas.xmlsoap.org/soap/envelope/", "Server"), 
/* 219 */         DEFAULT_XML_MESSAGE, DEFAULT_NAME_SPACE, 
/*     */ 
/*     */         
/* 222 */         null);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\ALMOrderWebService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */