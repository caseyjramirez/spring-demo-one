package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
//        load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        retrieve a bean that is fully assembelled
        Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);


//        call methods on the bean
        System.out.println("Baseball Coach : ");
        System.out.println(baseBallCoach.getDailyWorkOut());
        System.out.println(baseBallCoach.getDailyFortune());

        System.out.println("");
        System.out.println("Track Coach : ");
        System.out.println(trackCoach.getDailyWorkOut());
        System.out.println(trackCoach.getDailyFortune());



//        close the context
        context.close();
    }
}
