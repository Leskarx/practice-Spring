package com.example.practice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private int ID;
    private String name;
    private String email;
    
}
