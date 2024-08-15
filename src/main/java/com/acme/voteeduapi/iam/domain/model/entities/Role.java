package com.acme.voteeduapi.iam.domain.model.entities;

import com.acme.voteeduapi.iam.domain.model.valueobjects.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.List;

/**
 * This class represents a role entity.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Roles name;

    public Role(Roles name) {
        this.name = name;
    }

    /**
     * This method returns the name of the role.
     * @return The name of the role.
     */
    public String getStringName() {
        return name.toString();
    }

    /**
     * This method returns the default role.
     * @return The default role.
     */
    public static Role getDefaulRole() {
        return new Role(Roles.ROLE_USER);
    }

    /**
     * This method converts a string to a Role object.
     * @param name The name of the role.
     * @return The Role object.
     */
    public static Role toRoleFromName(String name) {
        return new Role(Roles.valueOf(name));
    }

    /**
     * This method validates a set of roles and returns the set of roles if it is not empty, otherwise it returns the default role.
     * @param roles The set of roles.
     * @return The set of roles.
     */
    public static List<Role> validateRoleSet(List<Role> roles) {
        if (roles == null || roles.isEmpty()) {
            return List.of(getDefaulRole());
        }
        return roles;
    }
}
