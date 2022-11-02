package com.example.demo.animal.elephant;

import com.example.demo.animal.Animal;

import javax.persistence.Entity;

@Entity
public class Elephant extends Animal {


    public Elephant() {
        super();
        super.setFeedQuantity(20);
    }

}
