package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.product.domain.aggregate.ProductCart;
import org.aadi.aadityacom.product.infrastructure.primary.RestPicture;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record RestProductCart(String name,
                              double price,
                              String brand,
                              RestPicture picture,
                              int quantity,
                              UUID publicId) {

  public static RestProductCart from(ProductCart productCart) {
    return RestProductCart.builder()
      .name(productCart.getName().value())
      .price(productCart.getPrice().value())
      .brand(productCart.getBrand().value())
      .picture(RestPicture.fromDomain(productCart.getPicture()))
      .publicId(productCart.getPublicId().value())
      .build();
  }

  public static List<RestProductCart> from(List<ProductCart> productCarts) {
    return productCarts.stream().map(RestProductCart::from).toList();
  }

}
