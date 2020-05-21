package com.car.sys.controller;

import com.car.sys.constast.SysConstast;
import com.car.sys.domain.User;
import com.car.sys.service.UserService;
import com.car.sys.utils.WebUtils;
import com.car.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户登录控制器
 *
 * @author liujiaxin
 * @date 2020-05-12-18:00
 */

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登陆页面
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "system/main/login";
    }

    /**
     * 登陆方法
     */
    @RequestMapping("login")
    public String login(UserVo userVo, Model model) {
        User user = this.userService.login(userVo);
        if (null != user) {
            //如果不为空放到session
            WebUtils.getHttpSession().setAttribute("user", user);
            //记录登录日志 向sys_login_log里面插入数据
            return "system/main/index";
        } else {
            model.addAttribute("error", SysConstast.USER_LOGIN_ERROR_MSG);
            return "system/main/login";
        }
    }

}
