/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class MessageSeverityType.
 * 
 * @version $Revision$ $Date$
 */
public class MessageSeverityType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ERROR type
     */
    public static final int ERROR_TYPE = 0;

    /**
     * The instance of the ERROR type
     */
    public static final MessageSeverityType ERROR = new MessageSeverityType(ERROR_TYPE, "ERROR");

    /**
     * The WARN type
     */
    public static final int WARN_TYPE = 1;

    /**
     * The instance of the WARN type
     */
    public static final MessageSeverityType WARN = new MessageSeverityType(WARN_TYPE, "WARN");

    /**
     * The INFO type
     */
    public static final int INFO_TYPE = 2;

    /**
     * The instance of the INFO type
     */
    public static final MessageSeverityType INFO = new MessageSeverityType(INFO_TYPE, "INFO");

    /**
     * The DEBUG type
     */
    public static final int DEBUG_TYPE = 3;

    /**
     * The instance of the DEBUG type
     */
    public static final MessageSeverityType DEBUG = new MessageSeverityType(DEBUG_TYPE, "DEBUG");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private MessageSeverityType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of MessageSeverityType
     * 
     * @return an Enumeration over all possible instances of
     * MessageSeverityType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this MessageSeverityType
     * 
     * @return the type of this MessageSeverityType
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable init(
    ) {
        Hashtable members = new Hashtable();
        members.put("ERROR", ERROR);
        members.put("WARN", WARN);
        members.put("INFO", INFO);
        members.put("DEBUG", DEBUG);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private java.lang.Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * MessageSeverityType
     * 
     * @return the String representation of this MessageSeverityType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new MessageSeverityType based on
     * the given String value.
     * 
     * @param string
     * @return the MessageSeverityType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.validation.types.MessageSeverityType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid MessageSeverityType";
            throw new IllegalArgumentException(err);
        }
        return (MessageSeverityType) obj;
    }

}
