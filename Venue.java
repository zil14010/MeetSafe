package pers.huangyuhui.sms.bean;

import java.util.Date;

/**
 * @project: sms
 * @description: 活动场地信息管理
 * @author: 黄宇辉
 * @date: 6/10/2019-3:41 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Venue {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvaible_time() {
        return avaible_time;
    }

    public void setAvaible_time(String avaible_time) {
        this.avaible_time = avaible_time;
    }

    public String getMaximum_volumn() {
        return maximum_volumn;
    }

    public void setMaximum_volumn(String maximum_volumn) {
        this.maximum_volumn = maximum_volumn;
    }

    public String getOpen_status() {
        return open_status;
    }

    public void setOpen_status(String open_status) {
        this.open_status = open_status;
    }

    public String getCurrentvolumn() {
        return currentvolumn;
    }

    public void setCurrentvolumn(String currentvolumn) {
        this.currentvolumn = currentvolumn;
    }

    private Integer id;
    private String name;
    private String avaible_time;
    private String maximum_volumn;
    private String open_status;
    private String currentvolumn;

}
