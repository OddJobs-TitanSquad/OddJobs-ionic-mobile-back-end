package com.example.jwt.repository;

import com.example.jwt.database.Replica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplicaRepository extends JpaRepository<Replica,Long> {
}
