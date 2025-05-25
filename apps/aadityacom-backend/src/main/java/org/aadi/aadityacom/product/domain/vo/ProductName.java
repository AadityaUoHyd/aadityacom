package org.aadi.aadityacom.product.domain.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record ProductName(String value) {

  public ProductName {
    Assert.notNull("value", value);
    Assert.field("value", value).minLength(3).maxLength(256);
  }
}
