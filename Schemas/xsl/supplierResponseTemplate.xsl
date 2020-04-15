<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- Edited with XML Spy v2007 (http://www.altova.com) -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="SupplierOrderResponse">
	<html>
	  <body style="font-family:Arial,helvetica,sans-serif;font-size:12pt;background-color:white">
		<i><b>Supplier Response</b> (XML transformation):</i>
		<xsl:apply-templates/>
	</body>
	</html>
</xsl:template>
<xsl:template match="ResponseHeader">
		  <div style="background-color:red;color:white;padding:4px">
			<span style="font-weight:bold;color:white">
			Supplier: <xsl:value-of select="Supplier"/></span>
			- SupplierStateCode: <xsl:value-of select="SupplierStateCode"/>
		  </div>
</xsl:template>
<xsl:template match="OrderDetail">
		<xsl:for-each select="OrderHeaderResponse">
		  <div style="background-color:blue;color:white;padding:4px">
			<span style="font-weight:bold;color:white">
			WebOrderId: <xsl:value-of select="WebOrderId"/></span>
		  </div>
		  <div style="margin-left:20px;margin-bottom:1em;font-size:10pt">
			 SupplierRep: <xsl:value-of select="SupplierRepCode"/>
			<br/>
			SupplierReference: <xsl:value-of select="SupplierReference"/>
		   <br/>
			OrderType: <xsl:value-of select="OrderType"/>
		   <br/>
			 WebCreatedDateTime: <xsl:value-of select="WebCreatedTime"/>
		   <br/>
			 CustomerId: <xsl:value-of select="CustomerId"/>
		   <br/>
			 CustomerStateCode: <xsl:value-of select="CustomerStateCode"/>
		   <br/>
			Items Accepted: <xsl:value-of select="ItemsAccepted"/>
			<span style="font-style:italic">
			  (<xsl:value-of select="ItemsRejected"/> Items Rejected)
			</span>
		   <br/>
		  </div>
		</xsl:for-each>
		<xsl:for-each select="LineMessages">
			  <div style="margin-left:20px;margin-bottom:1em;font-size:10pt">
				 ItemProductCode: <xsl:value-of select="ItemProductCode"/>
				  - 
				ItemDescription: <xsl:value-of select="ItemDescription"/>
				  - 
				OrderQuantity: <xsl:value-of select="OrderQuantity"/>
				  - 
				 LineMessageData: <xsl:value-of select="LineMessageData"/>
				  - 
				 LineMessageSeverity: <xsl:value-of select="LineMessageSeverity"/>
			  </div>
		</xsl:for-each>
</xsl:template>
</xsl:stylesheet>




