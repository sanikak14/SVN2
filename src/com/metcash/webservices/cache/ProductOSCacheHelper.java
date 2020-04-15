/*     */ package com.metcash.webservices.cache;
/*     */ 
/*     */ import com.metcash.common.services.ProductService;
/*     */ import com.metcash.common.services.SupplierRepProductService;
/*     */ import com.metcash.common.services.SupplierService;
/*     */ import com.metcash.framework.dao.DAOAbstractFactory;
/*     */ import com.metcash.framework.dao.firestorm.FirestormDAOFactory;
/*     */ import com.metcash.model.dao.dao.VProductDetailDao;
/*     */ import com.metcash.model.dao.dto.VProductDetail;
/*     */ import com.metcash.model.dao.toa.TOAFactory;
/*     */ import com.metcash.model.field.CustomerId;
/*     */ import com.metcash.model.field.PillarId;
/*     */ import com.metcash.model.field.StateId;
/*     */ import com.metcash.model.field.SupplierId;
/*     */ import com.metcash.model.segment.ProductViewWrapper;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.ProductDetail;
/*     */ import com.metcash.model.segment.db.SupplierRep;
/*     */ import com.opensymphony.oscache.base.NeedsRefreshException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ public class ProductOSCacheHelper
/*     */   extends OSCacheHelper
/*     */ {
/*  28 */   private ProductService productService = null;
/*     */   private FirestormDAOFactory daoFactory;
/*  30 */   private TOAFactory toaFactory = new TOAFactory();
/*     */   
/*     */   private VProductDetailDao vProductDetailDao;
/*  33 */   private static Log log = LogFactory.getLog(ProductOSCacheHelper.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static HashMap getSupplierCrossReferenceMapFromCache(PillarId pillarId, StateId stateId, SupplierId supplierId) {
/*  39 */     HashMap crossRefMap = null;
/*  40 */     log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache about to check cache... stateId "+ stateId);
/*  41 */     String key = "XREF:" + pillarId.internalValue() + ":" + stateId.internalValue() + ":" + supplierId.internalValue();
/*     */     
/*     */     try {
/*  44 */       crossRefMap = (HashMap)admin.getFromCache(key, 300);
/*  45 */       if (crossRefMap != null) {
/*  46 */         log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache crossRefMap was found of size " + crossRefMap.size());
/*     */       } else {
/*     */         
/*  49 */         log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache crossRefMap was null in cache");
/*     */       }
/*     */     
/*  52 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */ 
/*     */         
/*  58 */         SupplierService supplierService = new SupplierService();
/*  59 */         List supplierChildIds = getChildSuppliersFromCache(pillarId, stateId, supplierId);
/*     */ 
/*     */         
/*  62 */         if (supplierChildIds == null) {
/*  63 */           crossRefMap = supplierService.findSupplierCrossRefIds(pillarId, supplierId);
/*     */         } else {
/*     */           
/*  66 */           crossRefMap = supplierService.findSupplierCrossRefIds(pillarId, supplierChildIds);
/*     */         } 
/*     */ 
/*     */         
/*  70 */         admin.putInCache(key, crossRefMap);
/*     */       }
/*  72 */       catch (Exception ex) {
/*     */         
/*  74 */         crossRefMap = (HashMap)nre.getCacheContent();
/*     */ 
/*     */         
/*  77 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/*  80 */     return crossRefMap;
/*     */   }
/*     */   
/*     */   public static HashMap getSupplierCrossReferenceMapFromCache(SupplierRep supplierRep, Customer customer) {
/*  84 */     HashMap crossRefMap = null;
/*  85 */     log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache about to check cache...");
/*  86 */     String key = "XREF:" + (supplierRep.getSupplierRepKey()).pillarId.internalValue() + ":" + customer.stateId.internalValue() + ":" + 
/*  87 */       supplierRep.supplierId.internalValue();
/*     */     
/*     */     try {
/*  90 */       crossRefMap = (HashMap)admin.getFromCache(key, 300);
/*  91 */       if (crossRefMap != null) {
/*  92 */         log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache crossRefMap was found of size " + crossRefMap.size());
/*     */       } else {
/*     */         
/*  95 */         log.debug("OSCacheHelper:getSupplierCrossReferenceMapFromCache crossRefMap was null in cache");
/*     */       }
/*     */     
/*  98 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */ 
/*     */         
/* 104 */         SupplierService supplierService = new SupplierService();
/* 105 */         List supplierChildIds = getChildSuppliersFromCache((supplierRep.getSupplierRepKey()).pillarId, customer.stateId, supplierRep.supplierId);
/*     */ 
/*     */         
/* 108 */         if (supplierChildIds == null) {
/* 109 */           crossRefMap = supplierService.findSupplierCrossRefIds((supplierRep.getSupplierRepKey()).pillarId, supplierRep.supplierId);
/*     */         } else {
/*     */           
/* 112 */           crossRefMap = supplierService.findSupplierCrossRefIds((supplierRep.getSupplierRepKey()).pillarId, supplierChildIds);
/*     */         } 
/*     */ 
/*     */         
/* 116 */         admin.putInCache(key, crossRefMap);
/*     */       }
/* 118 */       catch (Exception ex) {
/*     */         
/* 120 */         crossRefMap = (HashMap)nre.getCacheContent();
/*     */ 
/*     */         
/* 123 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/* 126 */     return crossRefMap;
/*     */   }
/*     */   
/*     */   public static ProductViewWrapper getSupplierCatalogueFromCache(PillarId pillarId, StateId customerStateId, CustomerId customerId, SupplierId supplierId) {
/* 130 */     ProductViewWrapper wrapper = null;
/* 131 */     log.debug("OSCacheHelper:getSupplierCatalogueFromCache about to check cache...");
/* 132 */     String key = String.valueOf(pillarId.internalValue()) + ":" + customerStateId.internalValue() + ":" + customerId.internalValue() + ":" + supplierId.internalValue();
/*     */     
/*     */     try {
/* 135 */       wrapper = (ProductViewWrapper)admin.getFromCache(key, 300);
/* 136 */       if (wrapper != null) {
/* 137 */         log.debug("OSCacheHelper:getSupplierCatalogueFromCache Wrapper was found of size " + wrapper.size());
/*     */       } else {
/*     */         
/* 140 */         log.debug("OSCacheHelper:getSupplierCatalogueFromCache Wrapper was null in cache");
/*     */       }
/*     */     
/* 143 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/* 148 */         SupplierRepProductService productService = new SupplierRepProductService();
/* 149 */         wrapper = productService.repRetProductSearch(pillarId, customerStateId, customerId, supplierId);
/*     */         
/* 151 */         admin.putInCache(key, wrapper);
/*     */       }
/* 153 */       catch (Exception ex) {
/*     */         
/* 155 */         wrapper = (ProductViewWrapper)nre.getCacheContent();
/*     */ 
/*     */         
/* 158 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/* 161 */     return wrapper;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ProductViewWrapper getSupplierCatalogueFromCache(PillarId pillarId, StateId customerStateId, CustomerId customerId, List childSupplierIds, SupplierId supplierId) {
/* 166 */     ProductViewWrapper wrapper = null;
/* 167 */     log.debug("OSCacheHelper:getSupplierCatalogueFromCache about to check cache...");
/* 168 */     String key = String.valueOf(pillarId.internalValue()) + ":" + customerStateId.internalValue() + ":" + customerId.internalValue() + ":" + supplierId.internalValue() + ":" + 
/* 169 */       "childList";
/*     */     
/*     */     try {
/* 172 */       wrapper = (ProductViewWrapper)admin.getFromCache(key, 300);
/* 173 */       if (wrapper != null) {
/* 174 */         log.debug("OSCacheHelper:getSupplierCatalogueFromCache Wrapper was found of size " + wrapper.size());
/*     */       } else {
/*     */         
/* 177 */         log.debug("OSCacheHelper:getSupplierCatalogueFromCache Wrapper was null in cache");
/*     */       }
/*     */     
/* 180 */     } catch (NeedsRefreshException nre) {
/*     */ 
/*     */       
/*     */       try {
/*     */         log.debug("********************repRetProductSearch************************customerStateId: " + customerStateId);
/* 185 */         SupplierRepProductService productService = new SupplierRepProductService();
/* 186 */         wrapper = productService.repRetProductSearch(pillarId, customerStateId, customerId, childSupplierIds);
/*     */         
/* 188 */         admin.putInCache(key, wrapper);
/*     */       }
/* 190 */       catch (Exception ex) {
/*     */         
/* 192 */         wrapper = (ProductViewWrapper)nre.getCacheContent();
/*     */ 
/*     */         
/* 195 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/* 198 */     return wrapper;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProductDetail findProductDetail(Customer customer, String productCode) {
/* 208 */     ProductDetail productDetail = null;
/* 209 */     VProductDetail vProductDetail = null;
/* 210 */     String key = String.valueOf((customer.getCustomerKey()).pillarId.internalValue()) + ":" + (customer.getCustomerKey()).stateId.internalValue() + ":" + customer.branchId.internalValue() + ":" + productCode + ":ProductDetail";
/*     */     
/*     */     try {
/* 213 */       productDetail = (ProductDetail)admin.getFromCache(key, 300);
/* 214 */       if (productDetail != null) {
/* 215 */         log.debug("OSCacheHelper:findProductDetail productDetail was found of size " + (productDetail.getProductKey()).productId);
/*     */       } else {
/*     */         
/* 218 */         log.debug("OSCacheHelper:findProductDetail productDetail was null in cache");
/*     */       }
/*     */     
/* 221 */     } catch (NeedsRefreshException nre) {
/*     */       try {
/* 223 */         this.daoFactory = (FirestormDAOFactory)DAOAbstractFactory.getDAOFactory(FirestormDAOFactory.class);
/* 224 */         this.vProductDetailDao = (VProductDetailDao)this.daoFactory.getFirestormDAO(VProductDetailDao.class);
/*     */         
/* 226 */         vProductDetail = this.vProductDetailDao.findDetailByProduct((customer.getCustomerKey()).pillarId.internalValue(), 
/* 227 */             (customer.getCustomerKey()).stateId.internalValue(), 
/* 228 */             customer.branchId.internalValue(), 
/* 229 */             customer.wholesaleCode.internalValue(), 
/* 230 */             productCode);
/* 231 */         if (vProductDetail != null) {
/* 232 */           productDetail = this.toaFactory.getVProductDetailSegment(vProductDetail);
/*     */           
/* 234 */           admin.putInCache(key, productDetail);
/*     */         } else {
/* 236 */           log.error("Problem retrieving product from dbms.");
/* 237 */           admin.cancelUpdate(key);
/*     */         }
/*     */       
/* 240 */       } catch (Exception e) {
/* 241 */         log.error("Problem retrieving product from dbms.", e);
/*     */         
/* 243 */         productDetail = (ProductDetail)nre.getCacheContent();
/*     */ 
/*     */         
/* 246 */         admin.cancelUpdate(key);
/*     */       } 
/*     */     } 
/* 249 */     return productDetail;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\cache\ProductOSCacheHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */