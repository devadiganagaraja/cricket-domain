package com.cricketfoursix.cricketdomain.common.league;

import java.util.HashSet;
import java.util.Set;

public class LeagueTeam {
    private String displayName;

    private long id;

    private Set<Long> won = new HashSet<>();

    private Set<Long> lost = new HashSet<>();;

    private Set<Long> drawn = new HashSet<>();;


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Set<Long> getWon() {
        return won;
    }

    public void setWon(Set<Long> won) {
        this.won = won;
    }

    public Set<Long> getLost() {
        return lost;
    }

    public void setLost(Set<Long> lost) {
        this.lost = lost;
    }

    public Set<Long> getDrawn() {
        return drawn;
    }

    public void setDrawn(Set<Long> drawn) {
        this.drawn = drawn;
    }
}

