package com.acme.voteeduapi.iam.domain.services;

import com.acme.voteeduapi.iam.domain.model.commands.SeedRolesCommand;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
