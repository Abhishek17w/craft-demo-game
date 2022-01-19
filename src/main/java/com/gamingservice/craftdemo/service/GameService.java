package com.gamingservice.craftdemo.service;

import com.gamingservice.craftdemo.entity.Game;
import com.gamingservice.craftdemo.entity.Player;
import com.gamingservice.craftdemo.entity.ScoreCard;

import java.util.List;

public interface GameService {

    public Game createGame(Game game);

    public void play(long playerId);

    public List<Player> end(long gameId);

    public List<String> getTopScores();

}
