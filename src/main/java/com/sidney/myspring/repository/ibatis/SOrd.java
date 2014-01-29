package com.sidney.myspring.repository.ibatis;

import java.math.BigDecimal;
import java.util.Date;

public class SOrd {
    private Integer id;

    private Integer customerId;

    private Date dateOrdered;

    private Date dateShipped;

    private Integer salesRepId;

    private BigDecimal total;

    private String paymentType;

    private String orderFilled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public Integer getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(Integer salesRepId) {
        this.salesRepId = salesRepId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getOrderFilled() {
        return orderFilled;
    }

    public void setOrderFilled(String orderFilled) {
        this.orderFilled = orderFilled;
    }
}