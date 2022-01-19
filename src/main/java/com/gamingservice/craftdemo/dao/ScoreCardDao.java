package com.gamingservice.craftdemo.dao;

import com.gamingservice.craftdemo.entity.ScoreCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreCardDao extends JpaRepository<ScoreCard,Long> {
    List<ScoreCard> findTop5ByOrderByScoreDesc();
}
