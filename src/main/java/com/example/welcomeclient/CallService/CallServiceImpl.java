package com.example.welcomeclient.CallService;

import com.example.welcomeclient.ResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@AllArgsConstructor
public class CallServiceImpl implements CallService {

    private String urlToCallColleague;

    private String urlToCallBoss;

    private RestTemplate restTemplate;

    public String callBossByName(String name) {
        return makeRequest(urlToCallBoss, name);
    }

    public String callColleagueByName(String name) {
        return makeRequest(urlToCallColleague, name);
    }

    public String call(boolean isBossSelected) {
        return makeRequest(getProperUrl(isBossSelected), "");
    }

    private String makeRequest(String url, String param) {
        ResponseDTO response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                ResponseDTO.class, param).getBody();

        return Objects.requireNonNull(response).getContent();
    }

    private String getProperUrl(boolean isBossSelected) {
        return isBossSelected ? urlToCallBoss : urlToCallColleague;
    }

}
