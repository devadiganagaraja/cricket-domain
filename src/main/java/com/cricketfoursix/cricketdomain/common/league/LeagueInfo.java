package com.cricketfoursix.cricketdomain.common.league;


import java.util.HashMap;
import java.util.Map;

public class LeagueInfo {
    private String leagueName;
    private String tournament;
    private Map<Integer, LeagueSeason> leagueSeasonMap = new HashMap<>();

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }


    public Map<Integer, LeagueSeason> getLeagueSeasonMap() {
        return leagueSeasonMap;
    }

    public void setLeagueSeasonMap(Map<Integer, LeagueSeason> leagueSeasonMap) {
        this.leagueSeasonMap = leagueSeasonMap;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }
}

