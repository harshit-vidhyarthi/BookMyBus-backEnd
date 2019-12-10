package com.webapp.bookMyBus.controller;


import com.webapp.bookMyBus.dto.BusDTO;
import com.webapp.bookMyBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    private BusService busService;

    @Autowired
    public BusController(BusService theBusService) {
        busService = theBusService;
    }

    @PostMapping("/detail")
    public List<BusDTO> findBuses(@RequestParam String source, @RequestParam String destination, @RequestParam Date date) {
        List<BusDTO> buses = busService.findBuses(source, destination, date);
        return buses;
    }
}
