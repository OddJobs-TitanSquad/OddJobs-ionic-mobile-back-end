package com.example.jwt.controller;

import com.example.jwt.database.JobPost;
import com.example.jwt.database.JobType;
import com.example.jwt.repository.JobTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.util.List;
@RestController
public class JobTypeController {

    private JobTypeRepository jobTypeRepository;


    public JobTypeController(JobTypeRepository jobTypeRepository){
        this.jobTypeRepository = jobTypeRepository;
    }

    @GetMapping("/jobtype")
    public @ResponseBody
    List<JobType> all() {
        return jobTypeRepository.findAll();
    }

}
