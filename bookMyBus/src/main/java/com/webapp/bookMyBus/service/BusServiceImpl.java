package com.webapp.bookMyBus.service;

import com.webapp.bookMyBus.dto.BusDTO;
import com.webapp.bookMyBus.entity.Stop;
import com.webapp.bookMyBus.repository.BusDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BusServiceImpl implements BusService{
    private BusDAO busDAO;

    @Autowired
    public BusServiceImpl(BusDAO busDAO) {
        this.busDAO = busDAO;
    }


    @Override
    public List<BusDTO> findBuses(String source, String destination, Date date) {
        return busDAO.findBuses(source, destination, date);
    }

    @Override
    public List<Stop> listCities() {
        return busDAO.listCities();
    }
}
