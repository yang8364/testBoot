package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/first")
public class FirstController {
    @RequestMapping("/firstMothed")
    @ResponseBody
    public String firstMothed(){
        return "first mothed";
    }@RequestMapping("/firstPage")
    public String firstPage(HashMap<String,Object> map){
        map.put("hello","hello first");
        return "/index";
    }
}
