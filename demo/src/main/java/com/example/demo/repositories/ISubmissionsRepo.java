package com.example.demo.repositories;
import com.example.demo.entity.SubmissionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ISubmissionsRepo extends JpaRepository<SubmissionDetail, String>{

}
