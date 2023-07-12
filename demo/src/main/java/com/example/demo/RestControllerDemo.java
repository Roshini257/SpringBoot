package com.example.demo;

import com.example.demo.services.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo1")
public class RestControllerDemo {
    @Autowired
    private DemoService ds;

    @GetMapping(path="/getS")
    public List<String> getuser(){
        return ds.getNames();
    }

    @PostMapping(path="/postS")
    public boolean postS(@RequestBody JustString j){
        return ds.postName(j.getName());
    }


    @PutMapping(path="/putS")
    public boolean putS(@RequestBody JustString j){
        return ds.putName(j.getName());
    }


    @DeleteMapping(path="/delS")
    public boolean delS(@RequestParam String name){
        return ds.deleteName(name);
    }
}