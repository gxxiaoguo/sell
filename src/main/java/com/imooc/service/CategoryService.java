package com.imooc.service;

import com.imooc.entity.ProductCategory;

import java.util.List;

/**
 * @author guo
 * @date 2020-10-18 10:01
 */
public interface CategoryService {
    /**
     * 根据类目id查询一个商品
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找所有商品
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 买家端使用这个方法查询
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增和保存
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
