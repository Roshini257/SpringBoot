package com.example.demo.services;

import com.example.demo.Submissions;
import com.example.demo.repositories.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionServiceImp implements SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;



    @Override
    public Submissions getSubmission(String id) {
        return submissionRepository.getSubmission(id);
    }

    @Override
    public Submissions addSubmission(Submissions submission) {
        return submissionRepository.addSubmission(submission);
    }

    @Override
    public Submissions updateSubmission(Submissions submission) {
        return submissionRepository.updateSubmission(submission);
    }

    @Override
    public boolean deleteSubmission(String id) {
        return submissionRepository.deleteSubmission(id);
    }

    @Override
    public List<Submissions> getAll() {
        return submissionRepository.getAll();
    }
}
