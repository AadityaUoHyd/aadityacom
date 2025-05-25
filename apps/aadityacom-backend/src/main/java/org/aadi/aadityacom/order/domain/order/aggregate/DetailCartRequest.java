package org.aadi.aadityacom.order.domain.order.aggregate;

import lombok.Builder;

import java.util.List;

@Builder
public record DetailCartRequest(List<DetailCartItemRequest> items) {
}
