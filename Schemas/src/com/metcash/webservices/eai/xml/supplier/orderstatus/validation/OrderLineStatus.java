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
 * Class OrderLineStatus.
 * 
 * @version $Revision$ $Date$
 */
public class OrderLineStatus implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id.
     */
    private int _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _productCode.
     */
    private java.lang.String _productCode;

    /**
     * ' ': Undefined, 0: Reserved, 1: Sold Out, 2: Not Available,
     * 3: Not in Range, 5: Quantity Adjusted, 7: Cross Docked, 8:
     * Rejected, 9: Cancelled
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderLineStatusLineStatusType _lineStatus;

    /**
     * Format: 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units
     * would be 3.5
     */
    private java.lang.String _qtyReserved;

    /**
     * Format: 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units
     * would be 3.5
     */
    private java.lang.String _qtyUnreserved;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderLineStatus() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteId(
    ) {
        this._has_id= false;
    }

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'Id'.
     */
    public int getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'lineStatus'. The field
     * 'lineStatus' has the following description: ' ': Undefined,
     * 0: Reserved, 1: Sold Out, 2: Not Available, 3: Not in Range,
     * 5: Quantity Adjusted, 7: Cross Docked, 8: Rejected, 9:
     * Cancelled
     * 
     * @return the value of field 'LineStatus'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderLineStatusLineStatusType getLineStatus(
    ) {
        return this._lineStatus;
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
     * Returns the value of field 'qtyReserved'. The field
     * 'qtyReserved' has the following description: Format: 'carton
     * qty'.'unit qty'. Eg. 3 cartons and 5 units would be 3.5
     * 
     * @return the value of field 'QtyReserved'.
     */
    public java.lang.String getQtyReserved(
    ) {
        return this._qtyReserved;
    }

    /**
     * Returns the value of field 'qtyUnreserved'. The field
     * 'qtyUnreserved' has the following description: Format:
     * 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units would be
     * 3.5
     * 
     * @return the value of field 'QtyUnreserved'.
     */
    public java.lang.String getQtyUnreserved(
    ) {
        return this._qtyUnreserved;
    }

    /**
     * Method hasId.
     * 
     * @return true if at least one Id has been added
     */
    public boolean hasId(
    ) {
        return this._has_id;
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
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final int id) {
        this._id = id;
        this._has_id = true;
    }

    /**
     * Sets the value of field 'lineStatus'. The field 'lineStatus'
     * has the following description: ' ': Undefined, 0: Reserved,
     * 1: Sold Out, 2: Not Available, 3: Not in Range, 5: Quantity
     * Adjusted, 7: Cross Docked, 8: Rejected, 9: Cancelled
     * 
     * @param lineStatus the value of field 'lineStatus'.
     */
    public void setLineStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderLineStatusLineStatusType lineStatus) {
        this._lineStatus = lineStatus;
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
     * Sets the value of field 'qtyReserved'. The field
     * 'qtyReserved' has the following description: Format: 'carton
     * qty'.'unit qty'. Eg. 3 cartons and 5 units would be 3.5
     * 
     * @param qtyReserved the value of field 'qtyReserved'.
     */
    public void setQtyReserved(
            final java.lang.String qtyReserved) {
        this._qtyReserved = qtyReserved;
    }

    /**
     * Sets the value of field 'qtyUnreserved'. The field
     * 'qtyUnreserved' has the following description: Format:
     * 'carton qty'.'unit qty'. Eg. 3 cartons and 5 units would be
     * 3.5
     * 
     * @param qtyUnreserved the value of field 'qtyUnreserved'.
     */
    public void setQtyUnreserved(
            final java.lang.String qtyUnreserved) {
        this._qtyUnreserved = qtyUnreserved;
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
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus.class, reader);
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
