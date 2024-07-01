package com.ohgiraffers.blog_st.junseong.repository;

import com.ohgiraffers.blog_st.junseong.model.entity.junBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JunseongRepository extends JpaRepository<junBlog, Integer> {
}
