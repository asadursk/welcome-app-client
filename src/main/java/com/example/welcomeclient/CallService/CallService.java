package com.example.welcomeclient.CallService;

import com.example.welcomeclient.ResponseDTO;

/**
 * CallService should communicate with Welcome Application via HTTP client.
 *
 * Each method should invoke proper request from Welcome Application.
 */
public interface CallService {

    ResponseDTO call(boolean isBossSelected);

    ResponseDTO callBossByName(String name);

    ResponseDTO callColleagueByName(String name);

}
