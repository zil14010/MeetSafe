package com.ood.team.service.impl;

import com.ood.team.dao.ActivityMapper;
import com.ood.team.entity.Activity;
import com.ood.team.entity.ActivityExample;
import com.ood.team.entity.PersonActivity;
import com.ood.team.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {
//    @Autowired
    ActivityMapper activityMapper;
    /**
     * get All Activity in DB
     * used BY user&admin
     *
     * @return List
     */
    @Override
    public List<Activity> activityList() {
        return activityMapper.activityList();
    }

    /**
     * get List<Activity> BY parameter
     * used BY user&admin
     *
     * @param activity
     * @return List
     */
    @Override
    public List<Activity> getActivityByParam(Activity activity) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        if(activity.getActivityId()!=null){
            criteria.andActivityIdEqualTo(activity.getActivityId());
        }
        if(!activity.getActivityName().isEmpty()){
            criteria.andActivityNameEqualTo(activity.getActivityName());
        }
        if(activity.getCategoryId()!=null){
            criteria.andCategoryIdEqualTo(activity.getCategoryId());
        }
        if(activity.getMaxPeople()!=null){
            criteria.andMaxPeopleGreaterThan(activity.getMaxPeople());
        }
        if(activity.getCurPeople()!=null){
            criteria.andCurPeopleGreaterThan(activity.getCurPeople());
        }
        if(!activity.getDate().isEmpty()){
            criteria.andactDateEqualTo(activity.getDate());
        }
        if(activity.getOpenStatus()!=null){
            criteria.andopenStatusEqualTo(activity.getOpenStatus());
        }
        if(activity.getPlaceId()!=null){
            criteria.andactPlaceIdEqualTo(activity.getPlaceId());
        }
        if(!activity.getActivityName().isEmpty()){
            criteria.andPlaceNameEqualTo(activity.getActivityName());
        }

        return activityMapper.selectByExample(example);
    }

    /**
     * insertActivity
     * used BY user
     *
     * @param activity
     * @return Integer
     */
    @Override
    public Integer insertActivity(Activity activity) {
        activity.setOpenStatus(0);
        return activityMapper.insert(activity);
    }

    /**
     * updateActivity
     * used BY user
     *
     * @param activity
     * @return Integer
     */
    @Override
    public Integer updateActivity(Activity activity) {
        Integer activityId = activity.getActivityId();
        if(activityMapper.selectByPrimaryKey(activityId) == null){
            return -1;
        }
        return activityMapper.updateByPrimaryKey(activity);
    }

    /**
     * deleteActivity
     * used BY user&admin
     *
     * @param activityId
     * @return Integer
     */
    @Override
    public Integer deleteActivity(Integer activityId) {
        if(activityMapper.selectByPrimaryKey(activityId) == null){
            //does not exist, error
            return -1;
        }
        return activityMapper.deleteByPrimaryKey(activityId);
    }

    /**
     * batchDeleteActivity
     * used BY user&admin
     *
     * @param activityIdList
     * @return Integer
     */
    @Override
    public Integer batchDeleteActivity(List<Integer> activityIdList) {
        Integer num = 0;
        for(Integer activityId:activityIdList){
            //activity exists
            if(activityMapper.selectByPrimaryKey(activityId) != null){
                num += activityMapper.deleteByPrimaryKey(activityId);
            }
        }
        if(num == activityIdList.size()){
            return num;
        }else
            return -1;
    }

    /**
     * select openStatus == 0
     * used BY admin
     *
     * @return List
     */
    @Override
    public List<Activity> selectNonOpenActivity(){
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andopenStatusEqualTo(0);
        List<Activity> list = activityMapper.selectByExample(example);
        return list;
    }

    /**
     * select activity which person join
     * used By user
     *
     * @param personId
     * @return List
     */
    @Override
    public List<Activity> selectPersonActivity(Integer personId) {
        List<PersonActivity> personActivityList = activityMapper.personActivityList(personId);
        List<Activity> activityList = new ArrayList<>();
        for(PersonActivity pa : personActivityList){
            activityList.add(activityMapper.selectByPrimaryKey(pa.getActivityId()));
        }
        if(activityList.size() == personActivityList.size()){
            return activityList;
        }else {
            return new ArrayList<>();
        }
    }
}
