/*    */ package com.metcash.webservices;
/*    */ 
/*    */ import com.metcash.common.services.CustomerService;
/*    */ import com.metcash.model.segment.db.CustInfoIBA;
/*    */ import com.metcash.model.segment.db.IBACustDetails;
/*    */ import javax.jws.WebService;
/*    */ 
/*    */ @WebService(endpointInterface = "com.metcash.webservices.IBAService", serviceName = "IBACustomerWebService")
/*    */ public class IBACustomerWebService
/*    */   implements IBAService {
/*    */   public CustInfoIBA validateIBACustomer(String customerId, String stateId, String pillarId) throws Exception {
/* 12 */     CustInfoIBA custInfoIBA = new CustInfoIBA();
/*    */     try {
/* 14 */       CustomerService customerService = new CustomerService();
/* 15 */       IBACustDetails ibaCustDetails = customerService.findIBACustInfo(pillarId, stateId, customerId);
/* 16 */       if (ibaCustDetails != null) {
/* 17 */         custInfoIBA.setCustomerId(ibaCustDetails.getCustomerId());
/* 18 */         custInfoIBA.setStateId(ibaCustDetails.getStateId());
/* 19 */         custInfoIBA.setImgBrandId(ibaCustDetails.getImgBrandId());
/* 20 */         custInfoIBA.setBrandName(ibaCustDetails.getBrandName());
/* 21 */         custInfoIBA.setIbaRewardsCustomer(ibaCustDetails.getIbaRewardsCustomer());
/*    */       } else {
/* 23 */         custInfoIBA.setIbaRewardsCustomer("N");
/*    */       } 
/* 25 */     } catch (Exception e) {
/* 26 */       throw new Exception(
/* 27 */           "IBACustomerWebService.validateIBACustomer: Web Service: Exception while validating: \n" + e.getMessage());
/*    */     } 
/* 29 */     return custInfoIBA;
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\IBACustomerWebService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */