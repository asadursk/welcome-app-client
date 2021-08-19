package com.example.welcomeclient.services;

import com.example.welcomeclient.models.ResponseDTO;

/**
 * CallService should invoke proper request from Welcome Application.
 */
public interface CallService {

    /**
     * Invoke proper request depending on isBossSelected parameter.
     *
     * @param isBossSelected flag to decide if boss or colleague should be called
     * @return ResponseDTO with greeting in proper type depending on param isBossSelected
     */
    ResponseDTO call(boolean isBossSelected);

    /**
     * Invoke proper request to return official greeting by name.
     *
     * @param name to add to greeting
     * @return ResponseDTO with greeting by name in proper type
     */
    ResponseDTO callBossByName(String name);

    /**
     * Invoke proper request to return unofficial greeting by name.
     *
     * @param name to add to greeting
     * @return ResponseDTO with greeting by name in proper type
     */
    ResponseDTO callColleagueByName(String name);

}
