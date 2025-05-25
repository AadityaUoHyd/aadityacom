package org.aadi.aadityacom.order.domain.order.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record OrderPrice(double value) {

  public OrderPrice {
    Assert.field("value", value).strictlyPositive();
  }
}
