package org.aadi.aadityacom.order.domain.user.aggregate;

import org.aadi.aadityacom.order.domain.user.vo.AuthorityName;
import org.aadi.aadityacom.shared.error.domain.Assert;
import lombok.Builder;

@Builder
public class Authority {

  private AuthorityName name;

  public Authority(AuthorityName authorityName) {
    Assert.notNull("name", authorityName);
    this.name = authorityName;
  }

  public AuthorityName getName() {
    return name;
  }
}
