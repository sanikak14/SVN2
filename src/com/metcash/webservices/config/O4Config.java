/*    */ package com.metcash.webservices.config;
/*    */ 
/*    */ import com.metcash.config.Environment;
/*    */ import com.metcash.framework.commons.utils.Loader;
/*    */ import com.metcash.model.field.PillarId;
/*    */ import com.metcash.model.field.StateId;
/*    */ import com.metcash.model.field.SupplierId;
/*    */ import com.metcash.model.field.SupplierRepId;
import com.metcash.util.system.Log;

/*    */ import java.util.Properties;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class O4Config
/*    */ {
/*    */   public static final String PROPERTIES_FILE = "/O4Config.properties";
/*    */   public static PillarId O4_PILLAR_ID;
/*    */   public static SupplierId O4_SUPPLIER_ID;
/*    */   public static SupplierRepId O4_REP_ID;
/*    */   public static StateId O4_STATE_ID;
/*    */   
/*    */   static {
/* 22 */     Properties props = null;
/* 23 */     if (!Environment.isWebLogic()) {
/* 24 */       props = Loader.loadProperties("conf/O4Config.properties");
/*    */     } else {
	
/* 26 */       props = Loader.loadProperties("/O4Config.properties");
/*    */     } 
/*    */ 
/*    */     
/* 30 */     O4_PILLAR_ID = new PillarId(props.getProperty("O4Config.O4_PILLAR_ID"));
/* 31 */     O4_SUPPLIER_ID = new SupplierId(props
/* 32 */         .getProperty("O4Config.O4_SUPPLIER_ID"));
/* 33 */     O4_REP_ID = new SupplierRepId(props.getProperty("O4Config.O4_REP_ID"));
/* 34 */     O4_STATE_ID = new StateId(props.getProperty("O4Config.O4_STATE_ID"));
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\config\O4Config.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */