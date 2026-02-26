package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository repo;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee emp) {
        return repo.save(emp);
    }

    @PutMapping("/{username}")
    public Employee updateEmployee(@PathVariable String username,
                                   @RequestBody Employee emp) {
        emp.setUsername(username);
        return repo.save(emp);
    }

    @DeleteMapping("/{username}")
    public String deleteEmployee(@PathVariable String username) {
        repo.deleteById(username);
        return "Deleted " + username;
    }
}
