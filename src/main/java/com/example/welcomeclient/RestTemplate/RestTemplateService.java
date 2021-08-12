package com.example.welcomeclient.RestTemplate;

import org.springframework.stereotype.Service;

@Service
public interface RestTemplateService {

    String makeRequest(String url, String param);

}
