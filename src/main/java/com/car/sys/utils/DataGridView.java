package com.car.sys.utils;

/**
 * @author liujiaxin
 * @date 2020-05-13-11:09
 */
public class DataGridView {

    private Integer code=0;
    private String msg="";
    private Long count;
    private Object data;

    public DataGridView() {
        // TODO Auto-generated constructor stub
    }
    public DataGridView(Object data) {
        super();
        this.data = data;
    }

    public DataGridView(Long count, Object data) {
        super();
        this.count = count;
        this.data = data;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
