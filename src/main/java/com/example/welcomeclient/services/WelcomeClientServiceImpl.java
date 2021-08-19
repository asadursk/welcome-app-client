package com.example.welcomeclient.services;

import com.example.welcomeclient.models.ResponseDTO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WelcomeClientServiceImpl implements WelcomeClientService {

    private CallService callService;

    private RussianRouletteService russianRouletteService;

    public ResponseDTO callYourBoss(String name) {
        return callService.callBossByName(name);
    }

    public ResponseDTO callYourColleague(String name) {
        return callService.callColleagueByName(name);
    }

    public ResponseDTO callSomebody() {
        var isBossSelected = russianRouletteService.spinAndGetResult();

        return callService.call(isBossSelected);
    }
}
