package com.imooc.mapper;

import com.imooc.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author guo
 * @date 2020-10-18 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoMapperTest {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(4.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoMapper.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = productInfoMapper.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}