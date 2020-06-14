package com.codexmo.atm.service;

import com.codexmo.atm.model.Computer;

public interface ComputerService {

    Computer getComputer(String type, String ram, String hdd, String cpu);

}
