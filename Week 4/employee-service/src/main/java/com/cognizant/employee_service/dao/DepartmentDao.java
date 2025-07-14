package com.cognizant.employee_service.dao;

import com.cognizant.employee_service.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    private static List<Department> DEPARTMENT_LIST;

    @Autowired
    public DepartmentDao(List<Department> departmentList) {
        DEPARTMENT_LIST = departmentList;
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}