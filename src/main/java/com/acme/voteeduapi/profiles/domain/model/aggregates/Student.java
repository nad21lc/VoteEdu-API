package com.acme.voteeduapi.profiles.domain.model.aggregates;

import com.acme.voteeduapi.profiles.domain.model.commands.CreateStudentCommand;
import com.acme.voteeduapi.profiles.domain.model.valueobjects.EmailAddress;
import com.acme.voteeduapi.profiles.domain.model.valueobjects.PersonName;
import com.acme.voteeduapi.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;

/**
 * This class represents the Student aggregate root.
 * @author Nadia Alessandra Lucas Coronel - u202120430
 * @version 1.0
 */

@Entity
public class Student extends AuditableAbstractAggregateRoot<Student> {
    @Embedded
    private PersonName name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "address", column = @Column(name = "email_address"))})
    EmailAddress email;

    /**
     * @param firstName
     * @param lastName
     * @param email
     */
    public Student(String firstName, String lastName, String email) {
        this.name = new PersonName(firstName, lastName);
        this.email = new EmailAddress(email);
    }

    /**
     * @param command
     */
    public Student(CreateStudentCommand command) {
        this.name = new PersonName(command.firstName(), command.lastName());
        this.email = new EmailAddress(command.email());
    }

    public Student() {
    }

    public void updateName(String firstName, String lastName) {
        this.name = new PersonName(firstName, lastName);
    }

    public void updateEmail(String email) {
        this.email = new EmailAddress(email);
    }

    public String getFullName() {
        return name.getFullName();
    }

    public String getEmail() {
        return email.address();
    }
}
