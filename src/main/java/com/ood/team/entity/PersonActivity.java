package com.ood.team.entity;

/**
 * person&activity related Bean
 *
 * @author Ruofan Li
 * @date 2021/3/3
 */
public class PersonActivity {
    /**
     * personActivityId
     */
    private Integer personActivityId;

    /**
     * personId
     */
    private Integer personId;

    /**
     * activityId
     */
    private Integer activityId;

    public Integer getPersonActivityId() {
        return personActivityId;
    }

    public void setPersonActivityId(Integer personActivityId) {
        this.personActivityId = personActivityId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}
