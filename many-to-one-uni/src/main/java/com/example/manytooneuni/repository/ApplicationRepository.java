package com.example.manytooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytooneuni.entity.Application;
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
