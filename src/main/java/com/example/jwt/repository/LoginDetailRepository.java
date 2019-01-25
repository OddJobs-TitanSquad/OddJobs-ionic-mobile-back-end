package com.example.jwt.repository;

import com.example.jwt.database.LoginDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDetailRepository extends JpaRepository<LoginDetail,Long> {
}
