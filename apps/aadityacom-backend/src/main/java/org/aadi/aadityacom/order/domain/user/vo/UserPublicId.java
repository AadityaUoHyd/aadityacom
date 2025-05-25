package org.aadi.aadityacom.order.domain.user.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {
    Assert.notNull("value", value);
  }
}
