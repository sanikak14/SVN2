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
 * Class OrderStatusResponse.
 * 
 * @version $Revision$ $Date$
 */
public class OrderStatusResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderResponseList.
     */
    private java.util.List _orderResponseList;

    /**
     * Field _message.
     */
    private com.metcash.webservices.eai.xml.supplier.orderstatus.validation.Message _message;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderStatusResponse() {
        super();
        this._orderResponseList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderResponse(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse vOrderResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._orderResponseList.add(vOrderResponse);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderResponse(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse vOrderResponse)
    throws java.lang.IndexOutOfBoundsException {
        this._orderResponseList.add(index, vOrderResponse);
    }

    /**
     * Method enumerateOrderResponse.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderResponse(
    ) {
        return java.util.Collections.enumeration(this._orderResponseList);
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.Message getMessage(
    ) {
        return this._message;
    }

    /**
     * Method getOrderResponse.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse getOrderResponse(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderResponseList.size()) {
            throw new IndexOutOfBoundsException("getOrderResponse: Index value '" + index + "' not in range [0.." + (this._orderResponseList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse) _orderResponseList.get(index);
    }

    /**
     * Method getOrderResponse.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse[] getOrderResponse(
    ) {
        com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse[] array = new com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse[0];
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse[]) this._orderResponseList.toArray(array);
    }

    /**
     * Method getOrderResponseCount.
     * 
     * @return the size of this collection
     */
    public int getOrderResponseCount(
    ) {
        return this._orderResponseList.size();
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
     * Method iterateOrderResponse.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderResponse(
    ) {
        return this._orderResponseList.iterator();
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
    public void removeAllOrderResponse(
    ) {
        this._orderResponseList.clear();
    }

    /**
     * Method removeOrderResponse.
     * 
     * @param vOrderResponse
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderResponse(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse vOrderResponse) {
        boolean removed = _orderResponseList.remove(vOrderResponse);
        return removed;
    }

    /**
     * Method removeOrderResponseAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse removeOrderResponseAt(
            final int index) {
        java.lang.Object obj = this._orderResponseList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse) obj;
    }

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.Message message) {
        this._message = message;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderResponse
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderResponse(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse vOrderResponse)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderResponseList.size()) {
            throw new IndexOutOfBoundsException("setOrderResponse: Index value '" + index + "' not in range [0.." + (this._orderResponseList.size() - 1) + "]");
        }
        
        this._orderResponseList.set(index, vOrderResponse);
    }

    /**
     * 
     * 
     * @param vOrderResponseArray
     */
    public void setOrderResponse(
            final com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderResponse[] vOrderResponseArray) {
        //-- copy array
        _orderResponseList.clear();
        
        for (int i = 0; i < vOrderResponseArray.length; i++) {
                this._orderResponseList.add(vOrderResponseArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse
     */
    public static com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.orderstatus.validation.OrderStatusResponse.class, reader);
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
