package com.dgcc.recycle_server.service.impl;

import com.dgcc.recycle_server.mapper.OmsProductDao;
import com.dgcc.recycle_server.pojo.Product;
import com.dgcc.recycle_server.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 81
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Resource
    private OmsProductDao omsProductDao;

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product findOneById(Integer productId) {
        return null;
    }

    @Override
    public List<Product> findProductList(Product product) {
        return null;
    }

}
