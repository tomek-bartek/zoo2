package com.example.demo.zone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneService {
    @Autowired
    private ZoneRepository zoneRepository;

    public List<Zone> getZone(ZoneService zoneService) {
        return zoneRepository.findAll();
    }

    public void addZone(Zone zone) {
        zoneRepository.save(zone);
    }

    public Optional<Zone> findZoneById(Long id) {
        return zoneRepository.findById(id);
    }
}
