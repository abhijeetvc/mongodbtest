package com.mongodbdemo.mongodbtest.controller;

import com.mongodbdemo.mongodbtest.model.Employee;
import com.mongodbdemo.mongodbtest.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveEmp(@RequestBody Employee employee){

        employeeRepo.save(employee);
        return "Data saved";
    }
}
