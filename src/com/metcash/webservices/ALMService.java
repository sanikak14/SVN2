package com.metcash.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.rpc.soap.SOAPFaultException;

@WebService
public interface ALMService {
  @WebMethod
  String submitRetailerOrder(@WebParam(name = "XMLOrder") String paramString1, @WebParam(name = "authenticatedRetailerId") String paramString2, @WebParam(name = "authenticatedRetailerStateId") String paramString3) throws SOAPFaultException;
  
  @WebMethod
  String submitSupplierOrder(@WebParam(name = "XMLOrder") String paramString1, @WebParam(name = "authenticatedSupplierRepId") String paramString2, @WebParam(name = "authenticatedSupplierRepStateId") String paramString3) throws SOAPFaultException;
  
  @WebMethod
  boolean authenticateUser(@WebParam(name = "stateCode") String paramString1, @WebParam(name = "userId") String paramString2, @WebParam(name = "password") String paramString3, @WebParam(name = "businessType") String paramString4);
  
  @WebMethod
  String getSupplierOrderStatus(@WebParam(name = "xmlSupplierOrderStatusRequest") String paramString1, @WebParam(name = "authenticatedSupplierRepId") String paramString2, @WebParam(name = "authenticatedSupplierRepStateId") String paramString3) throws SOAPFaultException;
  
  @WebMethod
  String getSupplierOrderHistory(@WebParam(name = "xmlOrderHistoryRequest") String paramString1, @WebParam(name = "authenticatedUserId") String paramString2, @WebParam(name = "authenticatedUserStateId") String paramString3) throws SOAPFaultException;
}


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\ALMService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */