package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.order.domain.order.aggregate.Order;
import org.aadi.aadityacom.order.domain.order.vo.OrderStatus;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record RestOrderRead(UUID publicId,
                            OrderStatus status,
                            List<RestOrderedItemRead> orderedItems) {

  public static RestOrderRead from(Order order) {
    return RestOrderRead.builder()
      .publicId(order.getPublicId().value())
      .status(order.getStatus())
      .orderedItems(RestOrderedItemRead.from(order.getOrderedProducts()))
      .build();
  }
}
