package com.imooc.enums;

import lombok.Getter;

/**
 * @author guo
 * @date 2020-10-23 18:14
 */

@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
