package com.perist.proto

import spock.lang.Specification

/**
 * @author xiaofengh_1 on 2017/9/6 14:16
 */
class StockOuterClassTest extends Specification {

    void setup() {

    }

    void "build stock byte"() {
        setup:
        StockOuterClass.Stock.Builder builder = StockOuterClass.Stock.newBuilder()
        builder.setId(1)
        builder.setVersion(1)
        builder.setStatus(1)
        builder.setStockName("中国银行")
        StockOuterClass.Stock build = builder.build()
        expect:
        println build
        println StockOuterClass.Stock.parseFrom(build.toByteArray())
        println build.getStockName()
    }
}
