/*     */ package com.metcash.webservices.eai.xml.retailer.order.validation;
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
/*     */ public class OrderDetail
/*     */   implements Serializable
/*     */ {
/*     */   private OrderHeaderResponse _orderHeaderResponse;
/*  46 */   private List _lineMessagesList = new ArrayList();
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
/*     */   public void addLineMessages(LineMessages vLineMessages) throws IndexOutOfBoundsException {
/*  64 */     this._lineMessagesList.add(vLineMessages);
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
/*     */   public void addLineMessages(int index, LineMessages vLineMessages) throws IndexOutOfBoundsException {
/*  79 */     this._lineMessagesList.add(index, vLineMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Enumeration enumerateLineMessages() {
/*  90 */     return Collections.enumeration(this._lineMessagesList);
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
/*     */   public com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages getLineMessages(
        final int index)
throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._lineMessagesList.size()) {
        throw new IndexOutOfBoundsException("getLineMessages: Index value '" + index + "' not in range [0.." + (this._lineMessagesList.size() - 1) + "]");
    }
    
    return (com.metcash.webservices.eai.xml.retailer.order.validation.LineMessages) _lineMessagesList.get(index);
}
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
/*     */   public LineMessages[] getLineMessages() {
/* 126 */     LineMessages[] array = new LineMessages[0];
/* 127 */     return (LineMessages[])this._lineMessagesList.toArray((Object[])array);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLineMessagesCount() {
/* 137 */     return this._lineMessagesList.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrderHeaderResponse getOrderHeaderResponse() {
/* 147 */     return this._orderHeaderResponse;
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
/*     */   public Iterator iterateLineMessages() {
/* 173 */     return this._lineMessagesList.iterator();
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
/*     */   public void removeAllLineMessages() {
/* 212 */     this._lineMessagesList.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeLineMessages(LineMessages vLineMessages) {
/* 223 */     boolean removed = this._lineMessagesList.remove(vLineMessages);
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
/*     */   public LineMessages removeLineMessagesAt(int index) {
/* 235 */     Object obj = this._lineMessagesList.remove(index);
/* 236 */     return (LineMessages)obj;
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
/*     */   public void setLineMessages(int index, LineMessages vLineMessages) throws IndexOutOfBoundsException {
/* 252 */     if (index < 0 || index >= this._lineMessagesList.size()) {
/* 253 */       throw new IndexOutOfBoundsException("setLineMessages: Index value '" + index + "' not in range [0.." + (this._lineMessagesList.size() - 1) + "]");
/*     */     }
/*     */     
/* 256 */     this._lineMessagesList.set(index, vLineMessages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLineMessages(LineMessages[] vLineMessagesArray) {
/* 267 */     this._lineMessagesList.clear();
/*     */     
/* 269 */     for (int i = 0; i < vLineMessagesArray.length; i++) {
/* 270 */       this._lineMessagesList.add(vLineMessagesArray[i]);
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
/*     */   public void setOrderHeaderResponse(OrderHeaderResponse orderHeaderResponse) {
/* 282 */     this._orderHeaderResponse = orderHeaderResponse;
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
/*     */   public static OrderDetail unmarshal(Reader reader) throws MarshalException, ValidationException {
/* 299 */     return (OrderDetail)Unmarshaller.unmarshal(OrderDetail.class, reader);
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
/* 311 */     Validator validator = new Validator();
/* 312 */     validator.validate(this);
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\eai\xml\retailer\order\validation\OrderDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */