package com.cricketfoursix.cricketdomain.common.game;

import java.util.Date;
import java.util.Objects;

public class GameInfo {
    private String name;
    private long gameId;
    private long leagueId;
    private String leagueName;
    private int season;
    private Date date;
    private Date endDate;
    private GameStatus gameStatus;
    private String venue;
    private long competitor1;
    private String team1Name;
    private String team2Name;
    private String team1Score;
    private String team2Score;

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getCompetitor1() {
        return competitor1;
    }

    public void setCompetitor1(long competitor1) {
        this.competitor1 = competitor1;
    }

    public long getCompetitor2() {
        return competitor2;
    }

    public void setCompetitor2(long competitor2) {
        this.competitor2 = competitor2;
    }

    public GameClass getGameClass() {
        return gameClass;
    }

    public void setGameClass(GameClass gameClass) {
        this.gameClass = gameClass;
    }

    public GameSummary getGameSummary() {
        return gameSummary;
    }

    public void setGameSummary(GameSummary gameSummary) {
        this.gameSummary = gameSummary;
    }

    private long competitor2;

    private GameClass gameClass;

    private GameSummary gameSummary;


    public String getToss() {
        return toss;
    }

    public void setToss(String toss) {
        this.toss = toss;
    }


    private String note;
    private String toss;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public String getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(String team1Score) {
        this.team1Score = team1Score;
    }

    public String getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(String team2Score) {
        this.team2Score = team2Score;
    }

    @Override
    public String toString() {
        return "GameInfo{" +
                "name='" + name + '\'' +
                ", gameId=" + gameId +
                ", leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", season=" + season +
                ", date=" + date +
                ", endDate=" + endDate +
                ", gameStatus=" + gameStatus +
                ", venue='" + venue + '\'' +
                ", competitor1=" + competitor1 +
                ", competitor2=" + competitor2 +
                ", gameClass=" + gameClass +
                ", gameSummary=" + gameSummary +
                ", note='" + note + '\'' +
                ", toss='" + toss + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameInfo gameInfo = (GameInfo) o;
        return gameId == gameInfo.gameId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId);
    }
}
