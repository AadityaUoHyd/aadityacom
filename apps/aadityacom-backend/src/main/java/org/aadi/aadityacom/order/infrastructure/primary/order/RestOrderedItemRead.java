package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.order.domain.order.aggregate.OrderedProduct;
import lombok.Builder;

import java.util.List;

@Builder
public record RestOrderedItemRead(long quantity,
                                  double price,
                                  String name) {

  public static RestOrderedItemRead from(OrderedProduct orderedProduct) {
    return RestOrderedItemRead.builder()
      .name(orderedProduct.getProductName().value())
      .quantity(orderedProduct.getQuantity().value())
      .price(orderedProduct.getPrice().value())
      .build();
  }

  public static List<RestOrderedItemRead> from(List<OrderedProduct> orderedProducts) {
    return orderedProducts.stream().map(RestOrderedItemRead::from).toList();
  }

}
