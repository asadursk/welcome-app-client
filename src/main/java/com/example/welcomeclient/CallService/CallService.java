package com.example.welcomeclient.CallService;

import org.springframework.stereotype.Service;

@Service
public interface CallService {

    String call(boolean isBossSelected);

    String callByName(boolean isBossSelected, String name);

}
