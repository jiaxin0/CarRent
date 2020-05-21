package com.car.sys.controller;

import com.car.sys.constast.SysConstast;
import com.car.sys.domain.Menu;
import com.car.sys.domain.User;
import com.car.sys.service.MenuService;
import com.car.sys.utils.*;
import com.car.sys.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单管理控制器
 *
 * @author liujiaxin
 * @since 2020-05-13
 */

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("loadIndexLeftMenuJson")
    public List<TreeNode> loadIndexLeftMenuJson(MenuVo menuVo){
        //得到当前登陆的用户对象
        User user=(User) WebUtils.getHttpSession().getAttribute("user");
        List<Menu> list=null;
        menuVo.setAvailable(SysConstast.AVAILABLE_TRUE);//只查询可用的
        if(user.getType().equals(SysConstast.USER_TYPE_SUPER)) {//身份为超级管理员
            list=this.menuService.queryAllMenuForList(menuVo);
        }else {
            list=this.menuService.queryMenuByUserIdForList(menuVo, user.getUserid());
        }
        List<TreeNode> nodes= new ArrayList<>();
        //把list里面的数据放到nodes
        for (Menu menu : list) {
            Integer id=menu.getId();
            Integer pid=menu.getPid();
            String title=menu.getTitle();
            String icon=menu.getIcon();
            String href=menu.getHref();
            Boolean spread=menu.getSpread()==SysConstast.SPREAD_TRUE?true:false;
            String target=menu.getTarget();
            nodes.add(new TreeNode(id, pid, title, icon, href, spread, target));
        }
        return TreeNodeBuilder.builder(nodes, 1);
    }


    /**
     * 加载菜单管理左边的菜单树
     */
    @RequestMapping("loadMenuManagerLeftTreeJson")
    public DataGridView loadMenuManagerLeftTreeJson(MenuVo menuVo){
        menuVo.setAvailable(SysConstast.AVAILABLE_TRUE);//只查询可用的
        List<Menu> list=this.menuService.queryAllMenuForList(menuVo);
        List<TreeNode> nodes= new ArrayList<>();
        //把list里面的数据放到nodes
        for (Menu menu : list) {
            Integer id=menu.getId();
            Integer pid=menu.getPid();
            String title=menu.getTitle();
            String icon=menu.getIcon();
            String href=menu.getHref();
            Boolean spread=menu.getSpread()==SysConstast.SPREAD_TRUE?true:false;
            String target=menu.getTarget();
            nodes.add(new TreeNode(id, pid, title, icon, href, spread, target));
        }
        return new DataGridView(nodes);
    }

    /**
     * 加载菜单列表返回DataGridView
     */
    @RequestMapping("loadAllMenu")
    public DataGridView loadAllMenu(MenuVo menuVo) {
        return this.menuService.queryAllMenu(menuVo);
    }


    /**
     * 添加菜单
     */
    @RequestMapping("addMenu")
    public ResultObj addMenu(MenuVo menuVo) {
        try {
            this.menuService.addMenu(menuVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

}
