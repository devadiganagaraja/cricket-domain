package com.cricketfoursix.cricketdomain.common.stats;

public class TeamsStanding {
    private long teamId;
    private String teamName;
    private String rank;
    private String matchesPlayed;
    private String matchesWon;
    private String matchesLost;
    private String matchesDraw;
    private String matchesTied;
    private String matchPoints;
    private String noresult;

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "TeamsStanding{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", rank='" + rank + '\'' +
                ", matchesPlayed='" + matchesPlayed + '\'' +
                ", matchesWon='" + matchesWon + '\'' +
                ", matchesLost='" + matchesLost + '\'' +
                ", matchesDraw='" + matchesDraw + '\'' +
                ", matchesTied='" + matchesTied + '\'' +
                ", matchPoints='" + matchPoints + '\'' +
                ", noresult='" + noresult + '\'' +
                ", netrr='" + netrr + '\'' +
                '}';
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private String netrr;

    public long getTeamId() {
        return teamId;
    }

    public String getNetrr() {
        return netrr;
    }

    public void setNetrr(String netrr) {
        this.netrr = netrr;
    }

    public String getNoresult() {
        return noresult;
    }

    public void setNoresult(String noresult) {
        this.noresult = noresult;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(String matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(String matchesWon) {
        this.matchesWon = matchesWon;
    }

    public String getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(String matchesLost) {
        this.matchesLost = matchesLost;
    }

    public String getMatchesDraw() {
        return matchesDraw;
    }

    public void setMatchesDraw(String matchesDraw) {
        this.matchesDraw = matchesDraw;
    }

    public String getMatchesTied() {
        return matchesTied;
    }

    public void setMatchesTied(String matchesTied) {
        this.matchesTied = matchesTied;
    }

    public String getMatchPoints() {
        return matchPoints;
    }

    public void setMatchPoints(String matchPoints) {
        this.matchPoints = matchPoints;
    }

}
