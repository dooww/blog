package com.iammahfuz.service;

import com.iammahfuz.model.User;
import com.iammahfuz.model.skill;
import com.iammahfuz.repository.UserRepository;
import com.iammahfuz.repository.skillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class skillServiceImpl implements SkillService {
    @Autowired
    private skillRepository skillRepository;
    @Override
    public List<skill> findAllskill() {
        return skillRepository.findAll();
    }

    @Override
    public skill findskillById(int id) {
        return skillRepository.findById(id);
    }

    @Override
    public void saveskill(skill user) {

    }


    }
