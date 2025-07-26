package com.example.practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.Dto.StudentDto;



@RestController


public class HomeController {
   @GetMapping("/student")
   public StudentDto getStudent(){
      return new StudentDto(11, "GOuri", "leskarzone@gmail.com,");
     

   }
  
    
}
