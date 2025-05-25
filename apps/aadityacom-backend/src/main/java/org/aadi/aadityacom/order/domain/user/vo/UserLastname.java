package org.aadi.aadityacom.order.domain.user.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record UserLastname(String value) {

  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
