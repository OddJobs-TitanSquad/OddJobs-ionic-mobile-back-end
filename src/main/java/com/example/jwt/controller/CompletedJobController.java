package com.example.jwt.controller;

import com.example.jwt.database.CompletedJob;
import com.example.jwt.database.JobPost;
import com.example.jwt.repository.CompletedJobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/auth")
public class CompletedJobController {
    private CompletedJobRepository completedJobRepository;



    public CompletedJobController(CompletedJobRepository completedJobRepository){
        this.completedJobRepository = completedJobRepository;



    }
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    @GetMapping("/completed")
    public @ResponseBody List<CompletedJob> all() {
        return completedJobRepository.findAll();
    }

    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    @GetMapping("/completed/{completed_Job_id}")
    public @ResponseBody  List<CompletedJob> findOne(@PathVariable Long completed_Job_id) {
        return completedJobRepository.findCompletedJobByCompletedJobId(completed_Job_id);
    }

}
