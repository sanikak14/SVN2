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
 * Class MessageType.
 * 
 * @version $Revision$ $Date$
 */
public class MessageType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _messageData.
     */
    private java.lang.String _messageData;

    /**
     * Field _messageSeverity.
     */
    private com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType _messageSeverity;


      //----------------/
     //- Constructors -/
    //----------------/

    public MessageType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'messageData'.
     * 
     * @return the value of field 'MessageData'.
     */
    public java.lang.String getMessageData(
    ) {
        return this._messageData;
    }

    /**
     * Returns the value of field 'messageSeverity'.
     * 
     * @return the value of field 'MessageSeverity'.
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType getMessageSeverity(
    ) {
        return this._messageSeverity;
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
     * Sets the value of field 'messageData'.
     * 
     * @param messageData the value of field 'messageData'.
     */
    public void setMessageData(
            final java.lang.String messageData) {
        this._messageData = messageData;
    }

    /**
     * Sets the value of field 'messageSeverity'.
     * 
     * @param messageSeverity the value of field 'messageSeverity'.
     */
    public void setMessageSeverity(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType messageSeverity) {
        this._messageSeverity = messageSeverity;
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
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.MessageType
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.validation.MessageType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.MessageType) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.pricesoh.validation.MessageType.class, reader);
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
