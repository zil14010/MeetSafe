package pers.huangyuhui.sms.dao;

import pers.huangyuhui.sms.bean.Venue;

import java.util.List;

/**
 * Created by xuhao on 2021/4/30.
 */
public interface VenueMapper1 {

    // TODO: 6/12/2019 根据姓名查询指定/所有管理员信息列表
    List<Venue> selectList(Venue venue);

    Venue findByName(String name);

    int insert(Venue venue);

    int update(Venue venue);

    int deleteById(Integer[] ids);

}
