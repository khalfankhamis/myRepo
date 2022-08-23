package com.trial.compositeKey.controler;

import com.trial.compositeKey.model.EnrolKey;
import com.trial.compositeKey.model.Enrolment;
import com.trial.compositeKey.services.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrolment")
public class EnrolmentControler {
    @Autowired
    public EnrolmentService enrolmentService;

    @PostMapping
    public Enrolment addEnrolment(@RequestBody Enrolment abe){
        return enrolmentService.addEnrolment(abe);
    }
    @GetMapping
    public List<Enrolment> getAll(){
        return enrolmentService.getAll();
    }
    @GetMapping("enrolKey/{stuId}/{courseCode}")
    public Enrolment getById(@PathVariable Integer stuId,@PathVariable String courseCode){
        EnrolKey id=new EnrolKey(stuId,courseCode);
        return enrolmentService.getById(id);
    }
}
