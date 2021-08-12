package com.example.welcomeclient;

import com.example.welcomeclient.RestTemplate.RestTemplateService;
import com.example.welcomeclient.RussianRoulette.RussianRouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WelcomeClientServiceImpl implements WelcomeClientService {

    @Value("${url.colleague}")
    public String urlToCallColleague;

    @Value("${url.boss}")
    public String urlToCallBoss;

    @Autowired
    private RussianRouletteService russianRouletteService;

    @Autowired
    private RestTemplateService restTemplateService;

    public String callYourBoss(String name) {
        return restTemplateService.makeRequest(urlToCallBoss, name);
    }

    public String callYourColleague(String name) {
        return restTemplateService.makeRequest(urlToCallColleague, name);
    }

    public String callSomebody() {
        var isBossSelected = russianRouletteService.spinAndGetResult();

        return restTemplateService.makeRequest(getProperUrl(isBossSelected), "");
    }

    private String getProperUrl(boolean isBossSelected) {
        return isBossSelected ? urlToCallBoss : urlToCallColleague;
    }
}
