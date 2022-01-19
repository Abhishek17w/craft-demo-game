 package com.gamingservice.craftdemo.controller;

import com.gamingservice.craftdemo.entity.Game;
import com.gamingservice.craftdemo.entity.Player;
import com.gamingservice.craftdemo.entity.ScoreCard;
import com.gamingservice.craftdemo.service.DefaultGameStrategy;
import com.gamingservice.craftdemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService service;

    // create game
    @PostMapping("/createGame")
    public Game create(@RequestBody Game game) {
        service.createGame(game);
        return game;
    }

    // play game
    @GetMapping("/play/{playerId}")
    public void play(@PathVariable int playerId) {
        service.play(playerId);
    }

    // end game
    @GetMapping("/end/{gameId}")
    public List<Player> end(@PathVariable long gameId) {
        return service.end(gameId);
    }

    // broadcast score
    @GetMapping("/top-scores")
    public List<String> getTopScores() {
        return service.getTopScores();
    }

}
