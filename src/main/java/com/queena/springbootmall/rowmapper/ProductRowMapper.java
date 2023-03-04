package com.queena.springbootmall.rowmapper;


import com.queena.springbootmall.constant.ProductCategory;
import com.queena.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       Product product = new Product();

       product.setProdductId(resultSet.getInt("product_id"));
       product.setProductName(resultSet.getString("product_name"));

       String categoryStr = resultSet.getString("category");
       ProductCategory productCategory = ProductCategory.valueOf(categoryStr);
       product.setCategory(productCategory);
       //以上可以寫為
        // product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));

       product.setImageUrl(resultSet.getString("image_url"));
       product.setPrice(resultSet.getInt("price"));
       product.setStock(resultSet.getInt("stock"));
       product.setDescription(resultSet.getString("description"));
       product.setCreatedDate(resultSet.getTimestamp("created_date"));
       product.setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
