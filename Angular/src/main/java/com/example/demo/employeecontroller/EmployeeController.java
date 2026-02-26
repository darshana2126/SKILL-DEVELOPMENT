package com.example.demo.employeecontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular
public class EmployeeController {
@GetMapping("/employees")
public List<Employee>	getEmployees() 

        {
	         return Arrays.asList(
             new Employee(1, "ranjith"),
             new Employee(2, "vicky"),
             new Employee(3, "poona")
             );
	        		 
	
          }
}
