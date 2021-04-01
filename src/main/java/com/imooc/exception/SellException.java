package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author guo
 * @date 2020-12-13 10:46
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
