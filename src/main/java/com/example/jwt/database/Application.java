package com.example.jwt.database;

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



   // @Basic(optional = false)
    //@Column(name = " acceptDate",insertable = false,updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
   // private Date acceptDate;


    private boolean isAccept;


    private boolean isConfirm;


    //@Basic(optional = false)
   // @Column(name = " confirmDate",insertable = false,updatable = false)
   // @Temporal(TemporalType.TIMESTAMP)
   // private Date confirmDate;

    public Application(){

    }
    public Application(Long jobId,Long userId,boolean isAccept,boolean isConfirm){
        this.jobId = jobId;
        this.userId = userId;
        this.isAccept = isAccept;
        this.isConfirm = isConfirm;
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

    //public Date getAcceptDate() {
   //     return acceptDate;
    //}

   // public void setAcceptDate(Date accetDate) {
     //   this.acceptDate = accetDate;
   // }

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


   // public Date getConfirmDate() {
     //   return confirmDate;
    //}

   // public void setConfirmDate(Date confirmDate) {
     //   this.confirmDate = confirmDate;
    //}
}
