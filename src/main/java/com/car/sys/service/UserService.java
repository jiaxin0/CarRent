package com.car.sys.service;

import com.car.sys.domain.User;
import com.car.sys.vo.UserVo;

/**
 * 用户服务接口
 * @author liujiaxin
 * @date 2020-05-12-17:53
 */
public interface UserService {

    User login(UserVo userVo);
}
