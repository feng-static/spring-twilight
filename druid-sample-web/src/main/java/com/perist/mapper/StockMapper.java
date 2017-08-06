package com.perist.mapper;

import com.perist.model.Stock;
import org.springframework.stereotype.Repository;

/**
 * @author perist
 * @date 2017/8/6
 * @time 18:24
 */
@Repository
public interface StockMapper {

    Stock findOneByStatus();

}
