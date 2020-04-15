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
 * Class OrderHeaderStatusStageType.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderStatusStageType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The R type
     */
    public static final int R_TYPE = 0;

    /**
     * The instance of the R type
     */
    public static final OrderHeaderStatusStageType R = new OrderHeaderStatusStageType(R_TYPE, "R");

    /**
     * The P type
     */
    public static final int P_TYPE = 1;

    /**
     * The instance of the P type
     */
    public static final OrderHeaderStatusStageType P = new OrderHeaderStatusStageType(P_TYPE, "P");

    /**
     * The E type
     */
    public static final int E_TYPE = 2;

    /**
     * The instance of the E type
     */
    public static final OrderHeaderStatusStageType E = new OrderHeaderStatusStageType(E_TYPE, "E");

    /**
     * The I type
     */
    public static final int I_TYPE = 3;

    /**
     * The instance of the I type
     */
    public static final OrderHeaderStatusStageType I = new OrderHeaderStatusStageType(I_TYPE, "I");

    /**
     * The C type
     */
    public static final int C_TYPE = 4;

    /**
     * The instance of the C type
     */
    public static final OrderHeaderStatusStageType C = new OrderHeaderStatusStageType(C_TYPE, "C");

    /**
     * The J type
     */
    public static final int J_TYPE = 5;

    /**
     * The instance of the J type
     */
    public static final OrderHeaderStatusStageType J = new OrderHeaderStatusStageType(J_TYPE, "J");

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

    private OrderHeaderStatusStageType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of OrderHeaderStatusStageType
     * 
     * @return an Enumeration over all possible instances of
     * OrderHeaderStatusStageType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * OrderHeaderStatusStageType
     * 
     * @return the type of this OrderHeaderStatusStageType
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
        members.put("R", R);
        members.put("P", P);
        members.put("E", E);
        members.put("I", I);
        members.put("C", C);
        members.put("J", J);
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
     * OrderHeaderStatusStageType
     * 
     * @return the String representation of this
     * OrderHeaderStatusStageType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new OrderHeaderStatusStageType
     * based on the given String value.
     * 
     * @param string
     * @return the OrderHeaderStatusStageType value of parameter
     * 'string'
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.types.OrderHeaderStatusStageType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid OrderHeaderStatusStageType";
            throw new IllegalArgumentException(err);
        }
        return (OrderHeaderStatusStageType) obj;
    }

}
