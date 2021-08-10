package com.example.welcomeclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class WelcomeClientController {

    @Autowired
    private WelcomeClientService welcomeClientService;

    @GetMapping("/boss")
    public String callYourBoss() {
        return welcomeClientService.callYourBoss();
    }

    @GetMapping("/colleague")
    public String callYourColleague() {
        return welcomeClientService.callYourColleague();
    }

    @GetMapping("/somebody")
    public String callSomebody() {
        return welcomeClientService.callSomebody();
    }
}
