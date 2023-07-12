package com.example.demo.repositories;

import com.example.demo.Submissions;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface SubmissionRepository {

    Submissions getSubmission(String id);

    List<Submissions> getAll();
    Submissions addSubmission(Submissions submission);
    Submissions updateSubmission(Submissions submission);
    boolean deleteSubmission(String id);

}