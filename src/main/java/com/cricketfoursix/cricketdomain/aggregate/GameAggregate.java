package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.game.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "games")
public class GameAggregate {
    @Id
    private Long id;

    private String name;


    private GameInfo gameInfo;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Date lastUpdated;


    private Competitor competitor1;
    private Competitor competitor2;

    private LiveScoreCard liveScoreCard;

    private String gameStatusApiRef;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GameInfo getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }


    public LiveScoreCard getLiveScoreCard() {
        return liveScoreCard;
    }

    public void setLiveScoreCard(LiveScoreCard liveScoreCard) {
        this.liveScoreCard = liveScoreCard;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public Competitor getCompetitor1() {
        return competitor1;
    }



    public void setCompetitor1(Competitor competitor1) {
        this.competitor1 = competitor1;
    }

    public Competitor getCompetitor2() {
        return competitor2;
    }

    public void setCompetitor2(Competitor competitor2) {
        this.competitor2 = competitor2;
    }

    public String getGameStatusApiRef() {
        return gameStatusApiRef;
    }

    public void setGameStatusApiRef(String gameStatusApiRef) {
        this.gameStatusApiRef = gameStatusApiRef;
    }


    @Override
    public String toString() {
        return "GameAggregate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gameInfo=" + gameInfo +
                ", lastUpdated=" + lastUpdated +
                ", competitor1=" + competitor1 +
                ", competitor2=" + competitor2 +
                ", liveScoreCard=" + liveScoreCard +
                ", gameStatusApiRef='" + gameStatusApiRef + '\'' +
                '}';
    }

}

