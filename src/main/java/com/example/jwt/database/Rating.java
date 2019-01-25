package com.example.jwt.database;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Rating")
public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RateId;



    private Long jobId;

    private Integer employeeRate;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
private Date employeeRateDateAndTime;


    private Integer employerRate;


    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date   employerRateDateAndTime;

    public Rating(){

    }
    public Rating(Long jobId,Integer employeeRate,Date employeeRateDateAndTime,Integer employerRate,Date employerRateDateAndTime){
        this.jobId = jobId;
        this.employeeRate = employeeRate;
        this.employeeRateDateAndTime = employeeRateDateAndTime;
        this.employerRate = employerRate;
        this.employerRateDateAndTime = employerRateDateAndTime;
    }
    public Long getRateId() {
        return RateId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
    public void setRateId(Long rateId) {
        RateId = rateId;
    }

    public Integer getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(Integer employeeRate) {
        this.employeeRate = employeeRate;
    }

    public Date getEmployeeRateDateAndTime() {
        return employeeRateDateAndTime;
    }

    public void setEmployeeRateDateAndTime(Date employeeRateDateAndTime) {
        this.employeeRateDateAndTime = employeeRateDateAndTime;
    }

    public Integer getEmployerRate() {
        return employerRate;
    }

    public void setEmployerRate(Integer employerRate) {
        this.employerRate = employerRate;
    }

    public Date getEmployerRateDateAndTime() {
        return employerRateDateAndTime;
    }

    public void setEmployerRateDateAndTime(Date employerRateDateAndTime) {
        this.employerRateDateAndTime = employerRateDateAndTime;
    }
}
