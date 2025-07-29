package com.example.practice.service;

import java.util.List;

import com.example.practice.Dto.StudentDto;

public interface StudentService {
    List<StudentDto> getAllStudent();
    StudentDto getStudentById(Long id);
    StudentDto saveStudent(StudentDto studentDto);
    
}
