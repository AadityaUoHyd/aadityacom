package org.aadi.aadityacom.order.domain.order.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

import java.util.UUID;

public record ProductPublicId(UUID value) {

  public ProductPublicId {
    Assert.notNull("value", value);
  }
}
