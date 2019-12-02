package com.sungang.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        Object o1 = applicationContext.getBean("user");
        Object o2 = applicationContext.getBean("user");
        System.out.println(o1 == o2);
        applicationContext.refresh();
        Object o3 = applicationContext.getBean("user");
        System.out.println(o1 == o3);
    }
}
