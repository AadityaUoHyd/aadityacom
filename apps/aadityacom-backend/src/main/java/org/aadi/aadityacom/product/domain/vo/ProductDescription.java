package org.aadi.aadityacom.product.domain.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record ProductDescription(String value) {

  public ProductDescription {
    Assert.field("value", value).notNull().minLength(10);
  }
}
