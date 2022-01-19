package com.gamingservice.craftdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScoreCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String playerName;
    private Double score;

    public ScoreCard(String playerName, Double score) {
        this.playerName = playerName;
        this.score = score;
    }

    public ScoreCard() {
    }

    @Override
    public String toString() {
        return "ScoreCard{" +
                "playerName='" + playerName + '\'' +
                ", score=" + score +
                '}';
    }
}
