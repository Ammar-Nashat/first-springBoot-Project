package com.spring.data1.second.service;

import com.spring.data1.second.exception.ResourceNotFoundException;
import com.spring.data1.second.model.dto.EmployeeDto;
import com.spring.data1.second.model.entity.Employee;
import com.spring.data1.second.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public EmployeeDto getEmpRepo(Integer id) {
        return empRepo.findById(id).map(employee -> EmployeeDto.fromEntity(employee))
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));

            }
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeDto.toEntity(employeeDto);
        Employee savedEmployee = empRepo.save(employee);
        return EmployeeDto.fromEntity(savedEmployee);

    }

    public void deleteEmployee(Integer id) {
        if (!empRepo.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with ID: " + id);
        }
        empRepo.deleteById(id);
    }

    public List<Employee> findAll() {
        return empRepo.findAll();
    }
}
