package com.acme.voteeduapi.profiles.domain.services;

import com.acme.voteeduapi.profiles.domain.model.aggregates.Student;
import com.acme.voteeduapi.profiles.domain.model.queries.GetAllStudentsQuery;
import com.acme.voteeduapi.profiles.domain.model.queries.GetStudentByEmailQuery;
import com.acme.voteeduapi.profiles.domain.model.queries.GetStudentByIdQuery;

import java.util.Optional;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface StudentQueryService {
    Optional<Student> handle(GetStudentByEmailQuery query);
    Optional<Student> handle(GetStudentByIdQuery query);
    Optional<Student> handle(GetAllStudentsQuery query);
}
