/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderhistory.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderHistory.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHistory implements java.io.Serializable {


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
     * Field _createdDate.
     */
    private java.util.Date _createdDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHistory() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteWebOrderId(
    ) {
        this._has_webOrderId= false;
    }

    /**
     * Returns the value of field 'createdDate'.
     * 
     * @return the value of field 'CreatedDate'.
     */
    public java.util.Date getCreatedDate(
    ) {
        return this._createdDate;
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
     * Method hasWebOrderId.
     * 
     * @return true if at least one WebOrderId has been added
     */
    public boolean hasWebOrderId(
    ) {
        return this._has_webOrderId;
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
     * Sets the value of field 'createdDate'.
     * 
     * @param createdDate the value of field 'createdDate'.
     */
    public void setCreatedDate(
            final java.util.Date createdDate) {
        this._createdDate = createdDate;
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
     * com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory
     */
    public static com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory.class, reader);
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
