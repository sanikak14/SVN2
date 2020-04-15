/*     */ package com.metcash.webservices.eai.xml.supplier.pricesoh;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.Marshaller;
/*     */ import org.exolab.castor.xml.Unmarshaller;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ import org.exolab.castor.xml.Validator;
/*     */ import org.xml.sax.ContentHandler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierPriceSohRequestType
/*     */   implements Serializable
/*     */ {
/*     */   private SupplierRep _supplierRep;
/*     */   private Customer _customer;
/*  51 */   private List _productList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addProduct(Product vProduct) throws IndexOutOfBoundsException {
/*  69 */     this._productList.add(vProduct);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addProduct(int index, Product vProduct) throws IndexOutOfBoundsException {
/*  84 */     this._productList.add(index, vProduct);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateProduct() {
/*  95 */     return Collections.enumeration(this._productList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Customer getCustomer() {
/* 105 */     return this._customer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public com.metcash.webservices.eai.xml.supplier.pricesoh.Product getProduct(int index) throws IndexOutOfBoundsException {
/* 122 */     if (index < 0 || index >= this._productList.size()) {
/* 123 */       throw new IndexOutOfBoundsException("getProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
/*     */     }
/*     */     
/* 126 */     return (com.metcash.webservices.eai.xml.supplier.pricesoh.Product) this._productList.get(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Product[] getProduct() {
/* 140 */     Product[] array = new Product[0];
/* 141 */     return (Product[])this._productList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getProductCount() {
/* 151 */     return this._productList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplierRep getSupplierRep() {
/* 161 */     return this._supplierRep;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/*     */     try {
/* 172 */       validate();
/* 173 */     } catch (ValidationException vex) {
/* 174 */       return false;
/*     */     } 
/* 176 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateProduct() {
/* 187 */     return this._productList.iterator();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void marshal(Writer out) throws MarshalException, ValidationException {
/* 202 */     Marshaller.marshal(this, out);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void marshal(ContentHandler handler) throws IOException, MarshalException, ValidationException {
/* 219 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllProduct() {
/* 226 */     this._productList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeProduct(Product vProduct) {
/* 237 */     boolean removed = this._productList.remove(vProduct);
/* 238 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Product removeProductAt(int index) {
/* 249 */     Object obj = this._productList.remove(index);
/* 250 */     return (Product)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomer(Customer customer) {
/* 260 */     this._customer = customer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProduct(int index, Product vProduct) throws IndexOutOfBoundsException {
/* 276 */     if (index < 0 || index >= this._productList.size()) {
/* 277 */       throw new IndexOutOfBoundsException("setProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
/*     */     }
/*     */     
/* 280 */     this._productList.set(index, vProduct);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProduct(Product[] vProductArray) {
/* 291 */     this._productList.clear();
/*     */     
/* 293 */     for (int i = 0; i < vProductArray.length; i++) {
/* 294 */       this._productList.add(vProductArray[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupplierRep(SupplierRep supplierRep) {
/* 305 */     this._supplierRep = supplierRep;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SupplierPriceSohRequestType unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 322 */     return (SupplierPriceSohRequestType)Unmarshaller.unmarshal(SupplierPriceSohRequestType.class, reader);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void validate() throws ValidationException {
/* 334 */     Validator validator = new Validator();
/* 335 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\supplier\pricesoh\SupplierPriceSohRequestType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */