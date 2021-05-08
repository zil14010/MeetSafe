package com.ood.team.dao;

import com.ood.team.entity.Activity;
import com.ood.team.entity.ActivityExample;
import com.ood.team.entity.*;

import java.util.List;

/**
 * ActivityMapper
 *
 * @author Ruofan Li
 * @date 2021/4/24
 */
public interface ActivityMapper {
    /**
     * countByExample
     *
     * @param example
     * @return Long
     */
    Long countByExample(ActivityExample example);

    /**
     * deleteByExample
     *
     * @param example
     * @return Integer
     */
    Integer deleteByExample(ActivityExample example);

    /**
     * deleteByPrimaryKey
     *
     * @param activityId
     * @return Integer
     */
    Integer deleteByPrimaryKey(Integer activityId);

    /**
     * insert
     *
     * @param activity
     * @return Integer
     */
    Integer insert(Activity activity);

    /**
     * insertSelective
     *
     * @param activity
     * @return Integer
     */
    Integer insertSelective(Activity activity);

    /**
     * selectByExample
     *
     * @param example
     * @return List
     */
    List<Activity> selectByExample(ActivityExample example);

    /**
     * selectByPrimaryKey
     *
     * @param activityId
     * @return Activity
     */
    Activity selectByPrimaryKey(Integer activityId);

    /**
     * updateByPrimaryKeySelective
     *
     * @param activity
     * @return Integer
     */
    Integer updateByPrimaryKeySelective(Activity activity);

    /**
     * updateByPrimaryKey
     *
     * @param activity
     * @return Integer
     */
    Integer updateByPrimaryKey(Activity activity);

    /**
     * get activityList
     *
     * @return List
     */
    List<Activity> activityList();

    /**
     * get activity of person
     *
     * @param personId
     * @return List
     */
    List<PersonActivity> personActivityList(Integer personId);
}
