package com.EmployeeDetails.Employeess.Repository.SearchRepo;

import com.EmployeeDetails.Employeess.model.Employee;

import java.util.List;

public interface SearchRepo {

    public List<Employee> findByUnit(String text);

}
