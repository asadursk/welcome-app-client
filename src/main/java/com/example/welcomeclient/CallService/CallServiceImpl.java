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

    public String callByName(boolean isBossSelected, String name) {
        return makeRequest(getProperUrl(isBossSelected), name);
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
