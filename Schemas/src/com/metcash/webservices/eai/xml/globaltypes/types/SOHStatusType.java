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
 * N: NOT AVAILABLE, A: AVAILABLE, O: SOLD OUT, S:
 *  SUBSTITUTE
 *  
 * 
 * @version $Revision$ $Date$
 */
public class SOHStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The N type
     */
    public static final int N_TYPE = 0;

    /**
     * The instance of the N type
     */
    public static final SOHStatusType N = new SOHStatusType(N_TYPE, "N");

    /**
     * The A type
     */
    public static final int A_TYPE = 1;

    /**
     * The instance of the A type
     */
    public static final SOHStatusType A = new SOHStatusType(A_TYPE, "A");

    /**
     * The O type
     */
    public static final int O_TYPE = 2;

    /**
     * The instance of the O type
     */
    public static final SOHStatusType O = new SOHStatusType(O_TYPE, "O");

    /**
     * The S type
     */
    public static final int S_TYPE = 3;

    /**
     * The instance of the S type
     */
    public static final SOHStatusType S = new SOHStatusType(S_TYPE, "S");

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

    private SOHStatusType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of SOHStatusType
     * 
     * @return an Enumeration over all possible instances of
     * SOHStatusType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this SOHStatusType
     * 
     * @return the type of this SOHStatusType
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
        members.put("N", N);
        members.put("A", A);
        members.put("O", O);
        members.put("S", S);
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
     * SOHStatusType
     * 
     * @return the String representation of this SOHStatusType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new SOHStatusType based on the
     * given String value.
     * 
     * @param string
     * @return the SOHStatusType value of parameter 'string'
     */
    public static com.metcash.webservices.eai.xml.globaltypes.types.SOHStatusType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid SOHStatusType";
            throw new IllegalArgumentException(err);
        }
        return (SOHStatusType) obj;
    }

}
