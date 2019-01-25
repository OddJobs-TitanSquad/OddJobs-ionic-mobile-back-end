package com.example.jwt.database;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complains")
public class Complain {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complainId;



    private Long userId;
    private Long comJobId;

    private String description;


    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date complainDateAndTime;

    public Complain(){

    }

    public Complain(Long comJobId,Long userId,String description,Date complainDateAndTime){
        this.comJobId = comJobId;
        this.userId = userId;
        this.description = description;
        this.complainDateAndTime = complainDateAndTime;
    }
    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }
    public Long getcomJobId() {
        return comJobId;
    }

    public void setcomJobId(Long comJobId) {
        this.comJobId = comJobId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getComplainDateAndTime() {
        return complainDateAndTime;
    }

    public void setComplainDateAndTime(Date complainDateAndTime) {
        this.complainDateAndTime = complainDateAndTime;
    }
}
