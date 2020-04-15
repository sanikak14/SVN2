/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderhistory;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class SupplierOrderHistoryRequestType.
 * 
 * @version $Revision$ $Date$
 */
public class SupplierOrderHistoryRequestType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _supplierRep.
     */
    private com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierRep _supplierRep;

    /**
     * Required for Metcash reps
     */
    private com.metcash.webservices.eai.xml.supplier.orderhistory.Customer _customer;

    /**
     * if not specified will be last 7 days from end date.
     */
    private org.exolab.castor.types.Date _startDate;

    /**
     * if end date not specified, will be up to today.
     */
    private org.exolab.castor.types.Date _endDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupplierOrderHistoryRequestType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'customer'. The field 'customer'
     * has the following description: Required for Metcash reps
     * 
     * @return the value of field 'Customer'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.Customer getCustomer(
    ) {
        return this._customer;
    }

    /**
     * Returns the value of field 'endDate'. The field 'endDate'
     * has the following description: if end date not specified,
     * will be up to today.
     * 
     * @return the value of field 'EndDate'.
     */
    public org.exolab.castor.types.Date getEndDate(
    ) {
        return this._endDate;
    }

    /**
     * Returns the value of field 'startDate'. The field
     * 'startDate' has the following description: if not specified
     * will be last 7 days from end date.
     * 
     * @return the value of field 'StartDate'.
     */
    public org.exolab.castor.types.Date getStartDate(
    ) {
        return this._startDate;
    }

    /**
     * Returns the value of field 'supplierRep'.
     * 
     * @return the value of field 'SupplierRep'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierRep getSupplierRep(
    ) {
        return this._supplierRep;
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
     * Sets the value of field 'customer'. The field 'customer' has
     * the following description: Required for Metcash reps
     * 
     * @param customer the value of field 'customer'.
     */
    public void setCustomer(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.Customer customer) {
        this._customer = customer;
    }

    /**
     * Sets the value of field 'endDate'. The field 'endDate' has
     * the following description: if end date not specified, will
     * be up to today.
     * 
     * @param endDate the value of field 'endDate'.
     */
    public void setEndDate(
            final org.exolab.castor.types.Date endDate) {
        this._endDate = endDate;
    }

    /**
     * Sets the value of field 'startDate'. The field 'startDate'
     * has the following description: if not specified will be last
     * 7 days from end date.
     * 
     * @param startDate the value of field 'startDate'.
     */
    public void setStartDate(
            final org.exolab.castor.types.Date startDate) {
        this._startDate = startDate;
    }

    /**
     * Sets the value of field 'supplierRep'.
     * 
     * @param supplierRep the value of field 'supplierRep'.
     */
    public void setSupplierRep(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierRep supplierRep) {
        this._supplierRep = supplierRep;
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
     * com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequestType
     */
    public static com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequestType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequestType) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequestType.class, reader);
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
