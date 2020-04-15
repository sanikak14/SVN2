/*     */ package com.metcash.webservices.handlers;
/*     */ 
/*     */ import com.metcash.common.services.CustomerService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.model.field.CustomerId;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierRepId;
/*     */ import com.metcash.model.segment.db.CustomerProfile;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.metcash.util.EncryptionUtility;
/*     */ import java.io.StringReader;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import javax.xml.namespace.QName;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.rpc.handler.GenericHandler;
/*     */ import javax.xml.rpc.handler.HandlerInfo;
/*     */ import javax.xml.rpc.handler.MessageContext;
/*     */ import javax.xml.rpc.handler.soap.SOAPMessageContext;
/*     */ import javax.xml.rpc.soap.SOAPFaultException;
/*     */ import javax.xml.soap.SOAPEnvelope;
/*     */ import javax.xml.soap.SOAPHeader;
/*     */ import javax.xml.soap.SOAPMessage;
/*     */ import javax.xml.soap.SOAPPart;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.NamedNodeMap;
/*     */ import org.w3c.dom.Node;
/*     */ import org.xml.sax.InputSource;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AuthenticationHandler
/*     */   extends GenericHandler
/*     */ {
/*  57 */   private static Log log = LogFactory.getLog(AuthenticationHandler.class);
/*     */ 
/*     */ 
/*     */   
/*     */   private HandlerInfo handlerInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init(HandlerInfo hi) {
/*  67 */     this.handlerInfo = hi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() {}
/*     */ 
/*     */   
/*     */   public QName[] getHeaders() {
/*  76 */     return this.handlerInfo.getHeaders();
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
/*     */   public boolean handleRequest(MessageContext mc) {
/*  89 */     log.debug("Inside the handle request of the handler. ");
/*  90 */     SOAPMessageContext messageContext = (SOAPMessageContext)mc;
/*     */     
/*  92 */     SOAPMessage msg = messageContext.getMessage();
/*  93 */     log.debug("SERVERSIDE - MESSAGE RECEIVED: " + msg.toString());
/*  94 */     SOAPPart part = msg.getSOAPPart();
/*     */     
/*     */     try {
/*  97 */       SOAPEnvelope envelope = part.getEnvelope();
/*  98 */       SOAPHeader header = envelope.getHeader();
/*  99 */       if (header == null)
/*     */       {
/* 101 */         throw new SOAPFaultException(null, null, null, null);
/*     */       }
/*     */       
/* 104 */       log.debug("SERVERSIDE - HEADER RECEIVED: " + header.toString());
/* 105 */       String headerMsg = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + header.toString();
/* 106 */       Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(headerMsg)));
/* 107 */       Element root = document.getDocumentElement();
/*     */       
/* 109 */       HashMap authHeaderMap = getAuthHeaderMap(new HashMap(), root);
/*     */       
/* 111 */       for (Iterator itera = authHeaderMap.keySet().iterator(); itera.hasNext();) {
/* 112 */         log.debug("Value is " + authHeaderMap.get(itera.next()));
/*     */       }
/*     */       
/* 115 */       String businessType = (String)authHeaderMap.get("BusinessType");
/* 116 */       String stateId = (String)authHeaderMap.get("StateCode");
/* 117 */       String userId = (String)authHeaderMap.get("UserId");
/* 118 */       String password = (String)authHeaderMap.get("Password");
/*     */       
/* 120 */       if (businessType.equalsIgnoreCase("RETAILER")) {
/* 121 */         boolean authRetailerResult = authenticateRetailer(stateId, userId, password);
/* 122 */         log.debug("result of customer authentication: " + authRetailerResult);
/* 123 */         return authRetailerResult;
/*     */       } 
/* 125 */       if (businessType.equalsIgnoreCase("SUPPLIER")) {
/* 126 */         boolean authSupplierResult = authenticateSupplier(stateId, userId, password);
/* 127 */         log.debug("result of supplier authentication: " + authSupplierResult);
/* 128 */         return authSupplierResult;
/*     */       } 
/*     */       
/* 131 */       return false;
/*     */     
/*     */     }
/* 134 */     catch (Exception ex) {
/* 135 */       log.warn("handleRequest()", ex);
/* 136 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static HashMap getAuthHeaderMap(HashMap<String, String> authHeaderMap, Node start) {
/* 142 */     if (start.getNodeName().equals("UserId")) {
/* 143 */       if (start.getFirstChild() != null && start.getFirstChild().getNodeType() == 3) {
/* 144 */         authHeaderMap.put("UserId", start.getFirstChild().getNodeValue());
/*     */       }
/* 146 */     } else if (start.getNodeName().equals("Password")) {
/* 147 */       if (start.getFirstChild() != null && start.getFirstChild().getNodeType() == 3) {
/* 148 */         authHeaderMap.put("Password", start.getFirstChild().getNodeValue());
/*     */       }
/* 150 */     } else if (start.getNodeName().equals("StateCode")) {
/* 151 */       if (start.getFirstChild() != null && start.getFirstChild().getNodeType() == 3) {
/* 152 */         authHeaderMap.put("StateCode", start.getFirstChild().getNodeValue());
/*     */       }
/* 154 */     } else if (start.getNodeName().equals("BusinessType") && 
/* 155 */       start.getFirstChild() != null && start.getFirstChild().getNodeType() == 3) {
/* 156 */       authHeaderMap.put("BusinessType", start.getFirstChild().getNodeValue());
/*     */     } 
/*     */ 
/*     */     
/* 160 */     for (Node child = start.getFirstChild(); child != null; child = child.getNextSibling()) {
/* 161 */       getAuthHeaderMap(authHeaderMap, child);
/*     */     }
/* 163 */     return authHeaderMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean authenticateSupplier(String stateId, String supplierRepId, String passwordStr) {
/*     */     try {
/* 170 */       SupplierRepService supplierRepService = new SupplierRepService();
/* 171 */       SupplierRep supplierRep = supplierRepService.findSupplierRep(PillarId.ALM, new StateId(stateId), new SupplierRepId(supplierRepId));
/* 172 */       if (supplierRep != null) {
/* 173 */         String storedPassword = null;
/* 174 */         storedPassword = supplierRep.password.internalValue();
/* 175 */         log.debug("Stored Password: " + storedPassword);
/* 176 */         if (EncryptionUtility.isEncrypted(storedPassword)) {
/* 177 */           log.debug("Encryption Present. Now enc the supplied pass.");
/* 178 */           passwordStr = EncryptionUtility.hashWithAlgorithm(passwordStr);
/* 179 */           log.debug("Pass: " + passwordStr);
/*     */         } 
/* 181 */         if (storedPassword != null && passwordStr != null) {
/* 182 */           return passwordStr.equals(storedPassword);
/*     */         }
/* 184 */         return false;
/*     */       }
/*     */     
/*     */     }
/* 188 */     catch (Exception ex) {
/* 189 */       log.warn("authenticateSupplier()", ex);
/*     */     } 
/* 191 */     return false;
/*     */   }
/*     */   private boolean authenticateRetailer(String stateId, String customerId, String password) {
/*     */     try {
/* 195 */       log.debug("inside the authenticate retailer method");
/* 196 */       CustomerService service = new CustomerService();
/* 197 */       CustomerProfile customerProfile = service.findCustomerProfile(PillarId.ALM, new StateId(stateId), new CustomerId(customerId));
/*     */       
/* 199 */       if (customerProfile != null) {
/* 200 */         log.debug("If customer is not null");
/* 201 */         String storedPassword = null;
/* 202 */         storedPassword = customerProfile.password.internalValue();
/* 203 */         log.debug("Stored customer Password: " + storedPassword);
/* 204 */         if (EncryptionUtility.isEncrypted(storedPassword)) {
/* 205 */           log.debug("Encryption Present. Now enc the customer pass.");
/* 206 */           password = EncryptionUtility.hashWithAlgorithm(password);
/* 207 */           log.debug("Password is : " + password);
/*     */         } 
/* 209 */         if (storedPassword != null && password != null) {
/* 210 */           return password.equals(storedPassword);
/*     */         }
/* 212 */         return false;
/*     */       }
/*     */     
/*     */     }
/* 216 */     catch (Exception ex) {
/* 217 */       log.warn("authenticateRetailer()", ex);
/*     */     } 
/* 219 */     return false;
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
/*     */   public boolean handleResponse(MessageContext mc) {
/* 239 */     return true;
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
/*     */   public boolean handleFault(MessageContext mc) {
/* 251 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 256 */     printMsgParams("");
/*     */   }
/*     */   
/*     */   private static void printMsgParams(String msg) {
/*     */     try {
/* 261 */       String xmlDocTag = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
/* 262 */       msg = String.valueOf(xmlDocTag) + msg;
/*     */       
/* 264 */       Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(msg)));
/* 265 */       Element root = document.getDocumentElement();
/*     */ 
/*     */       
/* 268 */       HashMap authHeaderMap = getAuthHeaderMap(new HashMap(), root);
/* 269 */       for (Iterator itera = authHeaderMap.keySet().iterator(); itera.hasNext();) {
/* 270 */         log.debug("Value is " + authHeaderMap.get(itera.next()));
/*     */       }
/*     */     }
/* 273 */     catch (Exception e) {
/* 274 */       log.warn("printMsgParams()", e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void stepThru(Node start) {
/* 279 */     log.debug("Child node step thru.. name: " + start.getNodeName() + " value: " + start.getNodeValue());
/* 280 */     for (Node child = start.getFirstChild(); child != null; child = child.getNextSibling()) {
/* 281 */       stepThru(child);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static void stepThruAll(Node start) {
/* 287 */     log.debug(String.valueOf(start.getNodeName()) + " = " + start.getNodeValue());
/*     */     
/* 289 */     if (start.getNodeType() == 1) {
/* 290 */       NamedNodeMap startAttr = start.getAttributes();
/* 291 */       for (int i = 0; i < startAttr.getLength(); i++) {
/* 292 */         Node attr = startAttr.item(i);
/* 293 */         log.debug("  Attribute:  " + attr.getNodeName() + " = " + attr.getNodeValue());
/*     */       } 
/*     */     } 
/*     */     
/* 297 */     for (Node child = start.getFirstChild(); child != null; child = child.getNextSibling())
/* 298 */       stepThruAll(child); 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\handlers\AuthenticationHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */