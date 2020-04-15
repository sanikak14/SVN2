/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderstatus.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderHeaderStatus.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderStatus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _webOrderId.
     */
    private int _webOrderId;

    /**
     * keeps track of state for field: _webOrderId
     */
    private boolean _has_webOrderId;

    /**
     * Field _customerId.
     */
    private java.lang.String _customerId;

    /**
     * Field _customerStateCode.
     */
    private com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType _customerStateCode;

    /**
     * Field _createDate.
     */
    private java.util.Date _createDate;

    /**
     * R: NORMAL ORDER, B: BONUS ORDER, O: OVERRIDE ORDER, T:
     * TURNIN ORDER, '': M/F ORDER
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType _turnInOrderType;

    /**
     * Field _turnInOrderApproved.
     */
    private boolean _turnInOrderApproved;

    /**
     * keeps track of state for field: _turnInOrderApproved
     */
    private boolean _has_turnInOrderApproved;

    /**
     * MFR: Mainframe, WEB: Webstore, WSE: WebService
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType _orderSource;

    /**
     * R: RECEIVED, P: PROCESSED, E: EXTRACTED, I: INVOICED, C:
     * CANCELLED, J: REJECTED
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType _stage;

    /**
     * C: COMPLETE, I: INCOMPLETE, P: PENDING, X: CANCELLED, J:
     * REJECTED, U: UNDEFINED
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType _status;

    /**
     * Field _deliveryDate.
     */
    private org.exolab.castor.types.Date _deliveryDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHeaderStatus() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteTurnInOrderApproved(
    ) {
        this._has_turnInOrderApproved= false;
    }

    /**
     */
    public void deleteWebOrderId(
    ) {
        this._has_webOrderId= false;
    }

    /**
     * Returns the value of field 'createDate'.
     * 
     * @return the value of field 'CreateDate'.
     */
    public java.util.Date getCreateDate(
    ) {
        return this._createDate;
    }

    /**
     * Returns the value of field 'customerId'.
     * 
     * @return the value of field 'CustomerId'.
     */
    public java.lang.String getCustomerId(
    ) {
        return this._customerId;
    }

    /**
     * Returns the value of field 'customerStateCode'.
     * 
     * @return the value of field 'CustomerStateCode'.
     */
    public com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType getCustomerStateCode(
    ) {
        return this._customerStateCode;
    }

    /**
     * Returns the value of field 'deliveryDate'.
     * 
     * @return the value of field 'DeliveryDate'.
     */
    public org.exolab.castor.types.Date getDeliveryDate(
    ) {
        return this._deliveryDate;
    }

    /**
     * Returns the value of field 'orderSource'. The field
     * 'orderSource' has the following description: MFR: Mainframe,
     * WEB: Webstore, WSE: WebService
     * 
     * @return the value of field 'OrderSource'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType getOrderSource(
    ) {
        return this._orderSource;
    }

    /**
     * Returns the value of field 'stage'. The field 'stage' has
     * the following description: R: RECEIVED, P: PROCESSED, E:
     * EXTRACTED, I: INVOICED, C: CANCELLED, J: REJECTED
     * 
     * @return the value of field 'Stage'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType getStage(
    ) {
        return this._stage;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: C: COMPLETE, I: INCOMPLETE, P:
     * PENDING, X: CANCELLED, J: REJECTED, U: UNDEFINED
     * 
     * @return the value of field 'Status'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'turnInOrderApproved'.
     * 
     * @return the value of field 'TurnInOrderApproved'.
     */
    public boolean getTurnInOrderApproved(
    ) {
        return this._turnInOrderApproved;
    }

    /**
     * Returns the value of field 'turnInOrderType'. The field
     * 'turnInOrderType' has the following description: R: NORMAL
     * ORDER, B: BONUS ORDER, O: OVERRIDE ORDER, T: TURNIN ORDER,
     * '': M/F ORDER
     * 
     * @return the value of field 'TurnInOrderType'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType getTurnInOrderType(
    ) {
        return this._turnInOrderType;
    }

    /**
     * Returns the value of field 'webOrderId'.
     * 
     * @return the value of field 'WebOrderId'.
     */
    public int getWebOrderId(
    ) {
        return this._webOrderId;
    }

    /**
     * Method hasTurnInOrderApproved.
     * 
     * @return true if at least one TurnInOrderApproved has been
     * added
     */
    public boolean hasTurnInOrderApproved(
    ) {
        return this._has_turnInOrderApproved;
    }

    /**
     * Method hasWebOrderId.
     * 
     * @return true if at least one WebOrderId has been added
     */
    public boolean hasWebOrderId(
    ) {
        return this._has_webOrderId;
    }

    /**
     * Returns the value of field 'turnInOrderApproved'.
     * 
     * @return the value of field 'TurnInOrderApproved'.
     */
    public boolean isTurnInOrderApproved(
    ) {
        return this._turnInOrderApproved;
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
     * Sets the value of field 'createDate'.
     * 
     * @param createDate the value of field 'createDate'.
     */
    public void setCreateDate(
            final java.util.Date createDate) {
        this._createDate = createDate;
    }

    /**
     * Sets the value of field 'customerId'.
     * 
     * @param customerId the value of field 'customerId'.
     */
    public void setCustomerId(
            final java.lang.String customerId) {
        this._customerId = customerId;
    }

    /**
     * Sets the value of field 'customerStateCode'.
     * 
     * @param customerStateCode the value of field
     * 'customerStateCode'.
     */
    public void setCustomerStateCode(
            final com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType customerStateCode) {
        this._customerStateCode = customerStateCode;
    }

    /**
     * Sets the value of field 'deliveryDate'.
     * 
     * @param deliveryDate the value of field 'deliveryDate'.
     */
    public void setDeliveryDate(
            final org.exolab.castor.types.Date deliveryDate) {
        this._deliveryDate = deliveryDate;
    }

    /**
     * Sets the value of field 'orderSource'. The field
     * 'orderSource' has the following description: MFR: Mainframe,
     * WEB: Webstore, WSE: WebService
     * 
     * @param orderSource the value of field 'orderSource'.
     */
    public void setOrderSource(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType orderSource) {
        this._orderSource = orderSource;
    }

    /**
     * Sets the value of field 'stage'. The field 'stage' has the
     * following description: R: RECEIVED, P: PROCESSED, E:
     * EXTRACTED, I: INVOICED, C: CANCELLED, J: REJECTED
     * 
     * @param stage the value of field 'stage'.
     */
    public void setStage(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType stage) {
        this._stage = stage;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: C: COMPLETE, I: INCOMPLETE, P:
     * PENDING, X: CANCELLED, J: REJECTED, U: UNDEFINED
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'turnInOrderApproved'.
     * 
     * @param turnInOrderApproved the value of field
     * 'turnInOrderApproved'.
     */
    public void setTurnInOrderApproved(
            final boolean turnInOrderApproved) {
        this._turnInOrderApproved = turnInOrderApproved;
        this._has_turnInOrderApproved = true;
    }

    /**
     * Sets the value of field 'turnInOrderType'. The field
     * 'turnInOrderType' has the following description: R: NORMAL
     * ORDER, B: BONUS ORDER, O: OVERRIDE ORDER, T: TURNIN ORDER,
     * '': M/F ORDER
     * 
     * @param turnInOrderType the value of field 'turnInOrderType'.
     */
    public void setTurnInOrderType(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType turnInOrderType) {
        this._turnInOrderType = turnInOrderType;
    }

    /**
     * Sets the value of field 'webOrderId'.
     * 
     * @param webOrderId the value of field 'webOrderId'.
     */
    public void setWebOrderId(
            final int webOrderId) {
        this._webOrderId = webOrderId;
        this._has_webOrderId = true;
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
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus.class, reader);
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
