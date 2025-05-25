package org.aadi.aadityacom.order.domain.order.aggregate;

import lombok.Builder;
import org.aadi.aadityacom.order.domain.order.vo.OrderQuantity;
import org.aadi.aadityacom.order.domain.order.vo.ProductPublicId;


@Builder
public record OrderProductQuantity(OrderQuantity quantity, ProductPublicId productPublicId) {
}
