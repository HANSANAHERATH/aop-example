package com.example.aop.dto;

import com.example.aop.annotations.Loggable;

public class EmployeeDto {

    private Integer employeeId;
    private String employeeName;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Loggable
    public String getEmployeeName() {
        System.out.println("get employee name ******* ");
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
