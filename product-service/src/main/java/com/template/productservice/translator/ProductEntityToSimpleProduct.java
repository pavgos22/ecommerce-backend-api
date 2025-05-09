package com.template.productservice.translator;

import com.template.productservice.entity.ProductEntity;
import com.template.productservice.entity.SimpleProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToSimpleProduct {

    public SimpleProductDTO toSimpleProduct(ProductEntity productEntity) {
        return new SimpleProductDTO(
                productEntity.getUid(),
                productEntity.getName(),
                productEntity.getMainDesc(),
                productEntity.getPrice(),
                productEntity.getImageUrls() != null && productEntity.getImageUrls().length > 0 ? productEntity.getImageUrls()[0] : null,
                productEntity.getCreateAt(),
                productEntity.isDiscount(),
                productEntity.getDiscountedPrice(),
                productEntity.getPriority()
        );
    }
}