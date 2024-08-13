package com.acme.voteeduapi.profiles.domain.model.valueobjects;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record PersonName(String firstName, String lastName) {
    public PersonName {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
