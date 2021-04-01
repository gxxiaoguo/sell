package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author guo
 * @date 2020-12-14 18:39
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
