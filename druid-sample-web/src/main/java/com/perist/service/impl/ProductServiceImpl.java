package com.perist.service.impl;

import com.perist.model.Product;
import com.perist.mapper.ProductMapper;
import com.perist.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author prist
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.list();
    }
}
