/*    */ package com.metcash.webservices.config;
/*    */ 
/*    */ import com.metcash.config.Environment;
/*    */ import com.metcash.framework.commons.utils.Loader;
/*    */ import java.util.Properties;
/*    */ 
/*    */ 
/*    */ public class ValidationConfig
/*    */ {
/*    */   public static final String VALIDATION_PROPERTIES = "/ValidationConfig.properties";
/* 11 */   public static String PRODUCT_DETAIL_UNAVAILABLE = "Product Detail Unavailable.";
/*    */   
/*    */   public static String NON_NUMERIC_VALUE;
/*    */   
/*    */   public static String NO_REP_EXISTS;
/*    */   
/*    */   public static String NO_CUSTOMER_EXISTS;
/*    */   
/*    */   public static String INVALID_CHARACTERS;
/*    */   
/*    */   public static String NO_REP_PRODUCT_CATALOGUE;
/*    */   
/*    */   public static String DUPLICATE_ORDER_LINE;
/*    */   
/*    */   public static String MAX_METCASH_PRODUCT_ID;
/*    */   
/*    */   public static String REP_PRODUCT_NOT_FOUND;
/*    */   
/*    */   public static String RETAILER_PRODUCT_NOT_FOUND;
/*    */   
/*    */   public static String DEAL_AMT_OVERRIDE_ONLY;
/*    */   public static String DEAL_AMT_EQUALS_ZERO;
/*    */   public static String DEAL_AMT_EXCEEDS_BASE_WSPR;
/*    */   public static String DEAL_AMT_LESS_THAN_CURRENT_DEALS;
/*    */   public static String MIN_ORDER_QTY_NOT_MET;
/*    */   public static String NO_BROKEN_PACK_FLAG;
/*    */   public static String UNEXPECTED_ERROR_PROCESSING_ORDER_LINE;
/*    */   public static String INVALID_PRODUCT_CODE;
/*    */   public static String PRODUCT_NOT_IN_RANGE;
/*    */   public static String AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH;
/*    */   public static String AUTHENTICATED_RETAILER_DOES_NOT_MATCH;
/*    */   public static String REP_NOT_ALLOW_DEALS;
/*    */   public static String ERROR_PARSING_REQUEST_XML;
/*    */   public static String INVALID_DATE_RANGE;
/*    */   public static String SFAP_O4_PASSWORD;
/*    */   
/*    */   static {
/* 48 */     ValidationConfig config = new ValidationConfig();
/* 49 */     Properties props = null;
/* 50 */     if (!Environment.isWebLogic()) {
/* 51 */       props = Loader.loadProperties("conf/ValidationConfig.properties");
/*    */     } else {
/* 53 */       props = Loader.loadProperties("/ValidationConfig.properties");
/*    */     } 
/* 55 */     NON_NUMERIC_VALUE = props.getProperty("ValidationConfig.NON_NUMERIC_VALUE");
/* 56 */     NO_REP_EXISTS = props.getProperty("ValidationConfig.NO_REP_EXISTS");
/* 57 */     NO_CUSTOMER_EXISTS = props.getProperty("ValidationConfig.NO_CUSTOMER_EXISTS");
/* 58 */     INVALID_CHARACTERS = props.getProperty("ValidationConfig.INVALID_CHARACTERS");
/* 59 */     NO_REP_PRODUCT_CATALOGUE = props.getProperty("ValidationConfig.NO_REP_PRODUCT_CATALOGUE");
/* 60 */     DUPLICATE_ORDER_LINE = props.getProperty("ValidationConfig.DUPLICATE_ORDER_LINE");
/* 61 */     MAX_METCASH_PRODUCT_ID = props.getProperty("ValidationConfig.MAX_METCASH_PRODUCT_ID");
/* 62 */     REP_PRODUCT_NOT_FOUND = props.getProperty("ValidationConfig.REP_PRODUCT_NOT_FOUND");
/* 63 */     RETAILER_PRODUCT_NOT_FOUND = props.getProperty("ValidationConfig.RETAILER_PRODUCT_NOT_FOUND");
/* 64 */     DEAL_AMT_OVERRIDE_ONLY = props.getProperty("ValidationConfig.DEAL_AMT_OVERRIDE_ONLY");
/* 65 */     DEAL_AMT_EQUALS_ZERO = props.getProperty("ValidationConfig.DEAL_AMT_EQUALS_ZERO");
/* 66 */     DEAL_AMT_EXCEEDS_BASE_WSPR = props.getProperty("ValidationConfig.DEAL_AMT_EXCEEDS_BASE_WSPR");
/* 67 */     DEAL_AMT_LESS_THAN_CURRENT_DEALS = props.getProperty("ValidationConfig.DEAL_AMT_LESS_THAN_CURRENT_DEALS");
/*    */ 
/*    */ 
/*    */     
/* 71 */     MIN_ORDER_QTY_NOT_MET = props.getProperty("ValidationConfig.MIN_ORDER_QTY_NOT_MET");
/* 72 */     NO_BROKEN_PACK_FLAG = props.getProperty("ValidationConfig.NO_BROKEN_PACK_FLAG");
/* 73 */     UNEXPECTED_ERROR_PROCESSING_ORDER_LINE = props.getProperty("ValidationConfig.UNEXPECTED_ERROR_PROCESSING_ORDER_LINE");
/* 74 */     PRODUCT_NOT_IN_RANGE = props.getProperty("ValidationConfig.PRODUCT_NOT_IN_RANGE");
/* 75 */     INVALID_PRODUCT_CODE = props.getProperty("ValidationConfig.INVALID_PRODUCT_CODE");
/* 76 */     AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH = props.getProperty("ValidationConfig.AUTHENTICATED_SUPPLIER_DOES_NOT_MATCH");
/* 77 */     AUTHENTICATED_RETAILER_DOES_NOT_MATCH = props.getProperty("ValidationConfig.AUTHENTICATED_RETAILER_DOES_NOT_MATCH");
/* 78 */     SFAP_O4_PASSWORD = props.getProperty("ValidationConfig.SFAP_O4_PASSWORD");
/* 79 */     REP_NOT_ALLOW_DEALS = props.getProperty("ValidationConfig.REP_NOT_ALLOW_DEALS");
/* 80 */     ERROR_PARSING_REQUEST_XML = props.getProperty("ValidationConfig.ERROR_PARSING_REQUEST_XML");
/* 81 */     INVALID_DATE_RANGE = props.getProperty("ValidationConfig.INVALID_DATE_RANGE");
/*    */   }
/*    */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\config\ValidationConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */