package com.trial.compositeKey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EnrolKey implements Serializable {
    @ManyToOne
    public Student student;
    @ManyToOne
    public Course course;

    public EnrolKey(Integer stuId, String courseCode) {
        student=new Student(stuId);
        course=new Course(courseCode);
    }
}
