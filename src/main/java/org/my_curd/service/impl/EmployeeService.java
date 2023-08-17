package org.my_curd.service.impl;

import org.my_curd.entity.Employee;

public interface EmployeeService {
    public abstract void createEmployee(Employee employee);
    public abstract Employee getEmployeeById(int employeeId);
    public abstract void updateEmployeeById(int employeeId, Double newSal);
    public abstract void deleteEmployeeById(int employeeId);
}
