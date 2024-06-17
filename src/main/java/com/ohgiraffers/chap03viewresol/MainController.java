package com.ohgiraffers.chap03viewresol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //어노테이션이뭐임
public class MainController {

    @RequestMapping(value = {"/"})
    public String main() {
        return "main";
    }
    /*
    * RequestToViewNameTranslator(interface)
    * spring에서 반환 타입이 void인 경우 요청 url을 기반으로 뷰를 해석하려고 하는데
    * 이때 RequestToViewNameTranslator를 사용하여 url을 뷰의 이름으로 변환한다.
     */
    @RequestMapping(value = "/main")
    public void mainPage(){
    // void일 경우에 url에 맞는 페이지를 찾아감
    }


}
