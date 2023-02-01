package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

//    no args constructor
    public CricketCoach() {
        System.out.println("Cricket Coach: inside no args");
    }

//    constructor
//    public CricketCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: inside email setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: inside team setter");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice some fast bowling!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
