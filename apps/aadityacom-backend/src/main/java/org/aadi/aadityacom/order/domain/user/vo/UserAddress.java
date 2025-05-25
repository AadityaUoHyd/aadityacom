package org.aadi.aadityacom.order.domain.user.vo;

import lombok.Builder;
import org.aadi.aadityacom.shared.error.domain.Assert;

@Builder
public record UserAddress(String street, String city, String zipCode, String country) {

  public UserAddress {
    Assert.field("street", street).notNull();
    Assert.field("city", city).notNull();
    Assert.field("zipCode", zipCode).notNull();
    Assert.field("country", country).notNull();
  }
}
