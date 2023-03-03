package org.ukma.service;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.ukma.dao.ProductDAO;;

import javax.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ProductService implements PanacheRepository<ProductDAO> {
    private static final Map<Long, ProductDAO> products = new HashMap<>();

    public ProductDAO addProduct(ProductDAO product){
        Long id = products.keySet().size() + 1L;
        product.setId(id);

        products.put(id, product);
        return product;
    }

    public List<ProductDAO> getAll(){
        return new ArrayList<>(products.values());
    }





}
