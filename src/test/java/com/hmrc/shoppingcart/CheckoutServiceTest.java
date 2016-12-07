package com.hmrc.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import com.hmrc.shoppingcart.model.Product;

import junit.framework.Assert;

public class CheckoutServiceTest
{

  CheckoutService checkoutService;

  @Before
  public void setup()
  {
    // TODO implement the CheckoutServiceImpl
    CheckoutService checkoutService = new CheckoutServiceImpl();
  }

  public void testGetTotalCost()
  {

    List<Product> items = new ArrayList<Product>();

    Product apple = new Product("apple", .6f);
    Product orange = new Product("orange", .25f);

    items.add(apple);
    items.add(apple);
    items.add(orange);
    items.add(apple);

    float cost = checkoutService.getTotalCost(items);

    Assert.assertEquals("Total cost does not match the expected", 2.05f, cost, .0f);

  }

}
