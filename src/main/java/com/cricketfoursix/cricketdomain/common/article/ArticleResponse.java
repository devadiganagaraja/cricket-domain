package com.cricketfoursix.cricketdomain.common.article;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ArticleResponse {
    private long id;
    private String response;
    private Set<String> likes = new HashSet<>();
    private CricketEnthusiast commenter;
    private Date date;

    public long getId() {
        return id;
    }

    public void setLikes(Set<String> likes) {
        this.likes = likes;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CricketEnthusiast getCommenter() {
        return commenter;
    }

    public void setCommenter(CricketEnthusiast commenter) {
        this.commenter = commenter;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Set<String> getLikes() {
        return likes;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ArticleResponse{" +
                "id=" + id +
                ", response='" + response + '\'' +
                ", likes=" + likes +
                ", commenter=" + commenter +
                ", date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
