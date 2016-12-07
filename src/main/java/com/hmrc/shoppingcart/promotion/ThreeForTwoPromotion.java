package com.hmrc.shoppingcart.promotion;

import com.hmrc.shoppingcart.model.Product;

public class ThreeForTwoPromotion implements PromotionsService
{

  public float getProductCostForQuantity(Product product, int quantity)
  {
    long unitCost = (long)(product.getUnitPrice() * 100);

    float cost = ((quantity / 3 * 2) * unitCost + (quantity % 3) * unitCost) / 100f;

    return cost;

  }
}
