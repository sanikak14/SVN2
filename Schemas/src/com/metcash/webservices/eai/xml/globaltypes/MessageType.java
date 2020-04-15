/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.globaltypes;

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
     * Field _data.
     */
    private java.lang.String _data;

    /**
     * Field _severity.
     */
    private com.metcash.webservices.eai.xml.globaltypes.types.SeverityType _severity;


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
     * Returns the value of field 'data'.
     * 
     * @return the value of field 'Data'.
     */
    public java.lang.String getData(
    ) {
        return this._data;
    }

    /**
     * Returns the value of field 'severity'.
     * 
     * @return the value of field 'Severity'.
     */
    public com.metcash.webservices.eai.xml.globaltypes.types.SeverityType getSeverity(
    ) {
        return this._severity;
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
     * Sets the value of field 'data'.
     * 
     * @param data the value of field 'data'.
     */
    public void setData(
            final java.lang.String data) {
        this._data = data;
    }

    /**
     * Sets the value of field 'severity'.
     * 
     * @param severity the value of field 'severity'.
     */
    public void setSeverity(
            final com.metcash.webservices.eai.xml.globaltypes.types.SeverityType severity) {
        this._severity = severity;
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
     * com.metcash.webservices.eai.xml.globaltypes.MessageType
     */
    public static com.metcash.webservices.eai.xml.globaltypes.MessageType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.globaltypes.MessageType) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.globaltypes.MessageType.class, reader);
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