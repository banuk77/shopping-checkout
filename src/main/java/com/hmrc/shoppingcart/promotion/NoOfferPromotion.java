package com.hmrc.shoppingcart.promotion;

import com.hmrc.shoppingcart.model.Product;

public class NoOfferPromotion implements PromotionsService
{

  public float getProductCostForQuantity(Product product, int quantity)
  {
    long pricePerQty = (long)(product.getUnitPrice() * 100);
    return (pricePerQty * quantity) / 100f;
  }
}
