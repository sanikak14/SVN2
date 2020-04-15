/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderstatus.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderStatusDetail.
 * 
 * @version $Revision$ $Date$
 */
public class OrderStatusDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderHeaderStatus.
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus _orderHeaderStatus;

    /**
     * Field _orderLineStatusList.
     */
    private java.util.List _orderLineStatusList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderStatusDetail() {
        super();
        this._orderLineStatusList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderLineStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderLineStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus vOrderLineStatus)
    throws java.lang.IndexOutOfBoundsException {
        this._orderLineStatusList.add(vOrderLineStatus);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderLineStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderLineStatus(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus vOrderLineStatus)
    throws java.lang.IndexOutOfBoundsException {
        this._orderLineStatusList.add(index, vOrderLineStatus);
    }

    /**
     * Method enumerateOrderLineStatus.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderLineStatus(
    ) {
        return java.util.Collections.enumeration(this._orderLineStatusList);
    }

    /**
     * Returns the value of field 'orderHeaderStatus'.
     * 
     * @return the value of field 'OrderHeaderStatus'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus getOrderHeaderStatus(
    ) {
        return this._orderHeaderStatus;
    }

    /**
     * Method getOrderLineStatus.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus getOrderLineStatus(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderLineStatusList.size()) {
            throw new IndexOutOfBoundsException("getOrderLineStatus: Index value '" + index + "' not in range [0.." + (this._orderLineStatusList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus) _orderLineStatusList.get(index);
    }

    /**
     * Method getOrderLineStatus.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus[] getOrderLineStatus(
    ) {
        com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus[] array = new com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus[0];
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus[]) this._orderLineStatusList.toArray(array);
    }

    /**
     * Method getOrderLineStatusCount.
     * 
     * @return the size of this collection
     */
    public int getOrderLineStatusCount(
    ) {
        return this._orderLineStatusList.size();
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
     * Method iterateOrderLineStatus.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderLineStatus(
    ) {
        return this._orderLineStatusList.iterator();
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
    public void removeAllOrderLineStatus(
    ) {
        this._orderLineStatusList.clear();
    }

    /**
     * Method removeOrderLineStatus.
     * 
     * @param vOrderLineStatus
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderLineStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus vOrderLineStatus) {
        boolean removed = _orderLineStatusList.remove(vOrderLineStatus);
        return removed;
    }

    /**
     * Method removeOrderLineStatusAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus removeOrderLineStatusAt(
            final int index) {
        java.lang.Object obj = this._orderLineStatusList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus) obj;
    }

    /**
     * Sets the value of field 'orderHeaderStatus'.
     * 
     * @param orderHeaderStatus the value of field
     * 'orderHeaderStatus'.
     */
    public void setOrderHeaderStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderHeaderStatus orderHeaderStatus) {
        this._orderHeaderStatus = orderHeaderStatus;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderLineStatus
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderLineStatus(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus vOrderLineStatus)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderLineStatusList.size()) {
            throw new IndexOutOfBoundsException("setOrderLineStatus: Index value '" + index + "' not in range [0.." + (this._orderLineStatusList.size() - 1) + "]");
        }
        
        this._orderLineStatusList.set(index, vOrderLineStatus);
    }

    /**
     * 
     * 
     * @param vOrderLineStatusArray
     */
    public void setOrderLineStatus(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderLineStatus[] vOrderLineStatusArray) {
        //-- copy array
        _orderLineStatusList.clear();
        
        for (int i = 0; i < vOrderLineStatusArray.length; i++) {
                this._orderLineStatusList.add(vOrderLineStatusArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusDetail
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusDetail unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusDetail) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusDetail.class, reader);
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
