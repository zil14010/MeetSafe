package com.ood.team.entity;
/**
 * Activity Bean
 *
 * @author Ruofan Li
 * @date 2021/4/24
 */
public class Activity {
    /**
     * activityId
     */
    private Integer activityId;

    /**
     * activityCategoryId
     */
    private Integer categoryId;

    /**
     * activityName
     */
    private String activityName;

    /**
     * activityMaxPeople
     */
    private Integer maxPeople;

    /**
     * activity Current People
     */
    private Integer curPeople;

    /**
     * openStatus
     */
    private Integer openStatus;

    /**
     * date
     */
    private String date;

    /**
     * placeId
     */
    private Integer placeId;

    /**
     * placeName
     */
    private String placeName;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCurPeople() {
        return curPeople;
    }

    public void setCurPeople(Integer curPeople) {
        this.curPeople = curPeople;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
