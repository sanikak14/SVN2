/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.pricesoh.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ParcelBuyList.
 * 
 * @version $Revision$ $Date$
 */
public class ParcelBuyList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parcelBuyList.
     */
    private java.util.List _parcelBuyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParcelBuyList() {
        super();
        this._parcelBuyList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParcelBuy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParcelBuy(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy vParcelBuy)
    throws java.lang.IndexOutOfBoundsException {
        this._parcelBuyList.add(vParcelBuy);
    }

    /**
     * 
     * 
     * @param index
     * @param vParcelBuy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParcelBuy(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy vParcelBuy)
    throws java.lang.IndexOutOfBoundsException {
        this._parcelBuyList.add(index, vParcelBuy);
    }

    /**
     * Method enumerateParcelBuy.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateParcelBuy(
    ) {
        return java.util.Collections.enumeration(this._parcelBuyList);
    }

    /**
     * Method getParcelBuy.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy getParcelBuy(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parcelBuyList.size()) {
            throw new IndexOutOfBoundsException("getParcelBuy: Index value '" + index + "' not in range [0.." + (this._parcelBuyList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy) _parcelBuyList.get(index);
    }

    /**
     * Method getParcelBuy.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy[] getParcelBuy(
    ) {
        com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy[] array = new com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy[0];
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy[]) this._parcelBuyList.toArray(array);
    }

    /**
     * Method getParcelBuyCount.
     * 
     * @return the size of this collection
     */
    public int getParcelBuyCount(
    ) {
        return this._parcelBuyList.size();
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
     * Method iterateParcelBuy.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateParcelBuy(
    ) {
        return this._parcelBuyList.iterator();
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
    public void removeAllParcelBuy(
    ) {
        this._parcelBuyList.clear();
    }

    /**
     * Method removeParcelBuy.
     * 
     * @param vParcelBuy
     * @return true if the object was removed from the collection.
     */
    public boolean removeParcelBuy(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy vParcelBuy) {
        boolean removed = _parcelBuyList.remove(vParcelBuy);
        return removed;
    }

    /**
     * Method removeParcelBuyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy removeParcelBuyAt(
            final int index) {
        java.lang.Object obj = this._parcelBuyList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vParcelBuy
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParcelBuy(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy vParcelBuy)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parcelBuyList.size()) {
            throw new IndexOutOfBoundsException("setParcelBuy: Index value '" + index + "' not in range [0.." + (this._parcelBuyList.size() - 1) + "]");
        }
        
        this._parcelBuyList.set(index, vParcelBuy);
    }

    /**
     * 
     * 
     * @param vParcelBuyArray
     */
    public void setParcelBuy(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuy[] vParcelBuyArray) {
        //-- copy array
        _parcelBuyList.clear();
        
        for (int i = 0; i < vParcelBuyArray.length; i++) {
                this._parcelBuyList.add(vParcelBuyArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList
     */
    public static com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ParcelBuyList.class, reader);
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
