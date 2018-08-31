package com.smiler.spring.boot.sample.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("ServletContex销毁");
        System.out.println(event.getSource().getClass().getName());
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("ServletContex初始化");
        System.out.println(event.getSource().getClass().getName());
    }

}
