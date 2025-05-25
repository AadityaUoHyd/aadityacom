package org.aadi.aadityacom.order.domain.order.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

  public StripeSessionId {
    Assert.notNull("value", value);
  }
}
