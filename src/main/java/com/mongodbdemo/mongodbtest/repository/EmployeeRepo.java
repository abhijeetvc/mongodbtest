package com.mongodbdemo.mongodbtest.repository;

import com.mongodbdemo.mongodbtest.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
