package org.my_curd.service.impl;


import org.my_curd.dao.impl.EmployeeDao;
import org.my_curd.dao.impl.EmployeeDaoImpl;
import org.my_curd.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    public void createEmployee(Employee employee) {
        if (employee != null && employee.getDoj() != null){
            employeeDao.addEmployee(employee);
        }

    }
    public Employee getEmployeeById(int employeeId) {
        return employeeDao.fetchEmployeeById(employeeId);
    }

    public void updateEmployeeById(int employeeId, Double newSal) {
        if (employeeId > 0 && newSal > 0) {
            employeeDao.updateEmployeeById(employeeId, newSal);
        } else {
            return;
        }
    }

    public void deleteEmployeeById(int employeeId) {
        employeeDao.deleteEmployeeById(employeeId);
    }
}
