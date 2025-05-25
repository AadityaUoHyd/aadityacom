package org.aadi.aadityacom.product.domain.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record ProductPrice(double value) {

  public ProductPrice {
    Assert.field("value", value).min(0.1);
  }
}
