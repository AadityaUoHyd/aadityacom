package org.aadi.aadityacom.product.domain.aggregate;

import lombok.Getter;
import org.aadi.aadityacom.product.domain.vo.ProductSize;
import org.aadi.aadityacom.product.domain.vo.PublicId;
import lombok.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {

}
