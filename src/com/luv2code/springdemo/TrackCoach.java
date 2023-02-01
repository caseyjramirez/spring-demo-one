package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend some time running!";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
