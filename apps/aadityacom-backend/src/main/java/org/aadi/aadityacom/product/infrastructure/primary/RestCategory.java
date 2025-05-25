package org.aadi.aadityacom.product.infrastructure.primary;

import org.aadi.aadityacom.product.domain.aggregate.Category;
import org.aadi.aadityacom.product.domain.vo.CategoryName;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import org.aadi.aadityacom.shared.error.domain.Assert;
import lombok.Builder;

import java.util.UUID;

@Builder
public record RestCategory(UUID publicId,
                           String name) {

  public RestCategory {
    Assert.notNull("name", name);
  }

  public static Category toDomain(RestCategory restCategory) {
    Category.CategoryBuilder categoryBuilder = Category.builder();

    if (restCategory.name() != null) {
      categoryBuilder.name(new CategoryName(restCategory.name()));
    }

    if (restCategory.publicId() != null) {
      categoryBuilder.publicId(new PublicId(restCategory.publicId()));
    }

    return categoryBuilder.build();
  }


  public static RestCategory fromDomain(Category category) {
    RestCategoryBuilder restCategoryBuilder = RestCategory.builder();

    if (category.getName() != null) {
      restCategoryBuilder.name(category.getName().value());
    }

    if (category.getPublicId() != null) {
      restCategoryBuilder.publicId(category.getPublicId().value());
    }

    return restCategoryBuilder.build();
  }

}
