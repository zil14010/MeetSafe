package pers.huangyuhui.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.huangyuhui.sms.bean.Venue;
import pers.huangyuhui.sms.dao.VenueMapper1;
import pers.huangyuhui.sms.service.VenueService1;

import java.util.List;

/**
 * Created by xuhao on 2021/4/30.
 */
@Service
@Transactional
public class VenueServiceImpl implements VenueService1 {


    //注入Mapper接口对象
    @Autowired
    private VenueMapper1 venueMapper;

    @Override
    public List<Venue> selectList(Venue venue) {
        return venueMapper.selectList(venue);
    }


    @Override
    public Venue findByName(String name) {
        return venueMapper.findByName(name);
    }

    @Override
    public int insert(Venue venue) {
        return venueMapper.insert(venue);
    }

    @Override
    public int update(Venue venue) { return venueMapper.update(venue); }

    @Override
    public int deleteById(Integer[] ids) {
        return venueMapper.deleteById(ids);
    }
}
