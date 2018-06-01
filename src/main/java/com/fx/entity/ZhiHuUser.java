package com.fx.entity;

/**
 * <dl>
 * <dt>ZhiHuUserSimple</dt>
 * <dd>Description:CREATE By maxBear</dd>
 * <dd>Copyright: Copyright (C) 2017</dd>
 * <dd>CreateDate: 2017/9/18</dd>
 * </dl>
 *  知乎用户信息
 *  https://www.zhihu.com/people/sakura-65-38/followers
 *  他关注的https://www.zhihu.com/people/urlToken/following
 *  关注他的https://www.zhihu.com/people/urlToken/followers
 * @author ${fxiong}
 */
public class ZhiHuUser {

    private String accountStatus;
    private String allowMessage;
    private String answerCount;
    private String articlesCount;
    private String avatarHue;
    private String avatarUrl;
    private String avatarUrlTemplate;
    private String badge;
    private String columnsCount;
    private String commercialQuestionCount;
    private String coverUrl;
    private String description;
    private String educations;
    private String employments;
    private String favoriteCount;
    private String favoritedCount;
    private String followerCount;
    private String followingColumnsCount;
    private String followingCount;
    private String followingFavlistsCount;
    private String followingQuestionCount;
    private String followingTopicCount;
    private String gender;
    private String headline;
    private String hostedLiveCount;
    private String id;
    private String includedAnswersCount;
    private String includedArticlesCount;
    private String includedText;
    private String isActive;
    private String isAdvertiser;
    private String isBlocked;
    private String isBlocking;
    private String isFollowed;
    private String isFollowing;
    private String isForceRenamed;
    private String isOrg;
    private String isPrivacyProtected;
    private String locations;
    private String logsCount;
    private String messageThreadToken;
    private String mutualFolloweesCount;
    private String name;
    private String participatedLiveCount;
    private String pinsCount;
    private String questionCount;
    private String thankFromCount;
    private String thankToCount;
    private String thankedCount;
    private String type;
    private String url;
    private String urlToken;
    private String userType;
    private String voteFromCount;
    private String voteToCount;
    private String voteupCount;

    public ZhiHuUser() {
    }

    public ZhiHuUser(String accountStatus, String allowMessage, String answerCount, String articlesCount, String avatarHue, String avatarUrl, String avatarUrlTemplate, String badge, String columnsCount, String commercialQuestionCount, String coverUrl, String description, String educations, String employments, String favoriteCount, String favoritedCount, String followerCount, String followingColumnsCount, String followingCount, String followingFavlistsCount, String followingQuestionCount, String followingTopicCount, String gender, String headline, String hostedLiveCount, String id, String includedAnswersCount, String includedArticlesCount, String includedText, String isActive, String isAdvertiser, String isBlocked, String isBlocking, String isFollowed, String isFollowing, String isForceRenamed, String isOrg, String isPrivacyProtected, String locations, String logsCount, String messageThreadToken, String mutualFolloweesCount, String name, String participatedLiveCount, String pinsCount, String questionCount, String thankFromCount, String thankToCount, String thankedCount, String type, String url, String urlToken, String userType, String voteFromCount, String voteToCount, String voteupCount) {
        this.accountStatus = accountStatus;
        this.allowMessage = allowMessage;
        this.answerCount = answerCount;
        this.articlesCount = articlesCount;
        this.avatarHue = avatarHue;
        this.avatarUrl = avatarUrl;
        this.avatarUrlTemplate = avatarUrlTemplate;
        this.badge = badge;
        this.columnsCount = columnsCount;
        this.commercialQuestionCount = commercialQuestionCount;
        this.coverUrl = coverUrl;
        this.description = description;
        this.educations = educations;
        this.employments = employments;
        this.favoriteCount = favoriteCount;
        this.favoritedCount = favoritedCount;
        this.followerCount = followerCount;
        this.followingColumnsCount = followingColumnsCount;
        this.followingCount = followingCount;
        this.followingFavlistsCount = followingFavlistsCount;
        this.followingQuestionCount = followingQuestionCount;
        this.followingTopicCount = followingTopicCount;
        this.gender = gender;
        this.headline = headline;
        this.hostedLiveCount = hostedLiveCount;
        this.id = id;
        this.includedAnswersCount = includedAnswersCount;
        this.includedArticlesCount = includedArticlesCount;
        this.includedText = includedText;
        this.isActive = isActive;
        this.isAdvertiser = isAdvertiser;
        this.isBlocked = isBlocked;
        this.isBlocking = isBlocking;
        this.isFollowed = isFollowed;
        this.isFollowing = isFollowing;
        this.isForceRenamed = isForceRenamed;
        this.isOrg = isOrg;
        this.isPrivacyProtected = isPrivacyProtected;
        this.locations = locations;
        this.logsCount = logsCount;
        this.messageThreadToken = messageThreadToken;
        this.mutualFolloweesCount = mutualFolloweesCount;
        this.name = name;
        this.participatedLiveCount = participatedLiveCount;
        this.pinsCount = pinsCount;
        this.questionCount = questionCount;
        this.thankFromCount = thankFromCount;
        this.thankToCount = thankToCount;
        this.thankedCount = thankedCount;
        this.type = type;
        this.url = url;
        this.urlToken = urlToken;
        this.userType = userType;
        this.voteFromCount = voteFromCount;
        this.voteToCount = voteToCount;
        this.voteupCount = voteupCount;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAllowMessage() {
        return allowMessage;
    }

    public void setAllowMessage(String allowMessage) {
        this.allowMessage = allowMessage;
    }

    public String getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(String answerCount) {
        this.answerCount = answerCount;
    }

    public String getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(String articlesCount) {
        this.articlesCount = articlesCount;
    }

    public String getAvatarHue() {
        return avatarHue;
    }

    public void setAvatarHue(String avatarHue) {
        this.avatarHue = avatarHue;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrlTemplate() {
        return avatarUrlTemplate;
    }

    public void setAvatarUrlTemplate(String avatarUrlTemplate) {
        this.avatarUrlTemplate = avatarUrlTemplate;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getColumnsCount() {
        return columnsCount;
    }

    public void setColumnsCount(String columnsCount) {
        this.columnsCount = columnsCount;
    }

    public String getCommercialQuestionCount() {
        return commercialQuestionCount;
    }

    public void setCommercialQuestionCount(String commercialQuestionCount) {
        this.commercialQuestionCount = commercialQuestionCount;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEducations() {
        return educations;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }

    public String getEmployments() {
        return employments;
    }

    public void setEmployments(String employments) {
        this.employments = employments;
    }

    public String getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(String favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getFavoritedCount() {
        return favoritedCount;
    }

    public void setFavoritedCount(String favoritedCount) {
        this.favoritedCount = favoritedCount;
    }

    public String getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(String followerCount) {
        this.followerCount = followerCount;
    }

    public String getFollowingColumnsCount() {
        return followingColumnsCount;
    }

    public void setFollowingColumnsCount(String followingColumnsCount) {
        this.followingColumnsCount = followingColumnsCount;
    }

    public String getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(String followingCount) {
        this.followingCount = followingCount;
    }

    public String getFollowingFavlistsCount() {
        return followingFavlistsCount;
    }

    public void setFollowingFavlistsCount(String followingFavlistsCount) {
        this.followingFavlistsCount = followingFavlistsCount;
    }

    public String getFollowingQuestionCount() {
        return followingQuestionCount;
    }

    public void setFollowingQuestionCount(String followingQuestionCount) {
        this.followingQuestionCount = followingQuestionCount;
    }

    public String getFollowingTopicCount() {
        return followingTopicCount;
    }

    public void setFollowingTopicCount(String followingTopicCount) {
        this.followingTopicCount = followingTopicCount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHostedLiveCount() {
        return hostedLiveCount;
    }

    public void setHostedLiveCount(String hostedLiveCount) {
        this.hostedLiveCount = hostedLiveCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIncludedAnswersCount() {
        return includedAnswersCount;
    }

    public void setIncludedAnswersCount(String includedAnswersCount) {
        this.includedAnswersCount = includedAnswersCount;
    }

    public String getIncludedArticlesCount() {
        return includedArticlesCount;
    }

    public void setIncludedArticlesCount(String includedArticlesCount) {
        this.includedArticlesCount = includedArticlesCount;
    }

    public String getIncludedText() {
        return includedText;
    }

    public void setIncludedText(String includedText) {
        this.includedText = includedText;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsAdvertiser() {
        return isAdvertiser;
    }

    public void setIsAdvertiser(String isAdvertiser) {
        this.isAdvertiser = isAdvertiser;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getIsBlocking() {
        return isBlocking;
    }

    public void setIsBlocking(String isBlocking) {
        this.isBlocking = isBlocking;
    }

    public String getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(String isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getIsFollowing() {
        return isFollowing;
    }

    public void setIsFollowing(String isFollowing) {
        this.isFollowing = isFollowing;
    }

    public String getIsForceRenamed() {
        return isForceRenamed;
    }

    public void setIsForceRenamed(String isForceRenamed) {
        this.isForceRenamed = isForceRenamed;
    }

    public String getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(String isOrg) {
        this.isOrg = isOrg;
    }

    public String getIsPrivacyProtected() {
        return isPrivacyProtected;
    }

    public void setIsPrivacyProtected(String isPrivacyProtected) {
        this.isPrivacyProtected = isPrivacyProtected;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getLogsCount() {
        return logsCount;
    }

    public void setLogsCount(String logsCount) {
        this.logsCount = logsCount;
    }

    public String getMessageThreadToken() {
        return messageThreadToken;
    }

    public void setMessageThreadToken(String messageThreadToken) {
        this.messageThreadToken = messageThreadToken;
    }

    public String getMutualFolloweesCount() {
        return mutualFolloweesCount;
    }

    public void setMutualFolloweesCount(String mutualFolloweesCount) {
        this.mutualFolloweesCount = mutualFolloweesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipatedLiveCount() {
        return participatedLiveCount;
    }

    public void setParticipatedLiveCount(String participatedLiveCount) {
        this.participatedLiveCount = participatedLiveCount;
    }

    public String getPinsCount() {
        return pinsCount;
    }

    public void setPinsCount(String pinsCount) {
        this.pinsCount = pinsCount;
    }

    public String getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(String questionCount) {
        this.questionCount = questionCount;
    }

    public String getThankFromCount() {
        return thankFromCount;
    }

    public void setThankFromCount(String thankFromCount) {
        this.thankFromCount = thankFromCount;
    }

    public String getThankToCount() {
        return thankToCount;
    }

    public void setThankToCount(String thankToCount) {
        this.thankToCount = thankToCount;
    }

    public String getThankedCount() {
        return thankedCount;
    }

    public void setThankedCount(String thankedCount) {
        this.thankedCount = thankedCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken(String urlToken) {
        this.urlToken = urlToken;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getVoteFromCount() {
        return voteFromCount;
    }

    public void setVoteFromCount(String voteFromCount) {
        this.voteFromCount = voteFromCount;
    }

    public String getVoteToCount() {
        return voteToCount;
    }

    public void setVoteToCount(String voteToCount) {
        this.voteToCount = voteToCount;
    }

    public String getVoteupCount() {
        return voteupCount;
    }

    public void setVoteupCount(String voteupCount) {
        this.voteupCount = voteupCount;
    }
}
