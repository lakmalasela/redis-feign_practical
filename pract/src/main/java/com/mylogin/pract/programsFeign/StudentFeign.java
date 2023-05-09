package com.mylogin.pract.programsFeign;


import com.mylogin.pract.model.Program;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "program-service",url = "localhost:8080/program")
public interface StudentFeign {

    @GetMapping(value = "/list",produces = "application/json")
    public List<Program> programList();
}
