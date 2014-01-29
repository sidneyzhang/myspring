package com.sidney.myspring.repository.ibatis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SOrdCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer oracleStart;

    private Integer oracleEnd;

    public SOrdCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SOrdCriteria(SOrdCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @param oracleStart 开始记录数
     */
    public void setOracleStart(Integer oracleStart) {
        this.oracleStart = oracleStart;
    }

    public Integer getOracleStart() {
        return oracleStart;
    }

    /**
     * @param oracleEnd 结束记录数
     */
    public void setOracleEnd(Integer oracleEnd) {
        this.oracleEnd = oracleEnd;
    }

    public Integer getOracleEnd() {
        return oracleEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public void setCriteriaWithoutValue(List<String> criteriaWithoutValue) {
            this.criteriaWithoutValue = criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public void setCriteriaWithSingleValue(List<Map<String, Object>> criteriaWithSingleValue) {
            this.criteriaWithSingleValue = criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public void setCriteriaWithListValue(List<Map<String, Object>> criteriaWithListValue) {
            this.criteriaWithListValue = criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        public void setCriteriaWithBetweenValue(List<Map<String, Object>> criteriaWithBetweenValue) {
            this.criteriaWithBetweenValue = criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andDateOrderedIsNull() {
            addCriterion("DATE_ORDERED is null");
            return (Criteria) this;
        }

        public Criteria andDateOrderedIsNotNull() {
            addCriterion("DATE_ORDERED is not null");
            return (Criteria) this;
        }

        public Criteria andDateOrderedEqualTo(Date value) {
            addCriterion("DATE_ORDERED =", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotEqualTo(Date value) {
            addCriterion("DATE_ORDERED <>", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedGreaterThan(Date value) {
            addCriterion("DATE_ORDERED >", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_ORDERED >=", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedLessThan(Date value) {
            addCriterion("DATE_ORDERED <", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_ORDERED <=", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedIn(List<Date> values) {
            addCriterion("DATE_ORDERED in", values, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotIn(List<Date> values) {
            addCriterion("DATE_ORDERED not in", values, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedBetween(Date value1, Date value2) {
            addCriterion("DATE_ORDERED between", value1, value2, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_ORDERED not between", value1, value2, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateShippedIsNull() {
            addCriterion("DATE_SHIPPED is null");
            return (Criteria) this;
        }

        public Criteria andDateShippedIsNotNull() {
            addCriterion("DATE_SHIPPED is not null");
            return (Criteria) this;
        }

        public Criteria andDateShippedEqualTo(Date value) {
            addCriterion("DATE_SHIPPED =", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedNotEqualTo(Date value) {
            addCriterion("DATE_SHIPPED <>", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedGreaterThan(Date value) {
            addCriterion("DATE_SHIPPED >", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_SHIPPED >=", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedLessThan(Date value) {
            addCriterion("DATE_SHIPPED <", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_SHIPPED <=", value, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedIn(List<Date> values) {
            addCriterion("DATE_SHIPPED in", values, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedNotIn(List<Date> values) {
            addCriterion("DATE_SHIPPED not in", values, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedBetween(Date value1, Date value2) {
            addCriterion("DATE_SHIPPED between", value1, value2, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andDateShippedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_SHIPPED not between", value1, value2, "dateShipped");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdIsNull() {
            addCriterion("SALES_REP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdIsNotNull() {
            addCriterion("SALES_REP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdEqualTo(Integer value) {
            addCriterion("SALES_REP_ID =", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdNotEqualTo(Integer value) {
            addCriterion("SALES_REP_ID <>", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdGreaterThan(Integer value) {
            addCriterion("SALES_REP_ID >", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALES_REP_ID >=", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdLessThan(Integer value) {
            addCriterion("SALES_REP_ID <", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdLessThanOrEqualTo(Integer value) {
            addCriterion("SALES_REP_ID <=", value, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdIn(List<Integer> values) {
            addCriterion("SALES_REP_ID in", values, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdNotIn(List<Integer> values) {
            addCriterion("SALES_REP_ID not in", values, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdBetween(Integer value1, Integer value2) {
            addCriterion("SALES_REP_ID between", value1, value2, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andSalesRepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SALES_REP_ID not between", value1, value2, "salesRepId");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andOrderFilledIsNull() {
            addCriterion("ORDER_FILLED is null");
            return (Criteria) this;
        }

        public Criteria andOrderFilledIsNotNull() {
            addCriterion("ORDER_FILLED is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFilledEqualTo(String value) {
            addCriterion("ORDER_FILLED =", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledNotEqualTo(String value) {
            addCriterion("ORDER_FILLED <>", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledGreaterThan(String value) {
            addCriterion("ORDER_FILLED >", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_FILLED >=", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledLessThan(String value) {
            addCriterion("ORDER_FILLED <", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledLessThanOrEqualTo(String value) {
            addCriterion("ORDER_FILLED <=", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledLike(String value) {
            addCriterion("ORDER_FILLED like", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledNotLike(String value) {
            addCriterion("ORDER_FILLED not like", value, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledIn(List<String> values) {
            addCriterion("ORDER_FILLED in", values, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledNotIn(List<String> values) {
            addCriterion("ORDER_FILLED not in", values, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledBetween(String value1, String value2) {
            addCriterion("ORDER_FILLED between", value1, value2, "orderFilled");
            return (Criteria) this;
        }

        public Criteria andOrderFilledNotBetween(String value1, String value2) {
            addCriterion("ORDER_FILLED not between", value1, value2, "orderFilled");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andPaymentTypeLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_TYPE) like", value.toUpperCase(), "paymentType");
            return this;
        }

        public Criteria andOrderFilledLikeInsensitive(String value) {
            addCriterion("upper(ORDER_FILLED) like", value.toUpperCase(), "orderFilled");
            return this;
        }
    }
}