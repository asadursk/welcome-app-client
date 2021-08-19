package com.example.welcomeclient.services;

import com.example.welcomeclient.models.ResponseDTO;

/**
 * WelcomeClientService should use CallService and make a call with proper arguments.
 */
public interface WelcomeClientService {

    /**
     * Call boss by name.
     *
     * @param name to add to greeting
     * @return ResponseDTO with greeting by name in proper type
     */
    ResponseDTO callYourBoss(String name);

    /**
     * Call colleague by name.
     *
     * @param name to add to greeting
     * @return ResponseDTO with greeting by name in proper type
     */
    ResponseDTO callYourColleague(String name);

    /**
     * Make a draw and call selected person.
     *
     * @return ResponseDTO with greeting in proper type
     */
    ResponseDTO callSomebody();
}
