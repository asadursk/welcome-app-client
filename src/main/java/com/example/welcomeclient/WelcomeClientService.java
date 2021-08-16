package com.example.welcomeclient;

/**
 * WelcomeClientService should use CallService and make a call with proper arguments.
 */
public interface WelcomeClientService {

    String callYourBoss(String name);

    String callYourColleague(String name);

    String callSomebody();
}
