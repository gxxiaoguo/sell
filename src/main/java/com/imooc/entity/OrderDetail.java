package com.imooc.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 订单详情表
 * @author guo
 * @date 2020-10-23 18:19
 */

@Entity
@Data
public class OrderDetail {

    /**
     *
     */
    @Id
    private String detailId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;
}
