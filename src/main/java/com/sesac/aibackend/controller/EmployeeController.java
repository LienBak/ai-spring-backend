package com.sesac.aibackend.controller;

import com.sesac.aibackend.domain.Employee;
import com.sesac.aibackend.dto.EmployeeResponse;
import com.sesac.aibackend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeResponse get(@PathVariable Long id) {
        Employee employee = employeeService.
    }


}
