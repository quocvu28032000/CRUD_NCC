package com.example.ncc_employee.service;

import java.util.List;

import com.example.ncc_employee.model.Employee;
//import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
