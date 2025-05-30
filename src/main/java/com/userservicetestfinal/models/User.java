package com.userservicetestfinal.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@JsonDeserialize(as = User.class)
public class User extends BaseModel {

    private String email;
    private String password;

    @ManyToMany(fetch = jakarta.persistence.FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();
}
