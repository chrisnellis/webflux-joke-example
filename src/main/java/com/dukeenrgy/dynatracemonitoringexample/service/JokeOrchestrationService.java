package com.dukeenrgy.dynatracemonitoringexample.service;

import com.dukeenrgy.dynatracemonitoringexample.controller.model.JokeResponse;
import com.dukeenrgy.dynatracemonitoringexample.service.api.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class JokeOrchestrationService {
    private JokeService jokeService;

    public Mono<JokeResponse> retrieveJokes() {
        var jokeMono1 = jokeService.getJoke();
        var jokeMono2 = jokeService.getJoke();

        return jokeMono1.flatMap(jokeResponse1 -> jokeMono2.flatMap(jokeResponse2 ->
                Mono.just(new JokeResponse(jokeResponse1, jokeResponse2))));
    }
}
