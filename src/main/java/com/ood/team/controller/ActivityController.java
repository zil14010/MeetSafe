package com.ood.team.controller;

import com.ood.team.entity.Activity;
import com.ood.team.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Activity Controller
 *
 * @author Ruofan Li
 * @date 2021/5/3
 */
//@Controller
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> activityList(){
        Map<String, Object> result = new HashMap<>();
        List<Activity> activityList = activityService.activityList();
        if(activityList != null){
            result.put("list",activityList);
        }else {
            result.put("msg","search fail");
        }
        return result;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> getActivityByParam(Activity activity){
        Map<String, Object> result = new HashMap<>();
        List<Activity> list = activityService.getActivityByParam(activity);
        if(list != null){
            result.put("list",list);
        }else {
            result.put("msg","search fail");
        }
        return result;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> insertActivity(Activity activity){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = activityService.insertActivity(activity);
        if(returnNum == 1){
            result.put("msg","insert succeed");
        }else {
            result.put("msg","insert fail");
        }
        return result;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> updateActivity(Activity activity){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = activityService.updateActivity(activity);
        if(returnNum == 1){
            result.put("msg","update succeed");
        }else {
            result.put("msg","update fail");
        }
        return result;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> deleteActivity(Integer activityId){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = activityService.deleteActivity(activityId);
        if(returnNum == 1){
            result.put("msg","delete succeed");
        }else {
            result.put("msg","delete fail");
        }
        return result;
    }

    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> batchDeleteActivity(List<Integer> activityIdList){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = activityService.batchDeleteActivity(activityIdList);
        if(returnNum == activityIdList.size()){
            result.put("msg","delete succeed");
            result.put("num",returnNum);
        }else {
            result.put("msg","delete fail");
        }
        return result;
    }


    //My Activity
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> selectPersonActivity(Integer personId){
        Map<String, Object> result = new HashMap<>();
        List<Activity> list = activityService.selectPersonActivity(personId);
        if(list.isEmpty()){
            result.put("msg","fail");
        }else {
            result.put("msg","succeed");
            result.put("list",list);
        }
        return result;
    }
}
