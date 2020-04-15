/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation;
/*     */ 
/*     */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ import java.util.Date;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.Marshaller;
/*     */ import org.exolab.castor.xml.Unmarshaller;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ import org.exolab.castor.xml.Validator;
/*     */ import org.xml.sax.ContentHandler;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RetailerProductDetail
/*     */   implements Serializable
/*     */ {
/*     */   private String _productCode;
/*     */   private String _productDescription;
/*     */   private long _deal;
/*     */   private boolean _has_deal;
/*     */   private long _universalDeal;
/*     */   private boolean _has_universalDeal;
/*     */   private long _netWS;
/*     */   private boolean _has_netWS;
/*     */   private long _LUC;
/*     */   private boolean _has_LUC;
/*     */   private String _SOH;
/*     */   private SOHStatusType _SOHStatus;
/*     */   private Date _SOHTimestamp;
/*     */   private QDAList _QDAList;
/*     */   private BonusList _bonusList;
/*     */   private ParcelBuyList _parcelBuyList;
/*     */   
/*     */   public void deleteDeal() {
/* 128 */     this._has_deal = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteLUC() {
/* 135 */     this._has_LUC = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteNetWS() {
/* 142 */     this._has_netWS = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteUniversalDeal() {
/* 149 */     this._has_universalDeal = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BonusList getBonusList() {
/* 159 */     return this._bonusList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDeal() {
/* 169 */     return this._deal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getLUC() {
/* 180 */     return this._LUC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getNetWS() {
/* 191 */     return this._netWS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ParcelBuyList getParcelBuyList() {
/* 201 */     return this._parcelBuyList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProductCode() {
/* 211 */     return this._productCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProductDescription() {
/* 221 */     return this._productDescription;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QDAList getQDAList() {
/* 231 */     return this._QDAList;
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
/*     */   public String getSOH() {
/* 243 */     return this._SOH;
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
/*     */   public SOHStatusType getSOHStatus() {
/* 255 */     return this._SOHStatus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSOHTimestamp() {
/* 265 */     return this._SOHTimestamp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getUniversalDeal() {
/* 275 */     return this._universalDeal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasDeal() {
/* 285 */     return this._has_deal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasLUC() {
/* 295 */     return this._has_LUC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasNetWS() {
/* 305 */     return this._has_netWS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasUniversalDeal() {
/* 315 */     return this._has_universalDeal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/*     */     try {
/* 326 */       validate();
/* 327 */     } catch (ValidationException vex) {
/* 328 */       return false;
/*     */     } 
/* 330 */     return true;
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
/*     */   public void marshal(Writer out) throws MarshalException, ValidationException {
/* 345 */     Marshaller.marshal(this, out);
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
/*     */   public void marshal(ContentHandler handler) throws IOException, MarshalException, ValidationException {
/* 362 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBonusList(BonusList bonusList) {
/* 372 */     this._bonusList = bonusList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeal(long deal) {
/* 382 */     this._deal = deal;
/* 383 */     this._has_deal = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLUC(long LUC) {
/* 394 */     this._LUC = LUC;
/* 395 */     this._has_LUC = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNetWS(long netWS) {
/* 406 */     this._netWS = netWS;
/* 407 */     this._has_netWS = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParcelBuyList(ParcelBuyList parcelBuyList) {
/* 417 */     this._parcelBuyList = parcelBuyList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProductCode(String productCode) {
/* 427 */     this._productCode = productCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProductDescription(String productDescription) {
/* 438 */     this._productDescription = productDescription;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQDAList(QDAList qDAList) {
/* 448 */     this._QDAList = qDAList;
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
/*     */   public void setSOH(String SOH) {
/* 460 */     this._SOH = SOH;
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
/*     */   public void setSOHStatus(SOHStatusType SOHStatus) {
/* 472 */     this._SOHStatus = SOHStatus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSOHTimestamp(Date SOHTimestamp) {
/* 482 */     this._SOHTimestamp = SOHTimestamp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUniversalDeal(long universalDeal) {
/* 492 */     this._universalDeal = universalDeal;
/* 493 */     this._has_universalDeal = true;
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
/*     */   public static RetailerProductDetail unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 510 */     return (RetailerProductDetail)Unmarshaller.unmarshal(RetailerProductDetail.class, reader);
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
/*     */   public void validate() throws ValidationException {
/* 522 */     Validator validator = new Validator();
/* 523 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\RetailerProductDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */