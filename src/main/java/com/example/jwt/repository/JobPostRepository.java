package com.example.jwt.repository;

import com.example.jwt.database.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.concurrent.Future;


@Repository
@CrossOrigin(origins = {"http://localhost:8102", "file://"})
public interface JobPostRepository extends JpaRepository<JobPost,Long>{
@Query(value = "select j from JobPost j where j.jobId = ?1")
List<JobPost> findJobPostByJob_id(Long job_id);

@Query(value = "select jp from JobPost jp where jp.jobType = ?1 and jp.expireDate > current_timestamp and jp.isPublish = true ")
    List<JobPost> findDistinctByPublishTrueAndExpireDateBefore(Long jobType);
}
