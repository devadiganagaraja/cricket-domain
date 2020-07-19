package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.squad.Squad;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document(collection = "league_squad")
public class LeagueSquadAggregate {

    @Id
    private String id;

    private HashMap<Long, Squad> squadMap = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HashMap<Long, Squad> getSquadMap() {
        return squadMap;
    }

    public void setSquadMap(HashMap<Long, Squad> squadMap) {
        this.squadMap = squadMap;
    }
}
