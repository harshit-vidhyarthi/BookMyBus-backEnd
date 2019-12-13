package com.webapp.bookMyBus.controller;


import com.webapp.bookMyBus.dto.BusDTO;
import com.webapp.bookMyBus.dto.SearchDTO;
import com.webapp.bookMyBus.entity.Stop;
import com.webapp.bookMyBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BusController {

    private BusService busService;

    @Autowired
    public BusController(BusService theBusService) {
        busService = theBusService;
    }

    @PostMapping("/detail")
    public List<BusDTO> findBuses(@RequestBody SearchDTO searchDTO) {
        List<BusDTO> buses = busService.findBuses(searchDTO.getSource(), searchDTO.getDestination(), searchDTO.getDate());
        return buses;
    }

    @GetMapping("/cities")
    public List<Stop> listCities() {
        return busService.listCities();
    }
}
