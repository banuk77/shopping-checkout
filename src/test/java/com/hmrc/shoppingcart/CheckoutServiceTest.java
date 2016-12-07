package com.hmrc.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.hmrc.shoppingcart.model.Product;
import com.hmrc.shoppingcart.promotion.PromotionFactory;

public class CheckoutServiceTest
{

  CheckoutService checkoutService;
  Product apple;
  Product orange;

  @Before
  public void setup()
  {
    checkoutService = new CheckoutServiceImpl();
    apple = new Product("apple", .6f);
    orange = new Product("orange", .25f);

  }

  @Test
  public void testGetTotalCost()
  {

    List<Product> items = new ArrayList<Product>();

    items.add(apple);
    items.add(apple);
    items.add(orange);
    items.add(apple);

    float cost = checkoutService.getTotalCost(items);

    Assert.assertEquals("Total cost does not match the expected", 2.05f, cost, .0f);

  }

  @Test
  public void testGetTotalCostWithPromotions()
  {
    apple.setPromotionId(PromotionFactory.BUY_ONE_GET_ONE_FREE);
    orange.setPromotionId(PromotionFactory.THREE_FOR_TWO);

    List<Product> items = new ArrayList<Product>();

    items.add(apple);
    items.add(apple);
    items.add(orange);
    items.add(apple);
    items.add(orange);
    items.add(orange);
    items.add(orange);

    // cost for apples = 1.2
    // cost for oranges = .50+.25 = .75
    // total = 1.95

    float cost = checkoutService.getTotalCost(items);

    Assert.assertEquals("Total cost does not match the expected", 1.95f, cost, .0f);

  }

}
