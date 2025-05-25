package org.aadi.aadityacom.order.domain.order.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record OrderQuantity(long value) {

  public OrderQuantity {
    Assert.field("value", value).positive();

  }
}
