package com.EmployeeDetails.Employeess.Repository;

import com.EmployeeDetails.Employeess.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
}
