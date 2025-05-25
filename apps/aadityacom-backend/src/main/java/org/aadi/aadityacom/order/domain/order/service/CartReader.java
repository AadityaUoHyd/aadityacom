package org.aadi.aadityacom.order.domain.order.service;

import org.aadi.aadityacom.order.domain.order.aggregate.DetailCartResponse;
import org.aadi.aadityacom.product.domain.aggregate.Product;
import org.aadi.aadityacom.product.domain.aggregate.ProductCart;

import java.util.List;

public class CartReader {

  public CartReader() {
  }

  public DetailCartResponse getDetails(List<Product> products) {
    List<ProductCart> cartProducts = products.stream().map(ProductCart::from).toList();
    return DetailCartResponse.builder().products(cartProducts)
      .build();
  }
}
