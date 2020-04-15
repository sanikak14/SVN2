/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.pricesoh.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class SupplierProductDetail.
 * 
 * @version $Revision$ $Date$
 */
public class SupplierProductDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productCode.
     */
    private java.lang.String _productCode;

    /**
     * Field _productDescription.
     */
    private java.lang.String _productDescription;

    /**
     * Field _baseWS.
     */
    private long _baseWS;

    /**
     * keeps track of state for field: _baseWS
     */
    private boolean _has_baseWS;

    /**
     * Field _deal.
     */
    private long _deal;

    /**
     * keeps track of state for field: _deal
     */
    private boolean _has_deal;

    /**
     * Field _dealDescription.
     */
    private java.lang.String _dealDescription;

    /**
     * Field _universalDeal.
     */
    private long _universalDeal;

    /**
     * keeps track of state for field: _universalDeal
     */
    private boolean _has_universalDeal;

    /**
     * Field _WET.
     */
    private long _WET;

    /**
     * keeps track of state for field: _WET
     */
    private boolean _has_WET;

    /**
     * incl WET, excl GST
     */
    private long _netWS;

    /**
     * keeps track of state for field: _netWS
     */
    private boolean _has_netWS;

    /**
     * Field _deliveryFee.
     */
    private long _deliveryFee;

    /**
     * keeps track of state for field: _deliveryFee
     */
    private boolean _has_deliveryFee;

    /**
     * Field _GST.
     */
    private long _GST;

    /**
     * keeps track of state for field: _GST
     */
    private boolean _has_GST;

    /**
     * Field _casePrice.
     */
    private long _casePrice;

    /**
     * keeps track of state for field: _casePrice
     */
    private boolean _has_casePrice;

    /**
     * incl GST
     */
    private long _adminFee;

    /**
     * keeps track of state for field: _adminFee
     */
    private boolean _has_adminFee;

    /**
     * Field _financeFee.
     */
    private long _financeFee;

    /**
     * keeps track of state for field: _financeFee
     */
    private boolean _has_financeFee;

    /**
     * Field _totalCasePrice.
     */
    private long _totalCasePrice;

    /**
     * keeps track of state for field: _totalCasePrice
     */
    private boolean _has_totalCasePrice;

    /**
     * incl GST
     */
    private long _LUC;

    /**
     * keeps track of state for field: _LUC
     */
    private boolean _has_LUC;

    /**
     * Only applicable when there is a deal
     */
    private boolean _applyQDA;

    /**
     * keeps track of state for field: _applyQDA
     */
    private boolean _has_applyQDA;

    /**
     * Only applicable when there is a deal
     */
    private boolean _applyBonus;

    /**
     * keeps track of state for field: _applyBonus
     */
    private boolean _has_applyBonus;

    /**
     * Format: 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units
     * of would be 3.5
     */
    private java.lang.String _SOH;

    /**
     * N: NOT AVAILABLE, A: AVAILABLE, O: SOLD OUT, S: SUBSTITUTE
     */
    private com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType _SOHStatus;

    /**
     * Field _SOHTimestamp.
     */
    private java.util.Date _SOHTimestamp;

    /**
     * Field _onOrderQty.
     */
    private int _onOrderQty;

    /**
     * keeps track of state for field: _onOrderQty
     */
    private boolean _has_onOrderQty;

    /**
     * Field _QDAList.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList _QDAList;

    /**
     * Field _bonusList.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList _bonusList;

    /**
     * Field _parcelBuyList.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList _parcelBuyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupplierProductDetail() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteAdminFee(
    ) {
        this._has_adminFee= false;
    }

    /**
     */
    public void deleteApplyBonus(
    ) {
        this._has_applyBonus= false;
    }

    /**
     */
    public void deleteApplyQDA(
    ) {
        this._has_applyQDA= false;
    }

    /**
     */
    public void deleteBaseWS(
    ) {
        this._has_baseWS= false;
    }

    /**
     */
    public void deleteCasePrice(
    ) {
        this._has_casePrice= false;
    }

    /**
     */
    public void deleteDeal(
    ) {
        this._has_deal= false;
    }

    /**
     */
    public void deleteDeliveryFee(
    ) {
        this._has_deliveryFee= false;
    }

    /**
     */
    public void deleteFinanceFee(
    ) {
        this._has_financeFee= false;
    }

    /**
     */
    public void deleteGST(
    ) {
        this._has_GST= false;
    }

    /**
     */
    public void deleteLUC(
    ) {
        this._has_LUC= false;
    }

    /**
     */
    public void deleteNetWS(
    ) {
        this._has_netWS= false;
    }

    /**
     */
    public void deleteOnOrderQty(
    ) {
        this._has_onOrderQty= false;
    }

    /**
     */
    public void deleteTotalCasePrice(
    ) {
        this._has_totalCasePrice= false;
    }

    /**
     */
    public void deleteUniversalDeal(
    ) {
        this._has_universalDeal= false;
    }

    /**
     */
    public void deleteWET(
    ) {
        this._has_WET= false;
    }

    /**
     * Returns the value of field 'adminFee'. The field 'adminFee'
     * has the following description: incl GST
     * 
     * @return the value of field 'AdminFee'.
     */
    public long getAdminFee(
    ) {
        return this._adminFee;
    }

    /**
     * Returns the value of field 'applyBonus'. The field
     * 'applyBonus' has the following description: Only applicable
     * when there is a deal
     * 
     * @return the value of field 'ApplyBonus'.
     */
    public boolean getApplyBonus(
    ) {
        return this._applyBonus;
    }

    /**
     * Returns the value of field 'applyQDA'. The field 'applyQDA'
     * has the following description: Only applicable when there is
     * a deal
     * 
     * @return the value of field 'ApplyQDA'.
     */
    public boolean getApplyQDA(
    ) {
        return this._applyQDA;
    }

    /**
     * Returns the value of field 'baseWS'.
     * 
     * @return the value of field 'BaseWS'.
     */
    public long getBaseWS(
    ) {
        return this._baseWS;
    }

    /**
     * Returns the value of field 'bonusList'.
     * 
     * @return the value of field 'BonusList'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList getBonusList(
    ) {
        return this._bonusList;
    }

    /**
     * Returns the value of field 'casePrice'.
     * 
     * @return the value of field 'CasePrice'.
     */
    public long getCasePrice(
    ) {
        return this._casePrice;
    }

    /**
     * Returns the value of field 'deal'.
     * 
     * @return the value of field 'Deal'.
     */
    public long getDeal(
    ) {
        return this._deal;
    }

    /**
     * Returns the value of field 'dealDescription'.
     * 
     * @return the value of field 'DealDescription'.
     */
    public java.lang.String getDealDescription(
    ) {
        return this._dealDescription;
    }

    /**
     * Returns the value of field 'deliveryFee'.
     * 
     * @return the value of field 'DeliveryFee'.
     */
    public long getDeliveryFee(
    ) {
        return this._deliveryFee;
    }

    /**
     * Returns the value of field 'financeFee'.
     * 
     * @return the value of field 'FinanceFee'.
     */
    public long getFinanceFee(
    ) {
        return this._financeFee;
    }

    /**
     * Returns the value of field 'GST'.
     * 
     * @return the value of field 'GST'.
     */
    public long getGST(
    ) {
        return this._GST;
    }

    /**
     * Returns the value of field 'LUC'. The field 'LUC' has the
     * following description: incl GST
     * 
     * @return the value of field 'LUC'.
     */
    public long getLUC(
    ) {
        return this._LUC;
    }

    /**
     * Returns the value of field 'netWS'. The field 'netWS' has
     * the following description: incl WET, excl GST
     * 
     * @return the value of field 'NetWS'.
     */
    public long getNetWS(
    ) {
        return this._netWS;
    }

    /**
     * Returns the value of field 'onOrderQty'.
     * 
     * @return the value of field 'OnOrderQty'.
     */
    public int getOnOrderQty(
    ) {
        return this._onOrderQty;
    }

    /**
     * Returns the value of field 'parcelBuyList'.
     * 
     * @return the value of field 'ParcelBuyList'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList getParcelBuyList(
    ) {
        return this._parcelBuyList;
    }

    /**
     * Returns the value of field 'productCode'.
     * 
     * @return the value of field 'ProductCode'.
     */
    public java.lang.String getProductCode(
    ) {
        return this._productCode;
    }

    /**
     * Returns the value of field 'productDescription'.
     * 
     * @return the value of field 'ProductDescription'.
     */
    public java.lang.String getProductDescription(
    ) {
        return this._productDescription;
    }

    /**
     * Returns the value of field 'QDAList'.
     * 
     * @return the value of field 'QDAList'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList getQDAList(
    ) {
        return this._QDAList;
    }

    /**
     * Returns the value of field 'SOH'. The field 'SOH' has the
     * following description: Format: 'carton qty'.'unit qty'. Eg.
     * 3 cartons and 5 units of would be 3.5
     * 
     * 
     * @return the value of field 'SOH'.
     */
    public java.lang.String getSOH(
    ) {
        return this._SOH;
    }

    /**
     * Returns the value of field 'SOHStatus'. The field
     * 'SOHStatus' has the following description: N: NOT AVAILABLE,
     * A: AVAILABLE, O: SOLD OUT, S: SUBSTITUTE
     * 
     * @return the value of field 'SOHStatus'.
     */
    public com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType getSOHStatus(
    ) {
        return this._SOHStatus;
    }

    /**
     * Returns the value of field 'SOHTimestamp'.
     * 
     * @return the value of field 'SOHTimestamp'.
     */
    public java.util.Date getSOHTimestamp(
    ) {
        return this._SOHTimestamp;
    }

    /**
     * Returns the value of field 'totalCasePrice'.
     * 
     * @return the value of field 'TotalCasePrice'.
     */
    public long getTotalCasePrice(
    ) {
        return this._totalCasePrice;
    }

    /**
     * Returns the value of field 'universalDeal'.
     * 
     * @return the value of field 'UniversalDeal'.
     */
    public long getUniversalDeal(
    ) {
        return this._universalDeal;
    }

    /**
     * Returns the value of field 'WET'.
     * 
     * @return the value of field 'WET'.
     */
    public long getWET(
    ) {
        return this._WET;
    }

    /**
     * Method hasAdminFee.
     * 
     * @return true if at least one AdminFee has been added
     */
    public boolean hasAdminFee(
    ) {
        return this._has_adminFee;
    }

    /**
     * Method hasApplyBonus.
     * 
     * @return true if at least one ApplyBonus has been added
     */
    public boolean hasApplyBonus(
    ) {
        return this._has_applyBonus;
    }

    /**
     * Method hasApplyQDA.
     * 
     * @return true if at least one ApplyQDA has been added
     */
    public boolean hasApplyQDA(
    ) {
        return this._has_applyQDA;
    }

    /**
     * Method hasBaseWS.
     * 
     * @return true if at least one BaseWS has been added
     */
    public boolean hasBaseWS(
    ) {
        return this._has_baseWS;
    }

    /**
     * Method hasCasePrice.
     * 
     * @return true if at least one CasePrice has been added
     */
    public boolean hasCasePrice(
    ) {
        return this._has_casePrice;
    }

    /**
     * Method hasDeal.
     * 
     * @return true if at least one Deal has been added
     */
    public boolean hasDeal(
    ) {
        return this._has_deal;
    }

    /**
     * Method hasDeliveryFee.
     * 
     * @return true if at least one DeliveryFee has been added
     */
    public boolean hasDeliveryFee(
    ) {
        return this._has_deliveryFee;
    }

    /**
     * Method hasFinanceFee.
     * 
     * @return true if at least one FinanceFee has been added
     */
    public boolean hasFinanceFee(
    ) {
        return this._has_financeFee;
    }

    /**
     * Method hasGST.
     * 
     * @return true if at least one GST has been added
     */
    public boolean hasGST(
    ) {
        return this._has_GST;
    }

    /**
     * Method hasLUC.
     * 
     * @return true if at least one LUC has been added
     */
    public boolean hasLUC(
    ) {
        return this._has_LUC;
    }

    /**
     * Method hasNetWS.
     * 
     * @return true if at least one NetWS has been added
     */
    public boolean hasNetWS(
    ) {
        return this._has_netWS;
    }

    /**
     * Method hasOnOrderQty.
     * 
     * @return true if at least one OnOrderQty has been added
     */
    public boolean hasOnOrderQty(
    ) {
        return this._has_onOrderQty;
    }

    /**
     * Method hasTotalCasePrice.
     * 
     * @return true if at least one TotalCasePrice has been added
     */
    public boolean hasTotalCasePrice(
    ) {
        return this._has_totalCasePrice;
    }

    /**
     * Method hasUniversalDeal.
     * 
     * @return true if at least one UniversalDeal has been added
     */
    public boolean hasUniversalDeal(
    ) {
        return this._has_universalDeal;
    }

    /**
     * Method hasWET.
     * 
     * @return true if at least one WET has been added
     */
    public boolean hasWET(
    ) {
        return this._has_WET;
    }

    /**
     * Returns the value of field 'applyBonus'. The field
     * 'applyBonus' has the following description: Only applicable
     * when there is a deal
     * 
     * @return the value of field 'ApplyBonus'.
     */
    public boolean isApplyBonus(
    ) {
        return this._applyBonus;
    }

    /**
     * Returns the value of field 'applyQDA'. The field 'applyQDA'
     * has the following description: Only applicable when there is
     * a deal
     * 
     * @return the value of field 'ApplyQDA'.
     */
    public boolean isApplyQDA(
    ) {
        return this._applyQDA;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'adminFee'. The field 'adminFee' has
     * the following description: incl GST
     * 
     * @param adminFee the value of field 'adminFee'.
     */
    public void setAdminFee(
            final long adminFee) {
        this._adminFee = adminFee;
        this._has_adminFee = true;
    }

    /**
     * Sets the value of field 'applyBonus'. The field 'applyBonus'
     * has the following description: Only applicable when there is
     * a deal
     * 
     * @param applyBonus the value of field 'applyBonus'.
     */
    public void setApplyBonus(
            final boolean applyBonus) {
        this._applyBonus = applyBonus;
        this._has_applyBonus = true;
    }

    /**
     * Sets the value of field 'applyQDA'. The field 'applyQDA' has
     * the following description: Only applicable when there is a
     * deal
     * 
     * @param applyQDA the value of field 'applyQDA'.
     */
    public void setApplyQDA(
            final boolean applyQDA) {
        this._applyQDA = applyQDA;
        this._has_applyQDA = true;
    }

    /**
     * Sets the value of field 'baseWS'.
     * 
     * @param baseWS the value of field 'baseWS'.
     */
    public void setBaseWS(
            final long baseWS) {
        this._baseWS = baseWS;
        this._has_baseWS = true;
    }

    /**
     * Sets the value of field 'bonusList'.
     * 
     * @param bonusList the value of field 'bonusList'.
     */
    public void setBonusList(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.BonusList bonusList) {
        this._bonusList = bonusList;
    }

    /**
     * Sets the value of field 'casePrice'.
     * 
     * @param casePrice the value of field 'casePrice'.
     */
    public void setCasePrice(
            final long casePrice) {
        this._casePrice = casePrice;
        this._has_casePrice = true;
    }

    /**
     * Sets the value of field 'deal'.
     * 
     * @param deal the value of field 'deal'.
     */
    public void setDeal(
            final long deal) {
        this._deal = deal;
        this._has_deal = true;
    }

    /**
     * Sets the value of field 'dealDescription'.
     * 
     * @param dealDescription the value of field 'dealDescription'.
     */
    public void setDealDescription(
            final java.lang.String dealDescription) {
        this._dealDescription = dealDescription;
    }

    /**
     * Sets the value of field 'deliveryFee'.
     * 
     * @param deliveryFee the value of field 'deliveryFee'.
     */
    public void setDeliveryFee(
            final long deliveryFee) {
        this._deliveryFee = deliveryFee;
        this._has_deliveryFee = true;
    }

    /**
     * Sets the value of field 'financeFee'.
     * 
     * @param financeFee the value of field 'financeFee'.
     */
    public void setFinanceFee(
            final long financeFee) {
        this._financeFee = financeFee;
        this._has_financeFee = true;
    }

    /**
     * Sets the value of field 'GST'.
     * 
     * @param GST the value of field 'GST'.
     */
    public void setGST(
            final long GST) {
        this._GST = GST;
        this._has_GST = true;
    }

    /**
     * Sets the value of field 'LUC'. The field 'LUC' has the
     * following description: incl GST
     * 
     * @param LUC the value of field 'LUC'.
     */
    public void setLUC(
            final long LUC) {
        this._LUC = LUC;
        this._has_LUC = true;
    }

    /**
     * Sets the value of field 'netWS'. The field 'netWS' has the
     * following description: incl WET, excl GST
     * 
     * @param netWS the value of field 'netWS'.
     */
    public void setNetWS(
            final long netWS) {
        this._netWS = netWS;
        this._has_netWS = true;
    }

    /**
     * Sets the value of field 'onOrderQty'.
     * 
     * @param onOrderQty the value of field 'onOrderQty'.
     */
    public void setOnOrderQty(
            final int onOrderQty) {
        this._onOrderQty = onOrderQty;
        this._has_onOrderQty = true;
    }

    /**
     * Sets the value of field 'parcelBuyList'.
     * 
     * @param parcelBuyList the value of field 'parcelBuyList'.
     */
    public void setParcelBuyList(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList parcelBuyList) {
        this._parcelBuyList = parcelBuyList;
    }

    /**
     * Sets the value of field 'productCode'.
     * 
     * @param productCode the value of field 'productCode'.
     */
    public void setProductCode(
            final java.lang.String productCode) {
        this._productCode = productCode;
    }

    /**
     * Sets the value of field 'productDescription'.
     * 
     * @param productDescription the value of field
     * 'productDescription'.
     */
    public void setProductDescription(
            final java.lang.String productDescription) {
        this._productDescription = productDescription;
    }

    /**
     * Sets the value of field 'QDAList'.
     * 
     * @param QDAList the value of field 'QDAList'.
     */
    public void setQDAList(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.QDAList QDAList) {
        this._QDAList = QDAList;
    }

    /**
     * Sets the value of field 'SOH'. The field 'SOH' has the
     * following description: Format: 'carton qty'.'unit qty'. Eg.
     * 3 cartons and 5 units of would be 3.5
     * 
     * 
     * @param SOH the value of field 'SOH'.
     */
    public void setSOH(
            final java.lang.String SOH) {
        this._SOH = SOH;
    }

    /**
     * Sets the value of field 'SOHStatus'. The field 'SOHStatus'
     * has the following description: N: NOT AVAILABLE, A:
     * AVAILABLE, O: SOLD OUT, S: SUBSTITUTE
     * 
     * @param SOHStatus the value of field 'SOHStatus'.
     */
    public void setSOHStatus(
            final com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType SOHStatus) {
        this._SOHStatus = SOHStatus;
    }

    /**
     * Sets the value of field 'SOHTimestamp'.
     * 
     * @param SOHTimestamp the value of field 'SOHTimestamp'.
     */
    public void setSOHTimestamp(
            final java.util.Date SOHTimestamp) {
        this._SOHTimestamp = SOHTimestamp;
    }

    /**
     * Sets the value of field 'totalCasePrice'.
     * 
     * @param totalCasePrice the value of field 'totalCasePrice'.
     */
    public void setTotalCasePrice(
            final long totalCasePrice) {
        this._totalCasePrice = totalCasePrice;
        this._has_totalCasePrice = true;
    }

    /**
     * Sets the value of field 'universalDeal'.
     * 
     * @param universalDeal the value of field 'universalDeal'.
     */
    public void setUniversalDeal(
            final long universalDeal) {
        this._universalDeal = universalDeal;
        this._has_universalDeal = true;
    }

    /**
     * Sets the value of field 'WET'.
     * 
     * @param WET the value of field 'WET'.
     */
    public void setWET(
            final long WET) {
        this._WET = WET;
        this._has_WET = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail
     */
    public static com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
