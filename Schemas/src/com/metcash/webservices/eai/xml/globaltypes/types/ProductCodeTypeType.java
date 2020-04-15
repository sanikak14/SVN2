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
 * M: METCASH, V: VENDOR, R: RETAILER
 *  
 * 
 * @version $Revision$ $Date$
 */
public class ProductCodeTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The M type
     */
    public static final int M_TYPE = 0;

    /**
     * The instance of the M type
     */
    public static final ProductCodeTypeType M = new ProductCodeTypeType(M_TYPE, "M");

    /**
     * The V type
     */
    public static final int V_TYPE = 1;

    /**
     * The instance of the V type
     */
    public static final ProductCodeTypeType V = new ProductCodeTypeType(V_TYPE, "V");

    /**
     * The R type
     */
    public static final int R_TYPE = 2;

    /**
     * The instance of the R type
     */
    public static final ProductCodeTypeType R = new ProductCodeTypeType(R_TYPE, "R");

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

    private ProductCodeTypeType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of ProductCodeTypeType
     * 
     * @return an Enumeration over all possible instances of
     * ProductCodeTypeType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this ProductCodeTypeType
     * 
     * @return the type of this ProductCodeTypeType
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
        members.put("M", M);
        members.put("V", V);
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
     * ProductCodeTypeType
     * 
     * @return the String representation of this ProductCodeTypeType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new ProductCodeTypeType based on
     * the given String value.
     * 
     * @param string
     * @return the ProductCodeTypeType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.globaltypes.types.ProductCodeTypeType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid ProductCodeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ProductCodeTypeType) obj;
    }

}
