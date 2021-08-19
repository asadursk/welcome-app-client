package com.example.welcomeclient.services;

import com.example.welcomeclient.models.ResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@AllArgsConstructor
public class CallServiceImpl implements CallService {

    private String urlToCallColleague;

    private String urlToCallBoss;

    private RestTemplate restTemplate;

    public ResponseDTO callBossByName(String name) {
        return makeRequest(urlToCallBoss, name);
    }

    public ResponseDTO callColleagueByName(String name) {
        return makeRequest(urlToCallColleague, name);
    }

    public ResponseDTO call(boolean isBossSelected) {
        return makeRequest(getProperUrl(isBossSelected), "");
    }

    private ResponseDTO makeRequest(String url, String param) {
        ResponseDTO response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                ResponseDTO.class, param).getBody();

        return Objects.requireNonNull(response);
    }

    private String getProperUrl(boolean isBossSelected) {
        return isBossSelected ? urlToCallBoss : urlToCallColleague;
    }

}
