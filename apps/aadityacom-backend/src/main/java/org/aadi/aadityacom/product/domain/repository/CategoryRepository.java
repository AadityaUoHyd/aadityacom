package org.aadi.aadityacom.product.domain.repository;

import org.aadi.aadityacom.product.domain.aggregate.Category;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryRepository {

  Page<Category> findAll(Pageable pageable);

  int delete(PublicId publicId);

  Category save(Category categoryToCreate);

}
