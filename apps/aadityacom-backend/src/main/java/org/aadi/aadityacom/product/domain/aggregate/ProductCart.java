package org.aadi.aadityacom.product.domain.aggregate;

import org.aadi.aadityacom.product.domain.vo.ProductBrand;
import org.aadi.aadityacom.product.domain.vo.ProductName;
import org.aadi.aadityacom.product.domain.vo.ProductPrice;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import org.aadi.aadityacom.shared.error.domain.Assert;
import lombok.Builder;

@Builder
public class ProductCart {

  private ProductName name;

  private ProductPrice price;

  private ProductBrand brand;

  private Picture picture;

  private PublicId publicId;

  public ProductCart() {
  }

  public ProductCart(ProductName name, ProductPrice price, ProductBrand brand,
                     Picture picture, PublicId publicId) {
    assertFields(name, price, brand, picture, publicId);
    this.name = name;
    this.price = price;
    this.brand = brand;
    this.picture = picture;
    this.publicId = publicId;
  }

  private void assertFields(ProductName name, ProductPrice price, ProductBrand brand,
                     Picture picture, PublicId publicId) {
    Assert.notNull("brand", brand);
    Assert.notNull("name", name);
    Assert.notNull("price", price);
    Assert.notNull("picture", picture);
    Assert.notNull("publicId", publicId);
  }

  public static ProductCart from(Product product) {
    return ProductCart.builder()
      .name(product.getName())
      .price(product.getPrice())
      .brand(product.getProductBrand())
      .picture(product.getPictures().stream().findFirst().orElseThrow())
      .publicId(product.getPublicId())
      .build();
  }

  public ProductName getName() {
    return name;
  }

  public ProductPrice getPrice() {
    return price;
  }

  public ProductBrand getBrand() {
    return brand;
  }

  public Picture getPicture() {
    return picture;
  }

  public PublicId getPublicId() {
    return publicId;
  }
}
