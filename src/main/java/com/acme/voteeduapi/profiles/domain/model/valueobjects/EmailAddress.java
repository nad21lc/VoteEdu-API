package com.acme.voteeduapi.profiles.domain.model.valueobjects;

import jakarta.validation.constraints.Email;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record EmailAddress(@Email String address) {
    public EmailAddress {
        if (address == null) {
            throw new IllegalArgumentException("Email address cannot be null");
        }
    }
}
