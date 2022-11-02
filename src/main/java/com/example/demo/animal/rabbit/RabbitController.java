package com.example.demo.animal.rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rabbits/")
public class RabbitController {
    @Autowired
    private RabbitService rabbitService;

    @GetMapping(path = "getRabbits")
    public List<Rabbit> getRabbit() {
        return rabbitService.getRabbit();
    }

    @PostMapping(path = "addRabbit")
    public void addRabbit(@RequestBody Rabbit rabbit) {
        rabbitService.addRabbit(rabbit);
    }
}

