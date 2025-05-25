package org.aadi.aadityacom.product.domain.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;

import java.util.UUID;

public record PublicId(UUID value) {

  public PublicId {
    Assert.notNull("value", value);
  }
}
