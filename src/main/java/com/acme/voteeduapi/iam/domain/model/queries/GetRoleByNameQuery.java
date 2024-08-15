package com.acme.voteeduapi.iam.domain.model.queries;

import com.acme.voteeduapi.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}
