package com.imooc.service;

import com.imooc.dto.CarDTO;
import com.imooc.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @author guo
 * @date 2020-10-18 17:45
 */


public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 管理端查询分页
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void increseStock(List<CarDTO> carDTOList);

    /**
     * 减库存
     */
    void decreaseStock(List<CarDTO> carDTOList);

    /**
     * 上架
     */


    /**
     * 下架
     */


}
