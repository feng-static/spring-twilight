package com.perist.mapper;

import com.perist.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品存储类
 *
 * @author prist
 */
@Repository
public interface ProductMapper {

    /**
     * 根据Id获取商品信息
     *
     * @return 商品返回实体
     */
    List<Product> list();
}
