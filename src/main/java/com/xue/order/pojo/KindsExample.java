package com.xue.order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KindsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KindsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPriceinprovinceIsNull() {
            addCriterion("PRICEINPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceIsNotNull() {
            addCriterion("PRICEINPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceEqualTo(Integer value) {
            addCriterion("PRICEINPROVINCE =", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceNotEqualTo(Integer value) {
            addCriterion("PRICEINPROVINCE <>", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceGreaterThan(Integer value) {
            addCriterion("PRICEINPROVINCE >", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICEINPROVINCE >=", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceLessThan(Integer value) {
            addCriterion("PRICEINPROVINCE <", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICEINPROVINCE <=", value, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceIn(List<Integer> values) {
            addCriterion("PRICEINPROVINCE in", values, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceNotIn(List<Integer> values) {
            addCriterion("PRICEINPROVINCE not in", values, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceBetween(Integer value1, Integer value2) {
            addCriterion("PRICEINPROVINCE between", value1, value2, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceinprovinceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICEINPROVINCE not between", value1, value2, "priceinprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceIsNull() {
            addCriterion("PRICEOUTPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceIsNotNull() {
            addCriterion("PRICEOUTPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceEqualTo(Integer value) {
            addCriterion("PRICEOUTPROVINCE =", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceNotEqualTo(Integer value) {
            addCriterion("PRICEOUTPROVINCE <>", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceGreaterThan(Integer value) {
            addCriterion("PRICEOUTPROVINCE >", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICEOUTPROVINCE >=", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceLessThan(Integer value) {
            addCriterion("PRICEOUTPROVINCE <", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICEOUTPROVINCE <=", value, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceIn(List<Integer> values) {
            addCriterion("PRICEOUTPROVINCE in", values, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceNotIn(List<Integer> values) {
            addCriterion("PRICEOUTPROVINCE not in", values, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceBetween(Integer value1, Integer value2) {
            addCriterion("PRICEOUTPROVINCE between", value1, value2, "priceoutprovince");
            return (Criteria) this;
        }

        public Criteria andPriceoutprovinceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICEOUTPROVINCE not between", value1, value2, "priceoutprovince");
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

        public Criteria andIsapplyaftersaleIsNull() {
            addCriterion("ISAPPLYAFTERSALE is null");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleIsNotNull() {
            addCriterion("ISAPPLYAFTERSALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleEqualTo(Integer value) {
            addCriterion("ISAPPLYAFTERSALE =", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleNotEqualTo(Integer value) {
            addCriterion("ISAPPLYAFTERSALE <>", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleGreaterThan(Integer value) {
            addCriterion("ISAPPLYAFTERSALE >", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISAPPLYAFTERSALE >=", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleLessThan(Integer value) {
            addCriterion("ISAPPLYAFTERSALE <", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleLessThanOrEqualTo(Integer value) {
            addCriterion("ISAPPLYAFTERSALE <=", value, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleIn(List<Integer> values) {
            addCriterion("ISAPPLYAFTERSALE in", values, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleNotIn(List<Integer> values) {
            addCriterion("ISAPPLYAFTERSALE not in", values, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleBetween(Integer value1, Integer value2) {
            addCriterion("ISAPPLYAFTERSALE between", value1, value2, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsapplyaftersaleNotBetween(Integer value1, Integer value2) {
            addCriterion("ISAPPLYAFTERSALE not between", value1, value2, "isapplyaftersale");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferIsNull() {
            addCriterion("ISSPECIALOFFER is null");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferIsNotNull() {
            addCriterion("ISSPECIALOFFER is not null");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferEqualTo(Integer value) {
            addCriterion("ISSPECIALOFFER =", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferNotEqualTo(Integer value) {
            addCriterion("ISSPECIALOFFER <>", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferGreaterThan(Integer value) {
            addCriterion("ISSPECIALOFFER >", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISSPECIALOFFER >=", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferLessThan(Integer value) {
            addCriterion("ISSPECIALOFFER <", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferLessThanOrEqualTo(Integer value) {
            addCriterion("ISSPECIALOFFER <=", value, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferIn(List<Integer> values) {
            addCriterion("ISSPECIALOFFER in", values, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferNotIn(List<Integer> values) {
            addCriterion("ISSPECIALOFFER not in", values, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferBetween(Integer value1, Integer value2) {
            addCriterion("ISSPECIALOFFER between", value1, value2, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andIsspecialofferNotBetween(Integer value1, Integer value2) {
            addCriterion("ISSPECIALOFFER not between", value1, value2, "isspecialoffer");
            return (Criteria) this;
        }

        public Criteria andShopingtotalIsNull() {
            addCriterion("SHOPINGTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andShopingtotalIsNotNull() {
            addCriterion("SHOPINGTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andShopingtotalEqualTo(Long value) {
            addCriterion("SHOPINGTOTAL =", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalNotEqualTo(Long value) {
            addCriterion("SHOPINGTOTAL <>", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalGreaterThan(Long value) {
            addCriterion("SHOPINGTOTAL >", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOPINGTOTAL >=", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalLessThan(Long value) {
            addCriterion("SHOPINGTOTAL <", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalLessThanOrEqualTo(Long value) {
            addCriterion("SHOPINGTOTAL <=", value, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalIn(List<Long> values) {
            addCriterion("SHOPINGTOTAL in", values, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalNotIn(List<Long> values) {
            addCriterion("SHOPINGTOTAL not in", values, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalBetween(Long value1, Long value2) {
            addCriterion("SHOPINGTOTAL between", value1, value2, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingtotalNotBetween(Long value1, Long value2) {
            addCriterion("SHOPINGTOTAL not between", value1, value2, "shopingtotal");
            return (Criteria) this;
        }

        public Criteria andShopingnumberIsNull() {
            addCriterion("SHOPINGNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andShopingnumberIsNotNull() {
            addCriterion("SHOPINGNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andShopingnumberEqualTo(String value) {
            addCriterion("SHOPINGNUMBER =", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberNotEqualTo(String value) {
            addCriterion("SHOPINGNUMBER <>", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberGreaterThan(String value) {
            addCriterion("SHOPINGNUMBER >", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPINGNUMBER >=", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberLessThan(String value) {
            addCriterion("SHOPINGNUMBER <", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberLessThanOrEqualTo(String value) {
            addCriterion("SHOPINGNUMBER <=", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberLike(String value) {
            addCriterion("SHOPINGNUMBER like", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberNotLike(String value) {
            addCriterion("SHOPINGNUMBER not like", value, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberIn(List<String> values) {
            addCriterion("SHOPINGNUMBER in", values, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberNotIn(List<String> values) {
            addCriterion("SHOPINGNUMBER not in", values, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberBetween(String value1, String value2) {
            addCriterion("SHOPINGNUMBER between", value1, value2, "shopingnumber");
            return (Criteria) this;
        }

        public Criteria andShopingnumberNotBetween(String value1, String value2) {
            addCriterion("SHOPINGNUMBER not between", value1, value2, "shopingnumber");
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

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("WEIGHT like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("WEIGHT not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsIsNull() {
            addCriterion("ISASSUMELOGISTICS is null");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsIsNotNull() {
            addCriterion("ISASSUMELOGISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsEqualTo(Integer value) {
            addCriterion("ISASSUMELOGISTICS =", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsNotEqualTo(Integer value) {
            addCriterion("ISASSUMELOGISTICS <>", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsGreaterThan(Integer value) {
            addCriterion("ISASSUMELOGISTICS >", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISASSUMELOGISTICS >=", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsLessThan(Integer value) {
            addCriterion("ISASSUMELOGISTICS <", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsLessThanOrEqualTo(Integer value) {
            addCriterion("ISASSUMELOGISTICS <=", value, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsIn(List<Integer> values) {
            addCriterion("ISASSUMELOGISTICS in", values, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsNotIn(List<Integer> values) {
            addCriterion("ISASSUMELOGISTICS not in", values, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsBetween(Integer value1, Integer value2) {
            addCriterion("ISASSUMELOGISTICS between", value1, value2, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsassumelogisticsNotBetween(Integer value1, Integer value2) {
            addCriterion("ISASSUMELOGISTICS not between", value1, value2, "isassumelogistics");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("ISNEW is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("ISNEW is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Integer value) {
            addCriterion("ISNEW =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Integer value) {
            addCriterion("ISNEW <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Integer value) {
            addCriterion("ISNEW >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISNEW >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Integer value) {
            addCriterion("ISNEW <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Integer value) {
            addCriterion("ISNEW <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Integer> values) {
            addCriterion("ISNEW in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Integer> values) {
            addCriterion("ISNEW not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Integer value1, Integer value2) {
            addCriterion("ISNEW between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Integer value1, Integer value2) {
            addCriterion("ISNEW not between", value1, value2, "isnew");
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