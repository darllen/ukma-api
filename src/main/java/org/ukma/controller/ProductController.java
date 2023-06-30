package org.ukma.controller;

import org.ukma.model.ProductModel;
import org.ukma.service.ProductService;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

//    @Inject
    ProductService productService;

    @POST
    public Response createProduct(ProductModel product){
        productService.create(product);
        return Response.ok().status(Response.Status.CREATED).build();
    }

//    @GET
//    @Transactional
//    public List<ProductDAO> getAllProducts(){
//        return productService.getAll();
//    }



}
