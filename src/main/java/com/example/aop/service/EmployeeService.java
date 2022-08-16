package com.example.aop.service;

import com.example.aop.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Integer employeeId);

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Integer employeeId);

    void deleteByName(EmployeeDto employeeDto);
}
