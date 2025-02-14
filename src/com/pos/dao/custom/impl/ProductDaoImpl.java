package com.pos.dao.custom.impl;

import com.pos.dao.CrudDao;
import com.pos.dao.CrudUtil;
import com.pos.dao.custom.ProductDao;
import com.pos.entity.Product;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Override
    public boolean create(Product product) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "INSERT INTO product VALUES(?,?,?,?,?,?,?)",
                product.getProductId(),
                product.getProductName(),
                product.getProductDescription(),
                product.getProductPrice(),
                product.getProductQuantity() + 1,  // i want check stock and incremtn 1
                product.getProductQrcode(),
                product.getProductImage()
        );
    }

    @Override
    public boolean update(Product product) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "UPDATE product SET product_name=?, product_description=?, unit_price=?, qr_code=?, product_image=? WHERE product_id=?",
                product.getProductName(),
                product.getProductDescription(),
                product.getProductPrice(),
                product.getProductQrcode(),
                product.getProductImage(),
                product.getProductId()
        );
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Product get(String s) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }
}
