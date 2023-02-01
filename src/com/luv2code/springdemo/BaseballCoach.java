package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes batting!";
    }

    @Override
    public String getDailyFortune() {
//        use my fortune service to
        return fortuneService.getFortune();
    }

}
