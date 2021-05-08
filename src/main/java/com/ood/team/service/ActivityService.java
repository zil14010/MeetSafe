package com.ood.team.service;

import com.ood.team.entity.Activity;

import java.util.List;

/**
 * Activity Service
 *
 * @author Ruofan Li
 * @date 2021/4/26
 */
public interface ActivityService {
    /**
     * getActivity
     * used BY user&admin
     *
     * @return List
     */
    public List<Activity> activityList();

    /**
     * get List<Activity> BY parameter
     * used BY user&admin
     *
     * @param activity
     * @return List
     */
    public List<Activity> getActivityByParam(Activity activity);

    /**
     * insertActivity
     * used BY user
     *
     * @param activity
     * @return Integer
     */
    public Integer insertActivity(Activity activity);

    /**
     * updateActivity
     * used BY user
     *
     * @param activity
     * @return Integer
     */
    public Integer updateActivity(Activity activity);

    /**
     * deleteActivity
     * used BY user&admin
     *
     * @param activityId
     * @return Integer
     */
    public Integer deleteActivity(Integer activityId);

    /**
     * batchDeleteActivity
     * used BY user&admin
     *
     * @param activityIdList
     * @return Integer
     */
    public Integer batchDeleteActivity(List<Integer> activityIdList);

    /**
     * select activities which openStatus = 0
     * used BY admin
     *
     * @return List
     */
    public List<Activity> selectNonOpenActivity();

    /**
     * select activity which person join
     * used By user
     *
     * @param personId
     * @return
     */
    public List<Activity> selectPersonActivity(Integer personId);
}
