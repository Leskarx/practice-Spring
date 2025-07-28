package com.example.practice.service.imple;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.example.practice.Dto.StudentDto;
import com.example.practice.Entity.StudentEntity;
import com.example.practice.Repositry.StudentRepo;
import com.example.practice.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceI implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentEntity> students = studentRepo.findAll();
        return students.stream()
        .map(student -> new StudentDto(
                student.getId(),
                student.getName(),
                student.getEmail()))
        .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(Long id) {
        // TODO Auto-generated method stub
        Optional<StudentEntity> optionalStudent = studentRepo.findById(id);
        if(optionalStudent.isPresent()){
            StudentEntity student=optionalStudent.get();
            return new StudentDto(student.getId(),student.getName(),student.getEmail());
        }else{
            throw new RuntimeException("student is not found");

        }


        
    }
}
