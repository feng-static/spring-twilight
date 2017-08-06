package com.perist.mapper;

import com.perist.model.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author perist
 * @date 2017/8/6
 * @time 18:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class StockMapperTests {

    @Resource
    private StockMapper mapper;

    @Test
    public void test() {

        Stock stock = mapper.findOneByStatus();
        //do something
        int matchedRows = 0;
        do {
            matchedRows = mapper.update(stock);
        } while (matchedRows == 0);


    }
}
