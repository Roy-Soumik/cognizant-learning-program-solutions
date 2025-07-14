package com.cognizant.employee_service.dao;

import com.cognizant.employee_service.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    private static List<Employee> EMPLOYEE_LIST;

    public EmployeeDao() {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = (List<Employee>) ctx.getBean("employeeList");
        ctx.close();
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}