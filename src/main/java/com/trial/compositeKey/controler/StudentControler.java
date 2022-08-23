package com.trial.compositeKey.controler;

import com.trial.compositeKey.model.Student;
import com.trial.compositeKey.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentControler {
    @Autowired
    private StudentServices studentServices;

    @PostMapping
    public Student addStudent(@RequestBody Student abe){
        return studentServices.addStudent(abe);
    }
    @GetMapping
    public List<Student> getAll(){
        return studentServices.getAll();
    }
    @GetMapping("/{stuId}")
    public Optional<Student> getbyId(Integer stuId){
        return studentServices.getbyId(stuId);
    }
    @PutMapping("/{stuId}")
    public Student addStudent(@RequestBody Student abe,@PathVariable Integer stuId){
        abe.setStuId(stuId);
        return studentServices.addStudent(abe);
    }
    @DeleteMapping("/{stuId}")
    public void deleteMe(@PathVariable Integer stuId){
        studentServices.deleteMe(stuId);
    }
}
