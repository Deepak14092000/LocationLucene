package com.location.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pondicherry")
public class Pondicherry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pincode")
    private Integer Pincode;

    @Column(name = "area")
    private String Area;

    @Column(name = "state")
    private String State;

    @Column(name = "district")
    private String District;

}
