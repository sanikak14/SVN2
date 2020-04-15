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
 * Class SupplierPriceSohResponse.
 * 
 * @version $Revision$ $Date$
 */
public class SupplierPriceSohResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productResponseList.
     */
    private java.util.List _productResponseList;

    /**
     * Field _message.
     */
    private com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupplierPriceSohResponse() {
        super();
        this._productResponseList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProductResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProductResponse(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse vProductResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._productResponseList.add(vProductResponse);
    }

    /**
     * 
     * 
     * @param index
     * @param vProductResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProductResponse(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse vProductResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._productResponseList.add(index, vProductResponse);
    }

    /**
     * Method enumerateProductResponse.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateProductResponse(
    ) {
        return java.util.Collections.enumeration(this._productResponseList);
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message getMessage(
    ) {
        return this._message;
    }

    /**
     * Method getProductResponse.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse getProductResponse(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._productResponseList.size()) {
            throw new IndexOutOfBoundsException("getProductResponse: Index value '" + index + "' not in range [0.." + (this._productResponseList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse) _productResponseList.get(index);
    }

    /**
     * Method getProductResponse.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse[] getProductResponse(
    ) {
        com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse[] array = new com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse[0];
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse[]) this._productResponseList.toArray(array);
    }

    /**
     * Method getProductResponseCount.
     * 
     * @return the size of this collection
     */
    public int getProductResponseCount(
    ) {
        return this._productResponseList.size();
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
     * Method iterateProductResponse.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateProductResponse(
    ) {
        return this._productResponseList.iterator();
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
    public void removeAllProductResponse(
    ) {
        this._productResponseList.clear();
    }

    /**
     * Method removeProductResponse.
     * 
     * @param vProductResponse
     * @return true if the object was removed from the collection.
     */
    public boolean removeProductResponse(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse vProductResponse) {
        boolean removed = _productResponseList.remove(vProductResponse);
        return removed;
    }

    /**
     * Method removeProductResponseAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse removeProductResponseAt(
            final int index) {
        java.lang.Object obj = this._productResponseList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse) obj;
    }

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.Message message) {
        this._message = message;
    }

    /**
     * 
     * 
     * @param index
     * @param vProductResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProductResponse(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse vProductResponse)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._productResponseList.size()) {
            throw new IndexOutOfBoundsException("setProductResponse: Index value '" + index + "' not in range [0.." + (this._productResponseList.size() - 1) + "]");
        }
        
        this._productResponseList.set(index, vProductResponse);
    }

    /**
     * 
     * 
     * @param vProductResponseArray
     */
    public void setProductResponse(
            final com.metcash.webservices.eai.xml.supplier.pricesoh.validation.ProductResponse[] vProductResponseArray) {
        //-- copy array
        _productResponseList.clear();
        
        for (int i = 0; i < vProductResponseArray.length; i++) {
                this._productResponseList.add(vProductResponseArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse
     */
    public static com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.pricesoh.validation.SupplierPriceSohResponse.class, reader);
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
