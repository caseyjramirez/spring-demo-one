package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
//        load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

//        get the needed beans
        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

//        call the needed methods
        System.out.println(baseballCoach);
//        close the context
        context.close();

    }
}
