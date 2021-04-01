package com.imooc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author guo
 * @date 2020-10-18 10:26
 */

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 商品描述信息
     */
    private String productDescription;

    /**
     * 小图
     * 链接地址
     */
    private String productIcon;

    /**
     * 状态
     * 0 正常
     * 1 下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;
}
