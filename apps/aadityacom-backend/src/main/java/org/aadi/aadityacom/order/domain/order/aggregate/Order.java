package org.aadi.aadityacom.order.domain.order.aggregate;

import lombok.Getter;
import lombok.Setter;
import org.aadi.aadityacom.order.domain.order.vo.OrderStatus;
import org.aadi.aadityacom.order.domain.order.vo.StripeSessionId;
import org.aadi.aadityacom.order.domain.user.aggregate.User;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
public class Order {

  private OrderStatus status;

  private User user;

  private String stripeId;

  private PublicId publicId;

  private List<OrderedProduct> orderedProducts;

  public Order(OrderStatus status, User user, String stripeId, PublicId publicId, List<OrderedProduct> orderedProducts) {
    this.status = status;
    this.user = user;
    this.stripeId = stripeId;
    this.publicId = publicId;
    this.orderedProducts = orderedProducts;
  }

  public static Order create(User connectedUser, List<OrderedProduct> orderedProducts,
                             StripeSessionId stripeSessionId) {
    return Order.builder()
      .publicId(new PublicId(UUID.randomUUID()))
      .user(connectedUser)
      .status(OrderStatus.PENDING)
      .orderedProducts(orderedProducts)
      .stripeId(stripeSessionId.value())
      .build();
  }

  public void validatePayment() {
    this.status =  OrderStatus.PAID;
  }
}
