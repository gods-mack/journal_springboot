package com.example.myjavaREST.repository;

import com.example.myjavaREST.entity.journalEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface journalRepository extends JpaRepository<journalEntity, Long> {
}