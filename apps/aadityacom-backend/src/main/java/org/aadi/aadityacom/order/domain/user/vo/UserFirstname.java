package org.aadi.aadityacom.order.domain.user.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}
