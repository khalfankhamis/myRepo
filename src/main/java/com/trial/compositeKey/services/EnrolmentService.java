package com.trial.compositeKey.services;

import com.trial.compositeKey.model.EnrolKey;
import com.trial.compositeKey.model.Enrolment;
import com.trial.compositeKey.repository.EnrolmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrolmentService {
    @Autowired
    public EnrolmentRepository enrolmentRepository;

    public Enrolment addEnrolment(Enrolment abe){
        return enrolmentRepository.save(abe);
    }
    public List<Enrolment> getAll(){
        return enrolmentRepository.findAll();
    }
    public Enrolment getById(EnrolKey id){
        Optional<Enrolment> optionalEnrolment=enrolmentRepository.findById(id);
        if (optionalEnrolment.isPresent()){
            return optionalEnrolment.get();
        }
            return null;
    }
}
