package com.microservices.Hotel.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "hotel")
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "about")
    private String about;
//
//    @Column(name = "review")
//    private String review;

}
