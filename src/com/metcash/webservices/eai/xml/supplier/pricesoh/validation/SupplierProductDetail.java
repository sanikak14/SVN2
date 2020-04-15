/*      */ package com.metcash.webservices.eai.xml.supplier.pricesoh.validation;
/*      */ 
/*      */ import com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType;
/*      */ import java.io.IOException;
/*      */ import java.io.Reader;
/*      */ import java.io.Serializable;
/*      */ import java.io.Writer;
/*      */ import java.util.Date;
/*      */ import org.exolab.castor.xml.MarshalException;
/*      */ import org.exolab.castor.xml.Marshaller;
/*      */ import org.exolab.castor.xml.Unmarshaller;
/*      */ import org.exolab.castor.xml.ValidationException;
/*      */ import org.exolab.castor.xml.Validator;
/*      */ import org.xml.sax.ContentHandler;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SupplierProductDetail
/*      */   implements Serializable
/*      */ {
/*      */   private String _productCode;
/*      */   private String _productDescription;
/*      */   private long _baseWS;
/*      */   private boolean _has_baseWS;
/*      */   private long _deal;
/*      */   private boolean _has_deal;
/*      */   private String _dealDescription;
/*      */   private long _universalDeal;
/*      */   private boolean _has_universalDeal;
/*      */   private long _WET;
/*      */   private boolean _has_WET;
/*      */   private long _netWS;
/*      */   private boolean _has_netWS;
/*      */   private long _deliveryFee;
/*      */   private boolean _has_deliveryFee;
/*      */   private long _GST;
/*      */   private boolean _has_GST;
/*      */   private long _casePrice;
/*      */   private boolean _has_casePrice;
/*      */   private long _adminFee;
/*      */   private boolean _has_adminFee;
/*      */   private long _financeFee;
/*      */   private boolean _has_financeFee;
/*      */   private long _totalCasePrice;
/*      */   private boolean _has_totalCasePrice;
/*      */   private long _LUC;
/*      */   private boolean _has_LUC;
/*      */   private boolean _applyQDA;
/*      */   private boolean _has_applyQDA;
/*      */   private boolean _applyBonus;
/*      */   private boolean _has_applyBonus;
/*      */   private String _SOH;
/*      */   private SOHStatusType _SOHStatus;
/*      */   private Date _SOHTimestamp;
/*      */   private int _onOrderQty;
/*      */   private boolean _has_onOrderQty;
/*      */   private QDAList _QDAList;
/*      */   private BonusList _bonusList;
/*      */   private ParcelBuyList _parcelBuyList;
/*      */   
/*      */   public void deleteAdminFee() {
/*  243 */     this._has_adminFee = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteApplyBonus() {
/*  250 */     this._has_applyBonus = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteApplyQDA() {
/*  257 */     this._has_applyQDA = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteBaseWS() {
/*  264 */     this._has_baseWS = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteCasePrice() {
/*  271 */     this._has_casePrice = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteDeal() {
/*  278 */     this._has_deal = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteDeliveryFee() {
/*  285 */     this._has_deliveryFee = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteFinanceFee() {
/*  292 */     this._has_financeFee = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteGST() {
/*  299 */     this._has_GST = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteLUC() {
/*  306 */     this._has_LUC = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteNetWS() {
/*  313 */     this._has_netWS = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteOnOrderQty() {
/*  320 */     this._has_onOrderQty = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteTotalCasePrice() {
/*  327 */     this._has_totalCasePrice = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteUniversalDeal() {
/*  334 */     this._has_universalDeal = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteWET() {
/*  341 */     this._has_WET = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getAdminFee() {
/*  352 */     return this._adminFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getApplyBonus() {
/*  364 */     return this._applyBonus;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getApplyQDA() {
/*  376 */     return this._applyQDA;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getBaseWS() {
/*  386 */     return this._baseWS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BonusList getBonusList() {
/*  396 */     return this._bonusList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getCasePrice() {
/*  406 */     return this._casePrice;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getDeal() {
/*  416 */     return this._deal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDealDescription() {
/*  426 */     return this._dealDescription;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getDeliveryFee() {
/*  436 */     return this._deliveryFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getFinanceFee() {
/*  446 */     return this._financeFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getGST() {
/*  456 */     return this._GST;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getLUC() {
/*  467 */     return this._LUC;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getNetWS() {
/*  478 */     return this._netWS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getOnOrderQty() {
/*  488 */     return this._onOrderQty;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ParcelBuyList getParcelBuyList() {
/*  498 */     return this._parcelBuyList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProductCode() {
/*  508 */     return this._productCode;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProductDescription() {
/*  518 */     return this._productDescription;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public QDAList getQDAList() {
/*  528 */     return this._QDAList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSOH() {
/*  541 */     return this._SOH;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SOHStatusType getSOHStatus() {
/*  553 */     return this._SOHStatus;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getSOHTimestamp() {
/*  563 */     return this._SOHTimestamp;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getTotalCasePrice() {
/*  573 */     return this._totalCasePrice;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getUniversalDeal() {
/*  583 */     return this._universalDeal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getWET() {
/*  593 */     return this._WET;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasAdminFee() {
/*  603 */     return this._has_adminFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasApplyBonus() {
/*  613 */     return this._has_applyBonus;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasApplyQDA() {
/*  623 */     return this._has_applyQDA;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasBaseWS() {
/*  633 */     return this._has_baseWS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasCasePrice() {
/*  643 */     return this._has_casePrice;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasDeal() {
/*  653 */     return this._has_deal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasDeliveryFee() {
/*  663 */     return this._has_deliveryFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFinanceFee() {
/*  673 */     return this._has_financeFee;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasGST() {
/*  683 */     return this._has_GST;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasLUC() {
/*  693 */     return this._has_LUC;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasNetWS() {
/*  703 */     return this._has_netWS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasOnOrderQty() {
/*  713 */     return this._has_onOrderQty;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasTotalCasePrice() {
/*  723 */     return this._has_totalCasePrice;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasUniversalDeal() {
/*  733 */     return this._has_universalDeal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasWET() {
/*  743 */     return this._has_WET;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isApplyBonus() {
/*  755 */     return this._applyBonus;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isApplyQDA() {
/*  767 */     return this._applyQDA;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isValid() {
/*      */     try {
/*  778 */       validate();
/*  779 */     } catch (ValidationException vex) {
/*  780 */       return false;
/*      */     } 
/*  782 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void marshal(Writer out) throws MarshalException, ValidationException {
/*  797 */     Marshaller.marshal(this, out);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void marshal(ContentHandler handler) throws IOException, MarshalException, ValidationException {
/*  814 */     Marshaller.marshal(this, handler);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAdminFee(long adminFee) {
/*  825 */     this._adminFee = adminFee;
/*  826 */     this._has_adminFee = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setApplyBonus(boolean applyBonus) {
/*  838 */     this._applyBonus = applyBonus;
/*  839 */     this._has_applyBonus = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setApplyQDA(boolean applyQDA) {
/*  851 */     this._applyQDA = applyQDA;
/*  852 */     this._has_applyQDA = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBaseWS(long baseWS) {
/*  862 */     this._baseWS = baseWS;
/*  863 */     this._has_baseWS = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBonusList(BonusList bonusList) {
/*  873 */     this._bonusList = bonusList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCasePrice(long casePrice) {
/*  883 */     this._casePrice = casePrice;
/*  884 */     this._has_casePrice = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDeal(long deal) {
/*  894 */     this._deal = deal;
/*  895 */     this._has_deal = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDealDescription(String dealDescription) {
/*  905 */     this._dealDescription = dealDescription;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDeliveryFee(long deliveryFee) {
/*  915 */     this._deliveryFee = deliveryFee;
/*  916 */     this._has_deliveryFee = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFinanceFee(long financeFee) {
/*  926 */     this._financeFee = financeFee;
/*  927 */     this._has_financeFee = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGST(long GST) {
/*  937 */     this._GST = GST;
/*  938 */     this._has_GST = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLUC(long LUC) {
/*  949 */     this._LUC = LUC;
/*  950 */     this._has_LUC = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNetWS(long netWS) {
/*  961 */     this._netWS = netWS;
/*  962 */     this._has_netWS = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOnOrderQty(int onOrderQty) {
/*  972 */     this._onOrderQty = onOrderQty;
/*  973 */     this._has_onOrderQty = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setParcelBuyList(ParcelBuyList parcelBuyList) {
/*  983 */     this._parcelBuyList = parcelBuyList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProductCode(String productCode) {
/*  993 */     this._productCode = productCode;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProductDescription(String productDescription) {
/* 1004 */     this._productDescription = productDescription;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setQDAList(QDAList qDAList) {
/* 1014 */     this._QDAList = qDAList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSOH(String SOH) {
/* 1027 */     this._SOH = SOH;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSOHStatus(SOHStatusType SOHStatus) {
/* 1039 */     this._SOHStatus = SOHStatus;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSOHTimestamp(Date SOHTimestamp) {
/* 1049 */     this._SOHTimestamp = SOHTimestamp;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTotalCasePrice(long totalCasePrice) {
/* 1059 */     this._totalCasePrice = totalCasePrice;
/* 1060 */     this._has_totalCasePrice = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUniversalDeal(long universalDeal) {
/* 1070 */     this._universalDeal = universalDeal;
/* 1071 */     this._has_universalDeal = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setWET(long WET) {
/* 1081 */     this._WET = WET;
/* 1082 */     this._has_WET = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static SupplierProductDetail unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 1099 */     return (SupplierProductDetail)Unmarshaller.unmarshal(SupplierProductDetail.class, reader);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void validate() throws ValidationException {
/* 1111 */     Validator validator = new Validator();
/* 1112 */     validator.validate(this);
/*      */   }
/*      */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\validation\SupplierProductDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */