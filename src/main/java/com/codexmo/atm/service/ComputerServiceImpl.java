package com.codexmo.atm.service;

import com.codexmo.atm.factory.ComputerFactory;
import com.codexmo.atm.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;

public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerFactory computerFactory;

    @Override
    public Computer getComputer(String type, String ram, String hdd, String cpu) {
        return computerFactory.getComputer(type, ram, hdd, cpu);
    }

}
