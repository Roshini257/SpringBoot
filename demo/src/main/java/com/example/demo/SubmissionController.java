package com.example.demo;
import com.example.demo.Submissions;
import com.example.demo.services.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submission")
public class SubmissionController {

    private final SubmissionService submissionService;

    @Autowired
    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @GetMapping("get/{id}")
    public Submissions getSubmission(@PathVariable String id) {
        return submissionService.getSubmission(id);



    }

    @GetMapping("/getAll")
    public List<Submissions> getAll(){
        return submissionService.getAll();
    }

    @PostMapping(path="/add")
    public Submissions addSubmission(@RequestBody Submissions submission) {
        return submissionService.addSubmission(submission);

    }

    @PutMapping("update")
    public Submissions updateSubmission( @RequestBody Submissions submission) {
        return  submissionService.updateSubmission(submission);

    }

    @DeleteMapping("delete/{id}")
    public void deleteSubmission(@PathVariable String id) {
        submissionService.deleteSubmission(id);

    }


}
