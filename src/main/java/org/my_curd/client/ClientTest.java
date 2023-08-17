package org.my_curd.client;

import org.my_curd.entity.Employee;
import org.my_curd.service.impl.EmployeeService;
import org.my_curd.service.impl.EmployeeServiceImpl;


public class ClientTest {
    public static void main(String[] args) {


        EmployeeService employeeService = new EmployeeServiceImpl();

        // Create Operation
        createEmployee(employeeService);

        // Get Operation
        /*Employee employee = employeeService.getEmployeeById(1);
        System.out.println("Employee Details : "+employee);*/

        //Update Operation
        //employeeService.updateEmployeeById(1, 900000000.0);

        //Delete Operation
        //employeeService.deleteEmployeeById(2);

    }

    private static void createEmployee(EmployeeService employeeService){
        employeeService.createEmployee(getEmployee());
    }
    private static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeFirstName("Paritosh");
        employee.setEmployeeLastName("Sharma");
        employee.setEmail("SharmaParitosh77@gmail.com");
        employee.setDoj("01-10-2023");
        employee.setSalary(5000000.00);

        employee.setEmployeeFirstName("Abhishekh");
        employee.setEmployeeLastName("Gupta");
        employee.setEmail("AbhishekhGupta55@gmail.com");
        employee.setDoj("01-12-2023");
        employee.setSalary(100000.00);
        return employee;


    }
}
