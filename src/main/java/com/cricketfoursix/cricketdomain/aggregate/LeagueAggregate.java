package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.league.LeagueInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leagues")
public class LeagueAggregate {
    @Id
    private Long id;

    private LeagueInfo leagueInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LeagueInfo getLeagueInfo() {
        return leagueInfo;
    }

    public void setLeagueInfo(LeagueInfo leagueInfo) {
        this.leagueInfo = leagueInfo;
    }
}

