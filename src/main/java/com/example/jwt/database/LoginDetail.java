package com.example.jwt.database;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LoginDetail")
public class LoginDetail {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long LoginId;



    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date loginDate;


    public LoginDetail(){

    }

    public void setLoginId(Long loginId) {
        LoginId = loginId;
    }
    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

}
