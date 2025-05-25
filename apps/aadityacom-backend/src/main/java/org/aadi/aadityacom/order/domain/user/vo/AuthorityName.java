package org.aadi.aadityacom.order.domain.user.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
