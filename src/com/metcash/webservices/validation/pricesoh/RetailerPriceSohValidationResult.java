/*     */ package com.metcash.webservices.validation.pricesoh;
/*     */ 
/*     */ import com.metcash.common.services.SupplierService;
/*     */ import com.metcash.eai.util.ProductHelper;
/*     */ import com.metcash.exception.MetException;
/*     */ import com.metcash.model.segment.ProductView;
/*     */ import com.metcash.model.segment.db.Allowance;
/*     */ import com.metcash.model.segment.db.Customer;
/*     */ import com.metcash.model.segment.db.Product;
/*     */ import com.metcash.model.segment.db.ProductSoh;
/*     */ import com.metcash.model.segment.db.PromotionalProduct;
/*     */ import com.metcash.model.segment.db.State;
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Message;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuy;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ProductResponse;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerPriceSohResponse;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail;
/*     */ import com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType;
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
/*     */ public class RetailerPriceSohValidationResult
/*     */   extends PriceSohValidationResult
/*     */ {
/*  42 */   private static Log log = LogFactory.getLog(RetailerPriceSohValidationResult.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  50 */   private RetailerPriceSohResponse response = new RetailerPriceSohResponse();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RetailerPriceSohResponse getResponse() {
/*  59 */     return this.response;
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
/*  70 */     ProductResponse productResponse = new ProductResponse();
/*  71 */     int index = increaseProductResponseIndex();
/*  72 */     productResponse.setIndex(index + 1);
/*  73 */     this.response.addProductResponse(productResponse);
/*     */     
/*  75 */     return getCurrentProductResponseIndex();
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
/*  87 */     if (severity == ValidationResult.ERROR) {
/*  88 */       setInError(true);
/*     */     }
/*     */     
/*  91 */     Message xmlMessage = new Message();
/*  92 */     xmlMessage.setMessageData(message);
/*  93 */     xmlMessage.setMessageSeverity(
/*  94 */         MessageSeverityType.valueOf(severityToString(severity)));
/*     */     
/*  96 */     this.response.setMessage(xmlMessage);
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
/* 110 */     if (severity == ValidationResult.ERROR) {
/* 111 */       setInError(true);
/*     */     }
/*     */     
/* 114 */     ProductResponse productResponse = this.response
/* 115 */       .getProductResponse(getCurrentProductResponseIndex());
/* 116 */     Message xmlMessage = new Message();
/* 117 */     xmlMessage.setMessageData(message);
/* 118 */     xmlMessage.setMessageSeverity(
/* 119 */         MessageSeverityType.valueOf(severityToString(severity)));
/* 120 */     productResponse.setMessage(xmlMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RetailerProductDetail getCurrentRetailerProductDetail() {
/* 128 */     ProductResponse productResponse = this.response
/* 129 */       .getProductResponse(getCurrentProductResponseIndex());
/* 130 */     RetailerProductDetail retailerProductDetail = productResponse
/* 131 */       .getRetailerProductDetail();
/*     */     
/* 133 */     if (retailerProductDetail == null) {
/* 134 */       retailerProductDetail = new RetailerProductDetail();
/* 135 */       productResponse.setRetailerProductDetail(retailerProductDetail);
/*     */     } 
/*     */     
/* 138 */     return retailerProductDetail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRetailerProductDetail(ProductSoh soh) {
/* 148 */     RetailerProductDetail retailerProductDetail = getCurrentRetailerProductDetail();
/*     */     
/* 150 */     retailerProductDetail.setSOH(convertUnitQtyToDecimalFormat(
/* 151 */           soh.stockOnHand.internalValue(), soh.packQty.internalValue()));
/* 152 */     retailerProductDetail.setSOHStatus(SOHStatusType.valueOf(soh.stockFlag
/* 153 */           .internalValue()));
/*     */     
/*     */     try {
/* 156 */       Product.ProductPK productKey = soh.getProductKey();
/* 157 */       SupplierService supplierService = new SupplierService();
/* 158 */       State state = supplierService.findStateStockPct(productKey.stateId
/* 159 */           .internalValue());
/* 160 */       retailerProductDetail.setSOHTimestamp(state.timeStamp
/* 161 */           .internalValue());
/*     */     }
/* 163 */     catch (MetException me) {
/* 164 */       log.error("setRetailerProductDetail()", (Throwable)me);
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
/*     */   public void setRetailerProductDetail(Customer customer, ProductView productView) {
/* 176 */     RetailerProductDetail retailerProductDetail = getCurrentRetailerProductDetail();
/*     */     
/* 178 */     retailerProductDetail.setProductCode(productView.getProductId()
/* 179 */         .internalValue());
/* 180 */     retailerProductDetail.setProductDescription(productView
/* 181 */         .getProductDescription().internalValue());
/*     */     
/* 183 */     Allowance allowance = productView.getAllowance();
/* 184 */     PromotionalProduct promotion = productView.getPromotionalProduct();
/* 185 */     if (allowance != null && 
/* 186 */       allowance.alwAllowanceExGst.internalValue() != 0) {
/* 187 */       retailerProductDetail.setDeal(allowance.alwAllowanceExGst
/* 188 */           .internalValue());
/* 189 */     } else if (promotion != null) {
/* 190 */       retailerProductDetail.setDeal(promotion.allowanceExGST
/* 191 */           .internalValue());
/*     */     } 
/* 193 */     if (productView.getUniversalDeal() != null && 
/* 194 */       productView.getUniversalDeal().getUniversalDealIncGST() != 0) {
/* 195 */       retailerProductDetail.setUniversalDeal(productView
/* 196 */           .getUniversalDeal().getUniversalDealIncGST());
/*     */     }
/*     */     
/* 199 */     retailerProductDetail.setNetWS(ProductHelper.calcNetWsaleInCents(
/* 200 */           productView, true));
/*     */     
/* 202 */     int luc = ProductHelper.calcLuc(customer, productView, true, true, 
/* 203 */         false);
/* 204 */     retailerProductDetail.setLUC(luc);
/*     */ 
/*     */     
/* 207 */     if (productView.getQdaGroup() != null) {
/* 208 */       String[] qdaDescs = productView.getQdaGroup().getDescriptions();
/* 209 */       QDAList xmlQdaList = new QDAList();
/* 210 */       QDA xmlQda = null;
/* 211 */       for (int a = 0; a < qdaDescs.length; a++) {
/* 212 */         xmlQda = new QDA();
/* 213 */         xmlQda.setIndex(a + 1);
/* 214 */         xmlQda.setDescription(qdaDescs[a]);
/* 215 */         xmlQdaList.addQDA(xmlQda);
/*     */       } 
/* 217 */       if (xmlQdaList.getQDACount() > 0) {
/* 218 */         retailerProductDetail.setQDAList(xmlQdaList);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 223 */     if (productView.getBonusGroup() != null) {
/* 224 */       String[] bonusDescs = productView.getBonusGroup().getDescriptions();
/* 225 */       BonusList xmlBonusList = new BonusList();
/* 226 */       Bonus xmlBonus = null;
/* 227 */       for (int a = 0; a < bonusDescs.length; a++) {
/* 228 */         xmlBonus = new Bonus();
/* 229 */         xmlBonus.setIndex(a + 1);
/* 230 */         xmlBonus.setDescription(bonusDescs[a]);
/* 231 */         xmlBonusList.addBonus(xmlBonus);
/*     */       } 
/* 233 */       if (xmlBonusList.getBonusCount() > 0) {
/* 234 */         retailerProductDetail.setBonusList(xmlBonusList);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 239 */     ParcelBuyList xmlAllPBs = new ParcelBuyList();
/* 240 */     if (productView.getQdaGroupParcel() != null) {
/* 241 */       String[] qdaPBDescs = productView.getQdaGroupParcel()
/* 242 */         .getDescriptions();
/* 243 */       ParcelBuy xmlParcelBuy = null;
/* 244 */       for (int a = 0; a < qdaPBDescs.length; a++) {
/* 245 */         xmlParcelBuy = new ParcelBuy();
/* 246 */         xmlParcelBuy.setIndex(a + 1);
/* 247 */         xmlParcelBuy.setDescription(qdaPBDescs[a]);
/* 248 */         xmlAllPBs.addParcelBuy(xmlParcelBuy);
/*     */       } 
/*     */     } 
/*     */     
/* 252 */     if (productView.getBonusGroupParcel() != null) {
/* 253 */       String[] bonusPBDescs = productView.getBonusGroupParcel()
/* 254 */         .getDescriptions();
/* 255 */       ParcelBuy xmlParcelBuy = null;
/* 256 */       for (int a = 0; a < bonusPBDescs.length; a++) {
/* 257 */         xmlParcelBuy = new ParcelBuy();
/* 258 */         xmlParcelBuy.setIndex(a + 1);
/* 259 */         xmlParcelBuy.setDescription(bonusPBDescs[a]);
/* 260 */         xmlAllPBs.addParcelBuy(xmlParcelBuy);
/*     */       } 
/*     */     } 
/*     */     
/* 264 */     if (xmlAllPBs.getParcelBuyCount() > 0) {
/* 265 */       retailerProductDetail.setParcelBuyList(xmlAllPBs);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRetailerProductDetail(int luc) {
/* 275 */     RetailerProductDetail retailerProductDetail = getCurrentRetailerProductDetail();
/* 276 */     retailerProductDetail.setLUC(luc);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\pricesoh\RetailerPriceSohValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */