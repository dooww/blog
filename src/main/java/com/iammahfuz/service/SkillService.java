package com.iammahfuz.service;

import java.util.List;

import com.iammahfuz.model.skill;

public interface SkillService {
    public List<skill> findAllskill();
    public skill findskillById(int id);
    public void saveskill(skill user);
}
