package com.example.jwt.repository;

import com.example.jwt.database.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {
    @Query(value = "select a from Application a where a.isAccept = true")
    List<Application> findAllByAcceptAfter();

    @Query(value = "select ap from Application ap where ap.applicationId = ?1")
    Application findApplicationByApplicationId(Long ap_id);
}
