package com.example.demo.animal.lion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LionService {
    @Autowired
    private LionRepository lionRepository;

    public List<Lion> getLion() {
        return lionRepository.findAll();
    }

    public void addLion(Lion lion) {
        lionRepository.save(lion);
    }
}
