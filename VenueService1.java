package pers.huangyuhui.sms.service;

import pers.huangyuhui.sms.bean.Venue;

import java.util.List;

/**
 * Created by xuhao on 2021/4/30.
 */
public interface VenueService1 {

    // TODO: 6/12/2019 根据姓名查询指定/所有管理员信息列表
    List<Venue> selectList(Venue venue);

    // TODO: 6/12/2019 根据用户名查询指定管理员信息
    Venue findByName(String name);

    int insert(Venue Venue);
    int update(Venue Venue);

    // TODO: 6/13/2019 根据id删除管理员信息
    int deleteById(Integer[] ids);
}
