package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.order.domain.order.aggregate.DetailCartResponse;
import lombok.Builder;

import java.util.List;

@Builder
public record RestDetailCartResponse(List<RestProductCart> products) {

  public static RestDetailCartResponse from(DetailCartResponse detailCartResponse) {
    return RestDetailCartResponse.builder()
      .products(detailCartResponse.getProducts().stream().map(RestProductCart::from).toList())
      .build();
  }
}
