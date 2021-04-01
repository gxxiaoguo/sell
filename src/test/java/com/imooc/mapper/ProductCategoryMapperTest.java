package com.imooc.mapper;

import com.imooc.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


/**
 * @author guo
 * @date 2020-10-17 16:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void findOneTest() {
        ProductCategory productCategory =  productCategoryMapper.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional // 数据不会更新到数据库，只会测试是否成功
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        productCategoryMapper.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = productCategoryMapper.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}