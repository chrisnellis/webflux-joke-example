package com.dukeenrgy.dynatracemonitoringexample.service.api;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;

@Service
public class JokeService {
    private WebClient client = WebClient.builder().build();
    private URI jokeURI = URI.create("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart");

    public Mono<JokeModel> getJoke() {
        return client.get().uri(jokeURI).retrieve().bodyToMono(JokeModel.class);
    }
}
