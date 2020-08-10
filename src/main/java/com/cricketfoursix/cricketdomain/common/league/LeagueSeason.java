package com.cricketfoursix.cricketdomain.common.league;



import com.cricketfoursix.cricketdomain.common.game.GameInfo;
import com.cricketfoursix.cricketdomain.common.stats.BattingLeader;
import com.cricketfoursix.cricketdomain.common.stats.BowlingLeader;
import com.cricketfoursix.cricketdomain.common.stats.TeamStandingGroup;

import java.util.*;

public class LeagueSeason {
    private String leagueYear;
    private String name;
    private Date startDate;
    private Date endDate;
    private Set<GameInfo> eventSet = new HashSet<>();
    private Set<LeagueTeam> teams;
    private Set<GameInfo> postGames = new HashSet<>();
    private Set<GameInfo> nextGames = new HashSet<>();
    private Set<GameInfo> liveGames = new HashSet<>();
    private List<TeamStandingGroup> teamGroups =  new ArrayList<>();
    private List<BattingLeader> battingLeaders;
    private List<BowlingLeader> bowlingLeaders;

    public List<TeamStandingGroup> getTeamGroups() {
        return teamGroups;
    }

    public void setTeamGroups(List<TeamStandingGroup> teamGroups) {
        this.teamGroups = teamGroups;
    }

    public String getLeagueYear() {
        return leagueYear;
    }

    public void setLeagueYear(String leagueYear) {
        this.leagueYear = leagueYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<GameInfo> getEventSet() {
        return eventSet;
    }

    public void setEventSet(Set<GameInfo> eventSet) {
        this.eventSet = eventSet;
    }

    public Set<LeagueTeam> getTeams() {
        return teams;
    }

    public void setTeams(Set<LeagueTeam> teams) {
        this.teams = teams;
    }

    public Set<GameInfo> getPostGames() {
        return postGames;
    }

    public void setPostGames(Set<GameInfo> postGames) {
        this.postGames = postGames;
    }

    public Set<GameInfo> getNextGames() {
        return nextGames;
    }

    public void setNextGames(Set<GameInfo> nextGames) {
        this.nextGames = nextGames;
    }

    public Set<GameInfo> getLiveGames() {
        return liveGames;
    }

    public void setLiveGames(Set<GameInfo> liveGames) {
        this.liveGames = liveGames;
    }

    public List<BattingLeader> getBattingLeaders() {
        return battingLeaders;
    }

    public void setBattingLeaders(List<BattingLeader> battingLeaders) {
        this.battingLeaders = battingLeaders;
    }

    public List<BowlingLeader> getBowlingLeaders() {
        return bowlingLeaders;
    }

    public void setBowlingLeaders(List<BowlingLeader> bowlingLeaders) {
        this.bowlingLeaders = bowlingLeaders;
    }

    @Override
    public String toString() {
        return "LeagueSeason{" +
                "leagueYear='" + leagueYear + '\'' +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", eventSet=" + eventSet +
                ", teams=" + teams +
                ", postGames=" + postGames +
                ", nextGames=" + nextGames +
                ", liveGames=" + liveGames +
                ", teamGroups=" + teamGroups +
                ", battingLeaders=" + battingLeaders +
                ", bowlingLeaders=" + bowlingLeaders +
                '}';
    }
}

