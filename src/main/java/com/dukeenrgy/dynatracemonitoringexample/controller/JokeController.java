package com.dukeenrgy.dynatracemonitoringexample.controller;

import com.dukeenrgy.dynatracemonitoringexample.controller.model.JokeResponse;
import com.dukeenrgy.dynatracemonitoringexample.service.JokeOrchestrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class JokeController {
    private JokeOrchestrationService jokeOrchestrationService;

    @GetMapping("/jokes")
    public Mono<JokeResponse> getJokes() {
        return jokeOrchestrationService.retrieveJokes();
    }
}
