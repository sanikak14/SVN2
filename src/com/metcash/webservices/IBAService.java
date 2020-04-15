package com.metcash.webservices;

import com.metcash.model.segment.db.CustInfoIBA;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IBAService {
  @WebMethod
  CustInfoIBA validateIBACustomer(@WebParam(name = "customerId") String paramString1, @WebParam(name = "stateId") String paramString2, @WebParam(name = "pillarId") String paramString3) throws Exception;
}


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\IBAService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */