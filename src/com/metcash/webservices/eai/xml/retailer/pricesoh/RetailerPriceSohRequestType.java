/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh;
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
/*     */ public class RetailerPriceSohRequestType
/*     */   implements Serializable
/*     */ {
/*     */   private Customer _customer;
/*  46 */   private List _productList = new ArrayList();
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
/*  64 */     this._productList.add(vProduct);
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
/*  79 */     this._productList.add(index, vProduct);
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
/*  90 */     return Collections.enumeration(this._productList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Customer getCustomer() {
/* 100 */     return this._customer;
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
/*     */   public com.metcash.webservices.eai.xml.retailer.pricesoh.Product getProduct(int index) throws IndexOutOfBoundsException {
/* 117 */     if (index < 0 || index >= this._productList.size()) {
/* 118 */       throw new IndexOutOfBoundsException("getProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
/*     */     }
/*     */     
/* 121 */     return (com.metcash.webservices.eai.xml.retailer.pricesoh.Product) this._productList.get(index);
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
/* 135 */     Product[] array = new Product[0];
/* 136 */     return (Product[])this._productList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getProductCount() {
/* 146 */     return this._productList.size();
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
/* 157 */       validate();
/* 158 */     } catch (ValidationException vex) {
/* 159 */       return false;
/*     */     } 
/* 161 */     return true;
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
/* 172 */     return this._productList.iterator();
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
/* 187 */     Marshaller.marshal(this, out);
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
/* 204 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllProduct() {
/* 211 */     this._productList.clear();
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
/* 222 */     boolean removed = this._productList.remove(vProduct);
/* 223 */     return removed;
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
/* 234 */     Object obj = this._productList.remove(index);
/* 235 */     return (Product)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomer(Customer customer) {
/* 245 */     this._customer = customer;
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
/* 261 */     if (index < 0 || index >= this._productList.size()) {
/* 262 */       throw new IndexOutOfBoundsException("setProduct: Index value '" + index + "' not in range [0.." + (this._productList.size() - 1) + "]");
/*     */     }
/*     */     
/* 265 */     this._productList.set(index, vProduct);
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
/* 276 */     this._productList.clear();
/*     */     
/* 278 */     for (int i = 0; i < vProductArray.length; i++) {
/* 279 */       this._productList.add(vProductArray[i]);
/*     */     }
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
/*     */   public static RetailerPriceSohRequestType unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 297 */     return (RetailerPriceSohRequestType)Unmarshaller.unmarshal(RetailerPriceSohRequestType.class, reader);
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
/* 309 */     Validator validator = new Validator();
/* 310 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\RetailerPriceSohRequestType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */