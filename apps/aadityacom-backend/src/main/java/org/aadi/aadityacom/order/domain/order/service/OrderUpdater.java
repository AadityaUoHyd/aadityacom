package org.aadi.aadityacom.order.domain.order.service;

import org.aadi.aadityacom.order.domain.order.aggregate.Order;
import org.aadi.aadityacom.order.domain.order.aggregate.OrderProductQuantity;
import org.aadi.aadityacom.order.domain.order.aggregate.OrderedProduct;
import org.aadi.aadityacom.order.domain.order.aggregate.StripeSessionInformation;
import org.aadi.aadityacom.order.domain.order.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderUpdater {

  private final OrderRepository orderRepository;

  public OrderUpdater(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public List<OrderedProduct> updateOrderFromStripe(StripeSessionInformation stripeSessionInformation) {
    Order order = orderRepository.findByStripeSessionId(stripeSessionInformation).orElseThrow();
    order.validatePayment();
    orderRepository.updateStatusByPublicId(order.getStatus(), order.getPublicId());
    return order.getOrderedProducts();
  }

  public List<OrderProductQuantity> computeQuantity(List<OrderedProduct> orderedProducts) {
    List<OrderProductQuantity> orderProductQuantities = new ArrayList<>();
    for (OrderedProduct orderedProduct : orderedProducts) {
      OrderProductQuantity orderProductQuantity = OrderProductQuantity.builder()
        .productPublicId(orderedProduct.getProductPublicId())
        .quantity(orderedProduct.getQuantity())
        .build();
      orderProductQuantities.add(orderProductQuantity);
    }
    return orderProductQuantities;
  }
}
