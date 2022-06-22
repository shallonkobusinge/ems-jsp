package com.data.emsjsp.controllers;

import com.data.emsjsp.dtos.LoginRequest;

import com.data.emsjsp.dtos.User;
import com.data.emsjsp.utils.APIResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAll(Model model){
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<User[]> users = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users",User[].class);
//        model.addAttribute("users",users.getBody());
        return "users/Login";
    }

    @PostMapping("/login")
    public String Login(String emailOrUsernameOrPhone, String password){
        System.out.println("Email "+emailOrUsernameOrPhone+" Password "+password);
        RestTemplate restTemplate = new RestTemplate();
        LoginRequest loginRequest = new LoginRequest(emailOrUsernameOrPhone,password);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:5000/api/v1/users/login",loginRequest,String.class);
        System.out.println("response "+responseEntity);
        HttpHeaders headers = new HttpHeaders();
        APIResponse response = new APIResponse(responseEntity);
 //        headers.add("authorization",);
        return "employees/ViewEmployee";
    }
    @PostMapping("/register")
    public String Register(String fname,String lname, String phone, String username, String email, String password){
        RestTemplate restTemplate = new RestTemplate();
        User registerRequest = new User(fname,lname,email,password,username,phone);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:5000/api/v1/users/add",registerRequest,String.class);
        System.out.println("response "+responseEntity);
        return "employees/ViewEmployee";
    }
}
