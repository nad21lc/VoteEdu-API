package com.acme.voteeduapi.iam.infrastructure.persistence.jpa.repositories;

import com.acme.voteeduapi.iam.domain.model.entities.Role;
import com.acme.voteeduapi.iam.domain.model.valueobjects.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface that represents the repository of the role entity
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Method that finds a role by its name
     * @param name the name of the role
     * @return an optional of the role
     */
    Optional<Role> findByName(Roles name);
    /**
     * Method that checks if a role exists by its name
     * @param name the name of the role
     * @return a boolean that indicates if the role exists
     */
    boolean existsByName(Roles name);
}
