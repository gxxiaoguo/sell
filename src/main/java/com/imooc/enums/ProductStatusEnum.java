package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author guo
 * @date 2020-10-18 17:52
 */

@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
