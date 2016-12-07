package com.hmrc.shoppingcart.model;

public class Product
{
  private String name;
  // It would be better if we use long to represent the price which includes the
  // pence.
  private float unitPrice;

  public Product(String name, float unitPrice)
  {
    this.name = name;
    this.unitPrice = unitPrice;
  }

  public String getName()
  {
    return name;
  }

  public float getUnitPrice()
  {
    return unitPrice;
  }

}
