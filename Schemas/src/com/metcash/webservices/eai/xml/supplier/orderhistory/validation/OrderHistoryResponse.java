/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.orderhistory.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderHistoryResponse.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHistoryResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderHistoryList.
     */
    private java.util.List _orderHistoryList;

    /**
     * Field _message.
     */
    private com.metcash.webservices.eai.xml.supplier.orderhistory.validation.Message _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHistoryResponse() {
        super();
        this._orderHistoryList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderHistory(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory vOrderHistory)
    throws java.lang.IndexOutOfBoundsException {
        this._orderHistoryList.add(vOrderHistory);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderHistory(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory vOrderHistory)
    throws java.lang.IndexOutOfBoundsException {
        this._orderHistoryList.add(index, vOrderHistory);
    }

    /**
     * Method enumerateOrderHistory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderHistory(
    ) {
        return java.util.Collections.enumeration(this._orderHistoryList);
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.validation.Message getMessage(
    ) {
        return this._message;
    }

    /**
     * Method getOrderHistory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory getOrderHistory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderHistoryList.size()) {
            throw new IndexOutOfBoundsException("getOrderHistory: Index value '" + index + "' not in range [0.." + (this._orderHistoryList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory) _orderHistoryList.get(index);
    }

    /**
     * Method getOrderHistory.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory[] getOrderHistory(
    ) {
        com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory[] array = new com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory[0];
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory[]) this._orderHistoryList.toArray(array);
    }

    /**
     * Method getOrderHistoryCount.
     * 
     * @return the size of this collection
     */
    public int getOrderHistoryCount(
    ) {
        return this._orderHistoryList.size();
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
     * Method iterateOrderHistory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderHistory(
    ) {
        return this._orderHistoryList.iterator();
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
    public void removeAllOrderHistory(
    ) {
        this._orderHistoryList.clear();
    }

    /**
     * Method removeOrderHistory.
     * 
     * @param vOrderHistory
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderHistory(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory vOrderHistory) {
        boolean removed = _orderHistoryList.remove(vOrderHistory);
        return removed;
    }

    /**
     * Method removeOrderHistoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory removeOrderHistoryAt(
            final int index) {
        java.lang.Object obj = this._orderHistoryList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory) obj;
    }

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.Message message) {
        this._message = message;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderHistory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderHistory(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory vOrderHistory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderHistoryList.size()) {
            throw new IndexOutOfBoundsException("setOrderHistory: Index value '" + index + "' not in range [0.." + (this._orderHistoryList.size() - 1) + "]");
        }
        
        this._orderHistoryList.set(index, vOrderHistory);
    }

    /**
     * 
     * 
     * @param vOrderHistoryArray
     */
    public void setOrderHistory(
            final com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistory[] vOrderHistoryArray) {
        //-- copy array
        _orderHistoryList.clear();
        
        for (int i = 0; i < vOrderHistoryArray.length; i++) {
                this._orderHistoryList.add(vOrderHistoryArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse
     */
    public static com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse.class, reader);
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
