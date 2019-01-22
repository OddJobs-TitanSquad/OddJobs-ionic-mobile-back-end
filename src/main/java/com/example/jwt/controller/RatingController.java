package com.example.jwt.controller;

import com.example.jwt.database.Application;
import com.example.jwt.database.Rating;
import com.example.jwt.repository.RatingRepository;
import org.springframework.web.bind.annotation.*;

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
        ratingRepository.save(rating);

    }
}
