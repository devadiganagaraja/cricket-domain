package com.cricketfoursix.cricketdomain.common.article;


import java.util.*;

public class CricketArticle {
    private long id;
    private String title;
    private String prePara;
    private String postPara;
    private CricketEnthusiast authorInfo;

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    private String author;
    private Date lastModified;
    private Date published;
    private Set<String> claps;
    private Set<String> tags = new HashSet<>();
    private List<ArticleResponse> articleResponses= new ArrayList<>();
    private String leagueTag;
    private String teamTag;
    private String playerTag;

    public String getLeagueTag() {
        return leagueTag;
    }

    public void setLeagueTag(String leagueTag) {
        this.leagueTag = leagueTag;
    }

    public String getTeamTag() {
        return teamTag;
    }

    public void setTeamTag(String teamTag) {
        this.teamTag = teamTag;
    }

    public String getPlayerTag() {
        return playerTag;
    }

    public void setPlayerTag(String playerTag) {
        this.playerTag = playerTag;
    }

    public Set<String> getClaps() {
        return claps;
    }

    public void setClaps(Set<String> claps) {
        this.claps = claps;
    }

    public List<ArticleResponse> getArticleResponses() {
        return articleResponses;
    }

    public void setArticleResponses(List<ArticleResponse> articleResponses) {
        this.articleResponses = articleResponses;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrePara() {
        return prePara;
    }

    public void setPrePara(String prePara) {
        this.prePara = prePara;
    }

    public String getPostPara() {
        return postPara;
    }

    public void setPostPara(String postPara) {
        this.postPara = postPara;
    }

    public CricketEnthusiast getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(CricketEnthusiast authorInfo) {
        this.authorInfo = authorInfo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
