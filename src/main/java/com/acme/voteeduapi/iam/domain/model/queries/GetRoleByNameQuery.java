package com.acme.voteeduapi.iam.domain.model.queries;

import com.acme.voteeduapi.iam.domain.model.valueobjects.Roles;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public record GetRoleByNameQuery(Roles name) {
}
