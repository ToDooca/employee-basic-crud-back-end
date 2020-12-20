package com.practice.springbootbackend.controller;

import com.practice.springbootbackend.entity.Employee;
import com.practice.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employees

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // create employee rest api
    @PostMapping("/employees")
    @CrossOrigin
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
