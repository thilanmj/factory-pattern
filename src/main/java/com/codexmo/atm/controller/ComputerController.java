package com.codexmo.atm.controller;

import com.codexmo.atm.model.Computer;
import com.codexmo.atm.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ComputerController {

    @Autowired
    private ComputerService computerService;

    public Computer getPC(String ram, String hdd, String cpu) {
        Computer pc = computerService.getComputer("PC", ram, hdd, cpu);
        return pc;
    }

    public Computer getServer(String ram, String hdd, String cpu) {
        Computer server = computerService.getComputer("SERVER", ram, hdd, cpu);
        return server;
    }

}
