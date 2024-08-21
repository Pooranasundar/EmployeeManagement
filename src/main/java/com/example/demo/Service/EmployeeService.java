package com.example.demo.Service;

import com.example.demo.Employee;
import com.example.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public void addEmp(Employee emp)
    {
        repo.save(emp);
    }

    public List<Employee> getAllEmp()
    {
        return repo.findAll();
    }

    public void updateEmp(Employee emp)
    {
        repo.save(emp);
    }

    public void deleteEmp(int empId)
    {
        repo.deleteById(empId);
    }

}
