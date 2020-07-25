package com.cricketfoursix.cricketdomain.common.league;



import com.cricketfoursix.cricketdomain.common.game.GameInfo;
import com.cricketfoursix.cricketdomain.common.stats.BattingLeader;
import com.cricketfoursix.cricketdomain.common.stats.BowlingLeader;
import com.cricketfoursix.cricketdomain.common.stats.TeamStat;

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
    private List<TeamStat> TeamStats;
    private Set<BattingLeader> BattingLeaders;
    private Set<BowlingLeader> BowlingLeaders;


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

    public List<TeamStat> getTeamStats() {
        return TeamStats;
    }

    public void setTeamStats(List<TeamStat> teamStats) {
        TeamStats = teamStats;
    }

    public Set<BattingLeader> getBattingLeaders() {
        return BattingLeaders;
    }

    public void setBattingLeaders(Set<BattingLeader> battingLeaders) {
        BattingLeaders = battingLeaders;
    }

    public Set<BowlingLeader> getBowlingLeaders() {
        return BowlingLeaders;
    }

    public void setBowlingLeaders(Set<BowlingLeader> bowlingLeaders) {
        BowlingLeaders = bowlingLeaders;
    }
}

