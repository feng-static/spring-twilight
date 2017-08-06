package com.perist.model;

import java.io.Serializable;

/**
 * @author perist
 * @date 2017/8/6
 * @time 18:22
 */
public class Stock implements Serializable{

    private static final long serialVersionUID = 4372761696482981964L;

    private Long id;
    private String stockName;
    private Integer status;

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", stockName='" + stockName + '\'' +
                ", status=" + status +
                '}';
    }
}
