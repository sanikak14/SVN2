/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.order.validation.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class TurnInOrderTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TurnInOrderTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The O type
     */
    public static final int O_TYPE = 0;

    /**
     * The instance of the O type
     */
    public static final TurnInOrderTypeType O = new TurnInOrderTypeType(O_TYPE, "O");

    /**
     * The B type
     */
    public static final int B_TYPE = 1;

    /**
     * The instance of the B type
     */
    public static final TurnInOrderTypeType B = new TurnInOrderTypeType(B_TYPE, "B");

    /**
     * The T type
     */
    public static final int T_TYPE = 2;

    /**
     * The instance of the T type
     */
    public static final TurnInOrderTypeType T = new TurnInOrderTypeType(T_TYPE, "T");

    /**
     * The R type
     */
    public static final int R_TYPE = 3;

    /**
     * The instance of the R type
     */
    public static final TurnInOrderTypeType R = new TurnInOrderTypeType(R_TYPE, "R");

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

    private TurnInOrderTypeType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of TurnInOrderTypeType
     * 
     * @return an Enumeration over all possible instances of
     * TurnInOrderTypeType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this TurnInOrderTypeType
     * 
     * @return the type of this TurnInOrderTypeType
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
        members.put("O", O);
        members.put("B", B);
        members.put("T", T);
        members.put("R", R);
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
     * TurnInOrderTypeType
     * 
     * @return the String representation of this TurnInOrderTypeType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new TurnInOrderTypeType based on
     * the given String value.
     * 
     * @param string
     * @return the TurnInOrderTypeType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid TurnInOrderTypeType";
            throw new IllegalArgumentException(err);
        }
        return (TurnInOrderTypeType) obj;
    }

}
