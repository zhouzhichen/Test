package com.iot.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonAdressIsNull() {
            addCriterion("person_adress is null");
            return (Criteria) this;
        }

        public Criteria andPersonAdressIsNotNull() {
            addCriterion("person_adress is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAdressEqualTo(String value) {
            addCriterion("person_adress =", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressNotEqualTo(String value) {
            addCriterion("person_adress <>", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressGreaterThan(String value) {
            addCriterion("person_adress >", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressGreaterThanOrEqualTo(String value) {
            addCriterion("person_adress >=", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressLessThan(String value) {
            addCriterion("person_adress <", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressLessThanOrEqualTo(String value) {
            addCriterion("person_adress <=", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressLike(String value) {
            addCriterion("person_adress like", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressNotLike(String value) {
            addCriterion("person_adress not like", value, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressIn(List<String> values) {
            addCriterion("person_adress in", values, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressNotIn(List<String> values) {
            addCriterion("person_adress not in", values, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressBetween(String value1, String value2) {
            addCriterion("person_adress between", value1, value2, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonAdressNotBetween(String value1, String value2) {
            addCriterion("person_adress not between", value1, value2, "personAdress");
            return (Criteria) this;
        }

        public Criteria andPersonTelIsNull() {
            addCriterion("person_tel is null");
            return (Criteria) this;
        }

        public Criteria andPersonTelIsNotNull() {
            addCriterion("person_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTelEqualTo(String value) {
            addCriterion("person_tel =", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelNotEqualTo(String value) {
            addCriterion("person_tel <>", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelGreaterThan(String value) {
            addCriterion("person_tel >", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelGreaterThanOrEqualTo(String value) {
            addCriterion("person_tel >=", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelLessThan(String value) {
            addCriterion("person_tel <", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelLessThanOrEqualTo(String value) {
            addCriterion("person_tel <=", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelLike(String value) {
            addCriterion("person_tel like", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelNotLike(String value) {
            addCriterion("person_tel not like", value, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelIn(List<String> values) {
            addCriterion("person_tel in", values, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelNotIn(List<String> values) {
            addCriterion("person_tel not in", values, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelBetween(String value1, String value2) {
            addCriterion("person_tel between", value1, value2, "personTel");
            return (Criteria) this;
        }

        public Criteria andPersonTelNotBetween(String value1, String value2) {
            addCriterion("person_tel not between", value1, value2, "personTel");
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