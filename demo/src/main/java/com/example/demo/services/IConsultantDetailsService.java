package com.example.demo.services;

import com.example.demo.entity.ConsultantDetail;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IConsultantDetailsService {

    List<ConsultantDetail> getAllConsultants();

    ConsultantDetail addConsultantDetails(ConsultantDetail cd);

    ConsultantDetail editConsultantDetails(@RequestBody ConsultantDetail cd);


    ConsultantDetail deleteConsultantDetails(long Id);
}

