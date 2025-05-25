package org.aadi.aadityacom.product.domain.aggregate;

import lombok.Getter;
import lombok.Setter;
import org.aadi.aadityacom.product.domain.vo.CategoryName;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import org.aadi.aadityacom.shared.error.domain.Assert;
import lombok.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@Getter
@Builder
@Setter
public class Category {


  private static final Logger log = LoggerFactory.getLogger(Category.class);
  private final CategoryName name;

  private Long dbId;
  private PublicId publicId;


  public Category(CategoryName name, Long dbId, PublicId publicId) {
    assertMandatoryFields(name);
    this.name = name;
    this.dbId = dbId;
    this.publicId = publicId;

  }

  private void assertMandatoryFields(CategoryName categoryName) {
    Assert.notNull("name", categoryName);

  }

  public void initDefaultFields() {
    this.publicId = new PublicId(UUID.randomUUID());
  }
}
