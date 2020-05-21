package com.car.sys.mapper;

import com.car.sys.domain.User;

/**
 * @author liujiaxin
 * @date 2020-05-12-17:33
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Integer userid);
    int updateByPrimarykeySelective(User record);
    int updateByPrimaryKey(User record);

    /**
     * 登陆
     */
    User login(User user);
}
