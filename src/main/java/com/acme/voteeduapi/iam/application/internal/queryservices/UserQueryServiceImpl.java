package com.acme.voteeduapi.iam.application.internal.queryservices;

import com.acme.voteeduapi.iam.domain.model.aggregates.User;
import com.acme.voteeduapi.iam.domain.model.queries.GetAllUsersQuery;
import com.acme.voteeduapi.iam.domain.model.queries.GetUserByIdQuery;
import com.acme.voteeduapi.iam.domain.model.queries.GetUserByDniQuery;
import com.acme.voteeduapi.iam.domain.services.UserQueryService;
import com.acme.voteeduapi.iam.infrastructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of {@link UserQueryService} interface.
 */
@Service
public class UserQueryServiceImpl implements UserQueryService {
    private final UserRepository userRepository;

    /**
     * Constructor.
     *
     * @param userRepository {@link UserRepository} instance.
     */
    public UserQueryServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * This method is used to handle {@link GetAllUsersQuery} query.
     * @param query {@link GetAllUsersQuery} instance.
     * @return {@link List} of {@link User} instances.
     * @see GetAllUsersQuery
     */
    @Override
    public List<User> handle(GetAllUsersQuery query) {
        return userRepository.findAll();
    }

    /**
     * This method is used to handle {@link GetUserByIdQuery} query.
     * @param query {@link GetUserByIdQuery} instance.
     * @return {@link Optional} of {@link User} instance.
     * @see GetUserByIdQuery
     */
    @Override
    public Optional<User> handle(GetUserByIdQuery query) {
        return userRepository.findById(query.userId());
    }

    /**
     * This method is used to handle {@link GetUserByDniQuery} query.
     * @param query {@link GetUserByDniQuery} instance.
     * @return {@link Optional} of {@link User} instance.
     * @see GetUserByDniQuery
     */
    @Override
    public Optional<User> handle(GetUserByDniQuery query) {
        return userRepository.findByDni(query.dni());
    }
}
