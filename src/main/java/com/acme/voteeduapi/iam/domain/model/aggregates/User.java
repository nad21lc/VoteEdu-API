package com.acme.voteeduapi.iam.domain.model.aggregates;

import com.acme.voteeduapi.iam.domain.model.entities.Role;
import com.acme.voteeduapi.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */

@Getter
@Setter
@Entity
public class User extends AuditableAbstractAggregateRoot<User> {
    @NotBlank
    @Size(max = 8)
    private String dni;

    @NotBlank
    @Size(max = 100)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
        this.roles = new HashSet<>();
    }

    /**
     * Constructor for User
     * @param dni
     * @param password
     */
    public User(String dni, String password) {
        this.dni = dni;
        this.password = password;
        this.roles = new HashSet<>();
    }

    /**
     * Constructor for User
     * @param dni
     * @param password
     * @param roles
     */
    public User(String dni, String password, List<Role> roles) {
        this(dni, password);
        addRoles(roles);
    }

    /**
     * Add roles to the user
     * @param role
     * @return User
     */
    public User addRoles(Role role) {
        this.roles.add(role);
        return this;
    }

    /**
     * Add roles to the user
     * @param roles
     * @return User
     */
    public User addRoles(List<Role> roles) {
        this.roles.addAll(roles);
        return this;
    }
}
