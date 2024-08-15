package com.acme.voteeduapi.iam.infrastructure.persistence.jpa.repositories;

import com.acme.voteeduapi.iam.domain.model.aggregates.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * This interface represents the repository for the User entity.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * This method is used to find a user by its DNI.
     * @param dni The DNI of the user.
     * @return An optional with the user if it exists.
     */
    Optional<User> findByDni(String dni);
    /**
     * This method is used to check if a user exists by its DNI.
     * @param dni The DNI of the user.
     * @return A boolean indicating if the user exists.
     */
    boolean existsByDni(String dni);
}
