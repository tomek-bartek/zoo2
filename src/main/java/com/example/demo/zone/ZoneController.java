package com.example.demo.zone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/zone/")
public class ZoneController {
    @Autowired
    private ZoneService zoneService;

    @PostMapping("addZone")
    public void addZone(@RequestBody Zone zone){
        zoneService.addZone(zone);
    }
    @GetMapping(path = "allZones")
    public List<Zone> getZone(){
        return zoneService.getZone(zoneService);
    }
    @GetMapping(path = "zoneById")
    public Optional<Zone> findZoneById(@RequestParam Long id){
        return zoneService.findZoneById(id);
    }
}
