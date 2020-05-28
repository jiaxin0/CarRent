package com.car.bus.mapper;

import java.util.List;

import com.car.bus.domain.Check;
/**
 * @description:
 * @author:xiongyingjian
 * @date:2020/5/28
 */
public interface CheckMapper {
    int deleteByPrimaryKey(String checkid);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(String checkid);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);


    //查询
    List<Check> queryAllCheck(Check check);
}
