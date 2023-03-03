package org.ukma.controller;


import org.ukma.dao.ProductDAO;
import org.ukma.service.ProductService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    ProductService productService;

    @POST
    public ProductDAO createProduct(ProductDAO product){
        return productService.addProduct(product);
    }

    @GET
    @Transactional
    public List<ProductDAO> getAllProducts(){
        return productService.getAll();
    }



}
