package com.example.study.controller;


import com.example.study.model.SearchPara;
import org.springframework.web.bind.annotation.*;

@RestController // control 명시
@RequestMapping("/api") // Localhost :8080 api

public class postcontroller {

    @PostMapping( value = "/postparameter")
    public SearchPara PostMethod(@RequestBody SearchPara searchPara)
    {
        return searchPara;
    }

    @PutMapping("/putmapping")
    public void put()
    {

    }

   // @PatchMapping
   // public void patch("/patchmapping")
   // {
   //
  //  }


}
