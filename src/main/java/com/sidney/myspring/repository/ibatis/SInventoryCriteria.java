package com.sidney.myspring.repository.ibatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SInventoryCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer oracleStart;

    private Integer oracleEnd;

    public SInventoryCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SInventoryCriteria(SInventoryCriteria example) {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("WAREHOUSE_ID >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("WAREHOUSE_ID <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("WAREHOUSE_ID in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("WAREHOUSE_ID not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("WAREHOUSE_ID between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WAREHOUSE_ID not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andAmountInStockIsNull() {
            addCriterion("AMOUNT_IN_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andAmountInStockIsNotNull() {
            addCriterion("AMOUNT_IN_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andAmountInStockEqualTo(Integer value) {
            addCriterion("AMOUNT_IN_STOCK =", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockNotEqualTo(Integer value) {
            addCriterion("AMOUNT_IN_STOCK <>", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockGreaterThan(Integer value) {
            addCriterion("AMOUNT_IN_STOCK >", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT_IN_STOCK >=", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockLessThan(Integer value) {
            addCriterion("AMOUNT_IN_STOCK <", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT_IN_STOCK <=", value, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockIn(List<Integer> values) {
            addCriterion("AMOUNT_IN_STOCK in", values, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockNotIn(List<Integer> values) {
            addCriterion("AMOUNT_IN_STOCK not in", values, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT_IN_STOCK between", value1, value2, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andAmountInStockNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT_IN_STOCK not between", value1, value2, "amountInStock");
            return (Criteria) this;
        }

        public Criteria andReorderPointIsNull() {
            addCriterion("REORDER_POINT is null");
            return (Criteria) this;
        }

        public Criteria andReorderPointIsNotNull() {
            addCriterion("REORDER_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andReorderPointEqualTo(Integer value) {
            addCriterion("REORDER_POINT =", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointNotEqualTo(Integer value) {
            addCriterion("REORDER_POINT <>", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointGreaterThan(Integer value) {
            addCriterion("REORDER_POINT >", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("REORDER_POINT >=", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointLessThan(Integer value) {
            addCriterion("REORDER_POINT <", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointLessThanOrEqualTo(Integer value) {
            addCriterion("REORDER_POINT <=", value, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointIn(List<Integer> values) {
            addCriterion("REORDER_POINT in", values, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointNotIn(List<Integer> values) {
            addCriterion("REORDER_POINT not in", values, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointBetween(Integer value1, Integer value2) {
            addCriterion("REORDER_POINT between", value1, value2, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andReorderPointNotBetween(Integer value1, Integer value2) {
            addCriterion("REORDER_POINT not between", value1, value2, "reorderPoint");
            return (Criteria) this;
        }

        public Criteria andMaxInStockIsNull() {
            addCriterion("MAX_IN_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andMaxInStockIsNotNull() {
            addCriterion("MAX_IN_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInStockEqualTo(Integer value) {
            addCriterion("MAX_IN_STOCK =", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockNotEqualTo(Integer value) {
            addCriterion("MAX_IN_STOCK <>", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockGreaterThan(Integer value) {
            addCriterion("MAX_IN_STOCK >", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_IN_STOCK >=", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockLessThan(Integer value) {
            addCriterion("MAX_IN_STOCK <", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_IN_STOCK <=", value, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockIn(List<Integer> values) {
            addCriterion("MAX_IN_STOCK in", values, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockNotIn(List<Integer> values) {
            addCriterion("MAX_IN_STOCK not in", values, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockBetween(Integer value1, Integer value2) {
            addCriterion("MAX_IN_STOCK between", value1, value2, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andMaxInStockNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_IN_STOCK not between", value1, value2, "maxInStock");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationIsNull() {
            addCriterion("OUT_OF_STOCK_EXPLANATION is null");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationIsNotNull() {
            addCriterion("OUT_OF_STOCK_EXPLANATION is not null");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationEqualTo(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION =", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationNotEqualTo(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION <>", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationGreaterThan(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION >", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION >=", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationLessThan(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION <", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationLessThanOrEqualTo(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION <=", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationLike(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION like", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationNotLike(String value) {
            addCriterion("OUT_OF_STOCK_EXPLANATION not like", value, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationIn(List<String> values) {
            addCriterion("OUT_OF_STOCK_EXPLANATION in", values, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationNotIn(List<String> values) {
            addCriterion("OUT_OF_STOCK_EXPLANATION not in", values, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationBetween(String value1, String value2) {
            addCriterion("OUT_OF_STOCK_EXPLANATION between", value1, value2, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andOutOfStockExplanationNotBetween(String value1, String value2) {
            addCriterion("OUT_OF_STOCK_EXPLANATION not between", value1, value2, "outOfStockExplanation");
            return (Criteria) this;
        }

        public Criteria andRestockDateIsNull() {
            addCriterion("RESTOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRestockDateIsNotNull() {
            addCriterion("RESTOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRestockDateEqualTo(Date value) {
            addCriterion("RESTOCK_DATE =", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateNotEqualTo(Date value) {
            addCriterion("RESTOCK_DATE <>", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateGreaterThan(Date value) {
            addCriterion("RESTOCK_DATE >", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RESTOCK_DATE >=", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateLessThan(Date value) {
            addCriterion("RESTOCK_DATE <", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateLessThanOrEqualTo(Date value) {
            addCriterion("RESTOCK_DATE <=", value, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateIn(List<Date> values) {
            addCriterion("RESTOCK_DATE in", values, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateNotIn(List<Date> values) {
            addCriterion("RESTOCK_DATE not in", values, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateBetween(Date value1, Date value2) {
            addCriterion("RESTOCK_DATE between", value1, value2, "restockDate");
            return (Criteria) this;
        }

        public Criteria andRestockDateNotBetween(Date value1, Date value2) {
            addCriterion("RESTOCK_DATE not between", value1, value2, "restockDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andOutOfStockExplanationLikeInsensitive(String value) {
            addCriterion("upper(OUT_OF_STOCK_EXPLANATION) like", value.toUpperCase(), "outOfStockExplanation");
            return this;
        }
    }
}