package com.perist.service;

import com.perist.model.Product;

import java.util.List;

/**
 */
public interface ProductService {
    List<Product> list();

    void elasticSearch();
}
