/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.pricesoh.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class BonusList.
 * 
 * @version $Revision$ $Date$
 */
public class BonusList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bonusList.
     */
    private java.util.List _bonusList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BonusList() {
        super();
        this._bonusList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBonus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBonus(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus vBonus)
    throws java.lang.IndexOutOfBoundsException {
        this._bonusList.add(vBonus);
    }

    /**
     * 
     * 
     * @param index
     * @param vBonus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBonus(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus vBonus)
    throws java.lang.IndexOutOfBoundsException {
        this._bonusList.add(index, vBonus);
    }

    /**
     * Method enumerateBonus.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateBonus(
    ) {
        return java.util.Collections.enumeration(this._bonusList);
    }

    /**
     * Method getBonus.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus
     * at the given index
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus getBonus(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bonusList.size()) {
            throw new IndexOutOfBoundsException("getBonus: Index value '" + index + "' not in range [0.." + (this._bonusList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus) _bonusList.get(index);
    }

    /**
     * Method getBonus.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus[] getBonus(
    ) {
        com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus[] array = new com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus[0];
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus[]) this._bonusList.toArray(array);
    }

    /**
     * Method getBonusCount.
     * 
     * @return the size of this collection
     */
    public int getBonusCount(
    ) {
        return this._bonusList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateBonus.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateBonus(
    ) {
        return this._bonusList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllBonus(
    ) {
        this._bonusList.clear();
    }

    /**
     * Method removeBonus.
     * 
     * @param vBonus
     * @return true if the object was removed from the collection.
     */
    public boolean removeBonus(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus vBonus) {
        boolean removed = _bonusList.remove(vBonus);
        return removed;
    }

    /**
     * Method removeBonusAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus removeBonusAt(
            final int index) {
        java.lang.Object obj = this._bonusList.remove(index);
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBonus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBonus(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus vBonus)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bonusList.size()) {
            throw new IndexOutOfBoundsException("setBonus: Index value '" + index + "' not in range [0.." + (this._bonusList.size() - 1) + "]");
        }
        
        this._bonusList.set(index, vBonus);
    }

    /**
     * 
     * 
     * @param vBonusArray
     */
    public void setBonus(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.Bonus[] vBonusArray) {
        //-- copy array
        _bonusList.clear();
        
        for (int i = 0; i < vBonusArray.length; i++) {
                this._bonusList.add(vBonusArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.pricesoh.validation.BonusList.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
