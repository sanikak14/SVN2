/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.order;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Order.
 * 
 * @version $Revision$ $Date$
 */
public class Order implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderHeader.
     */
    private com.metcash.webservices.eai.xml.supplier.order.OrderHeader _orderHeader;

    /**
     * Field _lineItemList.
     */
    private java.util.List _lineItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Order() {
        super();
        this._lineItemList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLineItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineItem(
            final com.metcash.webservices.eai.xml.supplier.order.LineItem vLineItem)
    throws java.lang.IndexOutOfBoundsException {
        this._lineItemList.add(vLineItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vLineItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineItem(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.LineItem vLineItem)
    throws java.lang.IndexOutOfBoundsException {
        this._lineItemList.add(index, vLineItem);
    }

    /**
     * Method enumerateLineItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateLineItem(
    ) {
        return java.util.Collections.enumeration(this._lineItemList);
    }

    /**
     * Method getLineItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.order.LineItem at
     * the given index
     */
    public com.metcash.webservices.eai.xml.supplier.order.LineItem getLineItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineItemList.size()) {
            throw new IndexOutOfBoundsException("getLineItem: Index value '" + index + "' not in range [0.." + (this._lineItemList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.order.LineItem) _lineItemList.get(index);
    }

    /**
     * Method getLineItem.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.order.LineItem[] getLineItem(
    ) {
        com.metcash.webservices.eai.xml.supplier.order.LineItem[] array = new com.metcash.webservices.eai.xml.supplier.order.LineItem[0];
        return (com.metcash.webservices.eai.xml.supplier.order.LineItem[]) this._lineItemList.toArray(array);
    }

    /**
     * Method getLineItemCount.
     * 
     * @return the size of this collection
     */
    public int getLineItemCount(
    ) {
        return this._lineItemList.size();
    }

    /**
     * Returns the value of field 'orderHeader'.
     * 
     * @return the value of field 'OrderHeader'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.OrderHeader getOrderHeader(
    ) {
        return this._orderHeader;
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
     * Method iterateLineItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateLineItem(
    ) {
        return this._lineItemList.iterator();
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
    public void removeAllLineItem(
    ) {
        this._lineItemList.clear();
    }

    /**
     * Method removeLineItem.
     * 
     * @param vLineItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeLineItem(
            final com.metcash.webservices.eai.xml.supplier.order.LineItem vLineItem) {
        boolean removed = _lineItemList.remove(vLineItem);
        return removed;
    }

    /**
     * Method removeLineItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.order.LineItem removeLineItemAt(
            final int index) {
        java.lang.Object obj = this._lineItemList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.order.LineItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLineItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLineItem(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.LineItem vLineItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineItemList.size()) {
            throw new IndexOutOfBoundsException("setLineItem: Index value '" + index + "' not in range [0.." + (this._lineItemList.size() - 1) + "]");
        }
        
        this._lineItemList.set(index, vLineItem);
    }

    /**
     * 
     * 
     * @param vLineItemArray
     */
    public void setLineItem(
            final com.metcash.webservices.eai.xml.supplier.order.LineItem[] vLineItemArray) {
        //-- copy array
        _lineItemList.clear();
        
        for (int i = 0; i < vLineItemArray.length; i++) {
                this._lineItemList.add(vLineItemArray[i]);
        }
    }

    /**
     * Sets the value of field 'orderHeader'.
     * 
     * @param orderHeader the value of field 'orderHeader'.
     */
    public void setOrderHeader(
            final com.metcash.webservices.eai.xml.supplier.order.OrderHeader orderHeader) {
        this._orderHeader = orderHeader;
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
     * com.metcash.webservices.eai.xml.supplier.order.Order
     */
    public static com.metcash.webservices.eai.xml.supplier.order.Order unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.order.Order) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.order.Order.class, reader);
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
