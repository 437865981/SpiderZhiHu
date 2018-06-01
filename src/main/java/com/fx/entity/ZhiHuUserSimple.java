package com.fx.entity;

/**
 * <dl>
 * <dt>ZhiHuUserSimple</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/18</dd>
 * </dl>
 *  ֪���û���Ϣ
 *  https://www.zhihu.com/people/sakura-65-38/followers
 *  他关注的人：https://www.zhihu.com/people/urlToken/following
 *  关注他的人：https://www.zhihu.com/people/urlToken/followers
 * @author ${纔訾}
 */
public class ZhiHuUserSimple {

    private boolean isFollowed;
    private String avatarUrlTemplate; //图片路径 xl xll.jpg
    private String userType;
    private String answerCount;
    private boolean isFollowing;
    private String headline;
    private String urlToken;//英文�?
    private String id;
    private String articlesCount;
    private String type;
    private String name;  //中文�?
    private String url;
    private Integer gender;
    private boolean isAdvertiser;
    private String avatarUrl;
    private boolean isOrg;
    private Integer followerCount;
    private String badge;

    public ZhiHuUserSimple() {
    }

    public ZhiHuUserSimple(boolean isFollowed, String avatarUrlTemplate, String userType, String answerCount, boolean isFollowing, String headline, String urlToken, String id, String articlesCount, String type, String name, String url, Integer gender, boolean isAdvertiser, String avatarUrl, boolean isOrg, Integer followerCount, String badge) {
        this.isFollowed = isFollowed;
        this.avatarUrlTemplate = avatarUrlTemplate;
        this.userType = userType;
        this.answerCount = answerCount;
        this.isFollowing = isFollowing;
        this.headline = headline;
        this.urlToken = urlToken;
        this.id = id;
        this.articlesCount = articlesCount;
        this.type = type;
        this.name = name;
        this.url = url;
        this.gender = gender;
        this.isAdvertiser = isAdvertiser;
        this.avatarUrl = avatarUrl;
        this.isOrg = isOrg;
        this.followerCount = followerCount;
        this.badge = badge;
    }

    @Override
    public String toString() {
        return
                "\""+ id +  "\"" +","+
                "\"" + isFollowed + "\"" +","+
        "\"" + avatarUrlTemplate + "\"" +","+
        "\"" + userType +  "\"" +","+
        "\"" + answerCount +  "\"" +","+
        "\"" + isFollowing +  "\"" +","+
        "\"" + headline +  "\"" +","+
        "\"" + urlToken +  "\"" +","+

        "\"" + articlesCount + "\"" +","+
        "\"" + type + "\"" +","+
        "\"" + name + "\"" +","+
        "\"" + url + "\"" +","+
        "\"" + gender + "\"" +","+
        "\"" + isAdvertiser+ "\"" +","+
        "\"" + avatarUrl + "\"" +","+
        "\"" + isOrg + "\"" +","+
        "\"" + followerCount + "\"" +","+
        "\"" + "[]" +"\"";
    }

    public boolean isFollowed() {
        return isFollowed;
    }

    public void setFollowed(boolean followed) {
        isFollowed = followed;
    }

    public String getAvatarUrlTemplate() {
        return avatarUrlTemplate;
    }

    public void setAvatarUrlTemplate(String avatarUrlTemplate) {
        this.avatarUrlTemplate = avatarUrlTemplate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(String answerCount) {
        this.answerCount = answerCount;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken(String urlToken) {
        this.urlToken = urlToken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(String articlesCount) {
        this.articlesCount = articlesCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public boolean isAdvertiser() {
        return isAdvertiser;
    }

    public void setAdvertiser(boolean advertiser) {
        isAdvertiser = advertiser;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isOrg() {
        return isOrg;
    }

    public void setOrg(boolean org) {
        isOrg = org;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }
}
