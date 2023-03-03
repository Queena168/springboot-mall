package com.queena.springbootmall.dao;

import com.queena.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
