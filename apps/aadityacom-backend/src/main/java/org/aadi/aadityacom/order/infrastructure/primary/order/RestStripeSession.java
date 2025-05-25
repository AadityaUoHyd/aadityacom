package org.aadi.aadityacom.order.infrastructure.primary.order;

import org.aadi.aadityacom.order.domain.order.vo.StripeSessionId;
import lombok.Builder;

@Builder
public record RestStripeSession(String id) {


  public static RestStripeSession from(StripeSessionId stripeSessionId) {
    return RestStripeSession.builder()
      .id(stripeSessionId.value())
      .build();
  }
}
