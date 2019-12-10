package com.webapp.bookMyBus.service;

import com.webapp.bookMyBus.dto.BusDTO;

import java.util.Date;
import java.util.List;

public interface BusService {
    public List<BusDTO> findBuses(String Source, String destination, Date date);
}
