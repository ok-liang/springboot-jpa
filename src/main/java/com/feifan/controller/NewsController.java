package com.feifan.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
@CrossOrigin//开启跨域穿透，即其他服务器可以直接访问
public class NewsController {

    @GetMapping("/getContent")
    public String getNews(){
        System.out.println("有请求来了...\"/getContent\"");
        return "<p><del><em>&gt; <strong>张聪 </strong></em></del></p>\n" +
                "<h1 id=\"h1-aaaa\"><a name=\"AAAA\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>AAAA</h1>";
    }

    /**
     * 接收发布的新闻，提交什么新闻，回复什么新闻。
     * @param text
     * @return
     */
    @PostMapping("/addNews")
    public String saveNews(String text){
        System.out.println(text);
        return text;
    }
}
