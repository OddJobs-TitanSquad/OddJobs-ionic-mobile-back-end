package com.example.jwt.controller;


import com.example.jwt.database.JobPost;
import com.example.jwt.repository.JobPostRepository;
import com.example.jwt.security.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8100", "file://"})
@RequestMapping("/api/auth")
public class JobPostController {


    private JobPostRepository jobPostRepository;


    public JobPostController(JobPostRepository jobPostRepository) {
        this.jobPostRepository = jobPostRepository;

    }


    @GetMapping("/jobs")
    public @ResponseBody List<JobPost> all() {
        return jobPostRepository.findAll();
    }

    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    @GetMapping("/jobs/{job_id}")
   public @ResponseBody  List<JobPost> findOne(@PathVariable Long job_id) {
        return jobPostRepository.findJobPostByJob_id(job_id);
    }

@GetMapping("/njobs")
    public @ResponseBody List<JobPost> gAll(@PathVariable Long jobType){
        return jobPostRepository.findDistinctByPublishTrueAndExpireDateBefore(jobType);
}
}
