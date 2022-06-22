package com.data.emsjsp.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String username;
    private String phone;
//    private boolean isAdmin;
}
