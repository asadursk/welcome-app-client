package com.example.welcomeclient.RestTemplate;

import com.example.welcomeclient.ResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@AllArgsConstructor
public class RestTemplateServiceImpl implements RestTemplateService {

    private RestTemplate restTemplate;

    public String makeRequest(String url, String param) {
        return this.buildRequest(url, param);
    }

    private String buildRequest(String url, String param) {
        return Objects.requireNonNull(restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                ResponseDTO.class, param).getBody()).getContent();
    }
}
