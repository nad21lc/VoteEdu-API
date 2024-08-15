package com.acme.voteeduapi.iam.domain.services;

import com.acme.voteeduapi.iam.domain.model.aggregates.User;
import com.acme.voteeduapi.iam.domain.model.queries.GetAllUsersQuery;
import com.acme.voteeduapi.iam.domain.model.queries.GetUserByDniQuery;
import com.acme.voteeduapi.iam.domain.model.queries.GetUserByIdQuery;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface UserQueryService {
    List<User> handle(GetAllUsersQuery query);
    Optional<User> handle(GetUserByIdQuery query);
    Optional<User> handle(GetUserByDniQuery query);
}
