package com.metcash.webservices.validation.order;

import com.metcash.webservices.validation.ValidationResult;

public abstract class OrderValidationResult extends ValidationResult {
  public abstract void addOrderHeaderResponseMessage(int paramInt, String paramString);
  
  public abstract void addLineMessageToOrderDetail(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              D:\Sanika\iOrders War file\Production backu\cf portalapp04\almws.war\WEB-INF\classes\!\com\metcash\webservices\validation\order\OrderValidationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */