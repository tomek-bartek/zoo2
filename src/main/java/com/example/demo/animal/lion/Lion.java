package com.example.demo.animal.lion;

import com.example.demo.animal.Animal;
import com.example.demo.zone.Zone;

import javax.persistence.Entity;

@Entity
public class Lion extends Animal {


    public Lion() {
        super();
        super.setFeedQuantity(11);
    }

}
