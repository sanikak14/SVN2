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
 * Class ProductResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ProductResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _index.
     */
    private int _index;

    /**
     * keeps track of state for field: _index
     */
    private boolean _has_index;

    /**
     * Field _supplierProductDetail.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail _supplierProductDetail;

    /**
     * Field _message.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProductResponse() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteIndex(
    ) {
        this._has_index= false;
    }

    /**
     * Returns the value of field 'index'.
     * 
     * @return the value of field 'Index'.
     */
    public int getIndex(
    ) {
        return this._index;
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'supplierProductDetail'.
     * 
     * @return the value of field 'SupplierProductDetail'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail getSupplierProductDetail(
    ) {
        return this._supplierProductDetail;
    }

    /**
     * Method hasIndex.
     * 
     * @return true if at least one Index has been added
     */
    public boolean hasIndex(
    ) {
        return this._has_index;
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
     * Sets the value of field 'index'.
     * 
     * @param index the value of field 'index'.
     */
    public void setIndex(
            final int index) {
        this._index = index;
        this._has_index = true;
    }

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'supplierProductDetail'.
     * 
     * @param supplierProductDetail the value of field
     * 'supplierProductDetail'.
     */
    public void setSupplierProductDetail(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierProductDetail supplierProductDetail) {
        this._supplierProductDetail = supplierProductDetail;
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
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse
     */
    public static com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse.class, reader);
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
