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
 * Class QDAList.
 * 
 * @version $Revision$ $Date$
 */
public class QDAList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _QDAList.
     */
    private java.util.List _QDAList;


      //----------------/
     //- Constructors -/
    //----------------/

    public QDAList() {
        super();
        this._QDAList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vQDA
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQDA(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA vQDA)
    throws java.lang.IndexOutOfBoundsException {
        this._QDAList.add(vQDA);
    }

    /**
     * 
     * 
     * @param index
     * @param vQDA
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQDA(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA vQDA)
    throws java.lang.IndexOutOfBoundsException {
        this._QDAList.add(index, vQDA);
    }

    /**
     * Method enumerateQDA.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateQDA(
    ) {
        return java.util.Collections.enumeration(this._QDAList);
    }

    /**
     * Method getQDA.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA
     * at the given index
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA getQDA(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._QDAList.size()) {
            throw new IndexOutOfBoundsException("getQDA: Index value '" + index + "' not in range [0.." + (this._QDAList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA) _QDAList.get(index);
    }

    /**
     * Method getQDA.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA[] getQDA(
    ) {
        com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA[] array = new com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA[0];
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA[]) this._QDAList.toArray(array);
    }

    /**
     * Method getQDACount.
     * 
     * @return the size of this collection
     */
    public int getQDACount(
    ) {
        return this._QDAList.size();
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
     * Method iterateQDA.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateQDA(
    ) {
        return this._QDAList.iterator();
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
    public void removeAllQDA(
    ) {
        this._QDAList.clear();
    }

    /**
     * Method removeQDA.
     * 
     * @param vQDA
     * @return true if the object was removed from the collection.
     */
    public boolean removeQDA(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA vQDA) {
        boolean removed = _QDAList.remove(vQDA);
        return removed;
    }

    /**
     * Method removeQDAAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA removeQDAAt(
            final int index) {
        java.lang.Object obj = this._QDAList.remove(index);
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vQDA
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQDA(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA vQDA)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._QDAList.size()) {
            throw new IndexOutOfBoundsException("setQDA: Index value '" + index + "' not in range [0.." + (this._QDAList.size() - 1) + "]");
        }
        
        this._QDAList.set(index, vQDA);
    }

    /**
     * 
     * 
     * @param vQDAArray
     */
    public void setQDA(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDA[] vQDAArray) {
        //-- copy array
        _QDAList.clear();
        
        for (int i = 0; i < vQDAArray.length; i++) {
                this._QDAList.add(vQDAArray[i]);
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
     * com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.pricesoh.validation.QDAList.class, reader);
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
