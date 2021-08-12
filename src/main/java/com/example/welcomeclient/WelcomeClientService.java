package com.example.welcomeclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class WelcomeClientService {

    @Value("${url.colleague}")
    private String urlToCallColleague;

    @Value("${url.boss}")
    private String urlToCallBoss;

    @Autowired
    private RandomChoice randomChoice;

    @Bean
    private RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    public String callYourBoss() {
        return this.buildRequest(this.urlToCallBoss);
    }

    public String callYourColleague() {
        return this.buildRequest(this.urlToCallColleague);
    }

    public String callSomebody() {
        this.randomChoice.rechoose();

        return this.randomChoice.getCurrentPosition().equals(this.randomChoice.getBulletPosition()) ? this.buildRequest(this.urlToCallBoss) : this.buildRequest(this.urlToCallColleague);
    }

    private String buildRequest(String url) {
        return Objects.requireNonNull(restTemplate.exchange(url, HttpMethod.GET, null, ResponseDTO.class).getBody()).getContent();
    }
}
