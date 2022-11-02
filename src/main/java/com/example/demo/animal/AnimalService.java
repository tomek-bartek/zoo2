package com.example.demo.animal;

import com.example.demo.zone.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    public List<Animal> getAnimal() {
       return animalRepository.findAll();
    }

    public List<Animal> getAnimalsByName(String name) {
        return animalRepository.findByName(name);
    }


    public List<Integer> getFirstReport() {
        return animalRepository.zoneMaxSumFeedQuantity();
    }

    public List<Integer> getSecondReport() {
        return animalRepository.getSecondReport();
    }
}
