package com.dgcc.recycle_server.service;

import com.dgcc.recycle_server.pojo.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(Product product);

    Product findOneById(Integer productId);

    List<Product> findProductList(Product product);

}
