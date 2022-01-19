package com.gamingservice.craftdemo.entity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Game {

    private long id;
    private List<Player> players;

    public Game() {
    }

    public Game(long id, List<Player> players) {
        this.id = id;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public long getId() {
        return id;
    }
}
