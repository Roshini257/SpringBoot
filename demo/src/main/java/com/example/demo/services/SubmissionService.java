package com.example.demo.services;

import com.example.demo.Submissions;

import java.util.List;

public interface SubmissionService {
    Submissions getSubmission(String id);

    Submissions addSubmission(Submissions submission);

    Submissions updateSubmission(Submissions submission);

    boolean deleteSubmission(String id);

    List<Submissions> getAll();

}