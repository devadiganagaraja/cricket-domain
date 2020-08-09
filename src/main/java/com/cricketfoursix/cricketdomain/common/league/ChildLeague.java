package com.cricketfoursix.cricketdomain.common.league;

import java.util.Objects;

public class ChildLeague {

    private long leagueId;
    private String name;
    private String abbreviation;
    private int classId;
    private LeagueType leagueType;


    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildLeague that = (ChildLeague) o;
        return leagueId == that.leagueId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leagueId);
    }
}
