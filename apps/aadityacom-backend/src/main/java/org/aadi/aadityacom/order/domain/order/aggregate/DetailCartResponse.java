package org.aadi.aadityacom.order.domain.order.aggregate;

import lombok.Builder;
import org.aadi.aadityacom.product.domain.aggregate.ProductCart;


import java.util.List;

@Builder
public class DetailCartResponse {

  List<ProductCart> products;

  public DetailCartResponse(List<ProductCart> products) {
    this.products = products;
  }

  public List<ProductCart> getProducts() {
    return products;
  }

  public void setProducts(List<ProductCart> products) {
    this.products = products;
  }
}
