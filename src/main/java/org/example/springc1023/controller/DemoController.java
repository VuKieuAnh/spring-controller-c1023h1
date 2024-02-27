package org.example.springc1023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//danh dau controller

public class DemoController {
//    Dinh nghia request dc xu ly
    @GetMapping("/xinchao")
    public String xinchao(){
        return "index1";
    }

    @RequestMapping(value = "/studentlist", method = RequestMethod.POST)
//    chi dinh nghia rieng cho method nay
    public String student(){
        return "index";
    }
}
