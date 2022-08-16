package com.example.aop.service;

import com.example.aop.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeById(Integer employeeId) {
        log.info("Inside getEmployee method with id : {}", employeeId);
        System.out.println("Inside getEmployee method");
        return null;
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        log.info("Inside saveEmployee method with payload : {}", employeeDto);
        System.out.println("Inside saveEmployee method");
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, Integer employeeId){
        System.out.println("updateEmployee method inside");
        String employeeName = employeeDto.getEmployeeName();
        System.out.println(employeeName);

        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setEmployeeName("After execute method");
        employeeDto1.setEmployeeId(123456);
        return employeeDto1;
    }
}
