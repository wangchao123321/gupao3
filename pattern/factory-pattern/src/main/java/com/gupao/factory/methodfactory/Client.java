package com.gupao.factory.methodfactory;

import com.gupao.factory.simplefactory.Computer;

public class Client {

    public static void main(String[] args) {
        ComputerFacotry dellFactory = new DellFactory();
        Computer dell = dellFactory.getComputer();
        dell.work();
        ComputerFacotry huiPuFactory = new HuiPuFactory();
        Computer huipu = huiPuFactory.getComputer();
        huipu.work();
    }
}
