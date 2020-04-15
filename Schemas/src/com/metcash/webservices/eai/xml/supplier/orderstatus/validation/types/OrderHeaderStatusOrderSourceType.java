/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class OrderHeaderStatusOrderSourceType.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderStatusOrderSourceType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The MFR type
     */
    public static final int MFR_TYPE = 0;

    /**
     * The instance of the MFR type
     */
    public static final OrderHeaderStatusOrderSourceType MFR = new OrderHeaderStatusOrderSourceType(MFR_TYPE, "MFR");

    /**
     * The WEB type
     */
    public static final int WEB_TYPE = 1;

    /**
     * The instance of the WEB type
     */
    public static final OrderHeaderStatusOrderSourceType WEB = new OrderHeaderStatusOrderSourceType(WEB_TYPE, "WEB");

    /**
     * The WSE type
     */
    public static final int WSE_TYPE = 2;

    /**
     * The instance of the WSE type
     */
    public static final OrderHeaderStatusOrderSourceType WSE = new OrderHeaderStatusOrderSourceType(WSE_TYPE, "WSE");

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

    private OrderHeaderStatusOrderSourceType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of OrderHeaderStatusOrderSourceType
     * 
     * @return an Enumeration over all possible instances of
     * OrderHeaderStatusOrderSourceType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * OrderHeaderStatusOrderSourceType
     * 
     * @return the type of this OrderHeaderStatusOrderSourceType
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
        members.put("MFR", MFR);
        members.put("WEB", WEB);
        members.put("WSE", WSE);
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
     * OrderHeaderStatusOrderSourceType
     * 
     * @return the String representation of this
     * OrderHeaderStatusOrderSourceType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new
     * OrderHeaderStatusOrderSourceType based on the given String
     * value.
     * 
     * @param string
     * @return the OrderHeaderStatusOrderSourceType value of
     * parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusOrderSourceType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid OrderHeaderStatusOrderSourceType";
            throw new IllegalArgumentException(err);
        }
        return (OrderHeaderStatusOrderSourceType) obj;
    }

}
