package org.aadi.aadityacom.product.domain.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record CategoryName(String value) {
  public CategoryName {
    Assert.field("value", value).notNull().minLength(3);
  }
}
