package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * @author guo
 * @date 2020-10-19 22:11
 */

@Data
public class ProductVO {

    /*
    @JsonProperty注解的作用是把该属性的名称序列化为另外的名称
     */
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
