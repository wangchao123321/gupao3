package com.gupao.factory.methodfactory;

import com.gupao.factory.simplefactory.Computer;
import com.gupao.factory.simplefactory.Dell;

public class DellFactory implements ComputerFacotry {
    public Computer getComputer() {
        return new Dell();
    }
}
