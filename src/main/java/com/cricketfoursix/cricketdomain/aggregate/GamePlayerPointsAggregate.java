package com.cricketfoursix.cricketdomain.aggregate;


import com.cricketfoursix.cricketdomain.common.squad.PlayerPoints;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "game_player_points")
public class GamePlayerPointsAggregate {
    @Id
    private Long id;

    private Map<Long, PlayerPoints> playerPointsMap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, PlayerPoints> getPlayerPointsMap() {
        return playerPointsMap;
    }

    public void setPlayerPointsMap(Map<Long, PlayerPoints> playerPointsMap) {
        this.playerPointsMap = playerPointsMap;
    }
}
