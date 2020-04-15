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
 * Class OrderHeader.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeader implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _vendorOrderId.
     */
    private java.lang.String _vendorOrderId;

    /**
     * Field _customerOrderId.
     */
    private java.lang.String _customerOrderId;

    /**
     * Field _customerId.
     */
    private java.lang.String _customerId;

    /**
     * Field _customerStateCode.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType _customerStateCode;

    /**
     * Field _supplierRepId.
     */
    private java.lang.String _supplierRepId;

    /**
     * Field _supplierReference.
     */
    private java.lang.String _supplierReference;

    /**
     * Field _supplierStateId.
     */
    private java.lang.String _supplierStateId;

    /**
     * Field _trnApproved.
     */
    private com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType _trnApproved;

    /**
     * Field _refSupplierStateId.
     */
    private java.lang.String _refSupplierStateId;

    /**
     * Field _refSupplierRepId.
     */
    private java.lang.String _refSupplierRepId;

    /**
     * Field _specialInstructions.
     */
    private java.lang.String _specialInstructions;

    /**
     * Field _deliveryDate.
     */
    private java.lang.String _deliveryDate;

    /**
     * Field _orderCreatedDate.
     */
    private java.lang.String _orderCreatedDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHeader() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'customerOrderId'.
     * 
     * @return the value of field 'CustomerOrderId'.
     */
    public java.lang.String getCustomerOrderId(
    ) {
        return this._customerOrderId;
    }

    /**
     * Returns the value of field 'customerStateCode'.
     * 
     * @return the value of field 'CustomerStateCode'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType getCustomerStateCode(
    ) {
        return this._customerStateCode;
    }

    /**
     * Returns the value of field 'deliveryDate'.
     * 
     * @return the value of field 'DeliveryDate'.
     */
    public java.lang.String getDeliveryDate(
    ) {
        return this._deliveryDate;
    }

    /**
     * Returns the value of field 'orderCreatedDate'.
     * 
     * @return the value of field 'OrderCreatedDate'.
     */
    public java.lang.String getOrderCreatedDate(
    ) {
        return this._orderCreatedDate;
    }

    /**
     * Returns the value of field 'refSupplierRepId'.
     * 
     * @return the value of field 'RefSupplierRepId'.
     */
    public java.lang.String getRefSupplierRepId(
    ) {
        return this._refSupplierRepId;
    }

    /**
     * Returns the value of field 'refSupplierStateId'.
     * 
     * @return the value of field 'RefSupplierStateId'.
     */
    public java.lang.String getRefSupplierStateId(
    ) {
        return this._refSupplierStateId;
    }

    /**
     * Returns the value of field 'specialInstructions'.
     * 
     * @return the value of field 'SpecialInstructions'.
     */
    public java.lang.String getSpecialInstructions(
    ) {
        return this._specialInstructions;
    }

    /**
     * Returns the value of field 'supplierReference'.
     * 
     * @return the value of field 'SupplierReference'.
     */
    public java.lang.String getSupplierReference(
    ) {
        return this._supplierReference;
    }

    /**
     * Returns the value of field 'supplierRepId'.
     * 
     * @return the value of field 'SupplierRepId'.
     */
    public java.lang.String getSupplierRepId(
    ) {
        return this._supplierRepId;
    }

    /**
     * Returns the value of field 'supplierStateId'.
     * 
     * @return the value of field 'SupplierStateId'.
     */
    public java.lang.String getSupplierStateId(
    ) {
        return this._supplierStateId;
    }

    /**
     * Returns the value of field 'trnApproved'.
     * 
     * @return the value of field 'TrnApproved'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType getTrnApproved(
    ) {
        return this._trnApproved;
    }

    /**
     * Returns the value of field 'vendorOrderId'.
     * 
     * @return the value of field 'VendorOrderId'.
     */
    public java.lang.String getVendorOrderId(
    ) {
        return this._vendorOrderId;
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
     * Sets the value of field 'customerId'.
     * 
     * @param customerId the value of field 'customerId'.
     */
    public void setCustomerId(
            final java.lang.String customerId) {
        this._customerId = customerId;
    }

    /**
     * Sets the value of field 'customerOrderId'.
     * 
     * @param customerOrderId the value of field 'customerOrderId'.
     */
    public void setCustomerOrderId(
            final java.lang.String customerOrderId) {
        this._customerOrderId = customerOrderId;
    }

    /**
     * Sets the value of field 'customerStateCode'.
     * 
     * @param customerStateCode the value of field
     * 'customerStateCode'.
     */
    public void setCustomerStateCode(
            final com.metcash.webservices.eai.xml.supplier.order.types.CustomerStateCodeType customerStateCode) {
        this._customerStateCode = customerStateCode;
    }

    /**
     * Sets the value of field 'deliveryDate'.
     * 
     * @param deliveryDate the value of field 'deliveryDate'.
     */
    public void setDeliveryDate(
            final java.lang.String deliveryDate) {
        this._deliveryDate = deliveryDate;
    }

    /**
     * Sets the value of field 'orderCreatedDate'.
     * 
     * @param orderCreatedDate the value of field 'orderCreatedDate'
     */
    public void setOrderCreatedDate(
            final java.lang.String orderCreatedDate) {
        this._orderCreatedDate = orderCreatedDate;
    }

    /**
     * Sets the value of field 'refSupplierRepId'.
     * 
     * @param refSupplierRepId the value of field 'refSupplierRepId'
     */
    public void setRefSupplierRepId(
            final java.lang.String refSupplierRepId) {
        this._refSupplierRepId = refSupplierRepId;
    }

    /**
     * Sets the value of field 'refSupplierStateId'.
     * 
     * @param refSupplierStateId the value of field
     * 'refSupplierStateId'.
     */
    public void setRefSupplierStateId(
            final java.lang.String refSupplierStateId) {
        this._refSupplierStateId = refSupplierStateId;
    }

    /**
     * Sets the value of field 'specialInstructions'.
     * 
     * @param specialInstructions the value of field
     * 'specialInstructions'.
     */
    public void setSpecialInstructions(
            final java.lang.String specialInstructions) {
        this._specialInstructions = specialInstructions;
    }

    /**
     * Sets the value of field 'supplierReference'.
     * 
     * @param supplierReference the value of field
     * 'supplierReference'.
     */
    public void setSupplierReference(
            final java.lang.String supplierReference) {
        this._supplierReference = supplierReference;
    }

    /**
     * Sets the value of field 'supplierRepId'.
     * 
     * @param supplierRepId the value of field 'supplierRepId'.
     */
    public void setSupplierRepId(
            final java.lang.String supplierRepId) {
        this._supplierRepId = supplierRepId;
    }

    /**
     * Sets the value of field 'supplierStateId'.
     * 
     * @param supplierStateId the value of field 'supplierStateId'.
     */
    public void setSupplierStateId(
            final java.lang.String supplierStateId) {
        this._supplierStateId = supplierStateId;
    }

    /**
     * Sets the value of field 'trnApproved'.
     * 
     * @param trnApproved the value of field 'trnApproved'.
     */
    public void setTrnApproved(
            final com.metcash.webservices.eai.xml.supplier.order.types.TrnApprovedType trnApproved) {
        this._trnApproved = trnApproved;
    }

    /**
     * Sets the value of field 'vendorOrderId'.
     * 
     * @param vendorOrderId the value of field 'vendorOrderId'.
     */
    public void setVendorOrderId(
            final java.lang.String vendorOrderId) {
        this._vendorOrderId = vendorOrderId;
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
     * com.metcash.webservices.eai.xml.supplier.order.OrderHeader
     */
    public static com.metcash.webservices.eai.xml.supplier.order.OrderHeader unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.order.OrderHeader) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.order.OrderHeader.class, reader);
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
