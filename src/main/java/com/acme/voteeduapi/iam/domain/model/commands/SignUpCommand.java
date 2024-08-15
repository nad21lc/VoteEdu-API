package com.acme.voteeduapi.iam.domain.model.commands;

import com.acme.voteeduapi.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String dni, String password, List<Role> roles) {
}
