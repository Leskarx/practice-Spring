package com.example.practice.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
   private Long ID;
    private String name;
    private String email;
    
}
