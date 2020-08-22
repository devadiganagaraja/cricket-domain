package com.cricketfoursix.cricketdomain.common.article;


public class CricketArticle {
    private long id;
    private String title;
    private String prePara;
    private String image;
    private String postPara;
    private ArticleAuthor authorInfo;
    private String author;


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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPostPara() {
        return postPara;
    }

    public void setPostPara(String postPara) {
        this.postPara = postPara;
    }

    public ArticleAuthor getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(ArticleAuthor authorInfo) {
        this.authorInfo = authorInfo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
