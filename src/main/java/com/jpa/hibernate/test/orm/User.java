package com.jpa.hibernate.test.orm;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Immutable
@Entity
@Table(name = "user")
public class User {

    @Id
    private long id;

    @Column
    private String username;

    @Column(name = "firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column
    private String password;

    @Column
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ id :").append(this.id);
        builder.append(" /username :").append(this.username);
        builder.append(" /firstname :").append(this.firstName);
        builder.append(" /lastName :").append(this.lastName);
        builder.append(" /email :").append(this.email).append(" ]");
        return builder.toString();
    }
}
