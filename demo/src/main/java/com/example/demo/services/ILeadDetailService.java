package com.example.demo.services;


import com.example.demo.entity.LeadDetail;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ILeadDetailService {


    List<LeadDetail> getAllLeads();

    LeadDetail addLeadDetails(LeadDetail ld);

    LeadDetail editLeadDetails(@RequestBody LeadDetail ld);


    LeadDetail deleteLeadDetails(long Id);
}
