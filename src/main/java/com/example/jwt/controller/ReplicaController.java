package com.example.jwt.controller;

import com.example.jwt.database.Replica;
import com.example.jwt.repository.ReplicaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class ReplicaController {


    private ReplicaRepository replicaRepository;

    public ReplicaController(ReplicaRepository replicaRepository){
        this.replicaRepository = replicaRepository;
    }

    @PostMapping("/replica")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public void saveReplica(@RequestBody Replica replica){
        replicaRepository.save(replica);
    }
}
