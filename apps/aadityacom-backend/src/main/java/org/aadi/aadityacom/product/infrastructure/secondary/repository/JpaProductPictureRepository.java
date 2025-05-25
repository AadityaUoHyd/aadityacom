package org.aadi.aadityacom.product.infrastructure.secondary.repository;

import org.aadi.aadityacom.product.infrastructure.secondary.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductPictureRepository extends JpaRepository<PictureEntity, Long> {
}
