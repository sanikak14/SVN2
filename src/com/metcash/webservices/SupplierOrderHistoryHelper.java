/*     */ package com.metcash.webservices;
/*     */ 
/*     */ import com.metcash.common.services.SupplierRepOrderService;
/*     */ import com.metcash.common.services.SupplierRepService;
/*     */ import com.metcash.webservices.config.ValidationConfig;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderHistoryValidationAdapter;
/*     */ import com.metcash.webservices.eai.xml.SupplierOrderHistoryXmlAdapter;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.SupplierOrderHistoryRequest;
/*     */ import com.metcash.webservices.eai.xml.supplier.orderhistory.validation.OrderHistoryResponse;
/*     */ import com.metcash.webservices.validation.ValidationResult;
/*     */ import com.metcash.webservices.validation.orderhistory.SupplierOrderHistoryValidationResult;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SupplierOrderHistoryHelper
/*     */ {
/*     */   private static final String DEFAULT_ERROR_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><OrderHistoryResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></OrderHistoryResponse>";
/*  37 */   private static Log log = LogFactory.getLog(SupplierOrderHistoryHelper.class);
/*     */   protected SupplierRepOrderService orderService;
/*     */   protected SupplierRepService supplierRepService;
/*     */   
/*     */   public class OrderHistory
/*     */   {
/*     */     private String orderId;
/*     */     private Date createdDate;
/*     */     
/*     */     public String getOrderId() {
/*  47 */       return this.orderId;
/*     */     }
/*     */     
/*     */     public void setOrderId(String orderId) {
/*  51 */       this.orderId = orderId;
/*     */     }
/*     */     
/*     */     public Date getCreatedDate() {
/*  55 */       return this.createdDate;
/*     */     }
/*     */     
/*     */     public void setCreatedDate(Date createdDate) {
/*  59 */       this.createdDate = createdDate;
/*     */     }
/*     */   }
/*     */   
/*     */   public SupplierOrderHistoryHelper() {
/*     */     try {
/*  65 */       this.orderService = new SupplierRepOrderService();
/*  66 */       this.supplierRepService = new SupplierRepService();
/*  67 */     } catch (Exception e) {
/*  68 */       log.error("OrderHistoryHelper()", e);
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
/*     */   public String getOrderHistory(String xmlOrderHistoryRequest, String authenticatedUserId, String authenticatedUserStateId) {
/*  80 */     SupplierOrderHistoryRequest request = null;
/*  81 */     SupplierOrderHistoryValidationResult result = new SupplierOrderHistoryValidationResult();
/*  82 */     OrderHistoryResponse response = null;
/*     */ 
/*     */     
/*     */     try {
/*  86 */       request = (new SupplierOrderHistoryXmlAdapter())
/*  87 */         .parseXml(xmlOrderHistoryRequest);
/*  88 */     } catch (Exception e) {
/*  89 */       result.setMessage(ValidationResult.ERROR, 
/*  90 */           ValidationConfig.ERROR_PARSING_REQUEST_XML);
/*     */     } 
/*     */ 
/*     */     
/*  94 */     if (!result.isInError()) {
/*  95 */       processRequest(request, authenticatedUserId, 
/*  96 */           authenticatedUserStateId, result);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 102 */       response = result.getResponse();
/* 103 */       SupplierOrderHistoryValidationAdapter responseValidationAdapter = new SupplierOrderHistoryValidationAdapter();
/* 104 */       String xmlResponse = responseValidationAdapter.getXml(response);
/* 105 */       log.info("getOrderHistory() Response: " + xmlResponse);
/* 106 */       return xmlResponse;
/*     */     }
/* 108 */     catch (Exception e) {
/* 109 */       log.error("Problem returning an XML Response to client:", e);
/*     */ 
/*     */       
/* 112 */       return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><OrderHistoryResponse xmlns=\"\"><Message><MessageData>Service is currently unavailable.</MessageData><MessageSeverity>ERROR</MessageSeverity></Message></OrderHistoryResponse>";
/*     */     } 
/*     */   }
/*     */   
/*     */   public void processRequest(SupplierOrderHistoryRequest request, String authenticatedUserId, String authenticatedUserStateId, SupplierOrderHistoryValidationResult result) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #5
/*     */     //   3: new com/metcash/webservices/validation/orderhistory/SupplierOrderHistoryValidator
/*     */     //   6: dup
/*     */     //   7: aload_1
/*     */     //   8: aload #4
/*     */     //   10: aload_0
/*     */     //   11: getfield orderService : Lcom/metcash/common/services/SupplierRepOrderService;
/*     */     //   14: aload_0
/*     */     //   15: getfield supplierRepService : Lcom/metcash/common/services/SupplierRepService;
/*     */     //   18: invokespecial <init> : (Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierOrderHistoryRequest;Lcom/metcash/webservices/validation/orderhistory/SupplierOrderHistoryValidationResult;Lcom/metcash/common/services/SupplierRepOrderService;Lcom/metcash/common/services/SupplierRepService;)V
/*     */     //   21: astore #5
/*     */     //   23: aload #5
/*     */     //   25: aload_2
/*     */     //   26: aload_3
/*     */     //   27: invokevirtual validateAuthenticatedUser : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   30: istore #6
/*     */     //   32: iload #6
/*     */     //   34: ifeq -> 406
/*     */     //   37: aload #5
/*     */     //   39: invokevirtual validateDateRange : ()Z
/*     */     //   42: ifeq -> 406
/*     */     //   45: aconst_null
/*     */     //   46: astore #7
/*     */     //   48: aload_1
/*     */     //   49: invokevirtual getSupplierRep : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierRep;
/*     */     //   52: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   55: getstatic com/metcash/webservices/config/O4Config.O4_REP_ID : Lcom/metcash/model/field/SupplierRepId;
/*     */     //   58: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   61: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 182
/*     */     //   67: aload_1
/*     */     //   68: invokevirtual getSupplierRep : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierRep;
/*     */     //   71: invokevirtual getStateCode : ()Lcom/metcash/webservices/eai/xml/globaltypes/types/StateCodeType;
/*     */     //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   77: getstatic com/metcash/webservices/config/O4Config.O4_STATE_ID : Lcom/metcash/model/field/StateId;
/*     */     //   80: invokevirtual internalValue : ()Ljava/lang/String;
/*     */     //   83: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 182
/*     */     //   89: aload_1
/*     */     //   90: invokevirtual getCustomer : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/Customer;
/*     */     //   93: astore #8
/*     */     //   95: aload #8
/*     */     //   97: ifnonnull -> 111
/*     */     //   100: aload #4
/*     */     //   102: getstatic com/metcash/webservices/validation/ValidationResult.ERROR : I
/*     */     //   105: ldc 'Customer details required.'
/*     */     //   107: invokevirtual setMessage : (ILjava/lang/String;)V
/*     */     //   110: return
/*     */     //   111: aload_0
/*     */     //   112: getfield orderService : Lcom/metcash/common/services/SupplierRepOrderService;
/*     */     //   115: new com/metcash/model/field/CustomerId
/*     */     //   118: dup
/*     */     //   119: aload #8
/*     */     //   121: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   124: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   127: new com/metcash/model/field/StateId
/*     */     //   130: dup
/*     */     //   131: aload #8
/*     */     //   133: invokevirtual getStateCode : ()Lcom/metcash/webservices/eai/xml/globaltypes/types/StateCodeType;
/*     */     //   136: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   139: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   142: getstatic com/metcash/model/field/PillarId.ALM : Lcom/metcash/model/field/PillarId;
/*     */     //   145: new com/metcash/model/field/CreatedDate
/*     */     //   148: dup
/*     */     //   149: aload_1
/*     */     //   150: invokevirtual getStartDate : ()Lorg/exolab/castor/types/Date;
/*     */     //   153: invokevirtual toDate : ()Ljava/util/Date;
/*     */     //   156: invokespecial <init> : (Ljava/util/Date;)V
/*     */     //   159: new com/metcash/model/field/CreatedDate
/*     */     //   162: dup
/*     */     //   163: aload_1
/*     */     //   164: invokevirtual getEndDate : ()Lorg/exolab/castor/types/Date;
/*     */     //   167: invokevirtual toDate : ()Ljava/util/Date;
/*     */     //   170: invokespecial <init> : (Ljava/util/Date;)V
/*     */     //   173: iconst_0
/*     */     //   174: invokevirtual findByCustomerInDateRange : (Lcom/metcash/model/field/CustomerId;Lcom/metcash/model/field/StateId;Lcom/metcash/model/field/PillarId;Lcom/metcash/model/field/CreatedDate;Lcom/metcash/model/field/CreatedDate;Z)Ljava/util/List;
/*     */     //   177: astore #7
/*     */     //   179: goto -> 334
/*     */     //   182: aload_0
/*     */     //   183: getfield supplierRepService : Lcom/metcash/common/services/SupplierRepService;
/*     */     //   186: getstatic com/metcash/model/field/PillarId.ALM : Lcom/metcash/model/field/PillarId;
/*     */     //   189: new com/metcash/model/field/StateId
/*     */     //   192: dup
/*     */     //   193: aload_1
/*     */     //   194: invokevirtual getSupplierRep : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierRep;
/*     */     //   197: invokevirtual getStateCode : ()Lcom/metcash/webservices/eai/xml/globaltypes/types/StateCodeType;
/*     */     //   200: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   203: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   206: new com/metcash/model/field/SupplierRepId
/*     */     //   209: dup
/*     */     //   210: aload_1
/*     */     //   211: invokevirtual getSupplierRep : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierRep;
/*     */     //   214: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   220: invokevirtual findSupplierRep : (Lcom/metcash/model/field/PillarId;Lcom/metcash/model/field/StateId;Lcom/metcash/model/field/SupplierRepId;)Lcom/metcash/model/segment/db/SupplierRep;
/*     */     //   223: astore #8
/*     */     //   225: aload_1
/*     */     //   226: invokevirtual getCustomer : ()Lcom/metcash/webservices/eai/xml/supplier/orderhistory/Customer;
/*     */     //   229: astore #9
/*     */     //   231: aconst_null
/*     */     //   232: astore #10
/*     */     //   234: aconst_null
/*     */     //   235: astore #11
/*     */     //   237: aload #9
/*     */     //   239: ifnull -> 273
/*     */     //   242: new com/metcash/model/field/CustomerId
/*     */     //   245: dup
/*     */     //   246: aload #9
/*     */     //   248: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   251: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   254: astore #10
/*     */     //   256: new com/metcash/model/field/StateId
/*     */     //   259: dup
/*     */     //   260: aload #9
/*     */     //   262: invokevirtual getStateCode : ()Lcom/metcash/webservices/eai/xml/globaltypes/types/StateCodeType;
/*     */     //   265: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   268: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   271: astore #11
/*     */     //   273: aload_0
/*     */     //   274: getfield orderService : Lcom/metcash/common/services/SupplierRepOrderService;
/*     */     //   277: getstatic com/metcash/model/field/PillarId.ALM : Lcom/metcash/model/field/PillarId;
/*     */     //   280: aload #8
/*     */     //   282: invokevirtual getSupplierRepKey : ()Lcom/metcash/model/segment/db/SupplierRep$SupplierRepPK;
/*     */     //   285: getfield stateId : Lcom/metcash/model/field/StateId;
/*     */     //   288: aload #8
/*     */     //   290: invokevirtual getSupplierRepKey : ()Lcom/metcash/model/segment/db/SupplierRep$SupplierRepPK;
/*     */     //   293: getfield supplierRepId : Lcom/metcash/model/field/SupplierRepId;
/*     */     //   296: aload #11
/*     */     //   298: aload #10
/*     */     //   300: new com/metcash/model/field/CreatedDate
/*     */     //   303: dup
/*     */     //   304: aload_1
/*     */     //   305: invokevirtual getStartDate : ()Lorg/exolab/castor/types/Date;
/*     */     //   308: invokevirtual toDate : ()Ljava/util/Date;
/*     */     //   311: invokespecial <init> : (Ljava/util/Date;)V
/*     */     //   314: new com/metcash/model/field/CreatedDate
/*     */     //   317: dup
/*     */     //   318: aload_1
/*     */     //   319: invokevirtual getEndDate : ()Lorg/exolab/castor/types/Date;
/*     */     //   322: invokevirtual toDate : ()Ljava/util/Date;
/*     */     //   325: invokespecial <init> : (Ljava/util/Date;)V
/*     */     //   328: iconst_0
/*     */     //   329: invokevirtual findBySupplierRepInDateRange : (Lcom/metcash/model/field/PillarId;Lcom/metcash/model/field/StateId;Lcom/metcash/model/field/SupplierRepId;Lcom/metcash/model/field/StateId;Lcom/metcash/model/field/CustomerId;Lcom/metcash/model/field/CreatedDate;Lcom/metcash/model/field/CreatedDate;Z)Ljava/util/List;
/*     */     //   332: astore #7
/*     */     //   334: aload #7
/*     */     //   336: ifnull -> 406
/*     */     //   339: iconst_0
/*     */     //   340: istore #8
/*     */     //   342: goto -> 365
/*     */     //   345: aload #4
/*     */     //   347: aload #7
/*     */     //   349: iload #8
/*     */     //   351: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   356: checkcast com/metcash/model/segment/db/OrderHeader
/*     */     //   359: invokevirtual setOrderHistory : (Lcom/metcash/model/segment/db/OrderHeader;)V
/*     */     //   362: iinc #8, 1
/*     */     //   365: iload #8
/*     */     //   367: aload #7
/*     */     //   369: invokeinterface size : ()I
/*     */     //   374: if_icmplt -> 345
/*     */     //   377: goto -> 406
/*     */     //   380: astore #6
/*     */     //   382: getstatic com/metcash/webservices/SupplierOrderHistoryHelper.log : Lorg/apache/commons/logging/Log;
/*     */     //   385: ldc_w 'processRequest()'
/*     */     //   388: aload #6
/*     */     //   390: invokeinterface error : (Ljava/lang/Object;Ljava/lang/Throwable;)V
/*     */     //   395: aload #4
/*     */     //   397: getstatic com/metcash/webservices/validation/ValidationResult.ERROR : I
/*     */     //   400: ldc_w 'Unexpected error occurred while processing request.'
/*     */     //   403: invokevirtual setMessage : (ILjava/lang/String;)V
/*     */     //   406: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #127	-> 0
/*     */     //   #129	-> 3
/*     */     //   #130	-> 10
/*     */     //   #129	-> 18
/*     */     //   #133	-> 23
/*     */     //   #134	-> 25
/*     */     //   #133	-> 27
/*     */     //   #136	-> 32
/*     */     //   #138	-> 37
/*     */     //   #139	-> 45
/*     */     //   #140	-> 48
/*     */     //   #141	-> 55
/*     */     //   #140	-> 61
/*     */     //   #142	-> 67
/*     */     //   #143	-> 74
/*     */     //   #144	-> 77
/*     */     //   #145	-> 80
/*     */     //   #143	-> 83
/*     */     //   #147	-> 89
/*     */     //   #148	-> 95
/*     */     //   #149	-> 100
/*     */     //   #150	-> 105
/*     */     //   #149	-> 107
/*     */     //   #151	-> 110
/*     */     //   #153	-> 111
/*     */     //   #154	-> 115
/*     */     //   #155	-> 119
/*     */     //   #154	-> 124
/*     */     //   #155	-> 127
/*     */     //   #156	-> 133
/*     */     //   #155	-> 139
/*     */     //   #157	-> 142
/*     */     //   #158	-> 150
/*     */     //   #159	-> 159
/*     */     //   #160	-> 167
/*     */     //   #159	-> 170
/*     */     //   #160	-> 173
/*     */     //   #154	-> 174
/*     */     //   #153	-> 177
/*     */     //   #165	-> 182
/*     */     //   #166	-> 186
/*     */     //   #167	-> 193
/*     */     //   #168	-> 200
/*     */     //   #169	-> 206
/*     */     //   #170	-> 211
/*     */     //   #169	-> 217
/*     */     //   #166	-> 220
/*     */     //   #165	-> 223
/*     */     //   #172	-> 225
/*     */     //   #173	-> 231
/*     */     //   #174	-> 234
/*     */     //   #175	-> 237
/*     */     //   #176	-> 242
/*     */     //   #177	-> 256
/*     */     //   #178	-> 262
/*     */     //   #177	-> 268
/*     */     //   #180	-> 273
/*     */     //   #182	-> 277
/*     */     //   #183	-> 280
/*     */     //   #184	-> 288
/*     */     //   #185	-> 296
/*     */     //   #186	-> 300
/*     */     //   #187	-> 308
/*     */     //   #186	-> 311
/*     */     //   #187	-> 314
/*     */     //   #188	-> 318
/*     */     //   #187	-> 325
/*     */     //   #189	-> 328
/*     */     //   #181	-> 329
/*     */     //   #180	-> 332
/*     */     //   #191	-> 334
/*     */     //   #193	-> 339
/*     */     //   #194	-> 345
/*     */     //   #195	-> 349
/*     */     //   #194	-> 359
/*     */     //   #193	-> 362
/*     */     //   #200	-> 380
/*     */     //   #201	-> 382
/*     */     //   #202	-> 395
/*     */     //   #203	-> 400
/*     */     //   #202	-> 403
/*     */     //   #205	-> 406
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	407	0	this	Lcom/metcash/webservices/SupplierOrderHistoryHelper;
/*     */     //   0	407	1	request	Lcom/metcash/webservices/eai/xml/supplier/orderhistory/SupplierOrderHistoryRequest;
/*     */     //   0	407	2	authenticatedUserId	Ljava/lang/String;
/*     */     //   0	407	3	authenticatedUserStateId	Ljava/lang/String;
/*     */     //   0	407	4	result	Lcom/metcash/webservices/validation/orderhistory/SupplierOrderHistoryValidationResult;
/*     */     //   3	404	5	validator	Lcom/metcash/webservices/validation/orderhistory/SupplierOrderHistoryValidator;
/*     */     //   32	348	6	isValid	Z
/*     */     //   48	329	7	orderHistories	Ljava/util/List;
/*     */     //   95	87	8	customer	Lcom/metcash/webservices/eai/xml/supplier/orderhistory/Customer;
/*     */     //   225	109	8	supplierRep	Lcom/metcash/model/segment/db/SupplierRep;
/*     */     //   231	103	9	customer	Lcom/metcash/webservices/eai/xml/supplier/orderhistory/Customer;
/*     */     //   234	100	10	customerId	Lcom/metcash/model/field/CustomerId;
/*     */     //   237	97	11	customerStateId	Lcom/metcash/model/field/StateId;
/*     */     //   342	35	8	i	I
/*     */     //   382	24	6	e	Ljava/lang/Exception;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	110	380	java/lang/Exception
/*     */     //   111	377	380	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\SupplierOrderHistoryHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */