package com.data.emsjsp.dtos;

import com.data.emsjsp.enums.EDepartments;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private Long employee;
    private EDepartments departments;
}
