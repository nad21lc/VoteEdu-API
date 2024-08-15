package com.acme.voteeduapi.iam.domain.services;

import com.acme.voteeduapi.iam.domain.model.entities.Role;
import com.acme.voteeduapi.iam.domain.model.queries.GetAllRolesQuery;
import com.acme.voteeduapi.iam.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query);
    Optional<Role> handle(GetRoleByNameQuery query);
}
