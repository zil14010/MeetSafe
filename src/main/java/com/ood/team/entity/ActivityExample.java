package com.ood.team.entity;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("ActivityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ActivityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("ActivityId =", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("ActivityId <>", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("ActivityId >", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityId >=", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("ActivityId <", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityId <=", value, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("ActivityId in", values, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("ActivityId not in", values, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("ActivityId between", value1, value2, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityId not between", value1, value2, "ActivityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("ActivityName is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ActivityName is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ActivityName =", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ActivityName <>", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ActivityName >", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ActivityName >=", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ActivityName <", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ActivityName <=", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ActivityName like", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ActivityName not like", value, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("ActivityName in", values, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("ActivityName not in", values, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ActivityName between", value1, value2, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ActivityName not between", value1, value2, "ActivityName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("CategoryId =", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("CategoryId <>", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("CategoryId >", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryId >=", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("CategoryId <", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryId <=", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("CategoryId in", values, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("CategoryId not in", values, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId between", value1, value2, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId not between", value1, value2, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCurPeopleIsNull() {
            addCriterion("CurPeople is null");
            return (Criteria) this;
        }

        public Criteria andCurPeopleIsNotNull() {
            addCriterion("CurPeople is not null");
            return (Criteria) this;
        }

        public Criteria andCurPeopleEqualTo(Integer value) {
            addCriterion("CurPeople =", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleNotEqualTo(Integer value) {
            addCriterion("CurPeople <>", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleGreaterThan(Integer value) {
            addCriterion("CurPeople >", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurPeople >=", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleLessThan(Integer value) {
            addCriterion("CurPeople <", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("CurPeople <=", value, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleIn(List<Integer> values) {
            addCriterion("CurPeople in", values, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleNotIn(List<Integer> values) {
            addCriterion("CurPeople not in", values, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleBetween(Integer value1, Integer value2) {
            addCriterion("CurPeople between", value1, value2, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andCurPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("CurPeople not between", value1, value2, "CurPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIsNull() {
            addCriterion("MaxPeople is null");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIsNotNull() {
            addCriterion("MaxPeople is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleEqualTo(Integer value) {
            addCriterion("MaxPeople =", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotEqualTo(Integer value) {
            addCriterion("MaxPeople <>", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleGreaterThan(Integer value) {
            addCriterion("MaxPeople >", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxPeople >=", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleLessThan(Integer value) {
            addCriterion("MaxPeople <", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("MaxPeople <=", value, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIn(List<Integer> values) {
            addCriterion("MaxPeople in", values, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotIn(List<Integer> values) {
            addCriterion("MaxPeople not in", values, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleBetween(Integer value1, Integer value2) {
            addCriterion("MaxPeople between", value1, value2, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxPeople not between", value1, value2, "MaxPeople");
            return (Criteria) this;
        }

        public Criteria andopenStatusIsNull() {
            addCriterion("openStatus is null");
            return (Criteria) this;
        }

        public Criteria andopenStatusIsNotNull() {
            addCriterion("openStatus is not null");
            return (Criteria) this;
        }

        public Criteria andopenStatusEqualTo(Integer value) {
            addCriterion("openStatus =", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusNotEqualTo(Integer value) {
            addCriterion("openStatus <>", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusGreaterThan(Integer value) {
            addCriterion("openStatus >", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("openStatus >=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusLessThan(Integer value) {
            addCriterion("openStatus <", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusLessThanOrEqualTo(Integer value) {
            addCriterion("openStatus <=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusIn(List<Integer> values) {
            addCriterion("openStatus in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusNotIn(List<Integer> values) {
            addCriterion("openStatus not in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusBetween(Integer value1, Integer value2) {
            addCriterion("openStatus between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andopenStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("openStatus not between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andactDateIsNull() {
            addCriterion("actDate is null");
            return (Criteria) this;
        }

        public Criteria andactDateIsNotNull() {
            addCriterion("actDate is not null");
            return (Criteria) this;
        }

        public Criteria andactDateEqualTo(String value) {
            addCriterion("actDate =", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateNotEqualTo(String value) {
            addCriterion("actDate <>", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateGreaterThan(String value) {
            addCriterion("actDate >", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateGreaterThanOrEqualTo(String value) {
            addCriterion("actDate >=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateLessThan(String value) {
            addCriterion("actDate <", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateLessThanOrEqualTo(String value) {
            addCriterion("actDate <=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateIn(List<String> values) {
            addCriterion("actDate in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateNotIn(List<String> values) {
            addCriterion("actDate not in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateBetween(String value1, String value2) {
            addCriterion("actDate between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andactDateNotBetween(String value1, String value2) {
            addCriterion("actDate not between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdIsNull() {
            addCriterion("actPlaceId is null");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdIsNotNull() {
            addCriterion("actPlaceId is not null");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdEqualTo(Integer value) {
            addCriterion("actPlaceId =", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdNotEqualTo(Integer value) {
            addCriterion("actPlaceId <>", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdGreaterThan(Integer value) {
            addCriterion("actPlaceId >", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actPlaceId >=", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdLessThan(Integer value) {
            addCriterion("actPlaceId <", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("actPlaceId <=", value, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdIn(List<Integer> values) {
            addCriterion("actPlaceId in", values, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdNotIn(List<Integer> values) {
            addCriterion("actPlaceId not in", values, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdBetween(Integer value1, Integer value2) {
            addCriterion("actPlaceId between", value1, value2, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andactPlaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actPlaceId not between", value1, value2, "actPlaceId");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNull() {
            addCriterion("PlaceName is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("PlaceName is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("PlaceName =", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("PlaceName <>", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("PlaceName >", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PlaceName >=", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("PlaceName <", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("PlaceName <=", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("PlaceName like", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("PlaceName not like", value, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("PlaceName in", values, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("PlaceName not in", values, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("PlaceName between", value1, value2, "PlaceName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("PlaceName not between", value1, value2, "PlaceName");
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