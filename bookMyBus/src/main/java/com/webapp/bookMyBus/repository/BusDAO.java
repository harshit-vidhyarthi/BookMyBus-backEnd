package com.webapp.bookMyBus.repository;

import com.webapp.bookMyBus.dto.BusDTO;

import java.util.Date;
import java.util.List;

public interface BusDAO {
    public List<BusDTO> findBuses(String Source, String destination, Date date);
}
