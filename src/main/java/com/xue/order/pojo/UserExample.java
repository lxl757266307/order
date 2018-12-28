package com.xue.order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNull() {
            addCriterion("ISFREE is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNotNull() {
            addCriterion("ISFREE is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeEqualTo(Integer value) {
            addCriterion("ISFREE =", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotEqualTo(Integer value) {
            addCriterion("ISFREE <>", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThan(Integer value) {
            addCriterion("ISFREE >", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISFREE >=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThan(Integer value) {
            addCriterion("ISFREE <", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThanOrEqualTo(Integer value) {
            addCriterion("ISFREE <=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeIn(List<Integer> values) {
            addCriterion("ISFREE in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotIn(List<Integer> values) {
            addCriterion("ISFREE not in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeBetween(Integer value1, Integer value2) {
            addCriterion("ISFREE between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotBetween(Integer value1, Integer value2) {
            addCriterion("ISFREE not between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
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

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
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

        public Criteria andOnlineIsNull() {
            addCriterion("ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Integer value) {
            addCriterion("ONLINE =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Integer value) {
            addCriterion("ONLINE <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Integer value) {
            addCriterion("ONLINE >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONLINE >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Integer value) {
            addCriterion("ONLINE <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("ONLINE <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Integer> values) {
            addCriterion("ONLINE in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Integer> values) {
            addCriterion("ONLINE not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CARDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CARDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CARDNUMBER =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CARDNUMBER <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CARDNUMBER >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNUMBER >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CARDNUMBER <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CARDNUMBER <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CARDNUMBER like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CARDNUMBER not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CARDNUMBER in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CARDNUMBER not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CARDNUMBER between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CARDNUMBER not between", value1, value2, "cardnumber");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("ADMINNAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("ADMINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("ADMINNAME =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("ADMINNAME <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("ADMINNAME >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINNAME >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("ADMINNAME <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("ADMINNAME <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("ADMINNAME like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("ADMINNAME not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("ADMINNAME in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("ADMINNAME not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("ADMINNAME between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("ADMINNAME not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("REALNAME =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("REALNAME <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("REALNAME >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("REALNAME <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("REALNAME <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("REALNAME like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("REALNAME not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("REALNAME in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("REALNAME not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("REALNAME between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("REALNAME not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoIsNull() {
            addCriterion("SHOPPINGPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoIsNotNull() {
            addCriterion("SHOPPINGPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoEqualTo(String value) {
            addCriterion("SHOPPINGPHOTO =", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoNotEqualTo(String value) {
            addCriterion("SHOPPINGPHOTO <>", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoGreaterThan(String value) {
            addCriterion("SHOPPINGPHOTO >", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPPINGPHOTO >=", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoLessThan(String value) {
            addCriterion("SHOPPINGPHOTO <", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoLessThanOrEqualTo(String value) {
            addCriterion("SHOPPINGPHOTO <=", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoLike(String value) {
            addCriterion("SHOPPINGPHOTO like", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoNotLike(String value) {
            addCriterion("SHOPPINGPHOTO not like", value, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoIn(List<String> values) {
            addCriterion("SHOPPINGPHOTO in", values, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoNotIn(List<String> values) {
            addCriterion("SHOPPINGPHOTO not in", values, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoBetween(String value1, String value2) {
            addCriterion("SHOPPINGPHOTO between", value1, value2, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andShoppingphotoNotBetween(String value1, String value2) {
            addCriterion("SHOPPINGPHOTO not between", value1, value2, "shoppingphoto");
            return (Criteria) this;
        }

        public Criteria andKindidIsNull() {
            addCriterion("KINDID is null");
            return (Criteria) this;
        }

        public Criteria andKindidIsNotNull() {
            addCriterion("KINDID is not null");
            return (Criteria) this;
        }

        public Criteria andKindidEqualTo(String value) {
            addCriterion("KINDID =", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotEqualTo(String value) {
            addCriterion("KINDID <>", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThan(String value) {
            addCriterion("KINDID >", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThanOrEqualTo(String value) {
            addCriterion("KINDID >=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThan(String value) {
            addCriterion("KINDID <", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThanOrEqualTo(String value) {
            addCriterion("KINDID <=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLike(String value) {
            addCriterion("KINDID like", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotLike(String value) {
            addCriterion("KINDID not like", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidIn(List<String> values) {
            addCriterion("KINDID in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotIn(List<String> values) {
            addCriterion("KINDID not in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidBetween(String value1, String value2) {
            addCriterion("KINDID between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotBetween(String value1, String value2) {
            addCriterion("KINDID not between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andBandcardIsNull() {
            addCriterion("BANDCARD is null");
            return (Criteria) this;
        }

        public Criteria andBandcardIsNotNull() {
            addCriterion("BANDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andBandcardEqualTo(String value) {
            addCriterion("BANDCARD =", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardNotEqualTo(String value) {
            addCriterion("BANDCARD <>", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardGreaterThan(String value) {
            addCriterion("BANDCARD >", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardGreaterThanOrEqualTo(String value) {
            addCriterion("BANDCARD >=", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardLessThan(String value) {
            addCriterion("BANDCARD <", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardLessThanOrEqualTo(String value) {
            addCriterion("BANDCARD <=", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardLike(String value) {
            addCriterion("BANDCARD like", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardNotLike(String value) {
            addCriterion("BANDCARD not like", value, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardIn(List<String> values) {
            addCriterion("BANDCARD in", values, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardNotIn(List<String> values) {
            addCriterion("BANDCARD not in", values, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardBetween(String value1, String value2) {
            addCriterion("BANDCARD between", value1, value2, "bandcard");
            return (Criteria) this;
        }

        public Criteria andBandcardNotBetween(String value1, String value2) {
            addCriterion("BANDCARD not between", value1, value2, "bandcard");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoIsNull() {
            addCriterion("PAYCODEPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoIsNotNull() {
            addCriterion("PAYCODEPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoEqualTo(String value) {
            addCriterion("PAYCODEPHOTO =", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoNotEqualTo(String value) {
            addCriterion("PAYCODEPHOTO <>", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoGreaterThan(String value) {
            addCriterion("PAYCODEPHOTO >", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYCODEPHOTO >=", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoLessThan(String value) {
            addCriterion("PAYCODEPHOTO <", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoLessThanOrEqualTo(String value) {
            addCriterion("PAYCODEPHOTO <=", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoLike(String value) {
            addCriterion("PAYCODEPHOTO like", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoNotLike(String value) {
            addCriterion("PAYCODEPHOTO not like", value, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoIn(List<String> values) {
            addCriterion("PAYCODEPHOTO in", values, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoNotIn(List<String> values) {
            addCriterion("PAYCODEPHOTO not in", values, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoBetween(String value1, String value2) {
            addCriterion("PAYCODEPHOTO between", value1, value2, "paycodephoto");
            return (Criteria) this;
        }

        public Criteria andPaycodephotoNotBetween(String value1, String value2) {
            addCriterion("PAYCODEPHOTO not between", value1, value2, "paycodephoto");
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