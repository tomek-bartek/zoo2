package com.example.demo.animal.rabbit;

import com.example.demo.animal.Animal;

import javax.persistence.Entity;

@Entity
public class Rabbit extends Animal {


    public Rabbit() {
        super();
        super.setFeedQuantity(4);
    }

}
