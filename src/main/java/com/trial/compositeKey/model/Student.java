package com.trial.compositeKey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer stuId;
    public String firstName;
    public String lastName;
    public Date dob;
    public String address;
    public Integer stuYear;
    public Student(Integer stuId) {
        this.stuId = stuId;
    }
}
