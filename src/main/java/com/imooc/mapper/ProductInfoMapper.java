package com.imooc.mapper;

import com.imooc.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author guo
 * @date 2020-10-18 10:33
 */
public interface ProductInfoMapper extends JpaRepository<ProductInfo, String> {
    /**
     * 查询上架的商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
