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
 * Class StateCodeType.
 * 
 * @version $Revision$ $Date$
 */
public class StateCodeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 1 type
     */
    public static final int VALUE_1_TYPE = 0;

    /**
     * The instance of the 1 type
     */
    public static final StateCodeType VALUE_1 = new StateCodeType(VALUE_1_TYPE, "1");

    /**
     * The 2 type
     */
    public static final int VALUE_2_TYPE = 1;

    /**
     * The instance of the 2 type
     */
    public static final StateCodeType VALUE_2 = new StateCodeType(VALUE_2_TYPE, "2");

    /**
     * The 3 type
     */
    public static final int VALUE_3_TYPE = 2;

    /**
     * The instance of the 3 type
     */
    public static final StateCodeType VALUE_3 = new StateCodeType(VALUE_3_TYPE, "3");

    /**
     * The 4 type
     */
    public static final int VALUE_4_TYPE = 3;

    /**
     * The instance of the 4 type
     */
    public static final StateCodeType VALUE_4 = new StateCodeType(VALUE_4_TYPE, "4");

    /**
     * The 5 type
     */
    public static final int VALUE_5_TYPE = 4;

    /**
     * The instance of the 5 type
     */
    public static final StateCodeType VALUE_5 = new StateCodeType(VALUE_5_TYPE, "5");

    /**
     * The 6 type
     */
    public static final int VALUE_6_TYPE = 5;

    /**
     * The instance of the 6 type
     */
    public static final StateCodeType VALUE_6 = new StateCodeType(VALUE_6_TYPE, "6");

    /**
     * The 7 type
     */
    public static final int VALUE_7_TYPE = 6;

    /**
     * The instance of the 7 type
     */
    public static final StateCodeType VALUE_7 = new StateCodeType(VALUE_7_TYPE, "7");

    /**
     * The 8 type
     */
    public static final int VALUE_8_TYPE = 7;

    /**
     * The instance of the 8 type
     */
    public static final StateCodeType VALUE_8 = new StateCodeType(VALUE_8_TYPE, "8");

    /**
     * The 9 type
     */
    public static final int VALUE_9_TYPE = 8;

    /**
     * The instance of the 9 type
     */
    public static final StateCodeType VALUE_9 = new StateCodeType(VALUE_9_TYPE, "9");

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

    private StateCodeType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of StateCodeType
     * 
     * @return an Enumeration over all possible instances of
     * StateCodeType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this StateCodeType
     * 
     * @return the type of this StateCodeType
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
        members.put("1", VALUE_1);
        members.put("2", VALUE_2);
        members.put("3", VALUE_3);
        members.put("4", VALUE_4);
        members.put("5", VALUE_5);
        members.put("6", VALUE_6);
        members.put("7", VALUE_7);
        members.put("8", VALUE_8);
        members.put("9", VALUE_9);
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
     * StateCodeType
     * 
     * @return the String representation of this StateCodeType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new StateCodeType based on the
     * given String value.
     * 
     * @param string
     * @return the StateCodeType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.globaltypes.types.StateCodeType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid StateCodeType";
            throw new IllegalArgumentException(err);
        }
        return (StateCodeType) obj;
    }

}
