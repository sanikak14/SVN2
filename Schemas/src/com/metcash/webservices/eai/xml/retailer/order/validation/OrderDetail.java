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
 * Class OrderDetail.
 * 
 * @version $Revision$ $Date$
 */
public class OrderDetail implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderHeaderResponse.
     */
    private com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderResponse _orderHeaderResponse;

    /**
     * Field _lineMessagesList.
     */
    private java.util.List _lineMessagesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderDetail() {
        super();
        this._lineMessagesList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLineMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineMessages(
            final com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages vLineMessages)
    throws java.lang.IndexOutOfBoundsException {
        this._lineMessagesList.add(vLineMessages);
    }

    /**
     * 
     * 
     * @param index
     * @param vLineMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineMessages(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages vLineMessages)
    throws java.lang.IndexOutOfBoundsException {
        this._lineMessagesList.add(index, vLineMessages);
    }

    /**
     * Method enumerateLineMessages.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateLineMessages(
    ) {
        return java.util.Collections.enumeration(this._lineMessagesList);
    }

    /**
     * Method getLineMessages.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages
     * at the given index
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages getLineMessages(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineMessagesList.size()) {
            throw new IndexOutOfBoundsException("getLineMessages: Index value '" + index + "' not in range [0.." + (this._lineMessagesList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages) _lineMessagesList.get(index);
    }

    /**
     * Method getLineMessages.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages[] getLineMessages(
    ) {
        com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages[] array = new com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages[0];
        return (com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages[]) this._lineMessagesList.toArray(array);
    }

    /**
     * Method getLineMessagesCount.
     * 
     * @return the size of this collection
     */
    public int getLineMessagesCount(
    ) {
        return this._lineMessagesList.size();
    }

    /**
     * Returns the value of field 'orderHeaderResponse'.
     * 
     * @return the value of field 'OrderHeaderResponse'.
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderResponse getOrderHeaderResponse(
    ) {
        return this._orderHeaderResponse;
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
     * Method iterateLineMessages.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateLineMessages(
    ) {
        return this._lineMessagesList.iterator();
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
    public void removeAllLineMessages(
    ) {
        this._lineMessagesList.clear();
    }

    /**
     * Method removeLineMessages.
     * 
     * @param vLineMessages
     * @return true if the object was removed from the collection.
     */
    public boolean removeLineMessages(
            final com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages vLineMessages) {
        boolean removed = _lineMessagesList.remove(vLineMessages);
        return removed;
    }

    /**
     * Method removeLineMessagesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages removeLineMessagesAt(
            final int index) {
        java.lang.Object obj = this._lineMessagesList.remove(index);
        return (com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLineMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLineMessages(
            final int index,
            final com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages vLineMessages)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineMessagesList.size()) {
            throw new IndexOutOfBoundsException("setLineMessages: Index value '" + index + "' not in range [0.." + (this._lineMessagesList.size() - 1) + "]");
        }
        
        this._lineMessagesList.set(index, vLineMessages);
    }

    /**
     * 
     * 
     * @param vLineMessagesArray
     */
    public void setLineMessages(
            final com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages[] vLineMessagesArray) {
        //-- copy array
        _lineMessagesList.clear();
        
        for (int i = 0; i < vLineMessagesArray.length; i++) {
                this._lineMessagesList.add(vLineMessagesArray[i]);
        }
    }

    /**
     * Sets the value of field 'orderHeaderResponse'.
     * 
     * @param orderHeaderResponse the value of field
     * 'orderHeaderResponse'.
     */
    public void setOrderHeaderResponse(
            final com.metcash.webservices.eai.xml.retailer.order.validation.OrderHeaderResponse orderHeaderResponse) {
        this._orderHeaderResponse = orderHeaderResponse;
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
     * com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail
     */
    public static com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.retailer.order.validation.OrderDetail.class, reader);
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
