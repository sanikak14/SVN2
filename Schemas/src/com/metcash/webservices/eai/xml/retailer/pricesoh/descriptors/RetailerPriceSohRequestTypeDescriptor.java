/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.metcash.webservices.eai.xml.retailer.pricesoh.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType;

/**
 * Class RetailerPriceSohRequestTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class RetailerPriceSohRequestTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public RetailerPriceSohRequestTypeDescriptor() {
        super();
        _nsURI = "metcash/retailerPriceSoh";
        _xmlName = "RetailerPriceSohRequestType";
        _elementDefinition = false;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _customer
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.metcash.webservices.eai.xml.retailer.pricesoh.Customer.class, "_customer", "Customer", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RetailerPriceSohRequestType target = (RetailerPriceSohRequestType) object;
                return target.getCustomer();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RetailerPriceSohRequestType target = (RetailerPriceSohRequestType) object;
                    target.setCustomer( (com.metcash.webservices.eai.xml.retailer.pricesoh.Customer) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.metcash.webservices.eai.xml.retailer.pricesoh.Customer();
            }
        };
        desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.Customer");
        desc.setHandler(handler);
        desc.setNameSpaceURI("metcash/retailerPriceSoh");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _customer
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _productList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.metcash.webservices.eai.xml.retailer.pricesoh.Product.class, "_productList", "Product", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RetailerPriceSohRequestType target = (RetailerPriceSohRequestType) object;
                return target.getProduct();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RetailerPriceSohRequestType target = (RetailerPriceSohRequestType) object;
                    target.addProduct( (com.metcash.webservices.eai.xml.retailer.pricesoh.Product) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    RetailerPriceSohRequestType target = (RetailerPriceSohRequestType) object;
                    target.removeAllProduct();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.metcash.webservices.eai.xml.retailer.pricesoh.Product();
            }
        };
        desc.setSchemaType("com.metcash.webservices.eai.xml.retailer.pricesoh.Product");
        desc.setHandler(handler);
        desc.setNameSpaceURI("metcash/retailerPriceSoh");
        desc.setRequired(true);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _productList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    public java.lang.Class getJavaClass(
    ) {
        return com.metcash.webservices.eai.xml.retailer.pricesoh.RetailerPriceSohRequestType.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
