package com.keyin;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private com.keyin.City city;

    @ManyToMany
    @JoinTable(
        name = "airport_aircraft",
        joinColumns = @JoinColumn(name = "airport_id"),
        inverseJoinColumns = @JoinColumn(name = "aircraft_id")
    )
    private List<com.keyin.Aircraft> aircraft;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

// Getters and setters
}
