package com.example.jwt.repository;

import com.example.jwt.database.CompletedJob;
import com.example.jwt.database.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompletedJobRepository extends JpaRepository<CompletedJob,Long> {
    @Query(value = "select c from CompletedJob c where c.completedJobId = ?1")
    List<CompletedJob> findCompletedJobByCompletedJobId(Long comJob_id);

}
