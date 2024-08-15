package com.acme.voteeduapi.iam.domain.model.commands;

import com.acme.voteeduapi.iam.domain.model.entities.Role;

import java.util.List;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record SignUpCommand(String dni, String password, List<Role> roles) {
}
