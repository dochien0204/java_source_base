package org.example.base.domain.entity;

import jakarta.persistence.*;
import org.example.base.domain.entity.base.BaseEntity;

@Entity
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String email;
}
