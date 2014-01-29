package com.sidney.myspring.repository.ibatis;

import java.util.Date;

public class SInventory extends SInventoryKey {
    private Integer amountInStock;

    private Integer reorderPoint;

    private Integer maxInStock;

    private String outOfStockExplanation;

    private Date restockDate;

    public Integer getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Integer amountInStock) {
        this.amountInStock = amountInStock;
    }

    public Integer getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(Integer reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public Integer getMaxInStock() {
        return maxInStock;
    }

    public void setMaxInStock(Integer maxInStock) {
        this.maxInStock = maxInStock;
    }

    public String getOutOfStockExplanation() {
        return outOfStockExplanation;
    }

    public void setOutOfStockExplanation(String outOfStockExplanation) {
        this.outOfStockExplanation = outOfStockExplanation;
    }

    public Date getRestockDate() {
        return restockDate;
    }

    public void setRestockDate(Date restockDate) {
        this.restockDate = restockDate;
    }
}