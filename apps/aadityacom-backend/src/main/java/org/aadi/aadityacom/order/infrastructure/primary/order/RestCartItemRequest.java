package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.order.domain.order.aggregate.DetailCartItemRequest;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record RestCartItemRequest(UUID publicId, long quantity) {

  public static DetailCartItemRequest to(RestCartItemRequest item) {
    return DetailCartItemRequest.builder()
      .productId(new PublicId(item.publicId()))
      .quantity(item.quantity())
      .build();
  }

  public static RestCartItemRequest from(DetailCartItemRequest detailCartItemRequest) {
    return RestCartItemRequest.builder()
      .publicId(detailCartItemRequest.productId().value())
      .quantity(detailCartItemRequest.quantity())
      .build();
  }

  public static List<DetailCartItemRequest> to(List<RestCartItemRequest> items) {
    return items.stream().map(RestCartItemRequest::to).toList();
  }

  public static List<RestCartItemRequest> from(List<DetailCartItemRequest> items) {
    return items.stream().map(RestCartItemRequest::from).toList();
  }
}
