package com.dukeenrgy.dynatracemonitoringexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {
    @GetMapping("/health")
    public String getHeartbeat() {
        return "Healthy!";
    }
}
