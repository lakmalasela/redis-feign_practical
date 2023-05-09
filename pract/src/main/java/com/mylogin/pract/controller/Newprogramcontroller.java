package com.mylogin.pract.controller;


import com.mylogin.pract.model.Program;
import com.mylogin.pract.programsFeign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign-demo")
public class Newprogramcontroller {

    @Autowired
    private StudentFeign studentFeign;


    @GetMapping(value = "/allprograms",produces = "application/json")
    public List<Program> getAllprograms (){
        return studentFeign.programList();
    }
}
