/*     */ package com.metcash.webservices.utils.jndi;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ import javax.naming.Context;
/*     */ import javax.naming.InitialContext;
/*     */ import javax.naming.NamingException;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ public class JndiWebServiceManager
/*     */ {
/*  24 */   private static String ALM_WEB_SERVICE_SUB_CONTEXT = "almwebservices";
/*  25 */   private static String ALM_WEB_SERVICE_MANAGER_CONTEXT = "almwsmanager";
/*     */   
/*  27 */   private static Log log = LogFactory.getLog(JndiWebServiceManager.class);
/*     */   
/*     */   public JndiWebServiceManager() {
/*  30 */     log.debug("Constructing JndiWebServiceManager STARTUP CLASS!!!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String startup(String name, Hashtable args) {
/*  39 */     log.debug("The JndiWebServiceManager STARTUP startup() call has been made!!");
/*  40 */     bindAlmWebServiceManager(new AlmWebServiceManager(), false);
/*  41 */     testAlmSupplierServiceAvailability();
/*  42 */     return "ok";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void bindAlmWebServiceManager(AlmWebServiceManager almWsManager, boolean rebind) {
/*  49 */     Context ic = null;
/*  50 */     Context ctx = null;
/*     */     try {
/*  52 */       ic = new InitialContext();
/*     */       
/*  54 */       if (rebind) {
/*  55 */         ctx = (Context)ic.lookup(ALM_WEB_SERVICE_SUB_CONTEXT);
/*  56 */         ctx.rebind(ALM_WEB_SERVICE_MANAGER_CONTEXT, almWsManager);
/*  57 */         ic.rebind(ALM_WEB_SERVICE_SUB_CONTEXT, ctx);
/*     */       } else {
/*  59 */         ctx = ic.createSubcontext(ALM_WEB_SERVICE_SUB_CONTEXT);
/*  60 */         ctx.bind(ALM_WEB_SERVICE_MANAGER_CONTEXT, almWsManager);
/*     */       }
/*     */     
/*  63 */     } catch (NamingException ne) {
/*  64 */       log.debug("Problem creating JndiWebServiceManager context" + ne);
/*     */     } finally {
/*     */       
/*     */       try {
/*  68 */         ic.close();
/*  69 */         ctx.close();
/*     */       }
/*  71 */       catch (Exception e) {
/*  72 */         log.debug("Problem closing JndiWebServiceManager initial context" + e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AlmWebServiceManager getAlmWebServiceManager() {
/*  82 */     Context ic = null;
/*  83 */     Context ctx = null;
/*  84 */     AlmWebServiceManager almWsManager = null;
/*     */     try {
/*  86 */       ic = new InitialContext();
/*     */       
/*  88 */       ctx = (Context)ic.lookup(ALM_WEB_SERVICE_SUB_CONTEXT);
/*  89 */       almWsManager = (AlmWebServiceManager)ctx.lookup(ALM_WEB_SERVICE_MANAGER_CONTEXT);
/*     */     }
/*  91 */     catch (NamingException ne) {
/*  92 */       log.debug("Problem creating JndiWebServiceManager context" + ne);
/*     */     } finally {
/*     */       
/*     */       try {
/*  96 */         ic.close();
/*  97 */         ctx.close();
/*     */       }
/*  99 */       catch (Exception e) {
/* 100 */         log.debug("Problem closing JndiWebServiceManager initial context" + e);
/*     */       } 
/*     */     } 
/* 103 */     return almWsManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void testAlmSupplierServiceAvailability() {
/* 111 */     AlmWebServiceManager almWsManager = getAlmWebServiceManager();
/* 112 */     if (almWsManager != null) {
/*     */       
/* 114 */       almWsManager.setSubmitSupplierOrderIsAvailable(false);
/*     */       
/* 116 */       bindAlmWebServiceManager(almWsManager, true);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 121 */     almWsManager = getAlmWebServiceManager();
/* 122 */     if (almWsManager != null) {
/*     */       
/* 124 */       almWsManager.setSubmitSupplierOrderIsAvailable(true);
/* 125 */       bindAlmWebServiceManager(almWsManager, true);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservice\\utils\jndi\JndiWebServiceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */