package com.example.demo.animal.lion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/lions/")
public class LionController {
    @Autowired
    private LionService lionService;
    @GetMapping(path = "getLions")
    public List<Lion> getLion(){
        return lionService.getLion();
    }
    @PostMapping(path = "addLion")
    public void addLion(@RequestBody Lion lion){
        lionService.addLion(lion);
    }
}

