package com.example.jwt.database;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "applicated")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;



    private Long jobId;



    private Long userId;




    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date acceptDate;


    private boolean isAccept;


    private boolean isConfirm;




    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date applicatedDate;



    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date confirmDate;

    public Application(){

    }
    public Application(Long jobId,Long userId,boolean isAccept,boolean isConfirm,Date applicatedDate,Date acceptDate,Date confirmDate){
        this.jobId = jobId;
        this.userId = userId;
        this.isAccept = isAccept;
        this.isConfirm = isConfirm;
        this.acceptDate = acceptDate;
        this.confirmDate = confirmDate;
        this.applicatedDate = applicatedDate;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



    public boolean isAccept() {
        return isAccept;
    }

    public void setAccept(boolean accept) {
        isAccept = accept;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setConfirm(boolean confirm) {
        isConfirm = confirm;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getApplicatedDate() {
        return applicatedDate;
    }

    public void setApplicatedDate(Date applicatedDate) {
        this.applicatedDate = applicatedDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }
}
