package com.location.Entities;

import javax.persistence.*;

@Entity
@Table(name = "pondicherry")
public class Pondicherry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "State")
    private String state;


    @Column(name = "Area")
    private String area;

    @Column(name = "Pincode")
    private String pincode;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
