package com.example.demo.animal.elephant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElephantService {
    @Autowired
    private ElephantRepository elephantRepository;
    public List<Elephant> getElephant() {
        return elephantRepository.findAll();
    }

    public void addElephant(Elephant elephant) {
        elephantRepository.save(elephant);
    }
}
