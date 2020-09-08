package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.article.ArticleStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "articles")
public class ArticleAggregate {
    @Id
    private long id;
    private String title;
    private String prePara;
    private String image;
    private String postPara;
    private String  author;
    private ArticleStatus articleStatus;
    private Date lastModified;
    private Date publishDate;

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

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ArticleAggregate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", prePara='" + prePara + '\'' +
                ", image='" + image + '\'' +
                ", postPara='" + postPara + '\'' +
                ", author='" + author + '\'' +
                ", articleStatus=" + articleStatus +
                ", lastModified=" + lastModified +
                ", publishDate=" + publishDate +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public ArticleStatus getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(ArticleStatus articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

}
