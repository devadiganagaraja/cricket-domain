package com.cricketfoursix.cricketdomain.common.bbb;

public class InningCommentarySummary {
    private int inningsNo;
    private int totalRuns;
    private int wickets;

    private double runRate;
    private double oversUnique;
    private String battingTeamName;

    public int getInningsNo() {
        return inningsNo;
    }

    public double getRunRate() {
        return runRate;
    }

    public void setRunRate(double runRate) {
        this.runRate = runRate;
    }

    public void setInningsNo(int inningsNo) {
        this.inningsNo = inningsNo;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getOversUnique() {
        return oversUnique;
    }

    public void setOversUnique(double oversUnique) {
        this.oversUnique = oversUnique;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public void setBattingTeamName(String battingTeamName) {
        this.battingTeamName = battingTeamName;
    }
}

