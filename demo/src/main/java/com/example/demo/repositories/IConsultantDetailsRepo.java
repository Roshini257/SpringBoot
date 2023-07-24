package com.example.demo.repositories;
import com.example.demo.entity.ConsultantDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface IConsultantDetailsRepo extends JpaRepository<ConsultantDetail, Long>
{

}