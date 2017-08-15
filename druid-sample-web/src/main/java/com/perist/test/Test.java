package com.perist.test;

import com.perist.mapper.ProductMapper;
import com.perist.model.Product;

import java.util.List;

/**
 * @author perist
 * @date 2017/6/29
 * @time 23:07
 */
public class Test {

    private ProductMapper productMapper;

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> test() {
        List<Product> list = productMapper.list();
        System.out.println(list);
        return list;
    }

    static {
        System.out.println("something ---");
    }
}
