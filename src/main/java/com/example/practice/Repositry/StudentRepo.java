package com.example.practice.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.Entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long>{
    
}
 