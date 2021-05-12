package com.anjin.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * Get,Post,Put,Delete;增删改查
     * @return
     *
     * /user?id=1
     * /user/1
     * @GetMapping...
     * @RequestMapping(value = "/user/1" ,method = RequestMethod.Get)
     * @RequestMapping(value = "/user/1" ,method = RequestMethod.Delete)
     */
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world! Post " + name;
    }


}
