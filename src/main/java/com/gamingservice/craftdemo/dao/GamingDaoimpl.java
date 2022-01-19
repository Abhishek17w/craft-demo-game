package com.gamingservice.craftdemo.dao;

import com.gamingservice.craftdemo.entity.Game;
import com.gamingservice.craftdemo.service.GameServiceimpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GamingDaoimpl implements GamingDao{

    private List<Game> games;

    public GamingDaoimpl() {
        games = new ArrayList<>();
    }

    @Override
    public void add(Game game) {
        games.add(game);
    }

    @Override
    public void update(Game game) {
        Game g = delete(game.getId());
        if(g!=null)
            games.remove(g);
        games.add(game);
    }

    public Game delete(long id) {
        for(Game g : games) {
            if(g.getId() == id) {
                return g;
            }
        }
        return null;
    }

}
