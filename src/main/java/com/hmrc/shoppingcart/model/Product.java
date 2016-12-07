package com.hmrc.shoppingcart.model;

public class Product
{
  private String name;
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
