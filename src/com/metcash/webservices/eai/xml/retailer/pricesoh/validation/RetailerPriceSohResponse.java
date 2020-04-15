/*     */ package com.metcash.webservices.eai.xml.retailer.pricesoh.validation;
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
/*     */ public class RetailerPriceSohResponse
/*     */   implements Serializable
/*     */ {
/*  46 */   private List _productResponseList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Message _message;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addProductResponse(ProductResponse vProductResponse) throws IndexOutOfBoundsException {
/*  64 */     this._productResponseList.add(vProductResponse);
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
/*     */   public void addProductResponse(int index, ProductResponse vProductResponse) throws IndexOutOfBoundsException {
/*  79 */     this._productResponseList.add(index, vProductResponse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateProductResponse() {
/*  90 */     return Collections.enumeration(this._productResponseList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Message getMessage() {
/* 100 */     return this._message;
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
/*     */   public com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ProductResponse getProductResponse(int index) throws IndexOutOfBoundsException {
/* 117 */     if (index < 0 || index >= this._productResponseList.size()) {
/* 118 */       throw new IndexOutOfBoundsException("getProductResponse: Index value '" + index + "' not in range [0.." + (this._productResponseList.size() - 1) + "]");
/*     */     }
/*     */     
/* 121 */     return (com.metcash.webservices.eai.xml.retailer.pricesoh.validation.ProductResponse) this._productResponseList.get(index);
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
/*     */   public ProductResponse[] getProductResponse() {
/* 136 */     ProductResponse[] array = new ProductResponse[0];
/* 137 */     return (ProductResponse[])this._productResponseList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getProductResponseCount() {
/* 147 */     return this._productResponseList.size();
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
/* 158 */       validate();
/* 159 */     } catch (ValidationException vex) {
/* 160 */       return false;
/*     */     } 
/* 162 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator iterateProductResponse() {
/* 173 */     return this._productResponseList.iterator();
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
/* 188 */     Marshaller.marshal(this, out);
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
/* 205 */     Marshaller.marshal(this, handler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllProductResponse() {
/* 212 */     this._productResponseList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeProductResponse(ProductResponse vProductResponse) {
/* 223 */     boolean removed = this._productResponseList.remove(vProductResponse);
/* 224 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProductResponse removeProductResponseAt(int index) {
/* 235 */     Object obj = this._productResponseList.remove(index);
/* 236 */     return (ProductResponse)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMessage(Message message) {
/* 246 */     this._message = message;
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
/*     */   public void setProductResponse(int index, ProductResponse vProductResponse) throws IndexOutOfBoundsException {
/* 262 */     if (index < 0 || index >= this._productResponseList.size()) {
/* 263 */       throw new IndexOutOfBoundsException("setProductResponse: Index value '" + index + "' not in range [0.." + (this._productResponseList.size() - 1) + "]");
/*     */     }
/*     */     
/* 266 */     this._productResponseList.set(index, vProductResponse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProductResponse(ProductResponse[] vProductResponseArray) {
/* 277 */     this._productResponseList.clear();
/*     */     
/* 279 */     for (int i = 0; i < vProductResponseArray.length; i++) {
/* 280 */       this._productResponseList.add(vProductResponseArray[i]);
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
/*     */   public static RetailerPriceSohResponse unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 298 */     return (RetailerPriceSohResponse)Unmarshaller.unmarshal(RetailerPriceSohResponse.class, reader);
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
/* 310 */     Validator validator = new Validator();
/* 311 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\pricesoh\validation\RetailerPriceSohResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */