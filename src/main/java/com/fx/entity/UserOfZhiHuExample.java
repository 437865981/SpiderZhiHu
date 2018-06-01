package com.fx.entity;

import java.util.ArrayList;
import java.util.List;

public class UserOfZhiHuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOfZhiHuExample() {
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

        public Criteria andAccountstatusIsNull() {
            addCriterion("accountStatus is null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIsNotNull() {
            addCriterion("accountStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusEqualTo(String value) {
            addCriterion("accountStatus =", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotEqualTo(String value) {
            addCriterion("accountStatus <>", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThan(String value) {
            addCriterion("accountStatus >", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThanOrEqualTo(String value) {
            addCriterion("accountStatus >=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThan(String value) {
            addCriterion("accountStatus <", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThanOrEqualTo(String value) {
            addCriterion("accountStatus <=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLike(String value) {
            addCriterion("accountStatus like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotLike(String value) {
            addCriterion("accountStatus not like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIn(List<String> values) {
            addCriterion("accountStatus in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotIn(List<String> values) {
            addCriterion("accountStatus not in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusBetween(String value1, String value2) {
            addCriterion("accountStatus between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotBetween(String value1, String value2) {
            addCriterion("accountStatus not between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAllowmessageIsNull() {
            addCriterion("allowMessage is null");
            return (Criteria) this;
        }

        public Criteria andAllowmessageIsNotNull() {
            addCriterion("allowMessage is not null");
            return (Criteria) this;
        }

        public Criteria andAllowmessageEqualTo(String value) {
            addCriterion("allowMessage =", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageNotEqualTo(String value) {
            addCriterion("allowMessage <>", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageGreaterThan(String value) {
            addCriterion("allowMessage >", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageGreaterThanOrEqualTo(String value) {
            addCriterion("allowMessage >=", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageLessThan(String value) {
            addCriterion("allowMessage <", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageLessThanOrEqualTo(String value) {
            addCriterion("allowMessage <=", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageLike(String value) {
            addCriterion("allowMessage like", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageNotLike(String value) {
            addCriterion("allowMessage not like", value, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageIn(List<String> values) {
            addCriterion("allowMessage in", values, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageNotIn(List<String> values) {
            addCriterion("allowMessage not in", values, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageBetween(String value1, String value2) {
            addCriterion("allowMessage between", value1, value2, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAllowmessageNotBetween(String value1, String value2) {
            addCriterion("allowMessage not between", value1, value2, "allowmessage");
            return (Criteria) this;
        }

        public Criteria andAnswercountIsNull() {
            addCriterion("answerCount is null");
            return (Criteria) this;
        }

        public Criteria andAnswercountIsNotNull() {
            addCriterion("answerCount is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercountEqualTo(String value) {
            addCriterion("answerCount =", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountNotEqualTo(String value) {
            addCriterion("answerCount <>", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountGreaterThan(String value) {
            addCriterion("answerCount >", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountGreaterThanOrEqualTo(String value) {
            addCriterion("answerCount >=", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountLessThan(String value) {
            addCriterion("answerCount <", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountLessThanOrEqualTo(String value) {
            addCriterion("answerCount <=", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountLike(String value) {
            addCriterion("answerCount like", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountNotLike(String value) {
            addCriterion("answerCount not like", value, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountIn(List<String> values) {
            addCriterion("answerCount in", values, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountNotIn(List<String> values) {
            addCriterion("answerCount not in", values, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountBetween(String value1, String value2) {
            addCriterion("answerCount between", value1, value2, "answercount");
            return (Criteria) this;
        }

        public Criteria andAnswercountNotBetween(String value1, String value2) {
            addCriterion("answerCount not between", value1, value2, "answercount");
            return (Criteria) this;
        }

        public Criteria andArticlescountIsNull() {
            addCriterion("articlesCount is null");
            return (Criteria) this;
        }

        public Criteria andArticlescountIsNotNull() {
            addCriterion("articlesCount is not null");
            return (Criteria) this;
        }

        public Criteria andArticlescountEqualTo(String value) {
            addCriterion("articlesCount =", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountNotEqualTo(String value) {
            addCriterion("articlesCount <>", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountGreaterThan(String value) {
            addCriterion("articlesCount >", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountGreaterThanOrEqualTo(String value) {
            addCriterion("articlesCount >=", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountLessThan(String value) {
            addCriterion("articlesCount <", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountLessThanOrEqualTo(String value) {
            addCriterion("articlesCount <=", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountLike(String value) {
            addCriterion("articlesCount like", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountNotLike(String value) {
            addCriterion("articlesCount not like", value, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountIn(List<String> values) {
            addCriterion("articlesCount in", values, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountNotIn(List<String> values) {
            addCriterion("articlesCount not in", values, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountBetween(String value1, String value2) {
            addCriterion("articlesCount between", value1, value2, "articlescount");
            return (Criteria) this;
        }

        public Criteria andArticlescountNotBetween(String value1, String value2) {
            addCriterion("articlesCount not between", value1, value2, "articlescount");
            return (Criteria) this;
        }

        public Criteria andAvatarhueIsNull() {
            addCriterion("avatarHue is null");
            return (Criteria) this;
        }

        public Criteria andAvatarhueIsNotNull() {
            addCriterion("avatarHue is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarhueEqualTo(String value) {
            addCriterion("avatarHue =", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueNotEqualTo(String value) {
            addCriterion("avatarHue <>", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueGreaterThan(String value) {
            addCriterion("avatarHue >", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueGreaterThanOrEqualTo(String value) {
            addCriterion("avatarHue >=", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueLessThan(String value) {
            addCriterion("avatarHue <", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueLessThanOrEqualTo(String value) {
            addCriterion("avatarHue <=", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueLike(String value) {
            addCriterion("avatarHue like", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueNotLike(String value) {
            addCriterion("avatarHue not like", value, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueIn(List<String> values) {
            addCriterion("avatarHue in", values, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueNotIn(List<String> values) {
            addCriterion("avatarHue not in", values, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueBetween(String value1, String value2) {
            addCriterion("avatarHue between", value1, value2, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarhueNotBetween(String value1, String value2) {
            addCriterion("avatarHue not between", value1, value2, "avatarhue");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNull() {
            addCriterion("avatarUrl is null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIsNotNull() {
            addCriterion("avatarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarurlEqualTo(String value) {
            addCriterion("avatarUrl =", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotEqualTo(String value) {
            addCriterion("avatarUrl <>", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThan(String value) {
            addCriterion("avatarUrl >", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("avatarUrl >=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThan(String value) {
            addCriterion("avatarUrl <", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLessThanOrEqualTo(String value) {
            addCriterion("avatarUrl <=", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlLike(String value) {
            addCriterion("avatarUrl like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotLike(String value) {
            addCriterion("avatarUrl not like", value, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlIn(List<String> values) {
            addCriterion("avatarUrl in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotIn(List<String> values) {
            addCriterion("avatarUrl not in", values, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlBetween(String value1, String value2) {
            addCriterion("avatarUrl between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurlNotBetween(String value1, String value2) {
            addCriterion("avatarUrl not between", value1, value2, "avatarurl");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateIsNull() {
            addCriterion("avatarUrlTemplate is null");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateIsNotNull() {
            addCriterion("avatarUrlTemplate is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateEqualTo(String value) {
            addCriterion("avatarUrlTemplate =", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateNotEqualTo(String value) {
            addCriterion("avatarUrlTemplate <>", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateGreaterThan(String value) {
            addCriterion("avatarUrlTemplate >", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateGreaterThanOrEqualTo(String value) {
            addCriterion("avatarUrlTemplate >=", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateLessThan(String value) {
            addCriterion("avatarUrlTemplate <", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateLessThanOrEqualTo(String value) {
            addCriterion("avatarUrlTemplate <=", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateLike(String value) {
            addCriterion("avatarUrlTemplate like", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateNotLike(String value) {
            addCriterion("avatarUrlTemplate not like", value, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateIn(List<String> values) {
            addCriterion("avatarUrlTemplate in", values, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateNotIn(List<String> values) {
            addCriterion("avatarUrlTemplate not in", values, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateBetween(String value1, String value2) {
            addCriterion("avatarUrlTemplate between", value1, value2, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andAvatarurltemplateNotBetween(String value1, String value2) {
            addCriterion("avatarUrlTemplate not between", value1, value2, "avatarurltemplate");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNull() {
            addCriterion("badge is null");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNotNull() {
            addCriterion("badge is not null");
            return (Criteria) this;
        }

        public Criteria andBadgeEqualTo(String value) {
            addCriterion("badge =", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotEqualTo(String value) {
            addCriterion("badge <>", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThan(String value) {
            addCriterion("badge >", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThanOrEqualTo(String value) {
            addCriterion("badge >=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThan(String value) {
            addCriterion("badge <", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThanOrEqualTo(String value) {
            addCriterion("badge <=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLike(String value) {
            addCriterion("badge like", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotLike(String value) {
            addCriterion("badge not like", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeIn(List<String> values) {
            addCriterion("badge in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotIn(List<String> values) {
            addCriterion("badge not in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeBetween(String value1, String value2) {
            addCriterion("badge between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotBetween(String value1, String value2) {
            addCriterion("badge not between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andColumnscountIsNull() {
            addCriterion("columnsCount is null");
            return (Criteria) this;
        }

        public Criteria andColumnscountIsNotNull() {
            addCriterion("columnsCount is not null");
            return (Criteria) this;
        }

        public Criteria andColumnscountEqualTo(String value) {
            addCriterion("columnsCount =", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountNotEqualTo(String value) {
            addCriterion("columnsCount <>", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountGreaterThan(String value) {
            addCriterion("columnsCount >", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountGreaterThanOrEqualTo(String value) {
            addCriterion("columnsCount >=", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountLessThan(String value) {
            addCriterion("columnsCount <", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountLessThanOrEqualTo(String value) {
            addCriterion("columnsCount <=", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountLike(String value) {
            addCriterion("columnsCount like", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountNotLike(String value) {
            addCriterion("columnsCount not like", value, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountIn(List<String> values) {
            addCriterion("columnsCount in", values, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountNotIn(List<String> values) {
            addCriterion("columnsCount not in", values, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountBetween(String value1, String value2) {
            addCriterion("columnsCount between", value1, value2, "columnscount");
            return (Criteria) this;
        }

        public Criteria andColumnscountNotBetween(String value1, String value2) {
            addCriterion("columnsCount not between", value1, value2, "columnscount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountIsNull() {
            addCriterion("commercialQuestionCount is null");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountIsNotNull() {
            addCriterion("commercialQuestionCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountEqualTo(String value) {
            addCriterion("commercialQuestionCount =", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountNotEqualTo(String value) {
            addCriterion("commercialQuestionCount <>", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountGreaterThan(String value) {
            addCriterion("commercialQuestionCount >", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountGreaterThanOrEqualTo(String value) {
            addCriterion("commercialQuestionCount >=", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountLessThan(String value) {
            addCriterion("commercialQuestionCount <", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountLessThanOrEqualTo(String value) {
            addCriterion("commercialQuestionCount <=", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountLike(String value) {
            addCriterion("commercialQuestionCount like", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountNotLike(String value) {
            addCriterion("commercialQuestionCount not like", value, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountIn(List<String> values) {
            addCriterion("commercialQuestionCount in", values, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountNotIn(List<String> values) {
            addCriterion("commercialQuestionCount not in", values, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountBetween(String value1, String value2) {
            addCriterion("commercialQuestionCount between", value1, value2, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCommercialquestioncountNotBetween(String value1, String value2) {
            addCriterion("commercialQuestionCount not between", value1, value2, "commercialquestioncount");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNull() {
            addCriterion("coverUrl is null");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNotNull() {
            addCriterion("coverUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCoverurlEqualTo(String value) {
            addCriterion("coverUrl =", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotEqualTo(String value) {
            addCriterion("coverUrl <>", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThan(String value) {
            addCriterion("coverUrl >", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThanOrEqualTo(String value) {
            addCriterion("coverUrl >=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThan(String value) {
            addCriterion("coverUrl <", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThanOrEqualTo(String value) {
            addCriterion("coverUrl <=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLike(String value) {
            addCriterion("coverUrl like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotLike(String value) {
            addCriterion("coverUrl not like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlIn(List<String> values) {
            addCriterion("coverUrl in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotIn(List<String> values) {
            addCriterion("coverUrl not in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlBetween(String value1, String value2) {
            addCriterion("coverUrl between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotBetween(String value1, String value2) {
            addCriterion("coverUrl not between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEducationsIsNull() {
            addCriterion("educations is null");
            return (Criteria) this;
        }

        public Criteria andEducationsIsNotNull() {
            addCriterion("educations is not null");
            return (Criteria) this;
        }

        public Criteria andEducationsEqualTo(String value) {
            addCriterion("educations =", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotEqualTo(String value) {
            addCriterion("educations <>", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsGreaterThan(String value) {
            addCriterion("educations >", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsGreaterThanOrEqualTo(String value) {
            addCriterion("educations >=", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLessThan(String value) {
            addCriterion("educations <", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLessThanOrEqualTo(String value) {
            addCriterion("educations <=", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLike(String value) {
            addCriterion("educations like", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotLike(String value) {
            addCriterion("educations not like", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsIn(List<String> values) {
            addCriterion("educations in", values, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotIn(List<String> values) {
            addCriterion("educations not in", values, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsBetween(String value1, String value2) {
            addCriterion("educations between", value1, value2, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotBetween(String value1, String value2) {
            addCriterion("educations not between", value1, value2, "educations");
            return (Criteria) this;
        }

        public Criteria andEmploymentsIsNull() {
            addCriterion("employments is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentsIsNotNull() {
            addCriterion("employments is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentsEqualTo(String value) {
            addCriterion("employments =", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsNotEqualTo(String value) {
            addCriterion("employments <>", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsGreaterThan(String value) {
            addCriterion("employments >", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsGreaterThanOrEqualTo(String value) {
            addCriterion("employments >=", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsLessThan(String value) {
            addCriterion("employments <", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsLessThanOrEqualTo(String value) {
            addCriterion("employments <=", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsLike(String value) {
            addCriterion("employments like", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsNotLike(String value) {
            addCriterion("employments not like", value, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsIn(List<String> values) {
            addCriterion("employments in", values, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsNotIn(List<String> values) {
            addCriterion("employments not in", values, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsBetween(String value1, String value2) {
            addCriterion("employments between", value1, value2, "employments");
            return (Criteria) this;
        }

        public Criteria andEmploymentsNotBetween(String value1, String value2) {
            addCriterion("employments not between", value1, value2, "employments");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIsNull() {
            addCriterion("favoriteCount is null");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIsNotNull() {
            addCriterion("favoriteCount is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritecountEqualTo(String value) {
            addCriterion("favoriteCount =", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotEqualTo(String value) {
            addCriterion("favoriteCount <>", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountGreaterThan(String value) {
            addCriterion("favoriteCount >", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountGreaterThanOrEqualTo(String value) {
            addCriterion("favoriteCount >=", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountLessThan(String value) {
            addCriterion("favoriteCount <", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountLessThanOrEqualTo(String value) {
            addCriterion("favoriteCount <=", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountLike(String value) {
            addCriterion("favoriteCount like", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotLike(String value) {
            addCriterion("favoriteCount not like", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIn(List<String> values) {
            addCriterion("favoriteCount in", values, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotIn(List<String> values) {
            addCriterion("favoriteCount not in", values, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountBetween(String value1, String value2) {
            addCriterion("favoriteCount between", value1, value2, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotBetween(String value1, String value2) {
            addCriterion("favoriteCount not between", value1, value2, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountIsNull() {
            addCriterion("favoritedCount is null");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountIsNotNull() {
            addCriterion("favoritedCount is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountEqualTo(String value) {
            addCriterion("favoritedCount =", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountNotEqualTo(String value) {
            addCriterion("favoritedCount <>", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountGreaterThan(String value) {
            addCriterion("favoritedCount >", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountGreaterThanOrEqualTo(String value) {
            addCriterion("favoritedCount >=", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountLessThan(String value) {
            addCriterion("favoritedCount <", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountLessThanOrEqualTo(String value) {
            addCriterion("favoritedCount <=", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountLike(String value) {
            addCriterion("favoritedCount like", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountNotLike(String value) {
            addCriterion("favoritedCount not like", value, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountIn(List<String> values) {
            addCriterion("favoritedCount in", values, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountNotIn(List<String> values) {
            addCriterion("favoritedCount not in", values, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountBetween(String value1, String value2) {
            addCriterion("favoritedCount between", value1, value2, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFavoritedcountNotBetween(String value1, String value2) {
            addCriterion("favoritedCount not between", value1, value2, "favoritedcount");
            return (Criteria) this;
        }

        public Criteria andFollowercountIsNull() {
            addCriterion("followerCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowercountIsNotNull() {
            addCriterion("followerCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowercountEqualTo(String value) {
            addCriterion("followerCount =", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountNotEqualTo(String value) {
            addCriterion("followerCount <>", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountGreaterThan(String value) {
            addCriterion("followerCount >", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountGreaterThanOrEqualTo(String value) {
            addCriterion("followerCount >=", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountLessThan(String value) {
            addCriterion("followerCount <", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountLessThanOrEqualTo(String value) {
            addCriterion("followerCount <=", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountLike(String value) {
            addCriterion("followerCount like", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountNotLike(String value) {
            addCriterion("followerCount not like", value, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountIn(List<String> values) {
            addCriterion("followerCount in", values, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountNotIn(List<String> values) {
            addCriterion("followerCount not in", values, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountBetween(String value1, String value2) {
            addCriterion("followerCount between", value1, value2, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowercountNotBetween(String value1, String value2) {
            addCriterion("followerCount not between", value1, value2, "followercount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountIsNull() {
            addCriterion("followingColumnsCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountIsNotNull() {
            addCriterion("followingColumnsCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountEqualTo(String value) {
            addCriterion("followingColumnsCount =", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountNotEqualTo(String value) {
            addCriterion("followingColumnsCount <>", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountGreaterThan(String value) {
            addCriterion("followingColumnsCount >", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountGreaterThanOrEqualTo(String value) {
            addCriterion("followingColumnsCount >=", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountLessThan(String value) {
            addCriterion("followingColumnsCount <", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountLessThanOrEqualTo(String value) {
            addCriterion("followingColumnsCount <=", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountLike(String value) {
            addCriterion("followingColumnsCount like", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountNotLike(String value) {
            addCriterion("followingColumnsCount not like", value, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountIn(List<String> values) {
            addCriterion("followingColumnsCount in", values, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountNotIn(List<String> values) {
            addCriterion("followingColumnsCount not in", values, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountBetween(String value1, String value2) {
            addCriterion("followingColumnsCount between", value1, value2, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcolumnscountNotBetween(String value1, String value2) {
            addCriterion("followingColumnsCount not between", value1, value2, "followingcolumnscount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountIsNull() {
            addCriterion("followingCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowingcountIsNotNull() {
            addCriterion("followingCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingcountEqualTo(String value) {
            addCriterion("followingCount =", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountNotEqualTo(String value) {
            addCriterion("followingCount <>", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountGreaterThan(String value) {
            addCriterion("followingCount >", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountGreaterThanOrEqualTo(String value) {
            addCriterion("followingCount >=", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountLessThan(String value) {
            addCriterion("followingCount <", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountLessThanOrEqualTo(String value) {
            addCriterion("followingCount <=", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountLike(String value) {
            addCriterion("followingCount like", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountNotLike(String value) {
            addCriterion("followingCount not like", value, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountIn(List<String> values) {
            addCriterion("followingCount in", values, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountNotIn(List<String> values) {
            addCriterion("followingCount not in", values, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountBetween(String value1, String value2) {
            addCriterion("followingCount between", value1, value2, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingcountNotBetween(String value1, String value2) {
            addCriterion("followingCount not between", value1, value2, "followingcount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountIsNull() {
            addCriterion("followingFavlistsCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountIsNotNull() {
            addCriterion("followingFavlistsCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountEqualTo(String value) {
            addCriterion("followingFavlistsCount =", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountNotEqualTo(String value) {
            addCriterion("followingFavlistsCount <>", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountGreaterThan(String value) {
            addCriterion("followingFavlistsCount >", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountGreaterThanOrEqualTo(String value) {
            addCriterion("followingFavlistsCount >=", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountLessThan(String value) {
            addCriterion("followingFavlistsCount <", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountLessThanOrEqualTo(String value) {
            addCriterion("followingFavlistsCount <=", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountLike(String value) {
            addCriterion("followingFavlistsCount like", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountNotLike(String value) {
            addCriterion("followingFavlistsCount not like", value, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountIn(List<String> values) {
            addCriterion("followingFavlistsCount in", values, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountNotIn(List<String> values) {
            addCriterion("followingFavlistsCount not in", values, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountBetween(String value1, String value2) {
            addCriterion("followingFavlistsCount between", value1, value2, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingfavlistscountNotBetween(String value1, String value2) {
            addCriterion("followingFavlistsCount not between", value1, value2, "followingfavlistscount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountIsNull() {
            addCriterion("followingQuestionCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountIsNotNull() {
            addCriterion("followingQuestionCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountEqualTo(String value) {
            addCriterion("followingQuestionCount =", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountNotEqualTo(String value) {
            addCriterion("followingQuestionCount <>", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountGreaterThan(String value) {
            addCriterion("followingQuestionCount >", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountGreaterThanOrEqualTo(String value) {
            addCriterion("followingQuestionCount >=", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountLessThan(String value) {
            addCriterion("followingQuestionCount <", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountLessThanOrEqualTo(String value) {
            addCriterion("followingQuestionCount <=", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountLike(String value) {
            addCriterion("followingQuestionCount like", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountNotLike(String value) {
            addCriterion("followingQuestionCount not like", value, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountIn(List<String> values) {
            addCriterion("followingQuestionCount in", values, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountNotIn(List<String> values) {
            addCriterion("followingQuestionCount not in", values, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountBetween(String value1, String value2) {
            addCriterion("followingQuestionCount between", value1, value2, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingquestioncountNotBetween(String value1, String value2) {
            addCriterion("followingQuestionCount not between", value1, value2, "followingquestioncount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountIsNull() {
            addCriterion("followingTopicCount is null");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountIsNotNull() {
            addCriterion("followingTopicCount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountEqualTo(String value) {
            addCriterion("followingTopicCount =", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountNotEqualTo(String value) {
            addCriterion("followingTopicCount <>", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountGreaterThan(String value) {
            addCriterion("followingTopicCount >", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountGreaterThanOrEqualTo(String value) {
            addCriterion("followingTopicCount >=", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountLessThan(String value) {
            addCriterion("followingTopicCount <", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountLessThanOrEqualTo(String value) {
            addCriterion("followingTopicCount <=", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountLike(String value) {
            addCriterion("followingTopicCount like", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountNotLike(String value) {
            addCriterion("followingTopicCount not like", value, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountIn(List<String> values) {
            addCriterion("followingTopicCount in", values, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountNotIn(List<String> values) {
            addCriterion("followingTopicCount not in", values, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountBetween(String value1, String value2) {
            addCriterion("followingTopicCount between", value1, value2, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andFollowingtopiccountNotBetween(String value1, String value2) {
            addCriterion("followingTopicCount not between", value1, value2, "followingtopiccount");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andHeadlineIsNull() {
            addCriterion("headline is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineIsNotNull() {
            addCriterion("headline is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineEqualTo(String value) {
            addCriterion("headline =", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotEqualTo(String value) {
            addCriterion("headline <>", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineGreaterThan(String value) {
            addCriterion("headline >", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("headline >=", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLessThan(String value) {
            addCriterion("headline <", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLessThanOrEqualTo(String value) {
            addCriterion("headline <=", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineLike(String value) {
            addCriterion("headline like", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotLike(String value) {
            addCriterion("headline not like", value, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineIn(List<String> values) {
            addCriterion("headline in", values, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotIn(List<String> values) {
            addCriterion("headline not in", values, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineBetween(String value1, String value2) {
            addCriterion("headline between", value1, value2, "headline");
            return (Criteria) this;
        }

        public Criteria andHeadlineNotBetween(String value1, String value2) {
            addCriterion("headline not between", value1, value2, "headline");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountIsNull() {
            addCriterion("hostedLiveCount is null");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountIsNotNull() {
            addCriterion("hostedLiveCount is not null");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountEqualTo(String value) {
            addCriterion("hostedLiveCount =", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountNotEqualTo(String value) {
            addCriterion("hostedLiveCount <>", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountGreaterThan(String value) {
            addCriterion("hostedLiveCount >", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountGreaterThanOrEqualTo(String value) {
            addCriterion("hostedLiveCount >=", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountLessThan(String value) {
            addCriterion("hostedLiveCount <", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountLessThanOrEqualTo(String value) {
            addCriterion("hostedLiveCount <=", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountLike(String value) {
            addCriterion("hostedLiveCount like", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountNotLike(String value) {
            addCriterion("hostedLiveCount not like", value, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountIn(List<String> values) {
            addCriterion("hostedLiveCount in", values, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountNotIn(List<String> values) {
            addCriterion("hostedLiveCount not in", values, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountBetween(String value1, String value2) {
            addCriterion("hostedLiveCount between", value1, value2, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andHostedlivecountNotBetween(String value1, String value2) {
            addCriterion("hostedLiveCount not between", value1, value2, "hostedlivecount");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountIsNull() {
            addCriterion("includedAnswersCount is null");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountIsNotNull() {
            addCriterion("includedAnswersCount is not null");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountEqualTo(String value) {
            addCriterion("includedAnswersCount =", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountNotEqualTo(String value) {
            addCriterion("includedAnswersCount <>", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountGreaterThan(String value) {
            addCriterion("includedAnswersCount >", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountGreaterThanOrEqualTo(String value) {
            addCriterion("includedAnswersCount >=", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountLessThan(String value) {
            addCriterion("includedAnswersCount <", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountLessThanOrEqualTo(String value) {
            addCriterion("includedAnswersCount <=", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountLike(String value) {
            addCriterion("includedAnswersCount like", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountNotLike(String value) {
            addCriterion("includedAnswersCount not like", value, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountIn(List<String> values) {
            addCriterion("includedAnswersCount in", values, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountNotIn(List<String> values) {
            addCriterion("includedAnswersCount not in", values, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountBetween(String value1, String value2) {
            addCriterion("includedAnswersCount between", value1, value2, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedanswerscountNotBetween(String value1, String value2) {
            addCriterion("includedAnswersCount not between", value1, value2, "includedanswerscount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountIsNull() {
            addCriterion("includedArticlesCount is null");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountIsNotNull() {
            addCriterion("includedArticlesCount is not null");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountEqualTo(String value) {
            addCriterion("includedArticlesCount =", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountNotEqualTo(String value) {
            addCriterion("includedArticlesCount <>", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountGreaterThan(String value) {
            addCriterion("includedArticlesCount >", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountGreaterThanOrEqualTo(String value) {
            addCriterion("includedArticlesCount >=", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountLessThan(String value) {
            addCriterion("includedArticlesCount <", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountLessThanOrEqualTo(String value) {
            addCriterion("includedArticlesCount <=", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountLike(String value) {
            addCriterion("includedArticlesCount like", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountNotLike(String value) {
            addCriterion("includedArticlesCount not like", value, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountIn(List<String> values) {
            addCriterion("includedArticlesCount in", values, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountNotIn(List<String> values) {
            addCriterion("includedArticlesCount not in", values, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountBetween(String value1, String value2) {
            addCriterion("includedArticlesCount between", value1, value2, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedarticlescountNotBetween(String value1, String value2) {
            addCriterion("includedArticlesCount not between", value1, value2, "includedarticlescount");
            return (Criteria) this;
        }

        public Criteria andIncludedtextIsNull() {
            addCriterion("includedText is null");
            return (Criteria) this;
        }

        public Criteria andIncludedtextIsNotNull() {
            addCriterion("includedText is not null");
            return (Criteria) this;
        }

        public Criteria andIncludedtextEqualTo(String value) {
            addCriterion("includedText =", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextNotEqualTo(String value) {
            addCriterion("includedText <>", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextGreaterThan(String value) {
            addCriterion("includedText >", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextGreaterThanOrEqualTo(String value) {
            addCriterion("includedText >=", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextLessThan(String value) {
            addCriterion("includedText <", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextLessThanOrEqualTo(String value) {
            addCriterion("includedText <=", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextLike(String value) {
            addCriterion("includedText like", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextNotLike(String value) {
            addCriterion("includedText not like", value, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextIn(List<String> values) {
            addCriterion("includedText in", values, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextNotIn(List<String> values) {
            addCriterion("includedText not in", values, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextBetween(String value1, String value2) {
            addCriterion("includedText between", value1, value2, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIncludedtextNotBetween(String value1, String value2) {
            addCriterion("includedText not between", value1, value2, "includedtext");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("isActive like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("isActive not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserIsNull() {
            addCriterion("isAdvertiser is null");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserIsNotNull() {
            addCriterion("isAdvertiser is not null");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserEqualTo(String value) {
            addCriterion("isAdvertiser =", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserNotEqualTo(String value) {
            addCriterion("isAdvertiser <>", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserGreaterThan(String value) {
            addCriterion("isAdvertiser >", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserGreaterThanOrEqualTo(String value) {
            addCriterion("isAdvertiser >=", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserLessThan(String value) {
            addCriterion("isAdvertiser <", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserLessThanOrEqualTo(String value) {
            addCriterion("isAdvertiser <=", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserLike(String value) {
            addCriterion("isAdvertiser like", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserNotLike(String value) {
            addCriterion("isAdvertiser not like", value, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserIn(List<String> values) {
            addCriterion("isAdvertiser in", values, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserNotIn(List<String> values) {
            addCriterion("isAdvertiser not in", values, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserBetween(String value1, String value2) {
            addCriterion("isAdvertiser between", value1, value2, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsadvertiserNotBetween(String value1, String value2) {
            addCriterion("isAdvertiser not between", value1, value2, "isadvertiser");
            return (Criteria) this;
        }

        public Criteria andIsblockedIsNull() {
            addCriterion("isBlocked is null");
            return (Criteria) this;
        }

        public Criteria andIsblockedIsNotNull() {
            addCriterion("isBlocked is not null");
            return (Criteria) this;
        }

        public Criteria andIsblockedEqualTo(String value) {
            addCriterion("isBlocked =", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedNotEqualTo(String value) {
            addCriterion("isBlocked <>", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedGreaterThan(String value) {
            addCriterion("isBlocked >", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedGreaterThanOrEqualTo(String value) {
            addCriterion("isBlocked >=", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedLessThan(String value) {
            addCriterion("isBlocked <", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedLessThanOrEqualTo(String value) {
            addCriterion("isBlocked <=", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedLike(String value) {
            addCriterion("isBlocked like", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedNotLike(String value) {
            addCriterion("isBlocked not like", value, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedIn(List<String> values) {
            addCriterion("isBlocked in", values, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedNotIn(List<String> values) {
            addCriterion("isBlocked not in", values, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedBetween(String value1, String value2) {
            addCriterion("isBlocked between", value1, value2, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockedNotBetween(String value1, String value2) {
            addCriterion("isBlocked not between", value1, value2, "isblocked");
            return (Criteria) this;
        }

        public Criteria andIsblockingIsNull() {
            addCriterion("isBlocking is null");
            return (Criteria) this;
        }

        public Criteria andIsblockingIsNotNull() {
            addCriterion("isBlocking is not null");
            return (Criteria) this;
        }

        public Criteria andIsblockingEqualTo(String value) {
            addCriterion("isBlocking =", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingNotEqualTo(String value) {
            addCriterion("isBlocking <>", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingGreaterThan(String value) {
            addCriterion("isBlocking >", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingGreaterThanOrEqualTo(String value) {
            addCriterion("isBlocking >=", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingLessThan(String value) {
            addCriterion("isBlocking <", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingLessThanOrEqualTo(String value) {
            addCriterion("isBlocking <=", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingLike(String value) {
            addCriterion("isBlocking like", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingNotLike(String value) {
            addCriterion("isBlocking not like", value, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingIn(List<String> values) {
            addCriterion("isBlocking in", values, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingNotIn(List<String> values) {
            addCriterion("isBlocking not in", values, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingBetween(String value1, String value2) {
            addCriterion("isBlocking between", value1, value2, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsblockingNotBetween(String value1, String value2) {
            addCriterion("isBlocking not between", value1, value2, "isblocking");
            return (Criteria) this;
        }

        public Criteria andIsfollowedIsNull() {
            addCriterion("isFollowed is null");
            return (Criteria) this;
        }

        public Criteria andIsfollowedIsNotNull() {
            addCriterion("isFollowed is not null");
            return (Criteria) this;
        }

        public Criteria andIsfollowedEqualTo(String value) {
            addCriterion("isFollowed =", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedNotEqualTo(String value) {
            addCriterion("isFollowed <>", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedGreaterThan(String value) {
            addCriterion("isFollowed >", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedGreaterThanOrEqualTo(String value) {
            addCriterion("isFollowed >=", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedLessThan(String value) {
            addCriterion("isFollowed <", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedLessThanOrEqualTo(String value) {
            addCriterion("isFollowed <=", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedLike(String value) {
            addCriterion("isFollowed like", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedNotLike(String value) {
            addCriterion("isFollowed not like", value, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedIn(List<String> values) {
            addCriterion("isFollowed in", values, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedNotIn(List<String> values) {
            addCriterion("isFollowed not in", values, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedBetween(String value1, String value2) {
            addCriterion("isFollowed between", value1, value2, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowedNotBetween(String value1, String value2) {
            addCriterion("isFollowed not between", value1, value2, "isfollowed");
            return (Criteria) this;
        }

        public Criteria andIsfollowingIsNull() {
            addCriterion("isFollowing is null");
            return (Criteria) this;
        }

        public Criteria andIsfollowingIsNotNull() {
            addCriterion("isFollowing is not null");
            return (Criteria) this;
        }

        public Criteria andIsfollowingEqualTo(String value) {
            addCriterion("isFollowing =", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingNotEqualTo(String value) {
            addCriterion("isFollowing <>", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingGreaterThan(String value) {
            addCriterion("isFollowing >", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingGreaterThanOrEqualTo(String value) {
            addCriterion("isFollowing >=", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingLessThan(String value) {
            addCriterion("isFollowing <", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingLessThanOrEqualTo(String value) {
            addCriterion("isFollowing <=", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingLike(String value) {
            addCriterion("isFollowing like", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingNotLike(String value) {
            addCriterion("isFollowing not like", value, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingIn(List<String> values) {
            addCriterion("isFollowing in", values, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingNotIn(List<String> values) {
            addCriterion("isFollowing not in", values, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingBetween(String value1, String value2) {
            addCriterion("isFollowing between", value1, value2, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsfollowingNotBetween(String value1, String value2) {
            addCriterion("isFollowing not between", value1, value2, "isfollowing");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedIsNull() {
            addCriterion("isForceRenamed is null");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedIsNotNull() {
            addCriterion("isForceRenamed is not null");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedEqualTo(String value) {
            addCriterion("isForceRenamed =", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedNotEqualTo(String value) {
            addCriterion("isForceRenamed <>", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedGreaterThan(String value) {
            addCriterion("isForceRenamed >", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedGreaterThanOrEqualTo(String value) {
            addCriterion("isForceRenamed >=", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedLessThan(String value) {
            addCriterion("isForceRenamed <", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedLessThanOrEqualTo(String value) {
            addCriterion("isForceRenamed <=", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedLike(String value) {
            addCriterion("isForceRenamed like", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedNotLike(String value) {
            addCriterion("isForceRenamed not like", value, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedIn(List<String> values) {
            addCriterion("isForceRenamed in", values, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedNotIn(List<String> values) {
            addCriterion("isForceRenamed not in", values, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedBetween(String value1, String value2) {
            addCriterion("isForceRenamed between", value1, value2, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsforcerenamedNotBetween(String value1, String value2) {
            addCriterion("isForceRenamed not between", value1, value2, "isforcerenamed");
            return (Criteria) this;
        }

        public Criteria andIsorgIsNull() {
            addCriterion("isOrg is null");
            return (Criteria) this;
        }

        public Criteria andIsorgIsNotNull() {
            addCriterion("isOrg is not null");
            return (Criteria) this;
        }

        public Criteria andIsorgEqualTo(String value) {
            addCriterion("isOrg =", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgNotEqualTo(String value) {
            addCriterion("isOrg <>", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgGreaterThan(String value) {
            addCriterion("isOrg >", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgGreaterThanOrEqualTo(String value) {
            addCriterion("isOrg >=", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgLessThan(String value) {
            addCriterion("isOrg <", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgLessThanOrEqualTo(String value) {
            addCriterion("isOrg <=", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgLike(String value) {
            addCriterion("isOrg like", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgNotLike(String value) {
            addCriterion("isOrg not like", value, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgIn(List<String> values) {
            addCriterion("isOrg in", values, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgNotIn(List<String> values) {
            addCriterion("isOrg not in", values, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgBetween(String value1, String value2) {
            addCriterion("isOrg between", value1, value2, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsorgNotBetween(String value1, String value2) {
            addCriterion("isOrg not between", value1, value2, "isorg");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedIsNull() {
            addCriterion("isPrivacyProtected is null");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedIsNotNull() {
            addCriterion("isPrivacyProtected is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedEqualTo(String value) {
            addCriterion("isPrivacyProtected =", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedNotEqualTo(String value) {
            addCriterion("isPrivacyProtected <>", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedGreaterThan(String value) {
            addCriterion("isPrivacyProtected >", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedGreaterThanOrEqualTo(String value) {
            addCriterion("isPrivacyProtected >=", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedLessThan(String value) {
            addCriterion("isPrivacyProtected <", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedLessThanOrEqualTo(String value) {
            addCriterion("isPrivacyProtected <=", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedLike(String value) {
            addCriterion("isPrivacyProtected like", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedNotLike(String value) {
            addCriterion("isPrivacyProtected not like", value, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedIn(List<String> values) {
            addCriterion("isPrivacyProtected in", values, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedNotIn(List<String> values) {
            addCriterion("isPrivacyProtected not in", values, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedBetween(String value1, String value2) {
            addCriterion("isPrivacyProtected between", value1, value2, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andIsprivacyprotectedNotBetween(String value1, String value2) {
            addCriterion("isPrivacyProtected not between", value1, value2, "isprivacyprotected");
            return (Criteria) this;
        }

        public Criteria andLocationsIsNull() {
            addCriterion("locations is null");
            return (Criteria) this;
        }

        public Criteria andLocationsIsNotNull() {
            addCriterion("locations is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsEqualTo(String value) {
            addCriterion("locations =", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsNotEqualTo(String value) {
            addCriterion("locations <>", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsGreaterThan(String value) {
            addCriterion("locations >", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsGreaterThanOrEqualTo(String value) {
            addCriterion("locations >=", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsLessThan(String value) {
            addCriterion("locations <", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsLessThanOrEqualTo(String value) {
            addCriterion("locations <=", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsLike(String value) {
            addCriterion("locations like", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsNotLike(String value) {
            addCriterion("locations not like", value, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsIn(List<String> values) {
            addCriterion("locations in", values, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsNotIn(List<String> values) {
            addCriterion("locations not in", values, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsBetween(String value1, String value2) {
            addCriterion("locations between", value1, value2, "locations");
            return (Criteria) this;
        }

        public Criteria andLocationsNotBetween(String value1, String value2) {
            addCriterion("locations not between", value1, value2, "locations");
            return (Criteria) this;
        }

        public Criteria andLogscountIsNull() {
            addCriterion("logsCount is null");
            return (Criteria) this;
        }

        public Criteria andLogscountIsNotNull() {
            addCriterion("logsCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogscountEqualTo(String value) {
            addCriterion("logsCount =", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountNotEqualTo(String value) {
            addCriterion("logsCount <>", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountGreaterThan(String value) {
            addCriterion("logsCount >", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountGreaterThanOrEqualTo(String value) {
            addCriterion("logsCount >=", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountLessThan(String value) {
            addCriterion("logsCount <", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountLessThanOrEqualTo(String value) {
            addCriterion("logsCount <=", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountLike(String value) {
            addCriterion("logsCount like", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountNotLike(String value) {
            addCriterion("logsCount not like", value, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountIn(List<String> values) {
            addCriterion("logsCount in", values, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountNotIn(List<String> values) {
            addCriterion("logsCount not in", values, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountBetween(String value1, String value2) {
            addCriterion("logsCount between", value1, value2, "logscount");
            return (Criteria) this;
        }

        public Criteria andLogscountNotBetween(String value1, String value2) {
            addCriterion("logsCount not between", value1, value2, "logscount");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenIsNull() {
            addCriterion("messageThreadToken is null");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenIsNotNull() {
            addCriterion("messageThreadToken is not null");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenEqualTo(String value) {
            addCriterion("messageThreadToken =", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenNotEqualTo(String value) {
            addCriterion("messageThreadToken <>", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenGreaterThan(String value) {
            addCriterion("messageThreadToken >", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenGreaterThanOrEqualTo(String value) {
            addCriterion("messageThreadToken >=", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenLessThan(String value) {
            addCriterion("messageThreadToken <", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenLessThanOrEqualTo(String value) {
            addCriterion("messageThreadToken <=", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenLike(String value) {
            addCriterion("messageThreadToken like", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenNotLike(String value) {
            addCriterion("messageThreadToken not like", value, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenIn(List<String> values) {
            addCriterion("messageThreadToken in", values, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenNotIn(List<String> values) {
            addCriterion("messageThreadToken not in", values, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenBetween(String value1, String value2) {
            addCriterion("messageThreadToken between", value1, value2, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMessagethreadtokenNotBetween(String value1, String value2) {
            addCriterion("messageThreadToken not between", value1, value2, "messagethreadtoken");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountIsNull() {
            addCriterion("mutualFolloweesCount is null");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountIsNotNull() {
            addCriterion("mutualFolloweesCount is not null");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountEqualTo(String value) {
            addCriterion("mutualFolloweesCount =", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountNotEqualTo(String value) {
            addCriterion("mutualFolloweesCount <>", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountGreaterThan(String value) {
            addCriterion("mutualFolloweesCount >", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountGreaterThanOrEqualTo(String value) {
            addCriterion("mutualFolloweesCount >=", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountLessThan(String value) {
            addCriterion("mutualFolloweesCount <", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountLessThanOrEqualTo(String value) {
            addCriterion("mutualFolloweesCount <=", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountLike(String value) {
            addCriterion("mutualFolloweesCount like", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountNotLike(String value) {
            addCriterion("mutualFolloweesCount not like", value, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountIn(List<String> values) {
            addCriterion("mutualFolloweesCount in", values, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountNotIn(List<String> values) {
            addCriterion("mutualFolloweesCount not in", values, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountBetween(String value1, String value2) {
            addCriterion("mutualFolloweesCount between", value1, value2, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andMutualfolloweescountNotBetween(String value1, String value2) {
            addCriterion("mutualFolloweesCount not between", value1, value2, "mutualfolloweescount");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountIsNull() {
            addCriterion("participatedLiveCount is null");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountIsNotNull() {
            addCriterion("participatedLiveCount is not null");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountEqualTo(String value) {
            addCriterion("participatedLiveCount =", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountNotEqualTo(String value) {
            addCriterion("participatedLiveCount <>", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountGreaterThan(String value) {
            addCriterion("participatedLiveCount >", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountGreaterThanOrEqualTo(String value) {
            addCriterion("participatedLiveCount >=", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountLessThan(String value) {
            addCriterion("participatedLiveCount <", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountLessThanOrEqualTo(String value) {
            addCriterion("participatedLiveCount <=", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountLike(String value) {
            addCriterion("participatedLiveCount like", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountNotLike(String value) {
            addCriterion("participatedLiveCount not like", value, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountIn(List<String> values) {
            addCriterion("participatedLiveCount in", values, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountNotIn(List<String> values) {
            addCriterion("participatedLiveCount not in", values, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountBetween(String value1, String value2) {
            addCriterion("participatedLiveCount between", value1, value2, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andParticipatedlivecountNotBetween(String value1, String value2) {
            addCriterion("participatedLiveCount not between", value1, value2, "participatedlivecount");
            return (Criteria) this;
        }

        public Criteria andPinscountIsNull() {
            addCriterion("pinsCount is null");
            return (Criteria) this;
        }

        public Criteria andPinscountIsNotNull() {
            addCriterion("pinsCount is not null");
            return (Criteria) this;
        }

        public Criteria andPinscountEqualTo(String value) {
            addCriterion("pinsCount =", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountNotEqualTo(String value) {
            addCriterion("pinsCount <>", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountGreaterThan(String value) {
            addCriterion("pinsCount >", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountGreaterThanOrEqualTo(String value) {
            addCriterion("pinsCount >=", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountLessThan(String value) {
            addCriterion("pinsCount <", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountLessThanOrEqualTo(String value) {
            addCriterion("pinsCount <=", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountLike(String value) {
            addCriterion("pinsCount like", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountNotLike(String value) {
            addCriterion("pinsCount not like", value, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountIn(List<String> values) {
            addCriterion("pinsCount in", values, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountNotIn(List<String> values) {
            addCriterion("pinsCount not in", values, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountBetween(String value1, String value2) {
            addCriterion("pinsCount between", value1, value2, "pinscount");
            return (Criteria) this;
        }

        public Criteria andPinscountNotBetween(String value1, String value2) {
            addCriterion("pinsCount not between", value1, value2, "pinscount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountIsNull() {
            addCriterion("questionCount is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncountIsNotNull() {
            addCriterion("questionCount is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncountEqualTo(String value) {
            addCriterion("questionCount =", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountNotEqualTo(String value) {
            addCriterion("questionCount <>", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountGreaterThan(String value) {
            addCriterion("questionCount >", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountGreaterThanOrEqualTo(String value) {
            addCriterion("questionCount >=", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountLessThan(String value) {
            addCriterion("questionCount <", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountLessThanOrEqualTo(String value) {
            addCriterion("questionCount <=", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountLike(String value) {
            addCriterion("questionCount like", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountNotLike(String value) {
            addCriterion("questionCount not like", value, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountIn(List<String> values) {
            addCriterion("questionCount in", values, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountNotIn(List<String> values) {
            addCriterion("questionCount not in", values, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountBetween(String value1, String value2) {
            addCriterion("questionCount between", value1, value2, "questioncount");
            return (Criteria) this;
        }

        public Criteria andQuestioncountNotBetween(String value1, String value2) {
            addCriterion("questionCount not between", value1, value2, "questioncount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountIsNull() {
            addCriterion("thankFromCount is null");
            return (Criteria) this;
        }

        public Criteria andThankfromcountIsNotNull() {
            addCriterion("thankFromCount is not null");
            return (Criteria) this;
        }

        public Criteria andThankfromcountEqualTo(String value) {
            addCriterion("thankFromCount =", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountNotEqualTo(String value) {
            addCriterion("thankFromCount <>", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountGreaterThan(String value) {
            addCriterion("thankFromCount >", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountGreaterThanOrEqualTo(String value) {
            addCriterion("thankFromCount >=", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountLessThan(String value) {
            addCriterion("thankFromCount <", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountLessThanOrEqualTo(String value) {
            addCriterion("thankFromCount <=", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountLike(String value) {
            addCriterion("thankFromCount like", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountNotLike(String value) {
            addCriterion("thankFromCount not like", value, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountIn(List<String> values) {
            addCriterion("thankFromCount in", values, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountNotIn(List<String> values) {
            addCriterion("thankFromCount not in", values, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountBetween(String value1, String value2) {
            addCriterion("thankFromCount between", value1, value2, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThankfromcountNotBetween(String value1, String value2) {
            addCriterion("thankFromCount not between", value1, value2, "thankfromcount");
            return (Criteria) this;
        }

        public Criteria andThanktocountIsNull() {
            addCriterion("thankToCount is null");
            return (Criteria) this;
        }

        public Criteria andThanktocountIsNotNull() {
            addCriterion("thankToCount is not null");
            return (Criteria) this;
        }

        public Criteria andThanktocountEqualTo(String value) {
            addCriterion("thankToCount =", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountNotEqualTo(String value) {
            addCriterion("thankToCount <>", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountGreaterThan(String value) {
            addCriterion("thankToCount >", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountGreaterThanOrEqualTo(String value) {
            addCriterion("thankToCount >=", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountLessThan(String value) {
            addCriterion("thankToCount <", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountLessThanOrEqualTo(String value) {
            addCriterion("thankToCount <=", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountLike(String value) {
            addCriterion("thankToCount like", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountNotLike(String value) {
            addCriterion("thankToCount not like", value, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountIn(List<String> values) {
            addCriterion("thankToCount in", values, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountNotIn(List<String> values) {
            addCriterion("thankToCount not in", values, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountBetween(String value1, String value2) {
            addCriterion("thankToCount between", value1, value2, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThanktocountNotBetween(String value1, String value2) {
            addCriterion("thankToCount not between", value1, value2, "thanktocount");
            return (Criteria) this;
        }

        public Criteria andThankedcountIsNull() {
            addCriterion("thankedCount is null");
            return (Criteria) this;
        }

        public Criteria andThankedcountIsNotNull() {
            addCriterion("thankedCount is not null");
            return (Criteria) this;
        }

        public Criteria andThankedcountEqualTo(String value) {
            addCriterion("thankedCount =", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountNotEqualTo(String value) {
            addCriterion("thankedCount <>", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountGreaterThan(String value) {
            addCriterion("thankedCount >", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountGreaterThanOrEqualTo(String value) {
            addCriterion("thankedCount >=", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountLessThan(String value) {
            addCriterion("thankedCount <", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountLessThanOrEqualTo(String value) {
            addCriterion("thankedCount <=", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountLike(String value) {
            addCriterion("thankedCount like", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountNotLike(String value) {
            addCriterion("thankedCount not like", value, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountIn(List<String> values) {
            addCriterion("thankedCount in", values, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountNotIn(List<String> values) {
            addCriterion("thankedCount not in", values, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountBetween(String value1, String value2) {
            addCriterion("thankedCount between", value1, value2, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andThankedcountNotBetween(String value1, String value2) {
            addCriterion("thankedCount not between", value1, value2, "thankedcount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrltokenIsNull() {
            addCriterion("urlToken is null");
            return (Criteria) this;
        }

        public Criteria andUrltokenIsNotNull() {
            addCriterion("urlToken is not null");
            return (Criteria) this;
        }

        public Criteria andUrltokenEqualTo(String value) {
            addCriterion("urlToken =", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotEqualTo(String value) {
            addCriterion("urlToken <>", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenGreaterThan(String value) {
            addCriterion("urlToken >", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenGreaterThanOrEqualTo(String value) {
            addCriterion("urlToken >=", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLessThan(String value) {
            addCriterion("urlToken <", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLessThanOrEqualTo(String value) {
            addCriterion("urlToken <=", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLike(String value) {
            addCriterion("urlToken like", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotLike(String value) {
            addCriterion("urlToken not like", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenIn(List<String> values) {
            addCriterion("urlToken in", values, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotIn(List<String> values) {
            addCriterion("urlToken not in", values, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenBetween(String value1, String value2) {
            addCriterion("urlToken between", value1, value2, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotBetween(String value1, String value2) {
            addCriterion("urlToken not between", value1, value2, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("userType like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("userType not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("userType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andVotefromcountIsNull() {
            addCriterion("voteFromCount is null");
            return (Criteria) this;
        }

        public Criteria andVotefromcountIsNotNull() {
            addCriterion("voteFromCount is not null");
            return (Criteria) this;
        }

        public Criteria andVotefromcountEqualTo(String value) {
            addCriterion("voteFromCount =", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountNotEqualTo(String value) {
            addCriterion("voteFromCount <>", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountGreaterThan(String value) {
            addCriterion("voteFromCount >", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountGreaterThanOrEqualTo(String value) {
            addCriterion("voteFromCount >=", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountLessThan(String value) {
            addCriterion("voteFromCount <", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountLessThanOrEqualTo(String value) {
            addCriterion("voteFromCount <=", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountLike(String value) {
            addCriterion("voteFromCount like", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountNotLike(String value) {
            addCriterion("voteFromCount not like", value, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountIn(List<String> values) {
            addCriterion("voteFromCount in", values, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountNotIn(List<String> values) {
            addCriterion("voteFromCount not in", values, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountBetween(String value1, String value2) {
            addCriterion("voteFromCount between", value1, value2, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotefromcountNotBetween(String value1, String value2) {
            addCriterion("voteFromCount not between", value1, value2, "votefromcount");
            return (Criteria) this;
        }

        public Criteria andVotetocountIsNull() {
            addCriterion("voteToCount is null");
            return (Criteria) this;
        }

        public Criteria andVotetocountIsNotNull() {
            addCriterion("voteToCount is not null");
            return (Criteria) this;
        }

        public Criteria andVotetocountEqualTo(String value) {
            addCriterion("voteToCount =", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountNotEqualTo(String value) {
            addCriterion("voteToCount <>", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountGreaterThan(String value) {
            addCriterion("voteToCount >", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountGreaterThanOrEqualTo(String value) {
            addCriterion("voteToCount >=", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountLessThan(String value) {
            addCriterion("voteToCount <", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountLessThanOrEqualTo(String value) {
            addCriterion("voteToCount <=", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountLike(String value) {
            addCriterion("voteToCount like", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountNotLike(String value) {
            addCriterion("voteToCount not like", value, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountIn(List<String> values) {
            addCriterion("voteToCount in", values, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountNotIn(List<String> values) {
            addCriterion("voteToCount not in", values, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountBetween(String value1, String value2) {
            addCriterion("voteToCount between", value1, value2, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVotetocountNotBetween(String value1, String value2) {
            addCriterion("voteToCount not between", value1, value2, "votetocount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountIsNull() {
            addCriterion("voteupCount is null");
            return (Criteria) this;
        }

        public Criteria andVoteupcountIsNotNull() {
            addCriterion("voteupCount is not null");
            return (Criteria) this;
        }

        public Criteria andVoteupcountEqualTo(String value) {
            addCriterion("voteupCount =", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountNotEqualTo(String value) {
            addCriterion("voteupCount <>", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountGreaterThan(String value) {
            addCriterion("voteupCount >", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountGreaterThanOrEqualTo(String value) {
            addCriterion("voteupCount >=", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountLessThan(String value) {
            addCriterion("voteupCount <", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountLessThanOrEqualTo(String value) {
            addCriterion("voteupCount <=", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountLike(String value) {
            addCriterion("voteupCount like", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountNotLike(String value) {
            addCriterion("voteupCount not like", value, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountIn(List<String> values) {
            addCriterion("voteupCount in", values, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountNotIn(List<String> values) {
            addCriterion("voteupCount not in", values, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountBetween(String value1, String value2) {
            addCriterion("voteupCount between", value1, value2, "voteupcount");
            return (Criteria) this;
        }

        public Criteria andVoteupcountNotBetween(String value1, String value2) {
            addCriterion("voteupCount not between", value1, value2, "voteupcount");
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