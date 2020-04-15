/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.pricesoh.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class RetailerProductDetail.
 * 
 * @version $Revision$ $Date$
 */
public class RetailerProductDetail implements java.io.Serializable {


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
     * Field _deal.
     */
    private long _deal;

    /**
     * keeps track of state for field: _deal
     */
    private boolean _has_deal;

    /**
     * Field _universalDeal.
     */
    private long _universalDeal;

    /**
     * keeps track of state for field: _universalDeal
     */
    private boolean _has_universalDeal;

    /**
     * incl WET, excl GST
     */
    private long _netWS;

    /**
     * keeps track of state for field: _netWS
     */
    private boolean _has_netWS;

    /**
     * incl GST
     */
    private long _LUC;

    /**
     * keeps track of state for field: _LUC
     */
    private boolean _has_LUC;

    /**
     * Format: 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units
     * of SOH would be 3.5
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
     * Field _QDAList.
     */
    private com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList _QDAList;

    /**
     * Field _bonusList.
     */
    private com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList _bonusList;

    /**
     * Field _parcelBuyList.
     */
    private com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList _parcelBuyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RetailerProductDetail() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDeal(
    ) {
        this._has_deal= false;
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
    public void deleteUniversalDeal(
    ) {
        this._has_universalDeal= false;
    }

    /**
     * Returns the value of field 'bonusList'.
     * 
     * @return the value of field 'BonusList'.
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList getBonusList(
    ) {
        return this._bonusList;
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
     * Returns the value of field 'parcelBuyList'.
     * 
     * @return the value of field 'ParcelBuyList'.
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList getParcelBuyList(
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
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList getQDAList(
    ) {
        return this._QDAList;
    }

    /**
     * Returns the value of field 'SOH'. The field 'SOH' has the
     * following description: Format: 'carton qty'.'unit qty'. Eg.
     * 3 cartons and 5 units of SOH would be 3.5
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
     * Returns the value of field 'universalDeal'.
     * 
     * @return the value of field 'UniversalDeal'.
     */
    public long getUniversalDeal(
    ) {
        return this._universalDeal;
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
     * Method hasUniversalDeal.
     * 
     * @return true if at least one UniversalDeal has been added
     */
    public boolean hasUniversalDeal(
    ) {
        return this._has_universalDeal;
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
     * Sets the value of field 'bonusList'.
     * 
     * @param bonusList the value of field 'bonusList'.
     */
    public void setBonusList(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList bonusList) {
        this._bonusList = bonusList;
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
     * Sets the value of field 'parcelBuyList'.
     * 
     * @param parcelBuyList the value of field 'parcelBuyList'.
     */
    public void setParcelBuyList(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ParcelBuyList parcelBuyList) {
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
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList QDAList) {
        this._QDAList = QDAList;
    }

    /**
     * Sets the value of field 'SOH'. The field 'SOH' has the
     * following description: Format: 'carton qty'.'unit qty'. Eg.
     * 3 cartons and 5 units of SOH would be 3.5
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.pricesoh.validation.RetailerProductDetail.class, reader);
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
