package com.car.sys.service.impl;

import com.car.sys.domain.User;
import com.car.sys.mapper.UserMapper;
import com.car.sys.service.UserService;
import com.car.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author liujiaxin
 * @date 2020-05-12-17:55
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(UserVo uservo) {
        //明文 123456
        //生成密文
        String pwd = DigestUtils.md5DigestAsHex(uservo.getPwd().getBytes());
        uservo.setPwd(pwd);

        return userMapper.login(uservo);
    }
}
