package com.dukeenrgy.dynatracemonitoringexample.controller.model;

import com.dukeenrgy.dynatracemonitoringexample.service.api.JokeModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JokeResponse {
    private String response;

    public JokeResponse(JokeModel jokeResponse1, JokeModel jokeResponse2) {
        response = jokeResponse1.getSetup() + "\n" + jokeResponse1.getDelivery() + "!!!\nBut that's not all!\n\n " +
                jokeResponse2.getSetup() + "\n" + jokeResponse2.getDelivery() + "!!!";
    }
}
