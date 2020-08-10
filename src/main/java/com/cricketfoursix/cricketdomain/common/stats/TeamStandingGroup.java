package com.cricketfoursix.cricketdomain.common.stats;

import java.util.ArrayList;
import java.util.List;

public class TeamStandingGroup {

    private int id;
    private String name;
    private String abbreviation;
    private List<TeamsStanding> teamsStandings = new ArrayList<>();


    public int getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamsStanding> getTeamsStandings() {
        return teamsStandings;
    }

    public void setTeamsStandings(List<TeamsStanding> teamsStandings) {
        this.teamsStandings = teamsStandings;
    }


    @Override
    public String toString() {
        return "TeamStandingGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", teamsStandings=" + teamsStandings +
                '}';
    }
}
