package com.data.emsjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping
    public String viewEmployees(){
        return "employees/ViewEmployee";
    }
    @PostMapping("/add")
    public String addEmployees(){
        return "employees/RegisterEmployee";
    }

}
