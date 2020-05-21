package com.car.sys.vo;

import com.car.sys.domain.Menu;

/**
 * @author liujiaxin
 * @date 2020-05-13-10:56
 */
public class MenuVo extends Menu {

    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
