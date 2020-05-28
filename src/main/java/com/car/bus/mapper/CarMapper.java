package com.car.bus.mapper;

import java.util.List;

import com.car.bus.domain.Car;

/**
 * @description:
 * @author:xiongyingjian
 * @date:2020/5/28
 */
public interface CarMapper {
    int deleteByPrimaryKey(String carnumber);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(String carnumber);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    List<Car> queryAllCar(Car car);
}
