package com.example.welcomeclient;

import com.example.welcomeclient.CallService.CallService;
import com.example.welcomeclient.RussianRoulette.RussianRouletteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WelcomeClientServiceImpl implements WelcomeClientService {

    private CallService callService;

    private RussianRouletteService russianRouletteService;

    public String callYourBoss(String name) {
        return callService.callByName(true, name);
    }

    public String callYourColleague(String name) {
        return callService.callByName(false, name);
    }

    public String callSomebody() {
        var isBossSelected = russianRouletteService.spinAndGetResult();

        return callService.call(isBossSelected);
    }
}
