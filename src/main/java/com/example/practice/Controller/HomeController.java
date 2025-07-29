package com.example.practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.practice.Dto.StudentDto;
// import com.example.practice.Dto.StudentDto;
import com.example.practice.Entity.StudentEntity;
import com.example.practice.service.StudentService;



@RestController


public class HomeController {
   private final StudentService studentService;
  



   public HomeController(StudentService studentService) {
      this.studentService = studentService;
   }




   @GetMapping("/student")
   public List<StudentDto> getStudent(){
      return studentService.getAllStudent();
     

   }

   @GetMapping("/student/{id}")
   public StudentDto getStudentById(@PathVariable Long id){
      return studentService.getStudentById(id);

     
   }
   @PostMapping("/demo")
   public StudentDto enterStudent(@RequestBody StudentDto student){
      StudentDto responseStudent=studentService.saveStudent(student);

     if(responseStudent!=null){
      return responseStudent;
     }else{
      throw new RuntimeException("Student not saved properly");
     }


      


   }
   
   
  
    
}
