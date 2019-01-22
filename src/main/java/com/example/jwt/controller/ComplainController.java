package com.example.jwt.controller;

import com.example.jwt.database.Application;
import com.example.jwt.database.Complain;
import com.example.jwt.repository.ComplainRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class ComplainController {
    private ComplainRepository complainRepository;

    public ComplainController(ComplainRepository complainRepository) {
        this.complainRepository = complainRepository;
    }

    @PostMapping("/complain")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void addComplain (@RequestBody Complain complain){
        complainRepository.save(complain);

    }

}
