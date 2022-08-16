package com.example.aop.controller;

import com.example.aop.dto.EmployeeDto;
import com.example.aop.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        log.info("Inside EmployeeController Constructor");
        System.out.println("Inside EmployeeController Constructor");
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeByIdController(@PathVariable Integer employeeId) {
        log.info("Inside getEmployeeByIdController controller with id : {}", employeeId);
        System.out.println("Inside getEmployeeByIdController controller");
        return ResponseEntity.ok(employeeService.getEmployeeById(employeeId));
    }

    @PostMapping("/")
    public ResponseEntity<EmployeeDto> saveEmployeeController(@RequestBody EmployeeDto employeeDto) {
        log.info("Inside saveEmployeeController controller with payload : {}", employeeDto);
        System.out.println("Inside saveEmployeeController controller");
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDto));
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> uploadEmployeeController(@PathVariable Integer employeeId, @RequestBody EmployeeDto employeeDto) {
        log.info("Inside uploadEmployeeController controller with payload : {}", employeeDto);
        System.out.println("Inside uploadEmployeeController controller");
        return ResponseEntity.ok(employeeService.updateEmployee(employeeDto, employeeId));
    }
}
