package com.gamingservice.craftdemo.service;

import com.gamingservice.craftdemo.entity.Player;

import java.util.List;

public interface GameStrategy {

    public Double play(long playerId);
    public List<Player> getPlayers();
}
