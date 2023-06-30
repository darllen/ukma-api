package org.ukma.service.impl;

import org.ukma.dao.ProductDAO;
import org.ukma.model.ProductModel;
import org.ukma.service.ProductService;

import javax.inject.Inject;

public class ProductServiceImpl implements ProductService {

    @Inject
    ProductDAO productDAO;

    @Override
    public void create(ProductModel productModel) {
        this.productDAO.save(productModel);
    }
}
