package com.trial.compositeKey.controler;

import com.trial.compositeKey.model.Course;
import com.trial.compositeKey.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/course")
public class CourseControler {
    @Autowired
    public CourseService courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course abe){
        return courseService.addCourse(abe);
    }
    @GetMapping
    public List<Course> getAll(){
        return courseService.getAll();
    }
    @GetMapping("/{courseCode}")
    public Optional<Course> getById(@PathVariable String courseCode){
        return courseService.getById(courseCode);
    }
    @PutMapping("/{courseCode}")
    public Course addCourse(@RequestBody Course abe,@PathVariable String courseCode){
        abe.setCourseCode(courseCode);
        return courseService.addCourse(abe);
    }
    @DeleteMapping("/{courseCode}")
    public void deleteMe(@PathVariable String courseCode){
        courseService.deleteMe(courseCode);
    }


}
