package com.car.sys.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author liujiaxin
 * @date 2020-05-12-16:40
 */

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        //取到ServletContext
        ServletContext context = arg0.getServletContext();
        context.setAttribute("car", context.getContextPath());
        System.err.println("---------Servlet容器创建成功 car被放到ServletContext作用域-------");
    }

}
