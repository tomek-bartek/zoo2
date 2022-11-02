package com.example.demo.animal;

import com.example.demo.zone.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;


    @GetMapping("/animals/")
    public List<Animal> getAnimal(AnimalRepository animalRepository) {
        return animalService.getAnimal();
    }

    @GetMapping("/animals/getAnimalByName")
    public List<Animal> getAnimalsByName(@RequestParam String name) {
        return animalService.getAnimalsByName(name);
    }

    //Lista stref z największym zapotrzebowaniem na karmę
    @GetMapping("/reports/first")
    public List<Integer> getFirstReport() {
        return animalService.getFirstReport();
    }

    // Lista stref (id stref), w których liczba zwierząt jest najmniejsza
    @GetMapping("/reports/second")
    public List<Integer> getSecondReport() {
        return animalService.getSecondReport();
    }

}
