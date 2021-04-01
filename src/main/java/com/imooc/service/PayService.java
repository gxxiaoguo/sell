package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author guo
 * @date 2021-01-17 19:36
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
