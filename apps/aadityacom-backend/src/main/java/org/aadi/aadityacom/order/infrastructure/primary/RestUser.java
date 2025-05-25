package org.aadi.aadityacom.order.infrastructure.primary;

import org.aadi.aadityacom.order.domain.user.aggregate.User;
import lombok.Builder;

import java.util.Set;
import java.util.UUID;

@Builder
public record RestUser(UUID publicId,
                      String firstName,
                      String lastName,
                      String email,
                      String imageUrl,
                      Set<String> authorities) {

  public static RestUser from(User user) {
    RestUserBuilder restUserBuilder = RestUser.builder();

    if(user.getImageUrl() != null) {
      restUserBuilder.imageUrl(user.getImageUrl().value());
    }

    return restUserBuilder
      .email(user.getEmail().value())
      .firstName(user.getFirstname().value())
      .lastName(user.getLastname().value())
      .publicId(user.getUserPublicId().value())
      .authorities(RestAuthority.fromSet(user.getAuthorities()))
      .build();
  }
}
