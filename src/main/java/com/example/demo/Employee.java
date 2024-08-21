package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {

    @Id
    private int id;
    private String empName;
    private String empRole;
    private int empSalary;

    public Employee() {

    }

    public Employee(int id, String empName, String empRole, int empSalary) {
        this.id = id;
        this.empName = empName;
        this.empRole = empRole;
        this.empSalary = empSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
