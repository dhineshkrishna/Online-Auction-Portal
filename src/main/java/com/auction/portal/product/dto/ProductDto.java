package com.auction.portal.product.dto;

import com.auction.portal.common.dto.CommonDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends CommonDto {

    private String productName;

    private String productImage;

    private String category;
}
