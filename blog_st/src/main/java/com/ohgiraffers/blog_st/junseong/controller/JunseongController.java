package com.ohgiraffers.blog_st.junseong.controller;


import com.ohgiraffers.blog_st.junseong.model.dto.BlogDTO;
import com.ohgiraffers.blog_st.junseong.service.JunseongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/junseong")//요청리로스 매칭해줌
public class JunseongController {

    private final JunseongService junseongService;

    public JunseongController(JunseongService junseongService) {
        this.junseongService = junseongService;
    }

    @Autowired


    @GetMapping
    public String indexJunseong(){
        return "/junseong/junseong";
    }

    @PostMapping
    public ModelAndView postBlog(BlogDTO blogDTO, ModelAndView mv){
        if(blogDTO.getBlogTitle() == null || blogDTO.getBlogTitle().equals("")){
            mv.setViewName("redirect:/junseong");
        }
        if(blogDTO.getBlogContent() == null || blogDTO.getBlogContent().equals("")){
            mv.setViewName("redirect:/junseong");
        }
        int result = JunseongService.post(blogDTO);
        mv.setViewName("/junseong/junseong");
        return null;

    }
}
