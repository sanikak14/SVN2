/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.order.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderHeaderMessages.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderMessages implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _headerMessageData.
     */
    private java.lang.String _headerMessageData;

    /**
     * Field _headerMessageSeverity.
     */
    private java.lang.String _headerMessageSeverity;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHeaderMessages() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'headerMessageData'.
     * 
     * @return the value of field 'HeaderMessageData'.
     */
    public java.lang.String getHeaderMessageData(
    ) {
        return this._headerMessageData;
    }

    /**
     * Returns the value of field 'headerMessageSeverity'.
     * 
     * @return the value of field 'HeaderMessageSeverity'.
     */
    public java.lang.String getHeaderMessageSeverity(
    ) {
        return this._headerMessageSeverity;
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
     * Sets the value of field 'headerMessageData'.
     * 
     * @param headerMessageData the value of field
     * 'headerMessageData'.
     */
    public void setHeaderMessageData(
            final java.lang.String headerMessageData) {
        this._headerMessageData = headerMessageData;
    }

    /**
     * Sets the value of field 'headerMessageSeverity'.
     * 
     * @param headerMessageSeverity the value of field
     * 'headerMessageSeverity'.
     */
    public void setHeaderMessageSeverity(
            final java.lang.String headerMessageSeverity) {
        this._headerMessageSeverity = headerMessageSeverity;
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
     * com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages
     */
    public static com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderMessages.class, reader);
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
