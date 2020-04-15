/*     */ package com.metcash.webservices.validation.pricesoh;
/*     */ 
/*     */ import com.metcash.common.services.SupplierService;
/*     */ import com.metcash.eai.util.ProductHelper;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.framework.dao.DAOAbstractFactory;
/*     */ import com.metcash.framework.dao.firestorm.FirestormDAOFactory;
/*     */ import com.metcash.model.dao.dao.SupplierLo40Dao;
/*     */ import com.metcash.model.dao.toa.TOAFactory;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.db.Allowance;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.Product;
/*     */ import com.metcash.model.segment.db.ProductSoh;
/*     */ import com.metcash.model.segment.db.PromotionalProduct;
/*     */ import com.metcash.model.segment.db.State;
/*     */ import com.metcash.model.segment.db.SupplierLo40;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SeverityType;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Bonus;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDA;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse;
/*     */ import com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail;
/*     */ import com.metcash.webservices.validation.ValidationResult;
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
/*     */ public class SupplierPriceSohValidationResult
/*     */   extends PriceSohValidationResult
/*     */ {
/*  47 */   private static Log log = LogFactory.getLog(SupplierPriceSohValidationResult.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  55 */   private SupplierPriceSohResponse response = new SupplierPriceSohResponse();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierPriceSohResponse getResponse() {
/*  64 */     return this.response;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int createProductResponse() {
/*  75 */     ProductResponse productResponse = new ProductResponse();
/*  76 */     int index = increaseProductResponseIndex();
/*  77 */     productResponse.setIndex(index + 1);
/*  78 */     this.response.addProductResponse(productResponse);
/*     */     
/*  80 */     return getCurrentProductResponseIndex();
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
/*     */   public void setMessage(int severity, String message) {
/*  92 */     if (severity == ValidationResult.ERROR) {
/*  93 */       setInError(true);
/*     */     }
/*     */     
/*  96 */     Message xmlMessage = new Message();
/*  97 */     xmlMessage.setData(message);
/*  98 */     xmlMessage
/*  99 */       .setSeverity(SeverityType.valueOf(severityToString(severity)));
/*     */     
/* 101 */     this.response.setMessage(xmlMessage);
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
/*     */   public void setProductResponseMessage(int severity, String message) {
/* 115 */     if (severity == ValidationResult.ERROR) {
/* 116 */       setInError(true);
/*     */     }
/*     */     
/* 119 */     ProductResponse productResponse = this.response
/* 120 */       .getProductResponse(getCurrentProductResponseIndex());
/* 121 */     Message xmlMessage = new Message();
/* 122 */     xmlMessage.setData(message);
/* 123 */     xmlMessage
/* 124 */       .setSeverity(SeverityType.valueOf(severityToString(severity)));
/* 125 */     productResponse.setMessage(xmlMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierProductDetail getCurrentSupplierProductDetail() {
/* 133 */     ProductResponse productResponse = this.response
/* 134 */       .getProductResponse(getCurrentProductResponseIndex());
/* 135 */     SupplierProductDetail supplierProductDetail = productResponse
/* 136 */       .getSupplierProductDetail();
/*     */     
/* 138 */     if (supplierProductDetail == null) {
/* 139 */       supplierProductDetail = new SupplierProductDetail();
/* 140 */       productResponse.setSupplierProductDetail(supplierProductDetail);
/*     */     } 
/*     */     
/* 143 */     return supplierProductDetail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierProductDetail(ProductSoh soh) {
/* 153 */     SupplierProductDetail supplierProductDetail = getCurrentSupplierProductDetail();
/*     */     
/* 155 */     supplierProductDetail.setSOH(convertUnitQtyToDecimalFormat(
/* 156 */           soh.stockOnHand.internalValue(), soh.packQty.internalValue()));
/* 157 */     supplierProductDetail.setSOHStatus(SOHStatusType.valueOf(soh.stockFlag
/* 158 */           .internalValue()));
/*     */     
/*     */     try {
/* 161 */       Product.ProductPK productKey = soh.getProductKey();
/* 162 */       SupplierService supplierService = new SupplierService();
/* 163 */       State state = supplierService.findStateStockPct(productKey.stateId
/* 164 */           .internalValue());
/* 165 */       supplierProductDetail.setSOHTimestamp(state.timeStamp
/* 166 */           .internalValue());
/*     */       
/* 168 */       SupplierLo40 supplierLo40 = findSupplierLO40Product(
/* 169 */           productKey.pillarId.internalValue(), productKey.stateId
/* 170 */           .internalValue(), soh.branchId.internalValue(), 
/* 171 */           soh.prSupplierId.internalValue(), productKey.productId
/* 172 */           .internalValue());
/* 173 */       if (supplierLo40 != null && supplierLo40.oosCases != null) {
/* 174 */         supplierProductDetail.setOnOrderQty(
/* 175 */             Integer.parseInt(supplierLo40.oosCases.internalValue()));
/*     */       }
/*     */     }
/* 178 */     catch (MetException me) {
/* 179 */       log.error("setSupplierProductDetail()", (Throwable)me);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierProductDetail(Customer customer, ProductView productView) {
/* 191 */     SupplierProductDetail supplierProductDetail = getCurrentSupplierProductDetail();
/*     */     
/* 193 */     supplierProductDetail.setProductCode(productView.getProductId()
/* 194 */         .internalValue());
/* 195 */     supplierProductDetail.setProductDescription(productView
/* 196 */         .getProductDescription().internalValue());
/* 197 */     supplierProductDetail.setBaseWS(productView.getBaseCostPriceExGST()
/* 198 */         .internalValue());
/* 199 */     Allowance allowance = productView.getAllowance();
/* 200 */     PromotionalProduct promotion = productView.getPromotionalProduct();
/* 201 */     if (allowance != null && 
/* 202 */       allowance.alwAllowanceExGst.internalValue() != 0) {
/* 203 */       supplierProductDetail.setDeal(allowance.alwAllowanceExGst
/* 204 */           .internalValue());
/* 205 */       supplierProductDetail.setDealDescription(allowance.allowanceType
/* 206 */           .getLongName());
/* 207 */       supplierProductDetail
/* 208 */         .setApplyQDA(allowance.qdaFlag.internalValue());
/* 209 */       supplierProductDetail.setApplyBonus(allowance.bonusFlag
/* 210 */           .internalValue());
/*     */     }
/* 212 */     else if (promotion != null) {
/* 213 */       supplierProductDetail.setDeal(promotion.allowanceExGST
/* 214 */           .internalValue());
/* 215 */       supplierProductDetail.setDealDescription(productView
/* 216 */           .getPromotionDescription().internalValue());
/* 217 */       supplierProductDetail.setApplyQDA(promotion.promotionQDAFlag
/* 218 */           .internalValue());
/* 219 */       supplierProductDetail.setApplyBonus(promotion.promotionBonusFlag
/* 220 */           .internalValue());
/*     */     } 
/*     */     
/* 223 */     if (productView.getUniversalDeal() != null && 
/* 224 */       productView.getUniversalDeal().getUniversalDealIncGST() != 0) {
/* 225 */       supplierProductDetail.setUniversalDeal(productView
/* 226 */           .getUniversalDeal().getUniversalDealIncGST());
/*     */     }
/*     */     
/* 229 */     int netWsPriceExTax = ProductHelper.calcNetWsaleInCents(productView, 
/* 230 */         false);
/* 231 */     int wet = Math.round(
/* 232 */         ProductHelper.calcWet(productView, netWsPriceExTax));
/* 233 */     int netWsPrice = netWsPriceExTax + wet;
/* 234 */     int deliveryFee = customer.deliveryFeePerCarton.internalValue();
/* 235 */     int gst = Math.round((netWsPrice + deliveryFee) * 
/* 236 */         0.1F);
/* 237 */     int casePrice = netWsPrice + deliveryFee + gst;
/* 238 */     supplierProductDetail.setWET(wet);
/* 239 */     supplierProductDetail.setNetWS(netWsPrice);
/* 240 */     supplierProductDetail.setDeliveryFee(deliveryFee);
/* 241 */     supplierProductDetail.setGST(gst);
/* 242 */     supplierProductDetail.setCasePrice(casePrice);
/*     */     
/* 244 */     int adminFeeCarton = ProductHelper.calcAdminFee(customer, netWsPrice);
/* 245 */     int financeFee = ProductHelper.calcFinanceFee(customer, netWsPrice);
/* 246 */     supplierProductDetail.setAdminFee(adminFeeCarton);
/* 247 */     supplierProductDetail.setFinanceFee(financeFee);
/* 248 */     int totalCasePrice = casePrice + adminFeeCarton + financeFee;
/* 249 */     supplierProductDetail.setTotalCasePrice(totalCasePrice);
/*     */     
/* 251 */     int luc = ProductHelper.calcLuc(customer, productView, true, true, 
/* 252 */         false);
/* 253 */     supplierProductDetail.setLUC(luc);
/*     */ 
/*     */     
/* 256 */     if (productView.getQdaGroup() != null) {
/* 257 */       String[] qdaDescs = productView.getQdaGroup().getDescriptions();
/* 258 */       QDAList xmlQdaList = new QDAList();
/* 259 */       QDA xmlQda = null;
/* 260 */       for (int a = 0; a < qdaDescs.length; a++) {
/* 261 */         xmlQda = new QDA();
/* 262 */         xmlQda.setIndex(a + 1);
/* 263 */         xmlQda.setDescription(qdaDescs[a]);
/* 264 */         xmlQdaList.addQDA(xmlQda);
/*     */       } 
/* 266 */       if (xmlQdaList.getQDACount() > 0) {
/* 267 */         supplierProductDetail.setQDAList(xmlQdaList);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 272 */     if (productView.getBonusGroup() != null) {
/* 273 */       String[] bonusDescs = productView.getBonusGroup().getDescriptions();
/* 274 */       BonusList xmlBonusList = new BonusList();
/* 275 */       Bonus xmlBonus = null;
/* 276 */       for (int a = 0; a < bonusDescs.length; a++) {
/* 277 */         xmlBonus = new Bonus();
/* 278 */         xmlBonus.setIndex(a + 1);
/* 279 */         xmlBonus.setDescription(bonusDescs[a]);
/* 280 */         xmlBonusList.addBonus(xmlBonus);
/*     */       } 
/* 282 */       if (xmlBonusList.getBonusCount() > 0) {
/* 283 */         supplierProductDetail.setBonusList(xmlBonusList);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 288 */     ParcelBuyList xmlAllPBs = new ParcelBuyList();
/* 289 */     if (productView.getQdaGroupParcel() != null) {
/* 290 */       String[] qdaPBDescs = productView.getQdaGroupParcel()
/* 291 */         .getDescriptions();
/* 292 */       ParcelBuy xmlParcelBuy = null;
/* 293 */       for (int a = 0; a < qdaPBDescs.length; a++) {
/* 294 */         xmlParcelBuy = new ParcelBuy();
/* 295 */         xmlParcelBuy.setIndex(a + 1);
/* 296 */         xmlParcelBuy.setDescription(qdaPBDescs[a]);
/* 297 */         xmlAllPBs.addParcelBuy(xmlParcelBuy);
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     if (productView.getBonusGroupParcel() != null) {
/* 302 */       String[] bonusPBDescs = productView.getBonusGroupParcel()
/* 303 */         .getDescriptions();
/* 304 */       ParcelBuy xmlParcelBuy = null;
/* 305 */       for (int a = 0; a < bonusPBDescs.length; a++) {
/* 306 */         xmlParcelBuy = new ParcelBuy();
/* 307 */         xmlParcelBuy.setIndex(a + 1);
/* 308 */         xmlParcelBuy.setDescription(bonusPBDescs[a]);
/* 309 */         xmlAllPBs.addParcelBuy(xmlParcelBuy);
/*     */       } 
/*     */     } 
/*     */     
/* 313 */     if (xmlAllPBs.getParcelBuyCount() > 0) {
/* 314 */       supplierProductDetail.setParcelBuyList(xmlAllPBs);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private SupplierLo40 findSupplierLO40Product(String slPillarId, String slStateId, String slBranchId, String slSupplierId, String slProductId) {
/* 321 */     SupplierLo40 supplierLo40 = null;
/*     */     try {
/* 323 */       TOAFactory toaFactory = new TOAFactory();
/* 324 */       FirestormDAOFactory factory = 
/* 325 */         (FirestormDAOFactory)DAOAbstractFactory.getDAOFactory(FirestormDAOFactory.class);
/* 326 */       SupplierLo40Dao supplierLo40Dao = (SupplierLo40Dao)factory
/* 327 */         .getFirestormDAO(SupplierLo40Dao.class);
/* 328 */       supplierLo40 = toaFactory.getSupplierLo40Segment(supplierLo40Dao
/* 329 */           .findByPrimaryKey(slPillarId, slStateId, slBranchId, 
/* 330 */             slSupplierId, slProductId));
/* 331 */     } catch (Exception e) {
/* 332 */       log.error("findSupplierLO40Product()", e);
/*     */     } 
/* 334 */     return supplierLo40;
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\SupplierPriceSohValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */