/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.order.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class OrderApprovedType.
 * 
 * @version $Revision$ $Date$
 */
public class OrderApprovedType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Y type
     */
    public static final int Y_TYPE = 0;

    /**
     * The instance of the Y type
     */
    public static final OrderApprovedType Y = new OrderApprovedType(Y_TYPE, "Y");

    /**
     * The N type
     */
    public static final int N_TYPE = 1;

    /**
     * The instance of the N type
     */
    public static final OrderApprovedType N = new OrderApprovedType(N_TYPE, "N");

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

    private OrderApprovedType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of OrderApprovedType
     * 
     * @return an Enumeration over all possible instances of
     * OrderApprovedType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this OrderApprovedType
     * 
     * @return the type of this OrderApprovedType
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
        members.put("Y", Y);
        members.put("N", N);
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
     * OrderApprovedType
     * 
     * @return the String representation of this OrderApprovedType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new OrderApprovedType based on the
     * given String value.
     * 
     * @param string
     * @return the OrderApprovedType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.retailer.order.types.OrderApprovedType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid OrderApprovedType";
            throw new IllegalArgumentException(err);
        }
        return (OrderApprovedType) obj;
    }

}
