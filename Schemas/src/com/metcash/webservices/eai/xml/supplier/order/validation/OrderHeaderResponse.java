/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.supplier.order.validation;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OrderHeaderResponse.
 * 
 * @version $Revision$ $Date$
 */
public class OrderHeaderResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _webOrderId.
     */
    private int _webOrderId;

    /**
     * keeps track of state for field: _webOrderId
     */
    private boolean _has_webOrderId;

    /**
     * Field _vendorOrderId.
     */
    private java.lang.String _vendorOrderId;

    /**
     * Field _supplierRepCode.
     */
    private java.lang.String _supplierRepCode;

    /**
     * Field _supplierRepStateCode.
     */
    private com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType _supplierRepStateCode;

    /**
     * Field _supplierReference.
     */
    private java.lang.String _supplierReference;

    /**
     * Field _turnInOrderType.
     */
    private com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType _turnInOrderType;

    /**
     * Field _customerId.
     */
    private java.lang.String _customerId;

    /**
     * Field _customerStateCode.
     */
    private com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType _customerStateCode;

    /**
     * Field _webCreatedTime.
     */
    private java.lang.String _webCreatedTime;

    /**
     * Field _itemsAccepted.
     */
    private int _itemsAccepted;

    /**
     * keeps track of state for field: _itemsAccepted
     */
    private boolean _has_itemsAccepted;

    /**
     * Field _itemsRejected.
     */
    private int _itemsRejected;

    /**
     * keeps track of state for field: _itemsRejected
     */
    private boolean _has_itemsRejected;

    /**
     * Field _orderHeaderMessagesList.
     */
    private java.util.List _orderHeaderMessagesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public OrderHeaderResponse() {
        super();
        this._orderHeaderMessagesList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderHeaderMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderHeaderMessages(
            final com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages vOrderHeaderMessages)
    throws java.lang.IndexOutOfBoundsException {
        this._orderHeaderMessagesList.add(vOrderHeaderMessages);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderHeaderMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderHeaderMessages(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages vOrderHeaderMessages)
    throws java.lang.IndexOutOfBoundsException {
        this._orderHeaderMessagesList.add(index, vOrderHeaderMessages);
    }

    /**
     */
    public void deleteItemsAccepted(
    ) {
        this._has_itemsAccepted= false;
    }

    /**
     */
    public void deleteItemsRejected(
    ) {
        this._has_itemsRejected= false;
    }

    /**
     */
    public void deleteWebOrderId(
    ) {
        this._has_webOrderId= false;
    }

    /**
     * Method enumerateOrderHeaderMessages.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderHeaderMessages(
    ) {
        return java.util.Collections.enumeration(this._orderHeaderMessagesList);
    }

    /**
     * Returns the value of field 'customerId'.
     * 
     * @return the value of field 'CustomerId'.
     */
    public java.lang.String getCustomerId(
    ) {
        return this._customerId;
    }

    /**
     * Returns the value of field 'customerStateCode'.
     * 
     * @return the value of field 'CustomerStateCode'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType getCustomerStateCode(
    ) {
        return this._customerStateCode;
    }

    /**
     * Returns the value of field 'itemsAccepted'.
     * 
     * @return the value of field 'ItemsAccepted'.
     */
    public int getItemsAccepted(
    ) {
        return this._itemsAccepted;
    }

    /**
     * Returns the value of field 'itemsRejected'.
     * 
     * @return the value of field 'ItemsRejected'.
     */
    public int getItemsRejected(
    ) {
        return this._itemsRejected;
    }

    /**
     * Method getOrderHeaderMessages.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages
     * at the given index
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages getOrderHeaderMessages(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
            throw new IndexOutOfBoundsException("getOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
        }
        
        return (com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages) _orderHeaderMessagesList.get(index);
    }

    /**
     * Method getOrderHeaderMessages.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages[] getOrderHeaderMessages(
    ) {
        com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages[] array = new com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages[0];
        return (com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages[]) this._orderHeaderMessagesList.toArray(array);
    }

    /**
     * Method getOrderHeaderMessagesCount.
     * 
     * @return the size of this collection
     */
    public int getOrderHeaderMessagesCount(
    ) {
        return this._orderHeaderMessagesList.size();
    }

    /**
     * Returns the value of field 'supplierReference'.
     * 
     * @return the value of field 'SupplierReference'.
     */
    public java.lang.String getSupplierReference(
    ) {
        return this._supplierReference;
    }

    /**
     * Returns the value of field 'supplierRepCode'.
     * 
     * @return the value of field 'SupplierRepCode'.
     */
    public java.lang.String getSupplierRepCode(
    ) {
        return this._supplierRepCode;
    }

    /**
     * Returns the value of field 'supplierRepStateCode'.
     * 
     * @return the value of field 'SupplierRepStateCode'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType getSupplierRepStateCode(
    ) {
        return this._supplierRepStateCode;
    }

    /**
     * Returns the value of field 'turnInOrderType'.
     * 
     * @return the value of field 'TurnInOrderType'.
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType getTurnInOrderType(
    ) {
        return this._turnInOrderType;
    }

    /**
     * Returns the value of field 'vendorOrderId'.
     * 
     * @return the value of field 'VendorOrderId'.
     */
    public java.lang.String getVendorOrderId(
    ) {
        return this._vendorOrderId;
    }

    /**
     * Returns the value of field 'webCreatedTime'.
     * 
     * @return the value of field 'WebCreatedTime'.
     */
    public java.lang.String getWebCreatedTime(
    ) {
        return this._webCreatedTime;
    }

    /**
     * Returns the value of field 'webOrderId'.
     * 
     * @return the value of field 'WebOrderId'.
     */
    public int getWebOrderId(
    ) {
        return this._webOrderId;
    }

    /**
     * Method hasItemsAccepted.
     * 
     * @return true if at least one ItemsAccepted has been added
     */
    public boolean hasItemsAccepted(
    ) {
        return this._has_itemsAccepted;
    }

    /**
     * Method hasItemsRejected.
     * 
     * @return true if at least one ItemsRejected has been added
     */
    public boolean hasItemsRejected(
    ) {
        return this._has_itemsRejected;
    }

    /**
     * Method hasWebOrderId.
     * 
     * @return true if at least one WebOrderId has been added
     */
    public boolean hasWebOrderId(
    ) {
        return this._has_webOrderId;
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
     * Method iterateOrderHeaderMessages.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderHeaderMessages(
    ) {
        return this._orderHeaderMessagesList.iterator();
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
    public void removeAllOrderHeaderMessages(
    ) {
        this._orderHeaderMessagesList.clear();
    }

    /**
     * Method removeOrderHeaderMessages.
     * 
     * @param vOrderHeaderMessages
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderHeaderMessages(
            final com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages vOrderHeaderMessages) {
        boolean removed = _orderHeaderMessagesList.remove(vOrderHeaderMessages);
        return removed;
    }

    /**
     * Method removeOrderHeaderMessagesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages removeOrderHeaderMessagesAt(
            final int index) {
        java.lang.Object obj = this._orderHeaderMessagesList.remove(index);
        return (com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages) obj;
    }

    /**
     * Sets the value of field 'customerId'.
     * 
     * @param customerId the value of field 'customerId'.
     */
    public void setCustomerId(
            final java.lang.String customerId) {
        this._customerId = customerId;
    }

    /**
     * Sets the value of field 'customerStateCode'.
     * 
     * @param customerStateCode the value of field
     * 'customerStateCode'.
     */
    public void setCustomerStateCode(
            final com.metcash.webservices.eai.xml.supplier.order.validation.types.CustomerStateCodeType customerStateCode) {
        this._customerStateCode = customerStateCode;
    }

    /**
     * Sets the value of field 'itemsAccepted'.
     * 
     * @param itemsAccepted the value of field 'itemsAccepted'.
     */
    public void setItemsAccepted(
            final int itemsAccepted) {
        this._itemsAccepted = itemsAccepted;
        this._has_itemsAccepted = true;
    }

    /**
     * Sets the value of field 'itemsRejected'.
     * 
     * @param itemsRejected the value of field 'itemsRejected'.
     */
    public void setItemsRejected(
            final int itemsRejected) {
        this._itemsRejected = itemsRejected;
        this._has_itemsRejected = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderHeaderMessages
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderHeaderMessages(
            final int index,
            final com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages vOrderHeaderMessages)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderHeaderMessagesList.size()) {
            throw new IndexOutOfBoundsException("setOrderHeaderMessages: Index value '" + index + "' not in range [0.." + (this._orderHeaderMessagesList.size() - 1) + "]");
        }
        
        this._orderHeaderMessagesList.set(index, vOrderHeaderMessages);
    }

    /**
     * 
     * 
     * @param vOrderHeaderMessagesArray
     */
    public void setOrderHeaderMessages(
            final com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderMessages[] vOrderHeaderMessagesArray) {
        //-- copy array
        _orderHeaderMessagesList.clear();
        
        for (int i = 0; i < vOrderHeaderMessagesArray.length; i++) {
                this._orderHeaderMessagesList.add(vOrderHeaderMessagesArray[i]);
        }
    }

    /**
     * Sets the value of field 'supplierReference'.
     * 
     * @param supplierReference the value of field
     * 'supplierReference'.
     */
    public void setSupplierReference(
            final java.lang.String supplierReference) {
        this._supplierReference = supplierReference;
    }

    /**
     * Sets the value of field 'supplierRepCode'.
     * 
     * @param supplierRepCode the value of field 'supplierRepCode'.
     */
    public void setSupplierRepCode(
            final java.lang.String supplierRepCode) {
        this._supplierRepCode = supplierRepCode;
    }

    /**
     * Sets the value of field 'supplierRepStateCode'.
     * 
     * @param supplierRepStateCode the value of field
     * 'supplierRepStateCode'.
     */
    public void setSupplierRepStateCode(
            final com.metcash.webservices.eai.xml.supplier.order.validation.types.SupplierRepStateCodeType supplierRepStateCode) {
        this._supplierRepStateCode = supplierRepStateCode;
    }

    /**
     * Sets the value of field 'turnInOrderType'.
     * 
     * @param turnInOrderType the value of field 'turnInOrderType'.
     */
    public void setTurnInOrderType(
            final com.metcash.webservices.eai.xml.supplier.order.validation.types.TurnInOrderTypeType turnInOrderType) {
        this._turnInOrderType = turnInOrderType;
    }

    /**
     * Sets the value of field 'vendorOrderId'.
     * 
     * @param vendorOrderId the value of field 'vendorOrderId'.
     */
    public void setVendorOrderId(
            final java.lang.String vendorOrderId) {
        this._vendorOrderId = vendorOrderId;
    }

    /**
     * Sets the value of field 'webCreatedTime'.
     * 
     * @param webCreatedTime the value of field 'webCreatedTime'.
     */
    public void setWebCreatedTime(
            final java.lang.String webCreatedTime) {
        this._webCreatedTime = webCreatedTime;
    }

    /**
     * Sets the value of field 'webOrderId'.
     * 
     * @param webOrderId the value of field 'webOrderId'.
     */
    public void setWebOrderId(
            final int webOrderId) {
        this._webOrderId = webOrderId;
        this._has_webOrderId = true;
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
     * com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse
     */
    public static com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse) Unmarshaller.unmarshal(com.metcash.webservices.eai.xml.supplier.order.validation.OrderHeaderResponse.class, reader);
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
