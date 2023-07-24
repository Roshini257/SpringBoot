package com.example.demo.resource;

import com.example.demo.entity.LeadDetail;
import com.example.demo.services.ILeadDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class  LeadDetailResource {

    @Autowired
    private ILeadDetailService service;

    @GetMapping("/getAll")
    public List<LeadDetail> getAllLeads(){
        return service.getAllLeads();
    }
    @PostMapping("/add")
    public LeadDetail addLeadDetails(@RequestBody LeadDetail ld) {
        return service.addLeadDetails(ld);
    }
    @PutMapping("/update")
    public LeadDetail editLeadDetails(@RequestBody LeadDetail ld){
        return service.editLeadDetails(ld);
    }
    @DeleteMapping("/delete/{Id}")
    public LeadDetail deleteLeadDetails(@PathVariable Long Id) {
        return service.deleteLeadDetails(Id);
    }
}

