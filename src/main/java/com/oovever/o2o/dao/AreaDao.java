package com.oovever.o2o.dao;

import com.oovever.o2o.entity.Area;

import java.util.List;

/**
 * @author OovEver
 * @DATE 2017/12/24 22:36
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList区域列表
     */
    List<Area> queryArea();
}
