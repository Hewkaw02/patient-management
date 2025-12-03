package com.pm.patientservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
