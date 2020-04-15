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
 * Class OrderHeaderStatusTurnInOrderTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderStatusTurnInOrderTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The R type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the R type
     */
    public static final OrderHeaderStatusTurnInOrderTypeType VALUE_0 = new OrderHeaderStatusTurnInOrderTypeType(VALUE_0_TYPE, "R");

    /**
     * The B type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the B type
     */
    public static final OrderHeaderStatusTurnInOrderTypeType VALUE_1 = new OrderHeaderStatusTurnInOrderTypeType(VALUE_1_TYPE, "B");

    /**
     * The O type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the O type
     */
    public static final OrderHeaderStatusTurnInOrderTypeType VALUE_2 = new OrderHeaderStatusTurnInOrderTypeType(VALUE_2_TYPE, "O");

    /**
     * The T type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the T type
     */
    public static final OrderHeaderStatusTurnInOrderTypeType VALUE_3 = new OrderHeaderStatusTurnInOrderTypeType(VALUE_3_TYPE, "T");

    /**
     * The  type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the  type
     */
    public static final OrderHeaderStatusTurnInOrderTypeType VALUE_4 = new OrderHeaderStatusTurnInOrderTypeType(VALUE_4_TYPE, "");

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

    private OrderHeaderStatusTurnInOrderTypeType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of OrderHeaderStatusTurnInOrderTypeType
     * 
     * @return an Enumeration over all possible instances of
     * OrderHeaderStatusTurnInOrderTypeType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * OrderHeaderStatusTurnInOrderTypeType
     * 
     * @return the type of this OrderHeaderStatusTurnInOrderTypeType
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
        members.put("R", VALUE_0);
        members.put("B", VALUE_1);
        members.put("O", VALUE_2);
        members.put("T", VALUE_3);
        members.put("", VALUE_4);
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
     * OrderHeaderStatusTurnInOrderTypeType
     * 
     * @return the String representation of this
     * OrderHeaderStatusTurnInOrderTypeType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new
     * OrderHeaderStatusTurnInOrderTypeType based on the given
     * String value.
     * 
     * @param string
     * @return the OrderHeaderStatusTurnInOrderTypeType value of
     * parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusTurnInOrderTypeType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid OrderHeaderStatusTurnInOrderTypeType";
            throw new IllegalArgumentException(err);
        }
        return (OrderHeaderStatusTurnInOrderTypeType) obj;
    }

}
