package com.gamingservice.craftdemo.service;

import com.gamingservice.craftdemo.entity.Game;
import com.gamingservice.craftdemo.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class DefaultGameStrategy implements  GameStrategy{

    private final int MIN_SCORE = 0;
    private final int MAX_SCORE = 10;
    //private List<Player> players;

    @Autowired
    private Game g;

//    public DefaultGameStrategy(List<Player> players) {
//        this.players = players;
//    }

    @Override
    public List<Player> getPlayers() {
        return g.getPlayers();
    }

    @Override
    public Double play(long playerId) {
        int randomScore = ThreadLocalRandom.current().nextInt(MIN_SCORE, MAX_SCORE + 1);
        Player p = getPlayer(playerId);
        //p.setScore(p.getScore()+randomScore);
        p.setScore(p.getScore()+10);
        return p.getScore();
    }

    public Player getPlayer(long playerId) {
        for(Player p : g.getPlayers()) {
            if(p.getId() == playerId)
                return p;
        }
        return null;
    }
}
