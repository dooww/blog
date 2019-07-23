package com.iammahfuz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iammahfuz.model.skill;

@Repository("skillRepository")
public interface skillRepository extends JpaRepository<skill, Long> {
    List<skill> findAll();
    skill findById(int id);}