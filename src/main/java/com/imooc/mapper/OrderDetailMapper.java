package com.imooc.mapper;

import com.imooc.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author guo
 * @date 2020-10-23 18:29
 */
public interface OrderDetailMapper extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
