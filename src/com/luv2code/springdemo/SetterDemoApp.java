package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
//        load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//        retrieve the required beans from the config file (these beans are fully assembeled)
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);


//        call whatever methods required on the beans
        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getDailyFortune());

//        get literal values
        System.out.println(cricketCoach.getEmailAddress());

//        close the context
        context.close();

    }
}
