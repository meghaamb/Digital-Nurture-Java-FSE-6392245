package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name="code")
    private String code;

    @Column(name="name")
    private String name;

    // getters and setters

    // toString()
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }

}
