package com.sesac.aibackend.service;

import com.sesac.aibackend.domain.Employee;
import com.sesac.aibackend.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.fin
    }
}
