package com.cricketfoursix.cricketdomain.common.article;


import java.util.Date;

public class CricketArticle {
    private long id;
    private String title;
    private String prePara;
    private String image;
    private String postPara;

    @Override
    public String toString() {
        return "CricketArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", prePara='" + prePara + '\'' +
                ", image='" + image + '\'' +
                ", postPara='" + postPara + '\'' +
                ", authorInfo=" + authorInfo +
                ", author='" + author + '\'' +
                ", articleStatus=" + articleStatus +
                ", lastModified=" + lastModified +
                ", publishDate=" + publishDate +
                '}';
    }

    private ArticleAuthor authorInfo;
    private String author;
    private ArticleStatus articleStatus;
    private Date lastModified;
    private Date publishDate;

    public ArticleStatus getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(ArticleStatus articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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


    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

}
