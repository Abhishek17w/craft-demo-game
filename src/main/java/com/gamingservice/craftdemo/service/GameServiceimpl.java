package com.gamingservice.craftdemo.service;

import com.gamingservice.craftdemo.dao.GamingDaoimpl;
import com.gamingservice.craftdemo.dao.ScoreCardDao;
import com.gamingservice.craftdemo.entity.Game;
import com.gamingservice.craftdemo.entity.Player;
import com.gamingservice.craftdemo.entity.ScoreCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceimpl implements GameService {

    @Autowired
    private GamingDaoimpl gamingDao;

    @Autowired
    private Game game;

    @Autowired
    private GameStrategy gameStrategy;

    @Autowired
    private ScoreCardDao scoreCardDao;

    public GameServiceimpl(GameStrategy strategy) {
        this.gameStrategy = strategy;
    }

    @Override
    public Game createGame(Game game) {
        game.setPlayers(game.getPlayers());
        new GameServiceimpl(new DefaultGameStrategy());
        gamingDao.add(game);
        return game;
    }

    @Override
    public void play(long playerId) {
        gameStrategy.play(playerId);
    }

    @Override
    public List<Player> end(long gameId) {
        List<Player> players = gameStrategy.getPlayers();
        Game game = new Game(gameId, players);
        gamingDao.update(game);
        for(Player p : players) {
            ScoreCard scoreCard = new ScoreCard(p.getName(),p.getScore());
            scoreCardDao.save(scoreCard);
        }
        return players;
    }

    @Override
    public List<String> getTopScores() {
        List<ScoreCard> topScores = scoreCardDao.findTop5ByOrderByScoreDesc();
        List<String> topWinners = new ArrayList<>();
        for(ScoreCard scoreCard : topScores) {
            topWinners.add(scoreCard.toString());
        }
        return topWinners;
    }

}
