package com.example.jwt.controller;

import com.example.jwt.database.LoginDetail;
import com.example.jwt.repository.LoginDetailRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("/api/auth")
public class LoginDetailController {

    private LoginDetailRepository loginDetailRepository;

    public LoginDetailController(LoginDetailRepository loginDetailRepository){
        this.loginDetailRepository = loginDetailRepository;
    }

    @PostMapping("/loginDetails")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void saveDetails(@RequestBody LoginDetail loginDetail){
       loginDetail.setLoginDate(getTimeStamp());
       this.loginDetailRepository.save(loginDetail);
    }

    public Date getTimeStamp(){
       Date date = new Date();

        return new Timestamp(date.getTime());
    }
}
