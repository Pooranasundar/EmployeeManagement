package com.example.demo.Controller;

import com.example.demo.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/getemp")
    public List<Employee> getEmployee() {
        return service.getAllEmp();
    }

    @PostMapping("/addemp")
    public void addEmployee(@RequestBody Employee emp)
    {
        service.addEmp(emp);
    }

    @PutMapping("/updateemp")
    public void updateEmployee(@RequestBody Employee emp)
    {
        service.updateEmp(emp);
    }

    @DeleteMapping("/deleteemp/{empId}")
    public void deleteEmployee(@PathVariable int empId)
    {
        service.deleteEmp(empId);
    }



}
