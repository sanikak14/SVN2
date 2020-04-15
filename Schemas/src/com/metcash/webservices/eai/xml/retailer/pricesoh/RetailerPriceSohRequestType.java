/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.pricesoh;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class RetailerPriceSohRequestType.
 * 
 * @version $Revision$ $Date$
 */
public class RetailerPriceSohRequestType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _customer.
     */
    private com.metcash.webservices.eai.xml.retailer.pricesoh.Customer _customer;

    /**
     * Field _productList.
     */
    private java.util.List _productList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RetailerPriceSohRequestType() {
        super();
        this._productList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProduct
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProduct(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Product vProduct)
    throws java.lang.IndexOutOfBoundsException {
        this._productList.add(vProduct);
    }

    /**
     * 
     * 
     * @param index
     * @param vProduct
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProduct(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Product vProduct)
    throws java.lang.IndexOutOfBoundsException {
        this._productList.add(index, vProduct);
    }

    /**
     * Method enumerateProduct.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateProduct(
    ) {
        return java.util.Collections.enumeration(this._productList);
    }

    /**
     * Returns the value of field 'customer'.
     * 
     * @return the value of field 'Customer'.
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.Customer getCustomer(
    ) {
        return this._customer;
    }

    /**
     * Method getProduct.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.retailer.pricesoh.Product at
     * the given index
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.Product getProduct(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._productList.size()) {
            throw new IndexOutOfBoundsException("getProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.Product) _productList.get(index);
    }

    /**
     * Method getProduct.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.Product[] getProduct(
    ) {
        com.metcash.webservices.eai.xml.retailer.pricesoh.Product[] array = new com.metcash.webservices.eai.xml.retailer.pricesoh.Product[0];
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.Product[]) this._productList.toArray(array);
    }

    /**
     * Method getProductCount.
     * 
     * @return the size of this collection
     */
    public int getProductCount(
    ) {
        return this._productList.size();
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
     * Method iterateProduct.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateProduct(
    ) {
        return this._productList.iterator();
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
    public void removeAllProduct(
    ) {
        this._productList.clear();
    }

    /**
     * Method removeProduct.
     * 
     * @param vProduct
     * @return true if the object was removed from the collection.
     */
    public boolean removeProduct(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Product vProduct) {
        boolean removed = _productList.remove(vProduct);
        return removed;
    }

    /**
     * Method removeProductAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.retailer.pricesoh.Product removeProductAt(
            final int index) {
        java.lang.Object obj = this._productList.remove(index);
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.Product) obj;
    }

    /**
     * Sets the value of field 'customer'.
     * 
     * @param customer the value of field 'customer'.
     */
    public void setCustomer(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Customer customer) {
        this._customer = customer;
    }

    /**
     * 
     * 
     * @param index
     * @param vProduct
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProduct(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Product vProduct)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._productList.size()) {
            throw new IndexOutOfBoundsException("setProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
        }
        
        this._productList.set(index, vProduct);
    }

    /**
     * 
     * 
     * @param vProductArray
     */
    public void setProduct(
            final com.metcash.webservices.eai.xml.retailer.pricesoh.Product[] vProductArray) {
        //-- copy array
        _productList.clear();
        
        for (int i = 0; i < vProductArray.length; i++) {
                this._productList.add(vProductArray[i]);
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
     * com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType
     */
    public static com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType.class, reader);
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
