package com.example.jwt.controller;

import com.example.jwt.database.Application;
import com.example.jwt.repository.ApplicationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class ApplicationController {

    private ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }
    @PostMapping("/insert")
   @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void insert (@RequestBody Application application){
        applicationRepository.save(application);

    }
    @GetMapping("/accepted")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public @ResponseBody  List<Application> all(){
        return applicationRepository.findAll();
    }
    @GetMapping("/accept")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public @ResponseBody  List<Application> allAccept(){
        return applicationRepository.findAllByAcceptAfter();
    }
    @PutMapping("/putAccept/{ap_id}")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void updateApplication(@PathVariable Long ap_id,@RequestBody Application application){
        Application application1 = applicationRepository.findApplicationByApplicationId(ap_id);

        //application1.setAccept(application.isAccept());
        application1.setConfirm(application.isConfirm());


         applicationRepository.save(application1);






    }

}
