package com.example.demo.service;

import com.example.demo.model.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> findAll();

    void save(Employer employer);

    Employer findById(int id);

    void update(int id, Employer employer);

    void remove(int id);
}
