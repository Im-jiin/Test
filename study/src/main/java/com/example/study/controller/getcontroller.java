package com.example.study.controller;

import com.example.study.model.SearchPara;
import org.springframework.web.bind.annotation.*;

@RestController // control 명시
@RequestMapping("/api") // Localhost :8080 api

public class getcontroller {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //http://localhost:8080/api/getMethod
    public  String getReqeust(){
        return "Hi GetMothod";
    }

    @GetMapping("/getParameter") //http://localhost:8080/api/getParameter?id=1234&password=123
    public String getParameter(@RequestParam String id, @RequestParam String password)
    {
        System.out.println("id :" +id);
        System.out.println("password :" +password);

        return id+password;
    }

    @GetMapping("/getmultiparameter")
    public SearchPara getMultiParameter(SearchPara searchPara)
    {
        System.out.println(searchPara.getAccount());
        System.out.println(searchPara.getEmail());
        System.out.println(searchPara.getPage());

        return searchPara;
    }
}


