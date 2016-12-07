package com.hmrc.shoppingcart;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.hmrc.shoppingcart.model.Product;
import com.hmrc.shoppingcart.promotion.PromotionFactory;
import com.hmrc.shoppingcart.promotion.PromotionsService;

public class CheckoutServiceImpl implements CheckoutService
{

  public float getTotalCost(List<Product> products)
  {
    float cost = .0f;

    if (products == null || products.isEmpty())
    {
      return 0.0f;
    }

    HashMap<Product, AtomicInteger> productQuantities = new HashMap<Product, AtomicInteger>();

    // first find the number of products
    for (Product p : products)
    {
      AtomicInteger prodCount = productQuantities.get(p);
      if (prodCount == null)
      {
        prodCount = new AtomicInteger(0);
      }
      prodCount.incrementAndGet();

      productQuantities.put(p, prodCount);

    }

    for (Product p : productQuantities.keySet())
    {
      PromotionsService promotionsService = PromotionFactory.getProductPromotionService(p);
      float offerPrice = promotionsService.getProductCostForQuantity(p,
          productQuantities.get(p).get());
      cost += offerPrice;
    }

    return cost;
  }

}
