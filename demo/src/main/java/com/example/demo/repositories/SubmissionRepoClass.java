package com.example.demo.repositories;

import com.example.demo.Submissions;

import java.util.*;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class SubmissionRepoClass implements SubmissionRepository {

    private  Map<String, Submissions> submissions = new HashMap<>();

    @Override
    public Submissions getSubmission(String id) {

        return submissions.get(id);
    }

    @Override
    public List<Submissions> getAll() {
        return new ArrayList<>(submissions.values());
    }

    @Override
    public Submissions addSubmission(Submissions submission) {
        String id = UUID.randomUUID().toString();
        submission.setId(id);

        submissions.put(id, submission);
        return submission;
    }

    @Override
    public Submissions updateSubmission(Submissions submission) {
        String id = submission.getId();
        if (submissions.containsKey(id)) {
            submissions.put(id, submission);
            return submission;
        }
        return null;
    }

    @Override
    public boolean deleteSubmission(String id) {


        submissions.entrySet().stream().filter(es -> {
            if(es.getValue().getConsultantName().equals(id)){
                return true;
            }
            return false;
        }).map(k -> k.getKey()).toList().forEach(submissions::remove);



        return true;
    }
}