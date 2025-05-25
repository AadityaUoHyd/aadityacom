package org.aadi.aadityacom.product.domain.aggregate;

import lombok.Builder;
import org.aadi.aadityacom.shared.error.domain.Assert;


@Builder
public record Picture(byte[] file, String mimeType) {

  public Picture {
    Assert.notNull("file", file);
    Assert.notNull("mimeType", mimeType);
  }
}
