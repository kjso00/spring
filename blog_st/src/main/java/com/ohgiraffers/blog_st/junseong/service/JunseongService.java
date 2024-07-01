package com.ohgiraffers.blog_st.junseong.service;


import com.ohgiraffers.blog_st.junseong.model.dto.BlogDTO;
import com.ohgiraffers.blog_st.junseong.repository.JunseongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JunseongService {

    private final JunseongRepository junseongRepository;

    @Autowired
    public JunseongService(JunseongRepository junseongRepository) {
        this.junseongRepository = junseongRepository;
    }

    public int post(BlogDTO blogDTO) {
        List<JunseongBlog> junseongBlogs = junseongRepository.findAll();

        public int post (BlogDTO blogDTO){
            List<JunseongBlog> junseongBlogs = junseongRepository.findAll();
            // 도메인 로직
            for (JunseongBlog blog : junseongBlogs) {
                if (blog.getBlogTitle().equals(blogDTO.getBlogTitle())) {
                    return 0;
                }
            }

            JunseongBlog saveBlog = new JunseongBlog();
            saveBlog.setBlogContent(blogDTO.getBlogContent());
            saveBlog.setBlogTitle(blogDTO.getBlogTitle());
            saveBlog.setCreateDate(new Date());
            JunseongBlog result = junseongRepository.save(saveBlog);

            int resultValue = 0;

            if (result != null) {
                resultValue = 1;
            }

            return resultValue;
        }
    }
}
