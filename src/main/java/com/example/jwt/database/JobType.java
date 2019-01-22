package com.example.jwt.database;


import javax.persistence.*;

@Entity
@Table(name = "JobType")
public class JobType {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobTypeId;


    private String name;

    public JobType(){

    }
    public JobType(String name){
        this.name = name;
    }
    public Long getJobTypeId() {
        return jobTypeId;
    }

    public void setJobTypeId(Long jobId) {
        this.jobTypeId = jobTypeId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
