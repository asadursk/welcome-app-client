package com.example.welcomeclient.services;

import com.example.welcomeclient.models.ResponseDTO;

/**
 * WelcomeClientService should use CallService and make a call with proper arguments.
 */
public interface WelcomeClientService {

    ResponseDTO callYourBoss(String name);

    ResponseDTO callYourColleague(String name);

    ResponseDTO callSomebody();
}
