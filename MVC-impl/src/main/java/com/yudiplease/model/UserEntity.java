package com.yudiplease.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Entity
@Table(name = "account")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(name = "hash_password", nullable = false)
    private String hashPassword;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "userEntity")
    private List<ApplicationEntity> applications;
}

