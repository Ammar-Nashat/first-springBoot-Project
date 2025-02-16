package com.spring.data1.second.controller;

import com.spring.data1.second.model.dto.EmployeeDto;
import com.spring.data1.second.model.entity.Employee;
import com.spring.data1.second.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable int id) {
        return empService.getEmpRepo(id);
    }
    @PostMapping("/emp-create")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto  employeeDto) {
        return empService.createEmployee(employeeDto);
    }
 @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(
            @PathVariable Integer id,
            @RequestBody EmployeeDto employeeDto) {
        EmployeeDto updatedEmployee = empService.updateEmployee(id, employeeDto);
        return ResponseEntity.ok(updatedEmployee); // HTTP 200 OK
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        empService.deleteEmployee(id);
    }
    @GetMapping("/all-employees")
    public List<Employee> getAllEmployees() {
        return empService.findAll();
    }
}
