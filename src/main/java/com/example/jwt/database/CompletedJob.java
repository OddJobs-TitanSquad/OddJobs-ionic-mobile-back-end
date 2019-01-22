package com.example.jwt.database;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CompletedJob")
public class CompletedJob {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long completedJobId;



    private Long employerId;




    private Date completedDate;

    private Long applicationId;








    public CompletedJob(){

    }
    public CompletedJob(Long completedJobId,Long employerId,Date completedDate,Long applicationId){

        this.employerId = employerId;
        this.completedDate = completedDate;
        this.applicationId = applicationId;
    }
    public Long getCompletedJobId() {
        return completedJobId;
    }

    public void setCompletedJobId(Long completedJobId) {
        this.completedJobId = completedJobId;
    }
    public Long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Long employerId) {
        this.employerId = employerId;
    }
    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

}
