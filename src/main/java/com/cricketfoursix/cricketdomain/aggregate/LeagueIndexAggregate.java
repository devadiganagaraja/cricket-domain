package com.cricketfoursix.cricketdomain.aggregate;


import com.cricketfoursix.cricketdomain.common.league.ChildLeague;
import com.cricketfoursix.cricketdomain.common.league.LeagueType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "leagueIndex")
public class LeagueIndexAggregate {


    @Id
    long leagueId;
    LeagueType leagueType;
    private String name;
    private String abbreviation;
    private Set<Integer> classIds = new HashSet<>();
    private Set<ChildLeague> childLeagues = new HashSet<ChildLeague>();
    private String seriesNote;


    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
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

    public Set<Integer> getClassIds() {
        return classIds;
    }

    public void setClassIds(Set<Integer> classIds) {
        this.classIds = classIds;
    }

    public Set<ChildLeague> getChildLeagues() {
        return childLeagues;
    }

    public void setChildLeagues(Set<ChildLeague> childLeagues) {
        this.childLeagues = childLeagues;
    }

    public String getSeriesNote() {
        return seriesNote;
    }

    public void setSeriesNote(String seriesNote) {
        this.seriesNote = seriesNote;
    }
}
