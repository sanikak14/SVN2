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
 * Class OrderHeaderStatusStatusType.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderStatusStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The C type
     */
    public static final int C_TYPE = 0;

    /**
     * The instance of the C type
     */
    public static final OrderHeaderStatusStatusType C = new OrderHeaderStatusStatusType(C_TYPE, "C");

    /**
     * The I type
     */
    public static final int I_TYPE = 1;

    /**
     * The instance of the I type
     */
    public static final OrderHeaderStatusStatusType I = new OrderHeaderStatusStatusType(I_TYPE, "I");

    /**
     * The P type
     */
    public static final int P_TYPE = 2;

    /**
     * The instance of the P type
     */
    public static final OrderHeaderStatusStatusType P = new OrderHeaderStatusStatusType(P_TYPE, "P");

    /**
     * The X type
     */
    public static final int X_TYPE = 3;

    /**
     * The instance of the X type
     */
    public static final OrderHeaderStatusStatusType X = new OrderHeaderStatusStatusType(X_TYPE, "X");

    /**
     * The J type
     */
    public static final int J_TYPE = 4;

    /**
     * The instance of the J type
     */
    public static final OrderHeaderStatusStatusType J = new OrderHeaderStatusStatusType(J_TYPE, "J");

    /**
     * The U type
     */
    public static final int U_TYPE = 5;

    /**
     * The instance of the U type
     */
    public static final OrderHeaderStatusStatusType U = new OrderHeaderStatusStatusType(U_TYPE, "U");

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

    private OrderHeaderStatusStatusType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of OrderHeaderStatusStatusType
     * 
     * @return an Enumeration over all possible instances of
     * OrderHeaderStatusStatusType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * OrderHeaderStatusStatusType
     * 
     * @return the type of this OrderHeaderStatusStatusType
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
        members.put("C", C);
        members.put("I", I);
        members.put("P", P);
        members.put("X", X);
        members.put("J", J);
        members.put("U", U);
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
     * OrderHeaderStatusStatusType
     * 
     * @return the String representation of this
     * OrderHeaderStatusStatusType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new OrderHeaderStatusStatusType
     * based on the given String value.
     * 
     * @param string
     * @return the OrderHeaderStatusStatusType value of parameter
     * 'string'
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStatusType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid OrderHeaderStatusStatusType";
            throw new IllegalArgumentException(err);
        }
        return (OrderHeaderStatusStatusType) obj;
    }

}
