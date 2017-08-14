package com.perist.service.impl;

import com.perist.mapper.ProductMapper;
import com.perist.model.Product;
import com.perist.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author prist
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductMapper productMapper;

    @Resource
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> list() {
        return productMapper.list();
    }
}
