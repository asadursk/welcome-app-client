package com.example.welcomeclient;

import org.springframework.stereotype.Service;

/**
 * WelcomeClientService should communicate with Welcome Application via HTTP client.
 * Each method should invoke proper request from Welcome Application.
 */
@Service
public interface WelcomeClientService {

    String callYourBoss(String name);

    String callYourColleague(String name);

    String callSomebody();
}
