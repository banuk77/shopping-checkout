package com.hmrc.shoppingcart.promotion;

import com.hmrc.shoppingcart.model.Product;

public interface PromotionsService
{
  float getProductCostForQuantity(Product product, int quantity);
}
