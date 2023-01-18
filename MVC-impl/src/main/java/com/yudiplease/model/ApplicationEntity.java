package com.yudiplease.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name = "application")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicationEntity extends AbstractEntity {

    private String name;

    private String version;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    private UserEntity userEntity;
}
