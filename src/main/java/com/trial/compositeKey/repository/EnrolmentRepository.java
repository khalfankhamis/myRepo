package com.trial.compositeKey.repository;

import com.trial.compositeKey.model.EnrolKey;
import com.trial.compositeKey.model.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnrolmentRepository extends JpaRepository<Enrolment, EnrolKey> {
}
