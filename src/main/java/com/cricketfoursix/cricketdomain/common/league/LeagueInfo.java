package com.cricketfoursix.cricketdomain.common.league;


import java.util.HashMap;
import java.util.Map;

public class LeagueInfo {
    private long leagueId;
    private String leagueName;
    private boolean tournament;

    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    private String abbreviation;

    @Override
    public String toString() {
        return "LeagueInfo{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", tournament=" + tournament +
                ", abbreviation='" + abbreviation + '\'' +
                ", leagueSeasonMap=" + leagueSeasonMap +
                '}';
    }

    private Map<Integer, LeagueSeason> leagueSeasonMap = new HashMap<>();

    public String getLeagueName() {
        return leagueName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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

    public boolean isTournament() {
        return tournament;
    }

    public void setTournament(boolean tournament) {
        this.tournament = tournament;
    }
}

