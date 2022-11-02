package com.example.demo.zone;


import com.example.demo.animal.Animal;

import javax.persistence.*;
import java.util.List;


@Entity
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name ="zone_id")
    private List<Animal> animals;

    public Zone(String name) {
        this.name = name;
    }

    public Zone() {

    }

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

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
