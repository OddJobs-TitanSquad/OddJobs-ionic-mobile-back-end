package com.example.jwt.controller;

import com.example.jwt.database.Application;
import com.example.jwt.database.Rating;
import com.example.jwt.repository.RatingRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("/api/auth")
public class RatingController {
    private RatingRepository ratingRepository;

    public RatingController(RatingRepository ratingRepository){
        this.ratingRepository = ratingRepository;
    }
    @PostMapping("/put")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void insert (@RequestBody Rating rating){
        rating.setEmployeeRateDateAndTime(getTimeStamp());
        ratingRepository.save(rating);

    }

    public Date getTimeStamp(){
        Date date = new Date();

        return new Timestamp(date.getTime());
    }

}
