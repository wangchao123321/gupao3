package com.gupao.factory.abstractfactory;

import com.gupao.factory.simplefactory.Computer;

public class Client {

    public static void main(String[] args) {
        AbstractFactory dellFactory = new DellFactory();
        Board dellBoard = dellFactory.getBoard();
        dellBoard.boardWork();
        Computer dell = dellFactory.getComputer();
        dell.work();
        System.out.println("--------------------------------------------");
        AbstractFactory huiPuFactory = new HuiPuFactory();
        Board huipuBoard = huiPuFactory.getBoard();
        huipuBoard.boardWork();
        Computer huipu = huiPuFactory.getComputer();
        huipu.work();

    }
}
