package com.trial.compositeKey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enrolment {
    @EmbeddedId
    public EnrolKey enrolKey;

    public Integer marks;
}
