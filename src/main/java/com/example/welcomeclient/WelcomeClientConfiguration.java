package com.example.welcomeclient;

import com.example.welcomeclient.CallService.CallService;
import com.example.welcomeclient.CallService.CallServiceImpl;
import com.example.welcomeclient.RussianRoulette.RussianRouletteService;
import com.example.welcomeclient.RussianRoulette.RussianRouletteServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.client.RestTemplate;

@Configuration
public class WelcomeClientConfiguration {

    @Value("${url.colleague}")
    public String urlToCallColleague;

    @Value("${url.boss}")
    public String urlToCallBoss;

    @Bean
    public WelcomeClientService WelcomeClientService(RussianRouletteService russianRouletteService, CallService callService) {
        return new WelcomeClientServiceImpl(callService, russianRouletteService);
    }

    @Bean
    public RussianRouletteService RussianRouletteService() {
        return new RussianRouletteServiceImpl();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CallService restTemplateService(RestTemplate restTemplate) {
        return new CallServiceImpl(urlToCallColleague, urlToCallBoss, restTemplate);
    }
}
