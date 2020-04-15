/*    */ package com.metcash.webservices;
/*    */ 
/*    */ import com.metcash.util.system.Log;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.xml.ws.Endpoint;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ALMOrderWebServiceServlet
/*    */   extends HttpServlet
/*    */ {
/*    */   public void init() throws ServletException {
/* 26 */     Log.info(this, "Starting IBACustomerWebServiceServlet");
/*    */ 
/*    */     
/*    */     try {
/* 30 */       Log.info(this, "ALMOrderWebServiceServlet Web Service started: http://localhost:8080/web-services/ALMOrderWebService");
/*    */ 
/*    */       
/* 33 */       Endpoint.publish("http://localhost:8080/web-services/ALMOrderWebService", new ALMOrderWebService());
/*    */     }
/* 35 */     catch (Exception e) {
/* 36 */       Log.error(this, "Failed to validate IBA customer", e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/* 41 */     doPost(req, resp);
/*    */   }
/*    */   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/* 44 */     doPost(req, resp);
/*    */   }
/*    */   
/*    */   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
/*    */ }


/* Location:              D:\Sanika\iOrders War file\SIT\almws.war\WEB-INF\classes\!\com\metcash\webservices\ALMOrderWebServiceServlet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */