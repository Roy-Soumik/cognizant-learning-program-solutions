package com.cognizant.employee_service.dao;

import com.cognizant.employee_service.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> EMPLOYEE_LIST;

    public EmployeeDao(ArrayList<Employee> employeeList) {
        EMPLOYEE_LIST = employeeList;
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}