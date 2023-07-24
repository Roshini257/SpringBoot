package com.example.demo.repositories;

import com.example.demo.Submissions;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ISubmissionRepository {
    Submissions postSubmission(@RequestBody Submissions sf);
    Submissions getSubmissionFormById(@RequestBody String Id);
    List<Submissions> getallSubmissions();
    Submissions editSubmission(@RequestBody Submissions sf);

    List<Submissions> getAll();

    List<Submissions> deleteSubmission(@RequestBody String Id);



}

