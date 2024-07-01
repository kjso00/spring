package com.ohgiraffers.blog_st.junseong.model.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "junseong_blog")  //테이블 이름 지정
public class junBlog {

    @Id
    @Column(name = "blog_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogNo;           //프라이머리 타입 인트

    @Column(name = "blog_title", unique = true, nullable = false)
    private String blogTitle;

    @Column(name = "blog_content", nullable = false, length = 3000) //블로그 내용 널x 글자수 제한
    private String blogContent;

    @Column(name = "blog_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public junBlog(){}

    public junBlog(int blogNo, String blogTitle, String blogContent, Date createDate) {
        this.blogNo = blogNo;
        this.blogTitle = blogTitle;
        this.blogContent = blogContent;
        this.createDate = createDate;
    }

    public int getBlogNo() {
        return blogNo;
    }

    public void setBlogNo(int blogNo) {
        this.blogNo = blogNo;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "junBlog{" +
                "blogNo=" + blogNo +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
