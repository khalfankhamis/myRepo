package com.trial.compositeKey.services;

import com.trial.compositeKey.model.Student;
import com.trial.compositeKey.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    public StudentRepository studentRepository;

    public Student addStudent(Student abe){
        return studentRepository.save(abe);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> getbyId(Integer stuId){
        return studentRepository.findById(stuId);
    }
    public void deleteMe(Integer stuId){
        studentRepository.deleteById(stuId);
    }
}
