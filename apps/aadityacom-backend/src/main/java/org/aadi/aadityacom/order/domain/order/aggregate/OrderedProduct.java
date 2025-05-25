package org.aadi.aadityacom.order.domain.order.aggregate;

import lombok.Builder;
import lombok.Getter;
import org.aadi.aadityacom.order.domain.order.vo.OrderPrice;
import org.aadi.aadityacom.order.domain.order.vo.OrderQuantity;
import org.aadi.aadityacom.order.domain.order.vo.ProductPublicId;
import org.aadi.aadityacom.product.domain.aggregate.Product;
import org.aadi.aadityacom.product.domain.vo.ProductName;


@Getter
@Builder
public class OrderedProduct {

  private final ProductPublicId productPublicId;

  private final OrderPrice price;

  private final OrderQuantity quantity;

  private final ProductName productName;

  public OrderedProduct(ProductPublicId productPublicId, OrderPrice price, OrderQuantity quantity, ProductName productName) {
    this.productPublicId = productPublicId;
    this.price = price;
    this.quantity = quantity;
    this.productName = productName;
  }

  public static OrderedProduct create(long quantity, Product product) {
    return OrderedProduct.builder()
      .price(new OrderPrice(product.getPrice().value()))
      .quantity(new OrderQuantity(quantity))
      .productName(product.getName())
      .productPublicId(new ProductPublicId(product.getPublicId().value()))
      .build();
  }

}
