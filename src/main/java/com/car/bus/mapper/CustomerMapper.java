package com.car.bus.mapper;

import java.util.List;

import com.car.bus.domain.Customer;
/**
 * @description:
 * @author:xiongyingjian
 * @date:2020/5/28
 */
public interface CustomerMapper {
    int deleteByPrimaryKey(String identity);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String identity);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> queryAllCustomer(Customer customer);
}
