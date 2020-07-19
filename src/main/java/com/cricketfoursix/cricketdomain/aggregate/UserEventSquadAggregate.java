package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.squad.UserSquadPlayer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "userEventSquad")
public class UserEventSquadAggregate {
    @Id
    private String userEventId;
    private Long gameId;
    private String userName;
    private List<UserSquadPlayer> userSquadPlayers;

    public String getUserEventId() {
        return userEventId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEventId(String userEventId) {
        this.userEventId = userEventId;
    }

    public List<UserSquadPlayer> getUserSquadPlayers() {
        return userSquadPlayers;
    }

    public void setUserSquadPlayers(List<UserSquadPlayer> userSquadPlayers) {
        this.userSquadPlayers = userSquadPlayers;
    }
}
