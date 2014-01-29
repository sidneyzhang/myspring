package com.sidney.myspring.repository.ibatis;

import java.math.BigDecimal;

public class SProduct {
    private Integer id;

    private String name;

    private String shortDesc;

    private Integer longtextId;

    private Integer imageId;

    private BigDecimal suggestedWhlslPrice;

    private String whlslUnits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public Integer getLongtextId() {
        return longtextId;
    }

    public void setLongtextId(Integer longtextId) {
        this.longtextId = longtextId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public BigDecimal getSuggestedWhlslPrice() {
        return suggestedWhlslPrice;
    }

    public void setSuggestedWhlslPrice(BigDecimal suggestedWhlslPrice) {
        this.suggestedWhlslPrice = suggestedWhlslPrice;
    }

    public String getWhlslUnits() {
        return whlslUnits;
    }

    public void setWhlslUnits(String whlslUnits) {
        this.whlslUnits = whlslUnits;
    }
}