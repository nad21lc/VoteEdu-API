package com.acme.voteeduapi.profiles.domain.services;

import com.acme.voteeduapi.profiles.domain.model.aggregates.Student;
import com.acme.voteeduapi.profiles.domain.model.commands.CreateStudentCommand;

import java.util.Optional;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface StudentCommandService {
    Optional<Student> handle(CreateStudentCommand command);
}
