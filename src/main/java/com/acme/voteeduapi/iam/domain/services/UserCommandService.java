package com.acme.voteeduapi.iam.domain.services;

import com.acme.voteeduapi.iam.domain.model.aggregates.User;
import com.acme.voteeduapi.iam.domain.model.commands.SignInCommand;
import com.acme.voteeduapi.iam.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */
public interface UserCommandService {
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
    Optional<User> handle(SignUpCommand command);
}
