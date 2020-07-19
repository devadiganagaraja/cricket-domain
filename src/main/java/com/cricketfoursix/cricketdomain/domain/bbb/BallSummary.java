package com.cricketfoursix.cricketdomain.domain.bbb;

import org.springframework.data.mongodb.core.index.Indexed;

public class BallSummary {
    @Indexed
    private Long eventId;
    private int inningsNo;
    private double overUnique;
    private double overActual;
    private double overs;
    private boolean byes;
    private boolean legByes;
    private boolean wide;
    private boolean noBall;
    private int runs;
    private int batsmanRuns;
    private String text;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public int getInningsNo() {
        return inningsNo;
    }

    public void setInningsNo(int inningsNo) {
        this.inningsNo = inningsNo;
    }

    public double getOverUnique() {
        return overUnique;
    }

    public void setOverUnique(double overUnique) {
        this.overUnique = overUnique;
    }

    public double getOverActual() {
        return overActual;
    }

    public void setOverActual(double overActual) {
        this.overActual = overActual;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }

    public boolean isByes() {
        return byes;
    }

    public void setByes(boolean byes) {
        this.byes = byes;
    }

    public boolean isLegByes() {
        return legByes;
    }

    public void setLegByes(boolean legByes) {
        this.legByes = legByes;
    }

    public boolean isWide() {
        return wide;
    }

    public void setWide(boolean wide) {
        this.wide = wide;
    }

    public boolean isNoBall() {
        return noBall;
    }

    public void setNoBall(boolean noBall) {
        this.noBall = noBall;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBatsmanRuns() {
        return batsmanRuns;
    }

    public void setBatsmanRuns(int batsmanRuns) {
        this.batsmanRuns = batsmanRuns;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
