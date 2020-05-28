package com.car.bus.service;

import com.car.bus.domain.Rent;
import com.car.bus.vo.RentVo;
import com.car.sys.utils.DataGridView;

/**
 * @description:
 * @author:xiongyingjian 
 * @date:2020/5/28
 */
public interface RentService {

    /**
     * 保存出租单信息
     * @param rentVo
     */
    void addRent(RentVo rentVo);

    /**
     * 查询
     * @param rentVo
     */
    DataGridView queryAllRent(RentVo rentVo);

    /**
     * 修改出租单
     * @param rentVo
     */
    void updateRent(RentVo rentVo);

    /**
     * 删除出租单
     * @param rentid
     */
    void deleteRent(String rentid);

    /**
     *  根据出租单号查询出租单信息
     * @param rentid
     * @return
     */
    Rent queryRentByRentId(String rentid);

}

