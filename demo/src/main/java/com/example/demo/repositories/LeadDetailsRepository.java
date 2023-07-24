package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.LeadDetail;


public interface LeadDetailsRepository extends JpaRepository<LeadDetail, Long> {


}