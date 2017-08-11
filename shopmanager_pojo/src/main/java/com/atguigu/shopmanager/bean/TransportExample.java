package com.atguigu.shopmanager.bean;

import java.util.ArrayList;
import java.util.List;

public class TransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransportExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransportLineIsNull() {
            addCriterion("transport_line is null");
            return (Criteria) this;
        }

        public Criteria andTransportLineIsNotNull() {
            addCriterion("transport_line is not null");
            return (Criteria) this;
        }

        public Criteria andTransportLineEqualTo(String value) {
            addCriterion("transport_line =", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineNotEqualTo(String value) {
            addCriterion("transport_line <>", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineGreaterThan(String value) {
            addCriterion("transport_line >", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineGreaterThanOrEqualTo(String value) {
            addCriterion("transport_line >=", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineLessThan(String value) {
            addCriterion("transport_line <", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineLessThanOrEqualTo(String value) {
            addCriterion("transport_line <=", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineLike(String value) {
            addCriterion("transport_line like", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineNotLike(String value) {
            addCriterion("transport_line not like", value, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineIn(List<String> values) {
            addCriterion("transport_line in", values, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineNotIn(List<String> values) {
            addCriterion("transport_line not in", values, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineBetween(String value1, String value2) {
            addCriterion("transport_line between", value1, value2, "transportLine");
            return (Criteria) this;
        }

        public Criteria andTransportLineNotBetween(String value1, String value2) {
            addCriterion("transport_line not between", value1, value2, "transportLine");
            return (Criteria) this;
        }

        public Criteria andShelfNumberIsNull() {
            addCriterion("shelf_number is null");
            return (Criteria) this;
        }

        public Criteria andShelfNumberIsNotNull() {
            addCriterion("shelf_number is not null");
            return (Criteria) this;
        }

        public Criteria andShelfNumberEqualTo(String value) {
            addCriterion("shelf_number =", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberNotEqualTo(String value) {
            addCriterion("shelf_number <>", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberGreaterThan(String value) {
            addCriterion("shelf_number >", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_number >=", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberLessThan(String value) {
            addCriterion("shelf_number <", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberLessThanOrEqualTo(String value) {
            addCriterion("shelf_number <=", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberLike(String value) {
            addCriterion("shelf_number like", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberNotLike(String value) {
            addCriterion("shelf_number not like", value, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberIn(List<String> values) {
            addCriterion("shelf_number in", values, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberNotIn(List<String> values) {
            addCriterion("shelf_number not in", values, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberBetween(String value1, String value2) {
            addCriterion("shelf_number between", value1, value2, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andShelfNumberNotBetween(String value1, String value2) {
            addCriterion("shelf_number not between", value1, value2, "shelfNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}