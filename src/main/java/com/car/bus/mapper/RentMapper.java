package com.car.bus.mapper;

import java.util.List;

import com.car.bus.domain.Rent;
/**
 * @description:
 * @author:xiongyingjian
 * @date:2020/5/28
 */
public interface RentMapper {
    int deleteByPrimaryKey(String rentid);

    int insert(Rent record);

    int insertSelective(Rent record);

    Rent selectByPrimaryKey(String rentid);

    int updateByPrimaryKeySelective(Rent record);

    int updateByPrimaryKey(Rent record);

    //查询
    public List<Rent> queryAllRent(Rent rent);

}
