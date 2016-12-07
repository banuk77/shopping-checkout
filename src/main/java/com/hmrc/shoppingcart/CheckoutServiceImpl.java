package com.hmrc.shoppingcart;

import java.util.List;

import com.hmrc.shoppingcart.model.Product;

public class CheckoutServiceImpl implements CheckoutService
{

  public float getTotalCost(List<Product> products)
  {
    float cost = .0f;

    if (products == null || products.isEmpty())
    {
      return 0.0f;
    }

    for (Product p : products)
    {
      cost += p.getUnitPrice() * 100;
    }

    cost = cost / 100;

    return cost;
  }

}
