/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.order.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Comment describing your root element
 * 
 * @version $Revision$ $Date$
 */
public class RetailerOrderResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderDetailList.
     */
    private java.util.List _orderDetailList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RetailerOrderResponse() {
        super();
        this._orderDetailList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderDetail(
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail vOrderDetail)
    throws java.lang.IndexOutOfBoundsException {
        this._orderDetailList.add(vOrderDetail);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderDetail(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail vOrderDetail)
    throws java.lang.IndexOutOfBoundsException {
        this._orderDetailList.add(index, vOrderDetail);
    }

    /**
     * Method enumerateOrderDetail.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderDetail(
    ) {
        return java.util.Collections.enumeration(this._orderDetailList);
    }

    /**
     * Method getOrderDetail.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail
     * at the given index
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail getOrderDetail(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderDetailList.size()) {
            throw new IndexOutOfBoundsException("getOrderDetail: Index value '" + index + "' not in range [0.." + (this._orderDetailList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail) _orderDetailList.get(index);
    }

    /**
     * Method getOrderDetail.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail[] getOrderDetail(
    ) {
        com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail[] array = new com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail[0];
        return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail[]) this._orderDetailList.toArray(array);
    }

    /**
     * Method getOrderDetailCount.
     * 
     * @return the size of this collection
     */
    public int getOrderDetailCount(
    ) {
        return this._orderDetailList.size();
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
     * Method iterateOrderDetail.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderDetail(
    ) {
        return this._orderDetailList.iterator();
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
    public void removeAllOrderDetail(
    ) {
        this._orderDetailList.clear();
    }

    /**
     * Method removeOrderDetail.
     * 
     * @param vOrderDetail
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderDetail(
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail vOrderDetail) {
        boolean removed = _orderDetailList.remove(vOrderDetail);
        return removed;
    }

    /**
     * Method removeOrderDetailAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail removeOrderDetailAt(
            final int index) {
        java.lang.Object obj = this._orderDetailList.remove(index);
        return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderDetail
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderDetail(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail vOrderDetail)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderDetailList.size()) {
            throw new IndexOutOfBoundsException("setOrderDetail: Index value '" + index + "' not in range [0.." + (this._orderDetailList.size() - 1) + "]");
        }
        
        this._orderDetailList.set(index, vOrderDetail);
    }

    /**
     * 
     * 
     * @param vOrderDetailArray
     */
    public void setOrderDetail(
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail[] vOrderDetailArray) {
        //-- copy array
        _orderDetailList.clear();
        
        for (int i = 0; i < vOrderDetailArray.length; i++) {
                this._orderDetailList.add(vOrderDetailArray[i]);
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
     * com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse
     */
    public static com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.order.validation.RetailerOrderResponse.class, reader);
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
