package com.imooc.dto;

import lombok.Data;

/**
 * @author guo
 * @date 2020-12-13 11:12
 */

@Data
public class CarDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CarDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
