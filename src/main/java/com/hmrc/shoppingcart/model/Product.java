package com.hmrc.shoppingcart.model;

public class Product
{
  private String name;
  // It would be better if we use long to represent the price which includes the
  // pence.
  private float unitPrice;
  private int promotionId;

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

  public int getPromotionId()
  {
    return promotionId;
  }

  public void setPromotionId(int promotionId)
  {
    this.promotionId = promotionId;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product)obj;
    if (name == null)
    {
      if (other.name != null)
        return false;
    }
    else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public String toString()
  {
    return name;
  }
}
