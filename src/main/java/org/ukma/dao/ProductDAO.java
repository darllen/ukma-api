package org.ukma.dao;


import org.ukma.model.ProductModel;
import org.ukma.repository.ProductRepository;

import javax.inject.Inject;

public class ProductDAO {

    @Inject
    ProductRepository productRepository;

    public void save(ProductModel productModel) {
        this.productRepository.persist(productModel);
    }
}

