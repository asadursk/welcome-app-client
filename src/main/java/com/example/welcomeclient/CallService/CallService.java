package com.example.welcomeclient.CallService;

/**
 * CallService should communicate with Welcome Application via HTTP client.
 *
 * Each method should invoke proper request from Welcome Application.
 */
public interface CallService {

    String call(boolean isBossSelected);

    String callBossByName(String name);

    String callColleagueByName(String name);

}
