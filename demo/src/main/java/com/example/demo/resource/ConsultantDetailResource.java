package com.example.demo.resource;

import com.example.demo.entity.ConsultantDetail;
import com.example.demo.services.IConsultantDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultants")
public class  ConsultantDetailResource {

    @Autowired
    private IConsultantDetailsService service;

    @GetMapping("/getAll")
    public List<ConsultantDetail> getAllConsultants(){
        return service.getAllConsultants();
    }
    @PostMapping("/add")
    public ConsultantDetail addConsultantDetails(@RequestBody ConsultantDetail cd) {
        return service.addConsultantDetails(cd);
    }
    @PutMapping("/update")
    public ConsultantDetail editConsultantDetails(@RequestBody ConsultantDetail cd){
        return service.editConsultantDetails(cd);
    }
    @DeleteMapping("/delete/{Id}")
    public ConsultantDetail deleteConsultantDetails(@PathVariable Long Id) {
        return service.deleteConsultantDetails(Id);
    }
}