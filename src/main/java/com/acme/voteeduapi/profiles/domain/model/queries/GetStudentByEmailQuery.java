package com.acme.voteeduapi.profiles.domain.model.queries;

import com.acme.voteeduapi.profiles.domain.model.valueobjects.EmailAddress;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record GetStudentByEmailQuery(EmailAddress emailAddress) {
}
