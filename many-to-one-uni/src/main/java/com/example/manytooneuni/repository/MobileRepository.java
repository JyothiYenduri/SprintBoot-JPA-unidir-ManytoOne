package com.example.manytooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytooneuni.entity.Mobile;
@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
