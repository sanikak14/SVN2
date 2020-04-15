/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.globaltypes.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class SeverityType.
 * 
 * @version $Revision$ $Date$
 */
public class SeverityType implements java.io.Serializable {


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
    public static final SeverityType ERROR = new SeverityType(ERROR_TYPE, "ERROR");

    /**
     * The WARN type
     */
    public static final int WARN_TYPE = 1;

    /**
     * The instance of the WARN type
     */
    public static final SeverityType WARN = new SeverityType(WARN_TYPE, "WARN");

    /**
     * The INFO type
     */
    public static final int INFO_TYPE = 2;

    /**
     * The instance of the INFO type
     */
    public static final SeverityType INFO = new SeverityType(INFO_TYPE, "INFO");

    /**
     * The DEBUG type
     */
    public static final int DEBUG_TYPE = 3;

    /**
     * The instance of the DEBUG type
     */
    public static final SeverityType DEBUG = new SeverityType(DEBUG_TYPE, "DEBUG");

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

    private SeverityType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of SeverityType
     * 
     * @return an Enumeration over all possible instances of
     * SeverityType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this SeverityType
     * 
     * @return the type of this SeverityType
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
     * SeverityType
     * 
     * @return the String representation of this SeverityType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new SeverityType based on the given
     * String value.
     * 
     * @param string
     * @return the SeverityType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.globaltypes.types.SeverityType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid SeverityType";
            throw new IllegalArgumentException(err);
        }
        return (SeverityType) obj;
    }

}
