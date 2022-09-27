package com.dgcc.recycle_server.mapper;

import com.dgcc.recycle_server.entity.OmsProduct;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
class OmsProductDaoTest {

    @Resource
    OmsProductDao omsProductDao;


    @Test
    public void insertSelective() {
        OmsProduct omsProduct = new OmsProduct();
        omsProduct.setProductName("小米手机").
                setIsHot(1);
        int i = omsProductDao.insertSelective(omsProduct);
        System.out.println(i);
    }

    @Test
    public void select() {
        OmsProduct product = omsProductDao.selectByPrimaryKey(1);
        System.out.println(product);
    }
}