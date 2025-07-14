package com.cognizant.employee_service.controller;

import com.cognizant.employee_service.model.Department;
import com.cognizant.employee_service.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        logger.info("GET /departments called");
        return departmentService.getAllDepartments();
    }
}
