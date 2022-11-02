package com.example.demo.animal.elephant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/elephants/")
public class ElephantController {
    @Autowired
    private ElephantService elephantService;
    @GetMapping(path = "getElephants")
    public List<Elephant> getElephant(){
        return elephantService.getElephant();
    }
    @PostMapping(path = "addElephant")
    public void addElephant(@RequestBody Elephant elephant){
        elephantService.addElephant(elephant);
    }
}

