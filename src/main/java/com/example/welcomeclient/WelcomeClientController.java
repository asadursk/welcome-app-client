package com.example.welcomeclient;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
@AllArgsConstructor
public class WelcomeClientController {

    private WelcomeClientService welcomeClientService;

    @GetMapping("/boss")
    public String callYourBoss(@RequestParam String name) {
        return welcomeClientService.callYourBoss(name);
    }

    @GetMapping("/colleague")
    public String callYourColleague(@RequestParam String name) {
        return welcomeClientService.callYourColleague(name);
    }

    @GetMapping("/somebody")
    public String callSomebody() {
        return welcomeClientService.callSomebody();
    }
}
