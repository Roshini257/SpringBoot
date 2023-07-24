package com.example.demo.services;
import com.example.demo.entity.ConsultantDetail;

import com.example.demo.entity.LeadDetail;
import com.example.demo.repositories.IConsultantDetailsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultantDetailsService implements IConsultantDetailsService{

    @Autowired
    private IConsultantDetailsRepo repository;
    @Override
    public List<ConsultantDetail> getAllConsultants() {
        return repository.findAll();
    }


    @Override
    public ConsultantDetail addConsultantDetails(ConsultantDetail cd){
        return repository.save(cd);
    }
    @Override
    public ConsultantDetail editConsultantDetails(ConsultantDetail cd) {
        Long ConsultantId = cd.getId();
        if (repository.existsById(ConsultantId)) {
            ConsultantDetail existingConsultant = repository.findById(ConsultantId).orElse(null);
            existingConsultant.setFirstName(cd.getFirstName());
            existingConsultant.setLastName(cd.getLastName());
            existingConsultant.setEmailAddress(cd.getEmailAddress());
            existingConsultant.setPhoneNumber(cd.getPhoneNumber());
            return repository.save(existingConsultant);
        } else {
            return null;
        }
    }

    @Override
    public ConsultantDetail deleteConsultantDetails(long Id) {
        repository.deleteById(Id);
        return null;
    }

}