package com.xue.order.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpecialShopingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialShopingExample() {
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

        public Criteria andSpecialidIsNull() {
            addCriterion("SPECIALID is null");
            return (Criteria) this;
        }

        public Criteria andSpecialidIsNotNull() {
            addCriterion("SPECIALID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialidEqualTo(String value) {
            addCriterion("SPECIALID =", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotEqualTo(String value) {
            addCriterion("SPECIALID <>", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidGreaterThan(String value) {
            addCriterion("SPECIALID >", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALID >=", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidLessThan(String value) {
            addCriterion("SPECIALID <", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidLessThanOrEqualTo(String value) {
            addCriterion("SPECIALID <=", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidLike(String value) {
            addCriterion("SPECIALID like", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotLike(String value) {
            addCriterion("SPECIALID not like", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidIn(List<String> values) {
            addCriterion("SPECIALID in", values, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotIn(List<String> values) {
            addCriterion("SPECIALID not in", values, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidBetween(String value1, String value2) {
            addCriterion("SPECIALID between", value1, value2, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotBetween(String value1, String value2) {
            addCriterion("SPECIALID not between", value1, value2, "specialid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("PRICE like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("PRICE not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("TIME like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("TIME not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andKindsidIsNull() {
            addCriterion("KINDSID is null");
            return (Criteria) this;
        }

        public Criteria andKindsidIsNotNull() {
            addCriterion("KINDSID is not null");
            return (Criteria) this;
        }

        public Criteria andKindsidEqualTo(String value) {
            addCriterion("KINDSID =", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidNotEqualTo(String value) {
            addCriterion("KINDSID <>", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidGreaterThan(String value) {
            addCriterion("KINDSID >", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidGreaterThanOrEqualTo(String value) {
            addCriterion("KINDSID >=", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidLessThan(String value) {
            addCriterion("KINDSID <", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidLessThanOrEqualTo(String value) {
            addCriterion("KINDSID <=", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidLike(String value) {
            addCriterion("KINDSID like", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidNotLike(String value) {
            addCriterion("KINDSID not like", value, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidIn(List<String> values) {
            addCriterion("KINDSID in", values, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidNotIn(List<String> values) {
            addCriterion("KINDSID not in", values, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidBetween(String value1, String value2) {
            addCriterion("KINDSID between", value1, value2, "kindsid");
            return (Criteria) this;
        }

        public Criteria andKindsidNotBetween(String value1, String value2) {
            addCriterion("KINDSID not between", value1, value2, "kindsid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNull() {
            addCriterion("ISUSE is null");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNotNull() {
            addCriterion("ISUSE is not null");
            return (Criteria) this;
        }

        public Criteria andIsuseEqualTo(Integer value) {
            addCriterion("ISUSE =", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotEqualTo(Integer value) {
            addCriterion("ISUSE <>", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThan(Integer value) {
            addCriterion("ISUSE >", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISUSE >=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThan(Integer value) {
            addCriterion("ISUSE <", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThanOrEqualTo(Integer value) {
            addCriterion("ISUSE <=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseIn(List<Integer> values) {
            addCriterion("ISUSE in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotIn(List<Integer> values) {
            addCriterion("ISUSE not in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseBetween(Integer value1, Integer value2) {
            addCriterion("ISUSE between", value1, value2, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotBetween(Integer value1, Integer value2) {
            addCriterion("ISUSE not between", value1, value2, "isuse");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("EXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("EXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Integer value) {
            addCriterion("EXPIRE =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Integer value) {
            addCriterion("EXPIRE <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Integer value) {
            addCriterion("EXPIRE >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRE >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Integer value) {
            addCriterion("EXPIRE <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRE <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Integer> values) {
            addCriterion("EXPIRE in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Integer> values) {
            addCriterion("EXPIRE not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRE between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRE not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andShopingnameIsNull() {
            addCriterion("SHOPINGNAME is null");
            return (Criteria) this;
        }

        public Criteria andShopingnameIsNotNull() {
            addCriterion("SHOPINGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopingnameEqualTo(String value) {
            addCriterion("SHOPINGNAME =", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameNotEqualTo(String value) {
            addCriterion("SHOPINGNAME <>", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameGreaterThan(String value) {
            addCriterion("SHOPINGNAME >", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPINGNAME >=", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameLessThan(String value) {
            addCriterion("SHOPINGNAME <", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameLessThanOrEqualTo(String value) {
            addCriterion("SHOPINGNAME <=", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameLike(String value) {
            addCriterion("SHOPINGNAME like", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameNotLike(String value) {
            addCriterion("SHOPINGNAME not like", value, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameIn(List<String> values) {
            addCriterion("SHOPINGNAME in", values, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameNotIn(List<String> values) {
            addCriterion("SHOPINGNAME not in", values, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameBetween(String value1, String value2) {
            addCriterion("SHOPINGNAME between", value1, value2, "shopingname");
            return (Criteria) this;
        }

        public Criteria andShopingnameNotBetween(String value1, String value2) {
            addCriterion("SHOPINGNAME not between", value1, value2, "shopingname");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKindsparentidIsNull() {
            addCriterion("KINDSPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andKindsparentidIsNotNull() {
            addCriterion("KINDSPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andKindsparentidEqualTo(String value) {
            addCriterion("KINDSPARENTID =", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidNotEqualTo(String value) {
            addCriterion("KINDSPARENTID <>", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidGreaterThan(String value) {
            addCriterion("KINDSPARENTID >", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidGreaterThanOrEqualTo(String value) {
            addCriterion("KINDSPARENTID >=", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidLessThan(String value) {
            addCriterion("KINDSPARENTID <", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidLessThanOrEqualTo(String value) {
            addCriterion("KINDSPARENTID <=", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidLike(String value) {
            addCriterion("KINDSPARENTID like", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidNotLike(String value) {
            addCriterion("KINDSPARENTID not like", value, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidIn(List<String> values) {
            addCriterion("KINDSPARENTID in", values, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidNotIn(List<String> values) {
            addCriterion("KINDSPARENTID not in", values, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidBetween(String value1, String value2) {
            addCriterion("KINDSPARENTID between", value1, value2, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andKindsparentidNotBetween(String value1, String value2) {
            addCriterion("KINDSPARENTID not between", value1, value2, "kindsparentid");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andShopingcodeIsNull() {
            addCriterion("SHOPINGCODE is null");
            return (Criteria) this;
        }

        public Criteria andShopingcodeIsNotNull() {
            addCriterion("SHOPINGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andShopingcodeEqualTo(String value) {
            addCriterion("SHOPINGCODE =", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeNotEqualTo(String value) {
            addCriterion("SHOPINGCODE <>", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeGreaterThan(String value) {
            addCriterion("SHOPINGCODE >", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPINGCODE >=", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeLessThan(String value) {
            addCriterion("SHOPINGCODE <", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeLessThanOrEqualTo(String value) {
            addCriterion("SHOPINGCODE <=", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeLike(String value) {
            addCriterion("SHOPINGCODE like", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeNotLike(String value) {
            addCriterion("SHOPINGCODE not like", value, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeIn(List<String> values) {
            addCriterion("SHOPINGCODE in", values, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeNotIn(List<String> values) {
            addCriterion("SHOPINGCODE not in", values, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeBetween(String value1, String value2) {
            addCriterion("SHOPINGCODE between", value1, value2, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andShopingcodeNotBetween(String value1, String value2) {
            addCriterion("SHOPINGCODE not between", value1, value2, "shopingcode");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("VOLUME =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("VOLUME <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("VOLUME >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("VOLUME >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("VOLUME <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("VOLUME <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("VOLUME like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("VOLUME not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("VOLUME in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("VOLUME not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("VOLUME between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("VOLUME not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("SPECIFICATIONS is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("SPECIFICATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("SPECIFICATIONS =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("SPECIFICATIONS <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("SPECIFICATIONS >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATIONS >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("SPECIFICATIONS <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATIONS <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("SPECIFICATIONS like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("SPECIFICATIONS not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("SPECIFICATIONS in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("SPECIFICATIONS not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("SPECIFICATIONS between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATIONS not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andFlavorIsNull() {
            addCriterion("FLAVOR is null");
            return (Criteria) this;
        }

        public Criteria andFlavorIsNotNull() {
            addCriterion("FLAVOR is not null");
            return (Criteria) this;
        }

        public Criteria andFlavorEqualTo(String value) {
            addCriterion("FLAVOR =", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotEqualTo(String value) {
            addCriterion("FLAVOR <>", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorGreaterThan(String value) {
            addCriterion("FLAVOR >", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorGreaterThanOrEqualTo(String value) {
            addCriterion("FLAVOR >=", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorLessThan(String value) {
            addCriterion("FLAVOR <", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorLessThanOrEqualTo(String value) {
            addCriterion("FLAVOR <=", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorLike(String value) {
            addCriterion("FLAVOR like", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotLike(String value) {
            addCriterion("FLAVOR not like", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorIn(List<String> values) {
            addCriterion("FLAVOR in", values, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotIn(List<String> values) {
            addCriterion("FLAVOR not in", values, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorBetween(String value1, String value2) {
            addCriterion("FLAVOR between", value1, value2, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotBetween(String value1, String value2) {
            addCriterion("FLAVOR not between", value1, value2, "flavor");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("IMGURL is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("IMGURL is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("IMGURL =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("IMGURL <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("IMGURL >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("IMGURL <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("IMGURL <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("IMGURL like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("IMGURL not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("IMGURL in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("IMGURL not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("IMGURL between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("IMGURL not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNull() {
            addCriterion("ORIGINALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNotNull() {
            addCriterion("ORIGINALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceEqualTo(Integer value) {
            addCriterion("ORIGINALPRICE =", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotEqualTo(Integer value) {
            addCriterion("ORIGINALPRICE <>", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThan(Integer value) {
            addCriterion("ORIGINALPRICE >", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORIGINALPRICE >=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThan(Integer value) {
            addCriterion("ORIGINALPRICE <", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThanOrEqualTo(Integer value) {
            addCriterion("ORIGINALPRICE <=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIn(List<Integer> values) {
            addCriterion("ORIGINALPRICE in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotIn(List<Integer> values) {
            addCriterion("ORIGINALPRICE not in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINALPRICE between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINALPRICE not between", value1, value2, "originalprice");
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