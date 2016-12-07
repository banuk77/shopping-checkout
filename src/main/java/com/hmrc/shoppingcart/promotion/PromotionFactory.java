package com.hmrc.shoppingcart.promotion;

import com.hmrc.shoppingcart.model.Product;

public class PromotionFactory
{
  public static final int BUY_ONE_GET_ONE_FREE = 1;
  public static final int THREE_FOR_TWO = 2;

  private static final PromotionsService buyOneGetOneFree = new BuyOneGetOnFreePromotion();
  private static final PromotionsService threeForTwo = new ThreeForTwoPromotion();
  private static final PromotionsService noOffer = new NoOfferPromotion();

  public static final PromotionsService getProductPromotionService(Product product)
  {
    // in real world, it should be decided based on a database entry that
    // identifies the promotion using the promotion id.
    if (product.getPromotionId() == BUY_ONE_GET_ONE_FREE)
    {
      return buyOneGetOneFree;
    }
    else if (product.getPromotionId() == THREE_FOR_TWO)
    {
      return threeForTwo;
    }
    else
    {
      return noOffer;
    }

  }
}
