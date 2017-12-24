package com.oovever.o2o.entity;

import java.util.Date;

/**
 * 学校区域实体类
 * @author OovEver
 * @Date 2017/12/24 20:34
 */
public class Area {
    //ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重，越高出现在越前面
    private Integer priority;
    //创建时间
    private Date createTime;
    //    更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }


}
