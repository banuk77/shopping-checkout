package com.hmrc.shoppingcart;

import java.util.List;

import com.hmrc.shoppingcart.model.Product;

/**
 * A Checkout service used to calculate the total cost for items currently in
 * the basket.
 * 
 * @author Banu Kones
 *
 */
public interface CheckoutService
{

  /**
   * Calculates the total cost for the items currently in the shopping cart. The
   * total cost is expected to be equal to the sum of (unitPrice * quantity) of
   * each item in the cart.
   * 
   * @param products
   * @return
   */
  float getTotalCost(List<Product> products);

}
