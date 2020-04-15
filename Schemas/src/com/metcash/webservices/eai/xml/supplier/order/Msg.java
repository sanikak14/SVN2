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
 * Class Msg.
 * 
 * @version $Revision$ $Date$
 */
public class Msg implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderList.
     */
    private java.util.List _orderList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Msg() {
        super();
        this._orderList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrder(
            final com.metcash.webservices.eai.xml.supplier.order.Order vOrder)
    throws java.lang.IndexOutOfBoundsException {
        this._orderList.add(vOrder);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrder(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.Order vOrder)
    throws java.lang.IndexOutOfBoundsException {
        this._orderList.add(index, vOrder);
    }

    /**
     * Method enumerateOrder.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrder(
    ) {
        return java.util.Collections.enumeration(this._orderList);
    }

    /**
     * Method getOrder.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.order.Order at the
     * given index
     */
    public com.metcash.webservices.eai.xml.supplier.order.Order getOrder(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderList.size()) {
            throw new IndexOutOfBoundsException("getOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.order.Order) _orderList.get(index);
    }

    /**
     * Method getOrder.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.order.Order[] getOrder(
    ) {
        com.metcash.webservices.eai.xml.supplier.order.Order[] array = new com.metcash.webservices.eai.xml.supplier.order.Order[0];
        return (com.metcash.webservices.eai.xml.supplier.order.Order[]) this._orderList.toArray(array);
    }

    /**
     * Method getOrderCount.
     * 
     * @return the size of this collection
     */
    public int getOrderCount(
    ) {
        return this._orderList.size();
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
     * Method iterateOrder.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrder(
    ) {
        return this._orderList.iterator();
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
    public void removeAllOrder(
    ) {
        this._orderList.clear();
    }

    /**
     * Method removeOrder.
     * 
     * @param vOrder
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrder(
            final com.metcash.webservices.eai.xml.supplier.order.Order vOrder) {
        boolean removed = _orderList.remove(vOrder);
        return removed;
    }

    /**
     * Method removeOrderAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.order.Order removeOrderAt(
            final int index) {
        java.lang.Object obj = this._orderList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.order.Order) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrder(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.Order vOrder)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderList.size()) {
            throw new IndexOutOfBoundsException("setOrder: Index value '" + index + "' not in range [0.." + (this._orderList.size() - 1) + "]");
        }
        
        this._orderList.set(index, vOrder);
    }

    /**
     * 
     * 
     * @param vOrderArray
     */
    public void setOrder(
            final com.metcash.webservices.eai.xml.supplier.order.Order[] vOrderArray) {
        //-- copy array
        _orderList.clear();
        
        for (int i = 0; i < vOrderArray.length; i++) {
                this._orderList.add(vOrderArray[i]);
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
     * com.metcash.webservices.eai.xml.supplier.order.Msg
     */
    public static com.metcash.webservices.eai.xml.supplier.order.Msg unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.order.Msg) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.order.Msg.class, reader);
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
