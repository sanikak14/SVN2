/*     */ package com.metcash.webservices.cache;
/*     */ 
/*     */ import com.metcash.common.services.CustomerService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.common.services.SupplierService;
/*     */ import com.metcash.model.field.CustomerId;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierId;
/*     */ import com.metcash.model.field.SupplierRepId;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.opensymphony.oscache.base.NeedsRefreshException;
/*     */ import com.opensymphony.oscache.general.GeneralCacheAdministrator;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ public class OSCacheHelper
/*     */ {
/*  36 */   protected static GeneralCacheAdministrator admin = new GeneralCacheAdministrator();
/*     */   
/*     */   protected static final int REFRESH_PERIOD = 300;
/*  39 */   private static Log log = LogFactory.getLog(OSCacheHelper.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Customer getCustomerFromCache(PillarId pillarId, StateId stateId, CustomerId customerId) {
/*  46 */     Customer customer = null;
/*  47 */     log.debug("OSCacheHelper:getSupplierCatalogueFromCache about to check cache...");
/*  48 */     String key = String.valueOf(pillarId.internalValue()) + ":" + stateId.internalValue() + ":" + customerId.internalValue();
/*     */     
/*     */     try {
/*  51 */       customer = (Customer)admin.getFromCache(key, 300);
/*  52 */       if (customer != null) {
/*  53 */         log.debug("OSCacheHelper:getCustomerFromCache: found customer " + customer.customerId.internalValue());
/*     */       } else {
/*     */         
/*  56 */         log.debug("OSCacheHelper:getCustomerFromCache customer was null in cache");
/*     */       }
/*     */     
/*  59 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/*  64 */         CustomerService customerService = new CustomerService();
/*  65 */         customer = customerService.findCustomer(
/*  66 */             pillarId, 
/*  67 */             customerId, 
/*  68 */             stateId);
/*     */         
/*  70 */         admin.putInCache(key, customer);
/*     */       }
/*  72 */       catch (Exception ex) {
/*     */         
/*  74 */         customer = (Customer)nre.getCacheContent();
/*     */ 
/*     */         
/*  77 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/*  80 */     return customer;
/*     */   }
/*     */ 
/*     */   
/*     */   public static SupplierRep getSupplierRepFromCache(PillarId pillarId, StateId stateId, SupplierRepId supplierRepId) {
/*  85 */     SupplierRep supplierRep = null;
/*  86 */     log.debug("OSCacheHelper:getSupplierCatalogueFromCache about to check cache...");
/*  87 */     String key = String.valueOf(pillarId.internalValue()) + ":" + stateId.internalValue() + ":" + supplierRepId.internalValue();
/*     */     
/*     */     try {
/*  90 */       supplierRep = (SupplierRep)admin.getFromCache(key, 300);
/*  91 */       if (supplierRep != null) {
/*  92 */         log.debug("OSCacheHelper:getSupplierRepFromCache Wrapper was found of size " + supplierRep.supplierId.internalValue());
/*     */       } else {
/*     */         
/*  95 */         log.debug("OSCacheHelper:getSupplierRepFromCache Wrapper was null in cache");
/*     */       }
/*     */     
/*  98 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/* 103 */         SupplierRepService repService = new SupplierRepService();
/* 104 */         supplierRep = repService.findSupplierRep(
/* 105 */             pillarId, 
/* 106 */             stateId, 
/* 107 */             supplierRepId);
/*     */         
/* 109 */         admin.putInCache(key, supplierRep);
/*     */       }
/* 111 */       catch (Exception ex) {
/*     */         
/* 113 */         supplierRep = (SupplierRep)nre.getCacheContent();
/*     */ 
/*     */         
/* 116 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/* 119 */     return supplierRep;
/*     */   }
/*     */   
/*     */   public static List getChildSuppliersFromCache(PillarId pillarId, StateId stateId, SupplierId supplierId) {
/* 123 */     List supplierChildIds = null;
/* 124 */     log.debug("OSCacheHelper:getChildSuppliersFromCache about to check cache...");
/* 125 */     String key = "SUPP_LINK:" + pillarId.internalValue() + ":" + stateId.internalValue() + ":" + supplierId.internalValue();
/*     */     
/*     */     try {
/* 128 */       supplierChildIds = (List)admin.getFromCache(key, 300);
/* 129 */       if (supplierChildIds != null) {
/* 130 */         log.debug("OSCacheHelper:getChildSuppliersFromCache suppIds was found of size " + supplierChildIds.size());
/*     */       } else {
/* 132 */         log.debug("OSCacheHelper:getChildSuppliersFromCache suppIds was null in cache");
/*     */       }
/*     */     
/* 135 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */ 			log.debug("********CALLING findChildSupplierIds**********" + pillarId+ " ," + stateId + " , "+ supplierId);
/*     */         
/* 141 */         SupplierService supplierService = new SupplierService();
/* 142 */         supplierChildIds = supplierService.findChildSupplierIds(pillarId, stateId, supplierId);
/*     */ 
/*     */         

/* 145 */         admin.putInCache(key, supplierChildIds);
/*     */       }
/* 147 */       catch (Exception ex) {
/*     */         
/* 149 */         supplierChildIds = (List)nre.getCacheContent();
/*     */ 
/*     */         
/* 152 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
log.debug("*******Return supplierChildIds*****************************"+ supplierChildIds);
/* 155 */     return supplierChildIds;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\cache\OSCacheHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */