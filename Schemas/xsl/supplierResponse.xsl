<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- Edited with XML Spy v2007 (http://www.altova.com) -->
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml">
  <body style="font-family:Arial,helvetica,sans-serif;font-size:12pt;
        background-color:#EEEEEE">
    <xsl:for-each select="SupplierOrderResponse/ResponseHeader">
      <div style="background-color:red;color:white;padding:4px">
        <span style="font-weight:bold;color:white">
        Supplier:<xsl:value-of select="Supplier"/></span>
		- SupplierStateCode: <xsl:value-of select="SupplierStateCode"/>
      </div>
    </xsl:for-each>

    <xsl:for-each select="SupplierOrderResponse/OrderDetail/OrderHeaderResponse">
      <div style="background-color:blue;color:white;padding:4px">
        <span style="font-weight:bold;color:white">
        WebOrderId: <xsl:value-of select="WebOrderId"/></span>
        - SupplierRep: <xsl:value-of select="SupplierRepCode"/>
      </div>
     <div style="margin-left:20px;margin-bottom:1em;font-size:10pt">
       SupplierReference: <xsl:value-of select="SupplierReference"/>
       Items Accepted: <xsl:value-of select="ItemsAccepted"/>
        <span style="font-style:italic">
          (<xsl:value-of select="ItemsRejected"/> Items Rejected)
        </span>
      </div>
    </xsl:for-each>    
    
  </body>
</html>