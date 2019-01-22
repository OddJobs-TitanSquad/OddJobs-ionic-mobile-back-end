package com.example.jwt.database;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;



@Entity
@Table(name = "job_post")
public class JobPost {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;



    private String address_line1;




    private String address_line2;


    private String city;



    private String description;



    @Digits(integer=2, fraction=4)
    @Column(name = "latitude")
    private BigDecimal latitude;



    @Digits(integer=2, fraction=4)
    @Column(name = "longitude")
    private BigDecimal longitude;

    public JobPost(){

    }
    public JobPost( String address_line1, String address_line2,String city,String description,BigDecimal latitude,BigDecimal longitude){
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long job_id) {
        this.jobId = jobId;
    }
    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }
    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
