package com.perist.service.impl;

import com.perist.mapper.ProductMapper;
import com.perist.model.Product;
import com.perist.service.ProductService;
import com.perist.test.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author prist
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductMapper productMapper;
//
//    @Resource
//    private ElasticsearchTemplate elasticsearchTemplate;

    @Resource
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> list() {
//        return productMapper.list();
        Test test = new Test();
        test.setProductMapper(productMapper);
        return test.test();
    }

    @Override
    public void elasticSearch() {
//        elasticsearchTemplate.deleteIndex("test-alias-index-2");
//        elasticsearchTemplate.createIndex(AuthorMarkerEntity.class);

    }
}
