package com.example.demo.animal;

import com.example.demo.zone.Zone;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int feedQuantity;

    public int getZone_id() {
        return zone_id;
    }

    public void setZone_id(int zone_id) {
        this.zone_id = zone_id;
    }

    private int zone_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="zone_id", insertable = false, updatable = false)
    private Zone zone;



    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
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

    public int getFeedQuantity() {
        return feedQuantity;
    }

    public void setFeedQuantity(int feedQuantity) {
        this.feedQuantity = feedQuantity;
    }

}
