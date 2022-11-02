package com.example.demo.animal.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RabbitService {
    @Autowired
    private RabbitRepository rabbitRepository;

    public List<Rabbit> getRabbit() {
        return rabbitRepository.findAll();
    }

    public void addRabbit(Rabbit rabbit) {
        rabbitRepository.save(rabbit);
    }
}
