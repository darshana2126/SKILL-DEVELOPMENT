package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee login(String username, String password) {
        return repo.findByUsernameAndPassword(username, password);
    }
}