package org.aadi.aadityacom.order.infrastructure.secondary.repository;

import org.aadi.aadityacom.order.infrastructure.secondary.entity.OrderedProductEntity;
import org.aadi.aadityacom.order.infrastructure.secondary.entity.OrderedProductEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
