package com.heiha.demo.demo4dubbo.provider;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <br>
 * <b>Project:</b> demo4dubbo<br>
 * <b>Date:</b> 2017/7/27 11:09<br>
 * <b>Author:</b> heiha<br>
 */
@Configuration
public class PublishServer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"/demo-notice-dubbo.xml"});
        System.out.println(this.getClass().getName().concat(" will start"));
        context.start();
        System.out.println(this.getClass().getName().concat(" running"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
