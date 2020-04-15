/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.order;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class LineItem.
 * 
 * @version $Revision$ $Date$
 */
public class LineItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _lineId.
     */
    private int _lineId;

    /**
     * keeps track of state for field: _lineId
     */
    private boolean _has_lineId;

    /**
     * Field _orderType.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType _orderType;

    /**
     * Field _backOrder.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType _backOrder;

    /**
     * Field _productCode.
     */
    private java.lang.String _productCode;

    /**
     * Field _productCodeType.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType _productCodeType;

    /**
     * Field _orderQuantity.
     */
    private int _orderQuantity;

    /**
     * keeps track of state for field: _orderQuantity
     */
    private boolean _has_orderQuantity;

    /**
     * Field _dealAmount.
     */
    private int _dealAmount;

    /**
     * keeps track of state for field: _dealAmount
     */
    private boolean _has_dealAmount;

    /**
     * Field _applyBonus.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType _applyBonus;

    /**
     * Field _applyQda.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType _applyQda;


      //----------------/
     //- Constructors -/
    //----------------/

    public LineItem() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDealAmount(
    ) {
        this._has_dealAmount= false;
    }

    /**
     */
    public void deleteLineId(
    ) {
        this._has_lineId= false;
    }

    /**
     */
    public void deleteOrderQuantity(
    ) {
        this._has_orderQuantity= false;
    }

    /**
     * Returns the value of field 'applyBonus'.
     * 
     * @return the value of field 'ApplyBonus'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType getApplyBonus(
    ) {
        return this._applyBonus;
    }

    /**
     * Returns the value of field 'applyQda'.
     * 
     * @return the value of field 'ApplyQda'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType getApplyQda(
    ) {
        return this._applyQda;
    }

    /**
     * Returns the value of field 'backOrder'.
     * 
     * @return the value of field 'BackOrder'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType getBackOrder(
    ) {
        return this._backOrder;
    }

    /**
     * Returns the value of field 'dealAmount'.
     * 
     * @return the value of field 'DealAmount'.
     */
    public int getDealAmount(
    ) {
        return this._dealAmount;
    }

    /**
     * Returns the value of field 'lineId'.
     * 
     * @return the value of field 'LineId'.
     */
    public int getLineId(
    ) {
        return this._lineId;
    }

    /**
     * Returns the value of field 'orderQuantity'.
     * 
     * @return the value of field 'OrderQuantity'.
     */
    public int getOrderQuantity(
    ) {
        return this._orderQuantity;
    }

    /**
     * Returns the value of field 'orderType'.
     * 
     * @return the value of field 'OrderType'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType getOrderType(
    ) {
        return this._orderType;
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
     * Returns the value of field 'productCodeType'.
     * 
     * @return the value of field 'ProductCodeType'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType getProductCodeType(
    ) {
        return this._productCodeType;
    }

    /**
     * Method hasDealAmount.
     * 
     * @return true if at least one DealAmount has been added
     */
    public boolean hasDealAmount(
    ) {
        return this._has_dealAmount;
    }

    /**
     * Method hasLineId.
     * 
     * @return true if at least one LineId has been added
     */
    public boolean hasLineId(
    ) {
        return this._has_lineId;
    }

    /**
     * Method hasOrderQuantity.
     * 
     * @return true if at least one OrderQuantity has been added
     */
    public boolean hasOrderQuantity(
    ) {
        return this._has_orderQuantity;
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
     * Sets the value of field 'applyBonus'.
     * 
     * @param applyBonus the value of field 'applyBonus'.
     */
    public void setApplyBonus(
            final com.metcash.webservices.eai.xml.supplier.order.types.ApplyBonusType applyBonus) {
        this._applyBonus = applyBonus;
    }

    /**
     * Sets the value of field 'applyQda'.
     * 
     * @param applyQda the value of field 'applyQda'.
     */
    public void setApplyQda(
            final com.metcash.webservices.eai.xml.supplier.order.types.ApplyQdaType applyQda) {
        this._applyQda = applyQda;
    }

    /**
     * Sets the value of field 'backOrder'.
     * 
     * @param backOrder the value of field 'backOrder'.
     */
    public void setBackOrder(
            final com.metcash.webservices.eai.xml.supplier.order.types.BackOrderType backOrder) {
        this._backOrder = backOrder;
    }

    /**
     * Sets the value of field 'dealAmount'.
     * 
     * @param dealAmount the value of field 'dealAmount'.
     */
    public void setDealAmount(
            final int dealAmount) {
        this._dealAmount = dealAmount;
        this._has_dealAmount = true;
    }

    /**
     * Sets the value of field 'lineId'.
     * 
     * @param lineId the value of field 'lineId'.
     */
    public void setLineId(
            final int lineId) {
        this._lineId = lineId;
        this._has_lineId = true;
    }

    /**
     * Sets the value of field 'orderQuantity'.
     * 
     * @param orderQuantity the value of field 'orderQuantity'.
     */
    public void setOrderQuantity(
            final int orderQuantity) {
        this._orderQuantity = orderQuantity;
        this._has_orderQuantity = true;
    }

    /**
     * Sets the value of field 'orderType'.
     * 
     * @param orderType the value of field 'orderType'.
     */
    public void setOrderType(
            final com.metcash.webservices.eai.xml.supplier.order.types.OrderTypeType orderType) {
        this._orderType = orderType;
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
     * Sets the value of field 'productCodeType'.
     * 
     * @param productCodeType the value of field 'productCodeType'.
     */
    public void setProductCodeType(
            final com.metcash.webservices.eai.xml.supplier.order.types.ProductCodeTypeType productCodeType) {
        this._productCodeType = productCodeType;
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
     * com.metcash.webservices.eai.xml.supplier.order.LineItem
     */
    public static com.metcash.webservices.eai.xml.supplier.order.LineItem unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.order.LineItem) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.order.LineItem.class, reader);
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
