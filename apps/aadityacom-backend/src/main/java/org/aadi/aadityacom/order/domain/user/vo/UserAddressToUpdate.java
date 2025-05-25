package org.aadi.aadityacom.order.domain.user.vo;

import org.aadi.aadityacom.shared.error.domain.Assert;
import lombok.Builder;

@Builder
public record UserAddressToUpdate(UserPublicId userPublicId, UserAddress userAddress) {

  public UserAddressToUpdate {
    Assert.notNull("value", userPublicId);
    Assert.notNull("value", userAddress);
  }
}
