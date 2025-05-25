package org.aadi.aadityacom.order.domain.order.repository;

import org.aadi.aadityacom.order.domain.order.aggregate.Order;
import org.aadi.aadityacom.order.domain.order.aggregate.StripeSessionInformation;
import org.aadi.aadityacom.order.domain.order.vo.OrderStatus;
import org.aadi.aadityacom.order.domain.user.vo.UserPublicId;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderRepository {

  void save(Order order);

  void updateStatusByPublicId(OrderStatus orderStatus, PublicId orderPublicId);

  Optional<Order> findByStripeSessionId(StripeSessionInformation stripeSessionInformation);

  Page<Order> findAllByUserPublicId(UserPublicId userPublicId, Pageable pageable);

  Page<Order> findAll(Pageable pageable);

}
