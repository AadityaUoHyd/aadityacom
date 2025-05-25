package org.aadi.aadityacom.order.domain.order.aggregate;

import org.aadi.aadityacom.product.domain.vo.PublicId;
import lombok.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
