package com.trial.compositeKey.services;

import com.trial.compositeKey.model.Course;
import com.trial.compositeKey.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    public CourseRepository courseRepository;

    public Course addCourse(Course abe){
        return courseRepository.save(abe);
    }
    public List<Course> getAll(){
        return courseRepository.findAll();
    }
    public Optional<Course> getById(String courseCode){
        return courseRepository.findById(courseCode);
    }
    public void deleteMe(String courseCode){
        courseRepository.deleteById(courseCode);
    }
}
