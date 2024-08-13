package com.acme.voteeduapi.profiles.domain.model.commands;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record CreateStudentCommand(String firstName, String lastName, String email) {
}
