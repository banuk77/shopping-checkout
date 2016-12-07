package com.hmrc.shoppingcart.promotion;

import com.hmrc.shoppingcart.model.Product;

public class BuyOneGetOnFreePromotion implements PromotionsService
{

  public float getProductCostForQuantity(Product product, int quantity)
  {
    long unitCost = (long)(product.getUnitPrice() * 100);

    float cost = ((quantity % 2) * unitCost + (quantity / 2) * unitCost) / 100f;

    return cost;

  }
}
