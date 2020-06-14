package com.codexmo.atm.factory;

import com.codexmo.atm.model.Computer;
import com.codexmo.atm.model.PC;
import com.codexmo.atm.model.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ( "PC".equalsIgnoreCase(type) ) {
            return new PC(ram, hdd, cpu);
        } else if ( "SERVER".equalsIgnoreCase(type) ) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }

}
