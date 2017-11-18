package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreApplyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreApplyCriteria() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andIdentityimageIsNull() {
            addCriterion("identityImage is null");
            return (Criteria) this;
        }

        public Criteria andIdentityimageIsNotNull() {
            addCriterion("identityImage is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityimageEqualTo(String value) {
            addCriterion("identityImage =", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageNotEqualTo(String value) {
            addCriterion("identityImage <>", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageGreaterThan(String value) {
            addCriterion("identityImage >", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageGreaterThanOrEqualTo(String value) {
            addCriterion("identityImage >=", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageLessThan(String value) {
            addCriterion("identityImage <", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageLessThanOrEqualTo(String value) {
            addCriterion("identityImage <=", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageLike(String value) {
            addCriterion("identityImage like", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageNotLike(String value) {
            addCriterion("identityImage not like", value, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageIn(List<String> values) {
            addCriterion("identityImage in", values, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageNotIn(List<String> values) {
            addCriterion("identityImage not in", values, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageBetween(String value1, String value2) {
            addCriterion("identityImage between", value1, value2, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimageNotBetween(String value1, String value2) {
            addCriterion("identityImage not between", value1, value2, "identityimage");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesIsNull() {
            addCriterion("identityImages is null");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesIsNotNull() {
            addCriterion("identityImages is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesEqualTo(String value) {
            addCriterion("identityImages =", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesNotEqualTo(String value) {
            addCriterion("identityImages <>", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesGreaterThan(String value) {
            addCriterion("identityImages >", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesGreaterThanOrEqualTo(String value) {
            addCriterion("identityImages >=", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesLessThan(String value) {
            addCriterion("identityImages <", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesLessThanOrEqualTo(String value) {
            addCriterion("identityImages <=", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesLike(String value) {
            addCriterion("identityImages like", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesNotLike(String value) {
            addCriterion("identityImages not like", value, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesIn(List<String> values) {
            addCriterion("identityImages in", values, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesNotIn(List<String> values) {
            addCriterion("identityImages not in", values, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesBetween(String value1, String value2) {
            addCriterion("identityImages between", value1, value2, "identityimages");
            return (Criteria) this;
        }

        public Criteria andIdentityimagesNotBetween(String value1, String value2) {
            addCriterion("identityImages not between", value1, value2, "identityimages");
            return (Criteria) this;
        }

        public Criteria andBankacountIsNull() {
            addCriterion("bankacount is null");
            return (Criteria) this;
        }

        public Criteria andBankacountIsNotNull() {
            addCriterion("bankacount is not null");
            return (Criteria) this;
        }

        public Criteria andBankacountEqualTo(String value) {
            addCriterion("bankacount =", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotEqualTo(String value) {
            addCriterion("bankacount <>", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountGreaterThan(String value) {
            addCriterion("bankacount >", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountGreaterThanOrEqualTo(String value) {
            addCriterion("bankacount >=", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLessThan(String value) {
            addCriterion("bankacount <", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLessThanOrEqualTo(String value) {
            addCriterion("bankacount <=", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLike(String value) {
            addCriterion("bankacount like", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotLike(String value) {
            addCriterion("bankacount not like", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountIn(List<String> values) {
            addCriterion("bankacount in", values, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotIn(List<String> values) {
            addCriterion("bankacount not in", values, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountBetween(String value1, String value2) {
            addCriterion("bankacount between", value1, value2, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotBetween(String value1, String value2) {
            addCriterion("bankacount not between", value1, value2, "bankacount");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesIsNull() {
            addCriterion("businessImages is null");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesIsNotNull() {
            addCriterion("businessImages is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesEqualTo(String value) {
            addCriterion("businessImages =", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesNotEqualTo(String value) {
            addCriterion("businessImages <>", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesGreaterThan(String value) {
            addCriterion("businessImages >", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesGreaterThanOrEqualTo(String value) {
            addCriterion("businessImages >=", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesLessThan(String value) {
            addCriterion("businessImages <", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesLessThanOrEqualTo(String value) {
            addCriterion("businessImages <=", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesLike(String value) {
            addCriterion("businessImages like", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesNotLike(String value) {
            addCriterion("businessImages not like", value, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesIn(List<String> values) {
            addCriterion("businessImages in", values, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesNotIn(List<String> values) {
            addCriterion("businessImages not in", values, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesBetween(String value1, String value2) {
            addCriterion("businessImages between", value1, value2, "businessimages");
            return (Criteria) this;
        }

        public Criteria andBusinessimagesNotBetween(String value1, String value2) {
            addCriterion("businessImages not between", value1, value2, "businessimages");
            return (Criteria) this;
        }

        public Criteria andAppletimeIsNull() {
            addCriterion("appleTime is null");
            return (Criteria) this;
        }

        public Criteria andAppletimeIsNotNull() {
            addCriterion("appleTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppletimeEqualTo(Date value) {
            addCriterion("appleTime =", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeNotEqualTo(Date value) {
            addCriterion("appleTime <>", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeGreaterThan(Date value) {
            addCriterion("appleTime >", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appleTime >=", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeLessThan(Date value) {
            addCriterion("appleTime <", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeLessThanOrEqualTo(Date value) {
            addCriterion("appleTime <=", value, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeIn(List<Date> values) {
            addCriterion("appleTime in", values, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeNotIn(List<Date> values) {
            addCriterion("appleTime not in", values, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeBetween(Date value1, Date value2) {
            addCriterion("appleTime between", value1, value2, "appletime");
            return (Criteria) this;
        }

        public Criteria andAppletimeNotBetween(Date value1, Date value2) {
            addCriterion("appleTime not between", value1, value2, "appletime");
            return (Criteria) this;
        }

        public Criteria andStutasIsNull() {
            addCriterion("stutas is null");
            return (Criteria) this;
        }

        public Criteria andStutasIsNotNull() {
            addCriterion("stutas is not null");
            return (Criteria) this;
        }

        public Criteria andStutasEqualTo(Byte value) {
            addCriterion("stutas =", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasNotEqualTo(Byte value) {
            addCriterion("stutas <>", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasGreaterThan(Byte value) {
            addCriterion("stutas >", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasGreaterThanOrEqualTo(Byte value) {
            addCriterion("stutas >=", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasLessThan(Byte value) {
            addCriterion("stutas <", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasLessThanOrEqualTo(Byte value) {
            addCriterion("stutas <=", value, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasIn(List<Byte> values) {
            addCriterion("stutas in", values, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasNotIn(List<Byte> values) {
            addCriterion("stutas not in", values, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasBetween(Byte value1, Byte value2) {
            addCriterion("stutas between", value1, value2, "stutas");
            return (Criteria) this;
        }

        public Criteria andStutasNotBetween(Byte value1, Byte value2) {
            addCriterion("stutas not between", value1, value2, "stutas");
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