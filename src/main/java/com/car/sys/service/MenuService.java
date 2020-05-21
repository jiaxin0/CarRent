package com.car.sys.service;

import com.car.sys.domain.Menu;
import com.car.sys.utils.DataGridView;
import com.car.sys.vo.MenuVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujiaxin
 * @since 2020-05-13
 */
public interface MenuService{

    /**
     * 查询所有菜单返回
     * List<Menu>
     */
    public List<Menu> queryAllMenuForList(MenuVo menuVo);

    /**
     * 根据用户id查询用户的可用菜单
     */
    public List<Menu> queryMenuByUserIdForList(MenuVo menuVo,Integer userId);

    /**
     * 查询所有菜单
     * @param menuVo
     * @return
     */
    public DataGridView queryAllMenu(MenuVo menuVo);

    /**
     * 添加菜单
     * @param menuVo
     */
    public void addMenu(MenuVo menuVo);

}
